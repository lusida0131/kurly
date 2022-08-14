package com.example.kurly.recipe;

import com.example.kurly.buy.BuyDTO;

import java.util.List;

public interface RecipeService {
    public void insertRecipe(RecipeDTO recipeDTO, BuyDTO buyDTO);
    public void deleteRecipe(RecipeDTO recipeDTO); // 추후 사용유무 따지기(22.08.14)
    public List<RecipeDTO> selectAllRecipe(RecipeDTO recipeDTO);
    public RecipeDTO selectOneRecipe(RecipeDTO recipeDTO);

}
