package com.example.kurly.basket;

import com.example.kurly.product.ProductDTO;
import com.example.kurly.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("basket")
// basket CURD
public class BasketController {

    private final ProductService productService;

    private final BasketService basketService;

    // 장바구니 등록하기
    @PostMapping("/register")
    public String register(@ModelAttribute BasketDTO basket, HttpSession session, @ModelAttribute ProductDTO product) {
        // 장바구니 등록 누르면 id, 상품 코드가 넘어오는데 넘어오는 값 DB저장
        basket.setMemberid(session.getId());
        basket.setProductno(product.getNo());
        basketService.register(basket);
        return "/basket/";
    }
    // 장바구니 목록리스트
    @PostMapping("/list")
    public String basketList() {
        return "list";
    }

    // 장바구니 삭제
//    @PostMapping("/delete")
//    public String delete(@ModelAttribute BasketDTO basket, HttpSession session) {
//        if(basket.getMemberid().equals(session.getId())) {
//            basketService.delete();
//            return "/basket/list";
//        }
//        else {
//            return "/basket/list";
//        }
//    }

}
