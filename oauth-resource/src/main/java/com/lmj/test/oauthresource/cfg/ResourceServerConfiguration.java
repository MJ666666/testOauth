package com.lmj.test.oauthresource.cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * ClassName: ResourceServerConfiguration
 * Description:
 * date: 2020/4/3 21:05
 *
 * @author MJ
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        //session创建策略：
        //ALWAYS 总是创建HttpSession
        //IF_REQUIRED Spring Security只会在需要时创建一个HttpSession
        //NEVER  Spring Security不会创建HttpSession，但如果它已经存在，将可以使用HttpSession
        //STATELESS SpringSecurity永远不会创建HttpSession，它不会使用HttpSession来获取SecurityContext
        http.exceptionHandling().and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeRequests().antMatchers("/**").hasAuthority("SystemContent")
                .antMatchers("/view/**").hasAuthority("SystemContentView");

    }
}
