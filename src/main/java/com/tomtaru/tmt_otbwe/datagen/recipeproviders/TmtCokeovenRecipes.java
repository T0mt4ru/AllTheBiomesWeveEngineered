package com.tomtaru.tmt_otbwe.datagen.recipeproviders;

import blusunrize.immersiveengineering.api.crafting.CokeOvenRecipe;
import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import blusunrize.immersiveengineering.api.crafting.TagOutput;
import com.tomtaru.tmt_otbwe.Tmt_otbweMain;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import static com.tomtaru.tmt_otbwe.TmtModData.ModPedia.OTBWG;

public class TmtCokeovenRecipes {

    private static void generateCokeovenRecipe(RecipeOutput cokeOutput, Item input, Item outputItem,
                                               int baseTime, int baseCreosoteAmount, String recipeName) {

        String[] suffixes = {"single", "double", "triple", "tetra", "penta", "hexa", "hepta", "octo"};

        for (int i = 1; i <= 8; i++) {

            IngredientWithSize inputIngredient = new IngredientWithSize(Ingredient.of(input), i);
            TagOutput outputResult = new TagOutput(outputItem, i);
            int time = baseTime * i;
            int creosoteAmount = baseCreosoteAmount * i;

            CokeOvenRecipe recipe = new CokeOvenRecipe(
                    outputResult,
                    inputIngredient,
                    time,
                    creosoteAmount
            );


            String suffix = suffixes[i - 1];
            ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Tmt_otbweMain.MODID, "cokeoven/" + recipeName + "_" + suffix);
            cokeOutput.accept(id, recipe, null);
        }
    }

    public static void build(RecipeOutput output) {

        generateCokeovenRecipe(
                output,
                BuiltInRegistries.ITEM.get(OTBWG.id("peat")),
                Items.COAL_BLOCK, //placeholder block, will create peatcoke later
                3200,
                125,
                "placeholder_recipe"
        );
    }
}