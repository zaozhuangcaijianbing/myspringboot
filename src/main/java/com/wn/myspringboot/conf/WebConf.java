package com.wn.myspringboot.conf;

//import com.qihoo.bigdata.qsso.client.V2.SsoFilter;
//import com.qihoo.bigdata.qsso.client.V2.SsoFilter;
import com.qihoo.bigdata.qsso.client.V2.SsoFilter;
import com.wn.myspringboot.interceptor.SessionInterceptorAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConf {

//    @Autowired
//    private SessionInterceptorAdapter sessionInterceptor;
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//
//
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(sessionInterceptor)
//                        .excludePathPatterns("/aaa");
//            }
//
//        };
//    }


    @Bean
    public FilterRegistrationBean registerSsoFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SsoFilter());
        registration.addUrlPatterns("/*");//配置需要拦截的请求
        registration.setName("ssoFilter");
        registration.setOrder(100);
        return registration;
    }


}

