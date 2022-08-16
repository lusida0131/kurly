package com.example.kurly.basket;

import com.example.kurly.product.ProductDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("basket")
@Slf4j
// basket CURD
public class BasketController {

    private final BasketService basketService;

    // 장바구니 등록하기
    @PostMapping("/register")
    public String register(@ModelAttribute BasketDTO basket, HttpSession session, @ModelAttribute ProductDTO product) {
        // 장바구니 등록 누르면 id, 상품 코드가 넘어오는데 넘어오는 값 DB저장
        basket.setMemberid(session.getId());
        basket.setProductno(product.getNo());
        basketService.register(basket);
        return "/basket/list";
    }
    // 장바구니 목록리스트
    @GetMapping("/list")
    public void basketList(@ModelAttribute BasketDTO basket, Model model) {
        List<BasketDTO> list = basketService.list(basket);
        model.addAttribute("list", list);
        log.info("list={}", list);
    }

    // 장바구니 삭제
    @GetMapping("/delete")
    public String delete(@RequestParam int bno, HttpSession session, BasketDTO basket) {
        if(basket.getMemberid().equals(session.getId())) {
            basketService.delete(bno);
            return "/basket/list";
        }
        else {
            return "/basket/list";
        }
    }

}
