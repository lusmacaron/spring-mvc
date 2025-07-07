package com.metaverse.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaverse.springmvc.domain.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JsonTest {

    @Test
    @DisplayName("Object to JSON : Get method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("NANA",232);

        // Jackson 라이브러리의 ObjectMapper가 파싱 기능을 수행한다.
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);

        System.out.println("json Result : " + jsonString);
    }

    @Test
    @DisplayName("")
    void test2() throws JsonProcessingException {
        String json  = "{\"name\":\"Meta\",\"age\": 95}";

        ObjectMapper objectMapper = new ObjectMapper();
        // json 문자열을 Star 클래스에 맞추어 값을 읽고 변환
        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("name: " + star.getName());
        System.out.println("age: " + star.getAge());
    }
}
