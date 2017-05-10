package com.artxak.recipebook;

public class IngredientsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
