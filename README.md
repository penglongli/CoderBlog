[TOC]

### 开发环境

#### 1. 修改 Nginx 配置
在 Nginx 配置中增加

```
include /path-to-mart-front/doc/nginx/mart_dev.conf
```
你可能需要把 ```/path-to-mart-front/doc/nginx/``` 目录下的 ```proxy.conf``` 和 ```mart_front_common.conf``` 拷贝到 nginx 目录下

#### 2. 增加 hosts 配置

```
127.0.0.1    mart.coding.com
```

#### 3. 开发模式运行

##### 3.1 本地访问
```
npm install
BACKEND_HOST=mart-backend-host npm run dev
```

##### 3.2 远程访问
```
npm install
BACKEND_HOST=mart-backend-host CODING_BACKEND_HOST=coding-backend-host npm run dev
```

#### 4. 生产模式运行

```
npm install
npm run build
BACKEND_HOST=mart-backend-host SENTRY_DSN={SENTRY_DSN} npm start
```

#### 5. 运行成功，访问
http//mart.coding.com

#### 6. 局域网内访问

##### 6.1 开发模式
```
BACKEND_HOST=mart-backend-host CODING_BACKEND_HOST=coding-backend-host LOCAL_HOST=your-ip-in-LAN npm run dev
```

##### 6.2 生产模式
```
BACKEND_HOST=mart-backend-host CODING_BACKEND_HOST=coding-backend-host LOCAL_HOST=your-ip-in-LAN npm start
```

---

### 生产环境

#### 1. 修改 Nginx 配置
在 Nginx 配置中增加

```
include /path-to-mart-front/doc/nginx/mart_pro.conf
```

你可能需要把 ```/path-to-mart-front/doc/nginx/``` 目录下的 ```proxy.conf``` 和 ```mart_front_common.conf``` 拷贝到 nginx 目录下。

然后修改 ```mart_pro.conf``` 中的 upstream coding_mart_front 地址

#### 2. 使用 Coding-local 运行

```
cd images/coding-mart-front
./build.sh && ./package.sh

cd ../../
./coding-job --jobs=coding.yml up mart-coding-front
```
See https://coding.net/u/thefallentree/p/coding-local/git/merge/80

---

### Admin 后台管理开发

> 我们使用了两个新的前端库: `react-bootstrap` 和 `Bootstrap` 样式库 `Gentelella`<br/> <br/> 建议将 `Gentelella` 下载到本地查看 `production` 目录下的效果

`react-bootstrap`: http://react-bootstrap.github.io
`Gentelella`: https://github.com/puikinsh/gentelella

---

### 文件结构

```
src/client
├── actions             redux actions
├── assets              通用的 CSS 样式(例如fontAwsome, coding icon, flex), 图片
│   ├── css
│   └── image
│       └── home
├── components          可复用组件(大写开头), 业务专用组件(小写开头)
│   ├── Breadcrumb      - 面包屑
│   ├── Flash           - 通知
│   ├── Hr              - 分割线
│   ├── Loading         - Loading状态
│   ├── layout          - 常用布局
│   ├── quote           - 火锅单页面组件
│   │   ├── functions
│   │   ├── platforms
│   │   ├── result
│   │   ├── steps
│   │   └── tabs
│   └── user            - 用户页面组件
├── constants
├── containers
│   ├── quote           火锅单页(包含路由配置)
│   └── user            用户页面(包含路由配置)
├── libs                API 接口
├── reducers            redux reducers
│   └── quote           quote reducers
└── store               redux store

```

---

### 开启 Redux DevTools
将下图中 false 设置为 true 即可默认显示 Redux 开发调试工具， 按 Ctrl + H 切换显示。

![图片][1]

[1]: https://dn-coding-net-production-pp.qbox.me/37c8edfc-cf3b-4ae3-93e6-23e3f84d6dfe.png

---

### ESLint
我们采用 ESLint 对代码进行基本语法和代码风格检查，在 ```npm run build``` 时会自动 lint 我们的代码, 也可手动执行 ```npm run lint``` 查看有问题的代码。
在 IDE 中，也可启用 ESLint 的插件实时检查代码问题

#### 新的代码
新的代码需要能够通过 lint 的检查，否则将会导致编译失败
遇到问题，请参考 http://eslint.org/docs/rules/ 解决问题，保证 _新的代码_ 能够保持一致的风格

#### 旧的代码
对于旧的代码，如果你有兴趣修改，可按照如下步骤 lint 代码：
1. 在 ```/src/libs/generate-eslintignore/lint-files.json``` 文件中，添加要 lint 的旧代码或目录

```
[
    "/src/client/actions/user.js",
    "/src/client/containers"
]
```
2. 执行 ```npm run eslintignore``` 生成新的 ```.eslintignore``` 文件，随后，执行 ```npm run lint``` 欢快的改代码吧

#### TODO:
1. Lint all old code
2. Pre-commit hook lint
3. ESLint watch

---
### Mpay 使用 ProtoBuf
执行 `npm run proto` 将会把 mpay 最新的 proto 文件拷贝到 src/client/proto 中, 具体使用可参考 `libs/proto-api.js`

---
### Unit Test
使用 [Mocha][mocha] + [Expect][expect] 进行测试

- 测试 Redux 组件: https://goo.gl/qAFHy3
- 使用 Enzyme 为 React Component 写单元测试: http://airbnb.io/enzyme/index.html

```
npm run test
```
 ![图片](https://dn-coding-net-production-pp.qbox.me/afe49d85-6e6f-4988-8fb3-8e386f6dc42c.png)

### Test Coverage
使用 [istanbul][istanbul] 提供 coverage 信息

```
npm run coverage && npm run coverage:detail
```
 ![图片](https://dn-coding-net-production-pp.qbox.me/f679f465-c620-4eb4-8b83-13310e092aca.png)

---

[mocha]: https://mochajs.org/
[istanbul]: https://github.com/gotwarlost/istanbul
[expect]: https://github.com/mjackson/expect
