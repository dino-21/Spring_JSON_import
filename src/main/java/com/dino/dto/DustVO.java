package com.dino.dto;

import lombok.Data;

@Data //모든 필드에 대해 getter, setter, toString, equals, hashCode 자동 생성
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


