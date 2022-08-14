package com.example.kurly.recipe;

public class RecipeDTO {
    private int recipeNo;
    private String title; // 제목
    private String rid; //레시피 작성자
    private String comment;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private int likeStatus; // 좋아요 했는지 안했는지 > 0 , 1로 나누어 0일경우 좋아요x, 1일경우 좋아요
    private int likeNum; //좋아요 갯수

}
