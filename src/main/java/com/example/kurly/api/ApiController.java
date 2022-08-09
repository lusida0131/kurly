package com.example.kurly.api;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

@RestController
public class ApiController extends IOException {
    @GetMapping("/api")
    public static void getStockPriceList() throws IOException {
        String url = "https://www.kurly.com/goods/5045734";
        Document doc = Jsoup.connect(url).data()
                .get();
        Elements e1 = doc.getElementsByAttributeValue("id", "__NEXT_DATA__"); // <script id="__NEXT_DATA__" type="application/json"> 안에 있는 테그만 가져오기
        System.out.println(e1);

    }
}
