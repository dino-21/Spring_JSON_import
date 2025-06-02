package com.dino.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.dino.dto.DustVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service // �� Ŭ������ Spring�� ���� ��(Bean)���� ���
public class DustServiceImpl implements DustService {

    @Override
    public List<DustVO> fetchDustList() {
        try {
            // �ܺ� JSON �����Ͱ� �ִ� URL ����
            URL url = new URL("https://dino-21.github.io/Json_data/pm1.json");

            // URL���� �����͸� �о���� ���� �Է� ��Ʈ�� ����
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            // JSON �Ľ��� ���� Jackson ObjectMapper ����
            ObjectMapper mapper = new ObjectMapper();

            // JSON �迭�� Java ��ü �迭�� ��ȯ ��, ����Ʈ�� ��ȯ
            return Arrays.asList(mapper.readValue(br, DustVO[].class));
        } catch (Exception e) {
            // ���� �߻� �� ���� Ʈ���̽� ����ϰ� null ��ȯ
            e.printStackTrace();
            return null;
        }
    }
}

