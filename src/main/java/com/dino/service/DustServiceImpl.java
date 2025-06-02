package com.dino.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.dino.dto.DustVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service // 이 클래스가 Spring의 서비스 빈(Bean)임을 명시
public class DustServiceImpl implements DustService {

    @Override
    public List<DustVO> fetchDustList() {
        try {
            // 외부 JSON 데이터가 있는 URL 생성
            URL url = new URL("https://dino-21.github.io/Json_data/pm1.json");

            // URL에서 데이터를 읽어오기 위한 입력 스트림 생성
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            // JSON 파싱을 위한 Jackson ObjectMapper 생성
            ObjectMapper mapper = new ObjectMapper();

            // JSON 배열을 Java 객체 배열로 변환 후, 리스트로 변환
            return Arrays.asList(mapper.readValue(br, DustVO[].class));
        } catch (Exception e) {
            // 에러 발생 시 스택 트레이스 출력하고 null 반환
            e.printStackTrace();
            return null;
        }
    }
}

