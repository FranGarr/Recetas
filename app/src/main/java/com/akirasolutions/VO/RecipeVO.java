package com.akirasolutions.VO;

import java.util.ArrayList;

/**
 * Created by Ebuctop on 01/04/2018.
 */
public class RecipeVO {

    String name;
    String description;
    ArrayList<String> ingredients;
    String type;
    String category;
    String prepare;
    String id;



    public RecipeVO () {
        super();
    }

    public RecipeVO(String name, String description, String ingredients, String type, String category, String prepare) {
        super();
        this.ingredients = new ArrayList<String>();
        setName(name);
        setDescription(description);
        setIngredients(ingredients);
        setType(type);
        setCategory(category);
        setPrepare(prepare);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if("".equals(description)){
            this.description =null;
        }else {
            this.description = description;
        }
    }

    public ArrayList<String> getAllIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        if("".equals(ingredients)){
            this.ingredients =null;
        }else {
            String[] ingredient=ingredients.split(";");
            for(String item:ingredient){
                this.ingredients.add(item);
            }

        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if("".equals(type)){
            this.type =null;
        }else {
            this.type = type;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if("".equals(category)){
            this.category =null;
        }else {
            this.category = category;
        }
    }

    public String getPrepare() {
        return prepare;
    }

    public void setPrepare(String prepare) {
        if("".equals(prepare)){
            this.prepare =null;
        }else {
            this.prepare = prepare;
        }
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
}
