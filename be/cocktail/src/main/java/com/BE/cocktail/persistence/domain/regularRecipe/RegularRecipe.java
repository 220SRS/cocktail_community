package com.BE.cocktail.persistence.domain.regularRecipe;

import com.BE.cocktail.dto.regularRecipe.RegularRecipeCreateDto;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
//@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RegularRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String name;

    private String description;

    private String recipe;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Integer alcVol;

    @Column(nullable = false)
    private String baseAlc;

    @Column(nullable = false)
    private String ingredient;

    @Column(nullable = false)
    private String amount;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime modifiedAt;

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime deletedAt;

    //id와 시간 데이터를 뺀 생성자
    private RegularRecipe(String imageUrl,
                          String name,
                          String description,
                          String recipe,
                          Integer alcVol,
                          String baseAlc,
                          String ingredient,
                          String amount) {

        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.alcVol = alcVol;
        this.baseAlc = baseAlc;
        this.ingredient = ingredient;
        this.amount = amount;
    }

    //test용 정적 팩토리 메서드
    public static RegularRecipe of(String imageUrl, String name, String description, String recipe, Integer alcVol, String baseAlc, String ingredient, String amount) {

        RegularRecipe regularRecipe = new RegularRecipe(imageUrl, name, description, recipe, alcVol, baseAlc, ingredient, amount);

        return regularRecipe;
    }
}