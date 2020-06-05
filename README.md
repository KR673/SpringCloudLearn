## 1. 模块

### 1.1 Eureka

注册中心, 管理服务名称和IP地址的映射关系

### 1.2 Zuul

API网关, 路由客户端的访问接口, 和nginx的功能类似

[谈谈微服务中的 API 网关（API Gateway）](https://www.cnblogs.com/savorboard/p/api-gateway.html)

### 1.3 Feign

**简化微服务器的接口调用**
声明式的服务调用工具, 我们只需本服务创建一个接口并用注解的方式来配置它，就可以实现对其他某个服务接口的调用.

[Spring Cloud OpenFeign：基于Ribbon和Hystrix的声明式服务调用](https://juejin.im/post/5d9c85c3e51d45782c23fab6)

## 2. maven事项

1. 父模块中需要使用`<modules>`加入了模块,子模块同样需要引入父级模块, 否则子模块的spring无法延用父模块的版本
2. 父模块的`<packing>`必需是pom

[Maven的继承以及import作用域](https://www.cnblogs.com/techroad4ca/p/6512591.html)
