package com.example.kurly.buy;

import lombok.Data;

@Data
public class BuyDTO {
    private int no; // 구매목록 pk
    private String id; // 구매한 사람 pk
    private int productNo; // 구매한 상품 pk
    private String productName; //구매한 상품 이름

}
