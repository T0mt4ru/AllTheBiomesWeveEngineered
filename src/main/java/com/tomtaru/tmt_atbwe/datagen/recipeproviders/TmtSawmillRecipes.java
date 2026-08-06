package com.tomtaru.tmt_atbwe.datagen.recipeproviders;

import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import blusunrize.immersiveengineering.api.crafting.SawmillRecipe;
import blusunrize.immersiveengineering.api.crafting.TagOutput;
import blusunrize.immersiveengineering.api.crafting.TagOutputList;
import com.tomtaru.tmt_atbwe.TmtModData;
import com.tomtaru.tmt_atbwe.Tmt_atbweMain;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;


public class TmtSawmillRecipes {

    public static void build(RecipeOutput output) {
        var energyStandard = 1600;

        for(TmtModData.TreePedia tree : TmtModData.TreePedia.TREEPEDIA) {

            generateSawmillRecipe(output,
                    tree.ingredient(tree.log()),
                    energyStandard,
                    new TagOutput(new IngredientWithSize(tree.ingredient(tree.strippedLog()), 1)),
                    new TagOutputList(new TagOutput(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(TmtModData.ModPedia.C.modid(), "dusts/wood")))),
                    new TagOutput(new IngredientWithSize(tree.ingredient(tree.planks()), 6)),
                    new TagOutputList(new TagOutput(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(TmtModData.ModPedia.C.modid(), "dusts/wood")))),
                    tree.log().getPath());
        }

    }

    private static void generateSawmillRecipe(RecipeOutput sawingOutput, Ingredient input, int energy, TagOutput strippedOutput, TagOutputList secondaryStrippedOutputs, TagOutput output, TagOutputList secondaryOutputs, String recipeName) {
        SawmillRecipe recipe = new SawmillRecipe(
                output,
                strippedOutput,
                input,
                energy,
                secondaryStrippedOutputs,
                secondaryOutputs
        );

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Tmt_atbweMain.MODID, "sawmill/" + recipeName);
        sawingOutput.accept(id, recipe, null);
    }
}