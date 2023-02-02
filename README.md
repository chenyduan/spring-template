# spring security 认证授权
1. Resource Owner: 资源所有者，通常指用户
2. spring-resource-server 资源服务器，比如要查看的信息存放的服务器
3. client 指需要获取用户资源的第三方应用，由用户操作，比如浏览器
2. authorization-server 授权服务器，用于验证资源所有者，并在验证成果之后向客户端发放相关令牌

# nacos2.2 dubbo3,springboot3
1. 修改 nacos连接mysql 
2. 启动nacos server ，在bin目录下执行 `./startup.cmd -m standalone`
2. 启动 clientA, clientB
3. 访问 http://192.168.3.60:6002/  查看控制台调用结果
~~~
***********************远程结果是：
这里是B 的dubbo

~~~



--------------
# Spring Securit Oauth2 Client
- GitHub应用注册 `https://github.com/settings/applications/new`

- 出现问题： 
~~~

[invalid_token_response] An error occurred while attempting to retrieve the OAuth 2.0 Access Token Response: I/O error on POST request for "https://github.com/login/oauth/access_token": Connection refused: connect
~~~
----------------------
- Gitee
~~~
其中：
（1）client_id、client-secret替换为Gitee获取的数据

（2）authorization-grant-type：授权模式使用授权码模式

（3）redirect-uri：回调地址，填写的与Gitee上申请的一致

（4）client-name：客户端名称，可以在登录选择页面上显示

Gitee的OAuth登录需要自定义provider，Spring Security OAuth提供了配置的方式来实现。

（5）authorization-uri：授权服务器地址

（6）token-uri：授权服务器获取token地址

（7）user-info-uri：授权服务器获取用户信息的地址

（8）user-name-attribute：用户信息中的用户名属性
————————————————
版权声明：本文为CSDN博主「阿提说说」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_40972073/article/details/126210758
~~~

> 换取系统自身token