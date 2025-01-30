package com.fastcampus.korean_test_data.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaConfig {
  
  // Entity의 생성/수정자를 자동으로 처리하기 위한 AuditorAware 구현체
  // 현재는 "jaewon"이라는 고정값을 반환하도록 설정
  @Bean
  public AuditorAware<String> auditorAware() {
    return () -> Optional.of("jaewon");
  }
}
