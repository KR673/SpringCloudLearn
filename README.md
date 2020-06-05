[toc]

## 1. 模块

### 1.1 Eureka

注册中心, 管理服务名称和IP地址的映射关系

1. [java.lang.TypeNotPresentException: Type javax.xml.bind.JAXBContext not present](https://www.jianshu.com/p/65d9d0d50521)

### 1.2 Zuul

API网关, 路由客户端的访问接口, 和nginx的功能类似(针对客户端直接调用时, 对服务间调用不起作用)

1. [谈谈微服务中的 API 网关（API Gateway）](https://www.cnblogs.com/savorboard/p/api-gateway.html)
2. [Spring Cloud Zuul：API网关服务](https://juejin.im/post/5d9f2dea6fb9a04e3e724067)

### 1.3 服务间调用

#### 1.3.1 Feign

**简化微服务器的接口调用**
声明式的服务调用工具, 我们只需本服务创建一个接口并用注解的方式来配置它，就可以实现对其他某个服务接口的调用.

* 负载均衡 : 默认为轮询的方式

[Spring Cloud OpenFeign：基于Ribbon和Hystrix的声明式服务调用](https://juejin.im/post/5d9c85c3e51d45782c23fab6)


#### 1.3.2 RestTemplate

**使用URl调用其他服务的接口**
[SpringCloud--RestTemplate 接口调用（四）](https://www.jianshu.com/p/9f2ffa41f6f1)

## 2. maven事项

1. 父模块中需要使用`<modules>`加入了模块,子模块同样需要引入父级模块, 否则子模块的spring无法延用父模块的版本
2. 父模块的`<packing>`必需是pom

[Maven的继承以及import作用域](https://www.cnblogs.com/techroad4ca/p/6512591.html)

## 3. 配制多个相同的模块

1. 注意pom文件中的artifactId需要不一致
2. 服务名需要相同, 才可以实现同一个模块的负载均衡

![](https://mynoteimg.oss-cn-beijing.aliyuncs.com/20200605230154.png)

## 4. SpringCloud 与 SpringBoot版本对应关系

| Spring Cloud               | Boot Boot                                       |
|----------------------------|-------------------------------------------------|
| Angle版本                  | 兼容 Spring Boot 1.2.x                          |
| Brixton 版本               | 兼容 Spring Boot 1.3.x, 也兼容Spring Boot 1.4.x |
| Camden 版本                | 兼容 Spring Boot 1.4.x, 也兼容Spring Boot 1.5.x |
| Dalston 版本、Edgware 版本 | 兼容 Spring Boot 1.5.x, 不兼容Spring Boot 2.0.x |
| Finchley 版本              | 兼容 Spring Boot 2.0.x, 不兼容Spring Boot 1.5.x |
| Greenwich 版本             | 兼容 Spring Boot 2.1.x                          |

[@EnableEurekaServer 注解无法引入问题](https://blog.csdn.net/zjhcxdj/article/details/102917380)

## 参考:

1. [入门搭建一个简单的springcloud](https://www.cnblogs.com/WonderfulU/p/12192384.html)