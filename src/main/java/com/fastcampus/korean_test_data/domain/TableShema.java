package com.fastcampus.korean_test_data.domain;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@ToString
public class TableShema {
  
  private String schemaName;
  private String userId;
  private LocalDateTime exportedAt;

}

