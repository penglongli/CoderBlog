# CoderBlog 一个可以个性化订制的博客社区

## 社区结构

域名：www.coder-blogs.com

结构：

- 社区前台：http://www.coder-blogs.com
- 个人管理：http://write.coder-blogs.com
- 个人前台: http://www.coder-blogs.com/xxx
- 管理后台：http://admin.coder-blogs.com

## 技术架构

Common：

1. 权限控制：Apache Shiro
2. 图片存储及 CDN：七牛
3. 数据库：MySQL
4. 接口数据：ProtoBuf
5. Collection Type & 消息订阅: Guava
6. Caching Libray: caffeine
7. 缓存: Redis
8. JSON: gson

单独产品技术：

1. 社区前台
   - 前端： React 全家桶 + ES6 + Webpack + Gulp
   - 后端： Node
   - 应用层查询：GraphQL
2. 个人管理
   - 前端：React 全家桶 + ES6 + Webpack + Gulp
   - 后端：Spring-boot
   - 应用层：GraphQL-Java
   - DAO 层: Spring data + JPA
3. 管理后台
   - 前端：Vue.js + Webpack + Gulp
   - 后端：Go

## module 组成
```
├── blog (社区和个人后台 REST 代码)
├── blog-front (社区和个人前台代码)
├── personal (个人写作后台 REST 代码) 1
├── personal-front (个人写作前台代码)
├── admin (管理后台)
├── admin-front (管理后台前端)
├── lib-blog-db (blog 的 Java bean 和 JPA)
├── lib-proto (Protobuf 文件)
├── lib-utils (通用工具类)
├── lib-markdown (markdown 编译工具)
├── email (email 服务)
```
