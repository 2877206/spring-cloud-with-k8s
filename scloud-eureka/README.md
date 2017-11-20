### spring-cloud-eureka


#### 测试：

 http://peer1:8761/api-b/add?a=1&b=2&accessToken=a


#### 启动：

java -jar scloud-zuul-0.0.1-SNAPSHOT.jar --spring.profiles.active=local



#### 协作项目

scloud-eureka 注册中心
scloud-zuul 服务网关，外部调用入口，外部调用测试
scloud-provider-calculate-02 服务实现类
scloud-feign  内部直接调用，内部调用测试

