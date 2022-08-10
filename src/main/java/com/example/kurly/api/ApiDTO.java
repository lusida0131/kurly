package com.example.kurly.api;

import lombok.Data;

@Data
public class ApiDTO {
    private String no;
    private String name;
    private Integer basePrice;
    private String allergy;
    private String shortDescription;
    private String salesUnit;
    private String volume;
    private String deliveryTypeNames;
    private String sellerName;

}
