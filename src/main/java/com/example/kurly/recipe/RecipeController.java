package com.example.kurly.recipe;

import com.example.kurly.buy.BuyDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    //리스트 전체 목록 보기
    @PostMapping("/list")
    public String recipeList(@ModelAttribute RecipeDTO recipeDTO){
        recipeService.selectAllRecipe(recipeDTO);
        return "/recipe/list";
    }

    //레시피 작성
    @PostMapping("/write")
    public String recipeForm(@ModelAttribute RecipeDTO recipeDTO, BuyDTO buyDTO){
        recipeService.insertRecipe(recipeDTO,buyDTO);

        return "/recipe/list";
    }

    @PostMapping("/delete")
    public String deleteMyRecipe(@ModelAttribute RecipeDTO recipeDTO, HttpSession session){
        // 화면단에서 처리 후 alert 하는게 더 나을듯
        if(recipeDTO.getRecipeid().equals( session.getId())){ //null대신 쿠키나 세션에 들어있는 아이디
            recipeService.deleteRecipe(recipeDTO);
            return "/recipe/list";
        }else{
            return "/recipe/list";
        }
    }
    @RequestMapping(value = { "/article/{recipeNo}"})
    public String selectOneList(@ModelAttribute RecipeDTO recipeDTO){
        recipeService.selectOneRecipe(recipeDTO);
        return "/article/{recipeNo}";
    }





}
