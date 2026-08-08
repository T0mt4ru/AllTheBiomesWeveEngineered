package com.tomtaru.tmt_otbwe.datagen;

import com.tomtaru.tmt_otbwe.TmtModData;
import com.tomtaru.tmt_otbwe.Tmt_otbweMain;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class TmtModItemTagsProvider extends ItemTagsProvider {

    public TmtModItemTagsProvider(PackOutput output,
                                  CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  CompletableFuture<TagLookup<Block>> blockTags,
                                  ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Tmt_otbweMain.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        TagKey<Item> richSoilCompat = TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath(Tmt_otbweMain.MODID, "compat/rich_soil"));

        tag(richSoilCompat).addOptional(ResourceLocation.fromNamespaceAndPath(TmtModData.ModPedia.FD.modid(), "rich_soil"));

    }
}