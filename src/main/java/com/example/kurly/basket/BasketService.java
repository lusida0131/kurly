package com.example.kurly.basket;

import java.util.List;

public interface BasketService {
    // 장바구니 등록
    public void register(BasketDTO basket);
    // 장바구니 삭제
    public void delete(int bno);
    // 장바구니 목록보기
    public List<BasketDTO> list(BasketDTO basket);
}
