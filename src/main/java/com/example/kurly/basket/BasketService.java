package com.example.kurly.basket;

import javax.servlet.http.HttpSession;

public interface BasketService {
    // 장바구니 등록
    public void register(BasketDTO basket);
}
