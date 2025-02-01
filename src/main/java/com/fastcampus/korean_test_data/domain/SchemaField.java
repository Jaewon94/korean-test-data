package com.fastcampus.korean_test_data.domain;

import lombok.*;

@Getter
@Setter
@ToString
public class SchemaField {

  private String fieldName;
  private String mockData;
  private Integer fieldOrder;
  private Integer blankPercent;
  private String typeOptionJson;
  private String forceValue;
  
}
