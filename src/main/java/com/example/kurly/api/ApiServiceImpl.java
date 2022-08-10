package com.example.kurly.api;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Jsoup, Json-simple 기능을 사용하여 마켓컬리 상품 DB에 저장
 * 마켓컬리 데이터를 가져오기 위해 작성.
 * @author 박현성
 */

@Service
@Slf4j
public class ApiServiceImpl implements ApiService{
    @Autowired
    ApiMapper apiMapper;

    @Override
    public void apiSave(String api) throws Exception {
        ApiDTO pvo = new ApiDTO();
        String jsonString = api;

        // string 형식으로 Json이 넘어와서 String을 다시 Json으로 변경하는 작업
        JSONParser parser = new JSONParser();
        JSONObject jObject = (JSONObject) parser.parse(jsonString);
        log.info("jobject ={}", jObject);

        // Json형식 {props -> pageProps -> product}
        JSONObject responseObject = (JSONObject) jObject.get("props");
        JSONObject responseObject1 = (JSONObject) responseObject.get("pageProps");
        JSONObject responseObject2 = (JSONObject) responseObject1.get("product");
        log.info("responseObject ={}", responseObject2);

        Object product = responseObject1.get("product");   // 상품중에 현재 판매 중인 상품이 아닌 경우 return
        if(product == null) {
            return;
        }
        else {
            // 필요한 데이터를 DTO 형식으로 담기 위해
            pvo.setNo(String.valueOf(responseObject2.get("no"))); // Integer를 (String)으로 바로 형변환하면 오류가 나서 String.valueOf 사용
            pvo.setName((String) responseObject2.get("name"));
            pvo.setBasePrice(Integer.parseInt(String.valueOf(responseObject2.get("basePrice")))); // 위의 이유와 비슷하다.
            pvo.setAllergy((String) responseObject2.get("allergy"));
            pvo.setShortDescription((String) responseObject2.get("shortDescription"));
            pvo.setSalesUnit((String) responseObject2.get("salesUnit"));
            pvo.setVolume((String) responseObject2.get("volume"));
            pvo.setDeliveryTypeNames(String.valueOf(responseObject2.get("deliveryTypeNames")));
            pvo.setSellerName((String) responseObject2.get("sellerName"));

            apiMapper.apiSave(pvo); // Mapper를 호출해서 DB에 저장
        }
    }
}
