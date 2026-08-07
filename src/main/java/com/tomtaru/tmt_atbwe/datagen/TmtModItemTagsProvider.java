package com.tomtaru.tmt_atbwe.datagen;

import com.tomtaru.tmt_atbwe.TmtModData;
import com.tomtaru.tmt_atbwe.Tmt_atbweMain;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class TmtModItemTagsProvider extends ItemTagsProvider {

    public TmtModItemTagsProvider(PackOutput output,
                                  CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  CompletableFuture<TagLookup<Block>> blockTags,
                                  ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Tmt_atbweMain.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        TagKey<Item> richSoilCompat = TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath(Tmt_atbweMain.MODID, "compat/rich_soil"));

        tag(richSoilCompat).addOptional(ResourceLocation.fromNamespaceAndPath(TmtModData.ModPedia.FD.modid(), "rich_soil"));

    }
}