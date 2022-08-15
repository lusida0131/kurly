package com.example.basket;

import com.example.kurly.KurlyApplication;
import com.example.kurly.basket.BasketDTO;
import com.example.kurly.basket.BasketMapper;
import com.example.kurly.member.MemberDTO;
import com.example.kurly.member.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = KurlyApplication.class)

public class BasketMapperTest {
    @Autowired
    BasketMapper basketMapper;

    @Test
    void 장바구니등록() {
        BasketDTO basket = new BasketDTO();
        basket.setMemberid("test");
        basket.setProductno("5000741");
        basketMapper.register(basket);
    }
}
