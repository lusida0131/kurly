package com.example.kurly.recipe;

import com.example.kurly.buy.BuyDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private final RecipeMapper recipeMapper;

    @Override
    public void insertRecipe(RecipeDTO recipeDTO, BuyDTO buyDTO) {
        recipeMapper.insertRecipe(recipeDTO, buyDTO);
    }

    @Override
    public void deleteRecipe(RecipeDTO recipeDTO) {
        recipeMapper.deleteRecipe(recipeDTO);
    }

    @Override
    public List<RecipeDTO> selectAllRecipe(RecipeDTO recipeDTO) {
        return recipeMapper.selectAllRecipe(recipeDTO);
    }

    @Override
    public RecipeDTO selectOneRecipe(RecipeDTO recipeDTO) {
        return recipeMapper.selectOneRecipe(recipeDTO);
    }
}
