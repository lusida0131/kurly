package com.example.kurly.basket;

import com.example.kurly.member.MemberDTO;
import com.example.kurly.product.ProductDTO;
import com.example.kurly.product.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService{

    private final BasketMapper basketMapper;

    @Override
    public void register(BasketDTO basket) {
        // 장바구니 등록 누르면 id, 상품 코드가 넘어오는데 넘어오는 값 DB저장
        basketMapper.register(basket);
    }
}
