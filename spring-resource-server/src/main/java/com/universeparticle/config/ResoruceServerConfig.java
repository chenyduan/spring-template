package com.universeparticle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity(debug = true)
public class ResoruceServerConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        /*
        * .mvcMatchers("/userinfo/**").hasAuthority("SCOPE_userinfo")匹配/userinfo/**地址，允许访问范围是SCOPE_userinfo
oauth2ResourceServer()定义为资源服务器
jwt()使用JWT令牌
————————————————
版权声明：本文为CSDN博主「阿提说说」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_40972073/article/details/126446735
        * */
        http
                .authorizeRequests()

                .requestMatchers("/userinfo/**").hasAuthority("SCOPE_userinfo")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }

}

