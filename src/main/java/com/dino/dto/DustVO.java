package com.dino.dto;

import lombok.Data;

@Data //��� �ʵ忡 ���� getter, setter, toString, equals, hashCode �ڵ� ����
public class DustVO {
    private String dev_id;
    private String name;
    private String loc;
    private String coordx;
    private String coordy;
    private boolean ison;
    private int pm10_after;
    private int pm25_after;
    private int state;
    private String timestamp;
    private String company_id;
    private String company_name;

}


