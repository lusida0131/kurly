package com.example.kurly.basket;

import lombok.Data;

@Data
public class BasketDTO {
    private int bno;
    private String memberid;   // 맴버 아이디
    private String productno;  // 상품 코드

}
