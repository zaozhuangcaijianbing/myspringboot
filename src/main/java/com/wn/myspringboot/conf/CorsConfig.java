package com.wn.myspringboot.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 设置跨域请求.
 */
@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setMaxAge(24 * 3600L);
        // 设置访问源地址
        corsConfiguration.addAllowedOrigin("*");
        // 设置访问源请求头
        corsConfiguration.addAllowedHeader("*");
        // 设置访问源请求方法
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    /**
     * Cors过滤器.
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 对接口配置跨域设置
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}