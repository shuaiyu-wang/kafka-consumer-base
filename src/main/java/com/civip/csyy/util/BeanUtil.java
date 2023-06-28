package com.civip.csyy.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanUtil {
  public static final ObjectMapper objectMapper = ObjectMapperUtil.createObjectMapper();

  private BeanUtil() {}


  public static <T> String bean2Json(T t) throws JsonProcessingException {
    return bean2Json(objectMapper, t);
  }

  public static <T> String bean2Json(ObjectMapper mapper, T t) throws JsonProcessingException {
    return mapper.writeValueAsString(t);
  }

  public static <T> T json2Bean(String json, Class<T> clazz) throws JsonProcessingException {
    return json2Bean(objectMapper, json, clazz);
  }

  public static <T> T json2Bean(ObjectMapper mapper, String json, Class<T> clazz) throws JsonProcessingException {
      return mapper.readValue(json, clazz);
  }
}
