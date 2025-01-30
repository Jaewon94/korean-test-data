package com.fastcampus.korean_test_data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  
  // 기본 보안 필터 체인 설정
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
            // 모든 요청에 대해 인증 없이 접근 허용
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            // 로그아웃 성공 시 홈페이지('/')로 리다이렉트
            .logout(logout -> logout.logoutSuccessUrl("/"))
            .build();
  }
}
