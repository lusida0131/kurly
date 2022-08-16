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

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
//    @Test // 보류 맞는지 모르겠음
//    void 목록보기() {
//        //given
//        String memberid = "test";
//        String productno = "5000741";
//
//        //when
//        List<BasketDTO> basket = basketMapper.list();
//
//        //then
//        assertEquals(memberid, basket.get(1).getMemberid());
//        assertEquals(productno, basket.get(1).getProductno());
//    }
//    @Test
//    void 삭제() {
//        //given
//
//        //when
//        basketMapper.delete(2);
//        //then
//        assertEquals(basketMapper.list()., null);
//    }
}
