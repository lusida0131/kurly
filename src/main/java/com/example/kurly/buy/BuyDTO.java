package com.example.kurly.buy;

public class BuyDTO {
    private int no; // 구매목록 pk
    private String id; // 구매한 사람 pk
    private int productNo; // 구매한 상품 pk
    private String productName; //구매한 상품 이름

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
