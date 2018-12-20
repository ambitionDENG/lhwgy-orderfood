## 			罗湖外语学校订餐系统

系统架构  winform 窗体嵌套web浏览器,订餐内容使用java实现读卡使用C#实现

后端

- 数据库连接池：Alibaba Druid

- 持久层框架：Mybatis

- 数据库：sqlserver2016

- 日志管理：logback

- 核心框架：Spring Boot Spring Cloud（用到的组件有eureka、feign、zuul、hystrix、ribbon)

- 开放Api  Swagger2,swagger-ui-layer

  

lhwgy-common  实体工具类

------

lhwgy-eureka      注册中心,配置中心

------

lhwgy-provider   服务提供者

------

lhwgy-web           服务消费者



http://127.0.0.1:8763/swagger-ui.html  开放Api

http://127.0.0.1:8763/docs.html  开放Api

http://127.0.0.1:8762/druid/index.html druid监控页面