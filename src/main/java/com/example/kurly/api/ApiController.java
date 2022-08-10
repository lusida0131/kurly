package com.example.kurly.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

@RestController
@RequiredArgsConstructor
public class ApiController extends IOException {

    // 마켓컬리 데이터 저장 Service
    private final ApiService apiService;

    @GetMapping("/api")
    public void apiSave() throws Exception {
        // 마켓컬리 상품 상세페이지 경로가 "http://www.kurly.com/goods/ + 상품코드
        // 상품코드를 하나씩 전체 for문을 돌려서 하나씩 호출한다.
        for(int i = 5000068; i < 5105000; i++) {
            String url = "https://www.kurly.com/goods/" + i;
            Document doc = Jsoup.connect(url).get();
            String e1 = doc.getElementById("__NEXT_DATA__").data(); // <script> 안에 있는 내용만 가져오기 위해 작성
 //           System.out.println(e1);
            apiService.apiSave(e1);
        }
    }
}
