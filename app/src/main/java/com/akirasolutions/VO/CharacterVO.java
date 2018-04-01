package com.akirasolutions.VO;

import java.util.ArrayList;

/**
 * Created by Ebuctop on 01/04/2018.
 */
public class CharacterVO {

    String name;
    String age;
    String id;
    ArrayList<RecipeVO> recipes;
    ArrayList<String> recipesId;


    public CharacterVO(){
        super();
    }

    public CharacterVO(String name, String age, ArrayList<RecipeVO> recipes) {
        setName(name);
        setAge(age);
        setRecipes(recipes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if("".equals(name)){
            this.name =null;
        }else {
            this.name = name;
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if("".equals(age)){
            this.age =null;
        }else {
            this.age = age;
        }
    }

    public ArrayList<RecipeVO> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<RecipeVO> recipes) {
        this.recipes = recipes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if("".equals(id)){
            this.id =null;
        }else {
            this.id = id;
        }
    }

    public ArrayList<String> getRecipesId() {
        return recipesId;
    }

    public void setRecipesId(String recipesId) {
        if("".equals(recipesId)){
            this.recipesId =null;
        }else {
            String[] recipeId=recipesId.split(";");
            for(String id:recipeId){
                this.recipesId.add(id);
            }
        }
    }

    private void buildCharacterById(int id){

    }

}
