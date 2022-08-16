package com.example.kurly.basket;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService{

    private final BasketMapper basketMapper;

    @Override
    public void register(BasketDTO basket) {
        // 장바구니 등록 누르면 id, 상품 코드가 넘어오는데 넘어오는 값 DB저장
        basketMapper.register(basket);
    }

    @Override
    public void delete(int bno) {
        basketMapper.delete(bno);
    }

    @Override
    public List<BasketDTO> list(BasketDTO basket) {
        List<BasketDTO> list = basketMapper.list();
        return list;
    }
}
