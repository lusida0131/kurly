package com.example.kurly.recipe;

import com.example.kurly.buy.BuyDTO;

import java.util.List;

public interface RecipeMapper {
    // 레시피 등록
    public void insertRecipe(RecipeDTO recipeDTO, BuyDTO buyDTO);
    // 레시피 삭제
    public void deleteRecipe(RecipeDTO recipeDTO); // 추후 사용유무 따지기(22.08.14)
    // 레시피 리스트
    public List<RecipeDTO> selectAllRecipe(RecipeDTO recipeDTO);
    // 레시피 한개
    public RecipeDTO selectOneRecipe(RecipeDTO recipeDTO);

    //물품 클릭시 물품으로 이동 --> Product에서 진행

}
