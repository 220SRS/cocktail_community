package com.BE.cocktail.controller.regularRecipe;

import com.BE.cocktail.dto.apiResponse.ApiResponse;
import com.BE.cocktail.dto.regularRecipe.RegularRecipeCreateDto;
import com.BE.cocktail.dto.regularRecipe.RegularRecipeCreateResponseDto;
import com.BE.cocktail.dto.regularRecipe.RegularRecipeMultiResponseDto;

import com.BE.cocktail.service.regularRecipe.RegularRecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class RegularRecipeController {

    private final RegularRecipeService regularRecipeService;


//    @PostMapping("/regular/create")
//    public ApiResponse<RegularRecipeCreateResponseDto> createRegularRecipe(@RequestBody RegularRecipeCreateDto createdto) {
//
//        RegularRecipeCreateResponseDto responseDto = regularRecipeService.saveRegularRecipe(createdto);
//
//        return ApiResponse.ok(responseDto);
//    }

//    @GetMapping("/regular/find/{recipe_name}")
//    public ApiResponse<RegularRecipeSingleResponseDto> findRegularRecipe(@PathVariable("recipe_name") String name) {
//
//        RegularRecipeSingleResponseDto responseDto = regularRecipeService.findRecipe(name);
//
//        return ApiResponse.ok(responseDto);
//    }

    @GetMapping(value = "/regular/findAll")
    public ResponseEntity<RegularRecipeMultiResponseDto> findAllRegularRecipes() {

        RegularRecipeMultiResponseDto responseDto = regularRecipeService.findAllRecipes();

        return ResponseEntity.ok(responseDto);
    }

}