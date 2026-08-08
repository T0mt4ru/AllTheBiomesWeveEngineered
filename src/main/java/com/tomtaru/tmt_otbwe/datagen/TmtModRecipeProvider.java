package com.tomtaru.tmt_otbwe.datagen;

import com.tomtaru.tmt_otbwe.datagen.recipeproviders.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class TmtModRecipeProvider extends RecipeProvider {

    public TmtModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        //VanillaRecipes.build(output);
        //FermenterRecipes.build(output);
        //MixerRecipes.build(output);
        //BottlingMachineRecipes.build(output);
        TmtClocheRecipes.build(output);
        //CrusherRecipes.build(output);
        //MetalPressRecipes.build(output);
        TmtSawmillRecipes.build(output);
        //SqueezerRecipes.build(output);
        //BlueprintRecipes.build(output);
        //ThermoelectricRecipes.build(output);
        //RefineryRecipes.build(output);
    }
}