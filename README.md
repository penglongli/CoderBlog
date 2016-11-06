## CoderBlog 一个可以个性化订制的博客社区

## 社区结构

域名：www.coder-blogs.com

结构：

- 社区前台：http://www.coder-blogs.com
- 个人管理：http://write.coder-blogs.com
- 管理后台：http://admin.coder-blogs.com

## 技术架构

Common：

1. 权限控制：Apache Shiro
2. 图片存储及 CDN：七牛
3. 数据库：MySQL
4. 接口数据：ProtoBuf
5. Collection Type: Guava

单独产品技术：

1. 社区前台
   - 前端： React 全家桶 + ES6 + Webpack + Gulp
   - 后端： Node + 少量 Go
   - 应用层查询：GraphQL
2. 个人管理
   - 前端：React 全家桶 + ES6 + Webpack + Gulp
   - 后端：Spring-boot
   - 应用层：GraphQL-Java
3. 管理后台
   - 前端：SB Admin(or others) + Vue.js
   - 后端：Python(or Go)

