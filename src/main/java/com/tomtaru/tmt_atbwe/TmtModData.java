package com.tomtaru.tmt_atbwe;

import blusunrize.immersiveengineering.api.crafting.ClocheRenderFunction;
import blusunrize.immersiveengineering.client.utils.ClocheRenderFunctions;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

import java.util.List;

public class TmtModData {

    public enum ClocheRenderType {
        GENERIC,
        CROP,
        STEM
    }

    public enum PlantCategory {
        FUNGI,
        FLOWER,
        VEGETABLE,
        FRUIT,
        CACTUS,
        REED,
        PUMPKIN,
        SWAMP
    }

    public record ModPedia(String modid, String modName) {
        public static final ModPedia ATBWG  = new ModPedia("biomeswevegone", "All The Biomes We've Gone");
        public static final ModPedia C      = new ModPedia("c", "Common");
        public static final ModPedia FD     = new ModPedia("farmersdelight", "Farmer's Delight");
        public static final ModPedia IE     = new ModPedia("immersiveengineering", "Immersive Engineering");
        public static final ModPedia MC     = new ModPedia("minecraft", "Minecraft");

        public ResourceLocation id(String path) {
            return ResourceLocation.fromNamespaceAndPath(this.modid, path);
        }
    }

    public record TreePedia(String treeType) {
        public static final TreePedia ASPEN                 = new TreePedia("aspen");
        public static final TreePedia BAOBAB                = new TreePedia("baobab");
        public static final TreePedia BLUE_ENCHANTED        = new TreePedia("blue_enchanted");
        public static final TreePedia CIKA                  = new TreePedia("cika");
        public static final TreePedia CYPRESS               = new TreePedia("cypress");
        public static final TreePedia EBONY                 = new TreePedia("ebony");
        public static final TreePedia FIR                   = new TreePedia("fir");
        public static final TreePedia FLORUS                = new TreePedia("florus");
        public static final TreePedia GREEN_ENCHANTED       = new TreePedia("green_enchanted");
        public static final TreePedia HOLLY                 = new TreePedia("holly");
        public static final TreePedia IRONWOOD              = new TreePedia("ironwood");
        public static final TreePedia JACARANDA             = new TreePedia("jacaranda");
        public static final TreePedia MAHOGANY              = new TreePedia("mahogany");
        public static final TreePedia MAPLE                 = new TreePedia("maple");
        public static final TreePedia PALM                  = new TreePedia("palm");
        public static final TreePedia PINE                  = new TreePedia("pine");
        public static final TreePedia RAINBOW_EUCALYPTUS    = new TreePedia("rainbow_eucalyptus");
        public static final TreePedia REDWOOD               = new TreePedia("redwood");
        public static final TreePedia SAKURA                = new TreePedia("sakura");
        public static final TreePedia SKYRIS                = new TreePedia("skyris");
        public static final TreePedia SPIRIT                = new TreePedia("spirit");
        public static final TreePedia WHITE_MANGROVE        = new TreePedia("white_mangrove");
        public static final TreePedia WILLOW                = new TreePedia("willow");
        public static final TreePedia WITCH_HAZEL           = new TreePedia("witch_hazel");
        public static final TreePedia ZELKOVA               = new TreePedia("zelkova");

        public static final List<TreePedia> TREEPEDIA = List.of(
                ASPEN, BAOBAB, BLUE_ENCHANTED, CIKA, CYPRESS, EBONY, FIR, FLORUS, GREEN_ENCHANTED, HOLLY, IRONWOOD,
                JACARANDA, MAHOGANY, MAPLE, PALM, PINE, RAINBOW_EUCALYPTUS, REDWOOD, SAKURA, SKYRIS, SPIRIT,
                WHITE_MANGROVE, WILLOW, WITCH_HAZEL, ZELKOVA
        );

        public ResourceLocation log() {
            if (!this.treeType.equals("florus")) {
                return ModPedia.ATBWG.id(this.treeType + "_log");
            }
            else  return ModPedia.ATBWG.id(this.treeType + "_stem");
        }

        public ResourceLocation wood() {
            return ModPedia.ATBWG.id(this.treeType + "_wood");
        }

        public ResourceLocation strippedLog() {
            if (!this.treeType.equals("florus")) {
                return ModPedia.ATBWG.id("stripped_" + this.treeType + "_log");
            }
            else  return ModPedia.ATBWG.id("stripped_" + this.treeType + "_stem");
        }

        public ResourceLocation strippedWood() {
            return ModPedia.ATBWG.id("stripped_" + this.treeType + "_wood");
        }

        public ResourceLocation planks() {
            return ModPedia.ATBWG.id(this.treeType + "_planks");
        }

        public ResourceLocation stairs() {
            return ModPedia.ATBWG.id(this.treeType + "_stairs");
        }

        public ResourceLocation slab() {
            return ModPedia.ATBWG.id(this.treeType + "_slab");
        }

        public ResourceLocation fence() {
            return ModPedia.ATBWG.id(this.treeType + "_fence");
        }

        public ResourceLocation fenceGate() {
            return ModPedia.ATBWG.id(this.treeType + "_fence_gate");
        }

        public ResourceLocation door() {
            return ModPedia.ATBWG.id(this.treeType + "_door");
        }

        public ResourceLocation trapdoor() {
            return ModPedia.ATBWG.id(this.treeType + "_trapdoor");
        }

        public ResourceLocation pressurePlate() {
            return ModPedia.ATBWG.id(this.treeType + "_pressure_plate");
        }

        public ResourceLocation button() {
            return ModPedia.ATBWG.id(this.treeType + "_button");
        }

        public ResourceLocation bookshelf() {
            return ModPedia.ATBWG.id(this.treeType + "_bookshelf");
        }

        public ResourceLocation craftingTable() {
            return ModPedia.ATBWG.id(this.treeType + "_crafting_table");
        }

        public ResourceLocation leaves() {
            return ModPedia.ATBWG.id(this.treeType + "_leaves");
        }

        public ResourceLocation sapling() {
            return ModPedia.ATBWG.id(this.treeType + "_sapling");
        }

        public ResourceLocation sign() {
            return ModPedia.ATBWG.id(this.treeType + "_sign");
        }

        public ResourceLocation hangingSign() {
            return ModPedia.ATBWG.id(this.treeType + "_hanging_sign");
        }

        public ResourceLocation boat() {
            return ModPedia.ATBWG.id(this.treeType + "_boat");
        }

        public ResourceLocation chestBoat() {
            return ModPedia.ATBWG.id(this.treeType + "_chest_boat");
        }

        public Holder<Item> getItemHolder(ResourceLocation id) {
            ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
            return BuiltInRegistries.ITEM.getHolderOrThrow(key);
        }

        public Ingredient getIngredient(ResourceLocation id) {
            return Ingredient.of(getItemHolder(id).value());
        }
    }

    public record HerbaPedia (String herbType, int yield,  ClocheRenderType renderType, PlantCategory category) {
        public static final HerbaPedia HYDRANGEA_BUSH = new HerbaPedia("hydrangea_bush", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia SHRUB = new HerbaPedia("shrub", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia FIRECRACKER_FLOWER_BUSH = new HerbaPedia("firecracker_flower_bush", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia GREEN_MUSHROOM = new HerbaPedia("green_mushroom", 1, ClocheRenderType.GENERIC, PlantCategory.FUNGI);
        public static final HerbaPedia WEEPING_MILKCAP = new HerbaPedia("weeping_milkcap", 1, ClocheRenderType.GENERIC, PlantCategory.FUNGI);
        public static final HerbaPedia WOOD_BLEWIT = new HerbaPedia("wood_blewit", 1, ClocheRenderType.GENERIC, PlantCategory.FUNGI);
        public static final HerbaPedia TALL_ALLIUM = new HerbaPedia("tall_allium", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia ALLIUM_FLOWER_BUSH = new HerbaPedia("allium_flower_bush", 1 , ClocheRenderType.GENERIC, PlantCategory.FLOWER );
        public static final HerbaPedia PINK_ALLIUM = new HerbaPedia("pink_allium", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia TALL_PINK_ALLIUM = new HerbaPedia("tall_pink_allium", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PINK_ALLIUM_FLOWER_BUSH = new HerbaPedia("pink_allium_flower_bush", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WHITE_ALLIUM = new HerbaPedia("white_allium", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia TALL_WHITE_ALLIUM = new HerbaPedia("tall_white_allium", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WHITE_ALLIUM_FLOWER_BUSH = new HerbaPedia("white_allium_flower_bush", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        //public static final HerbaPedia CYAN_PITCHER_PLANT = new HerbaPedia("cyan_pitcher_plant", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER); these are non plantable, make seperate exeption recipes
        //public static final HerbaPedia MAGENTA_PITCHER_PLANT = new HerbaPedia("magenta_pitcher_plant", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER); these are non plantable, make seperate exeption recipes
        public static final HerbaPedia ROSE = new HerbaPedia("rose", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia OSIRIA_ROSE = new HerbaPedia("osiria_rose", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BLACK_ROSE = new HerbaPedia("black_rose", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia CYAN_ROSE = new HerbaPedia("cyan_rose", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BLUE_ROSE_BUSH = new HerbaPedia("blue_rose_bush", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia CYAN_TULIP = new HerbaPedia("cyan_tulip", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia GREEN_TULIP = new HerbaPedia("green_tulip", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia MAGENTA_TULIP = new HerbaPedia("magenta_tulip", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PURPLE_TULIP = new HerbaPedia("purple_tulip", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia YELLOW_TULIP = new HerbaPedia("yellow_tulip", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia AMARANTH = new HerbaPedia("amaranth", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia CYAN_AMARANTH = new HerbaPedia("cyan_amaranth", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia MAGENTA_AMARANTH = new HerbaPedia("magenta_amaranth", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia ORANGE_AMARANTH = new HerbaPedia("orange_amaranth", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PURPLE_AMARANTH = new HerbaPedia("purple_amaranth", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BLUE_SAGE = new HerbaPedia("blue_sage", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PURPLE_SAGE = new HerbaPedia("purple_sage", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WHITE_SAGE = new HerbaPedia("white_sage", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia DAFFODIL = new HerbaPedia("daffodil", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PINK_DAFFODIL = new HerbaPedia("pink_daffodil", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia YELLOW_DAFFODIL = new HerbaPedia("yellow_daffodil", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PINK_ANEMONE = new HerbaPedia("pink_anemone", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WHITE_ANEMONE = new HerbaPedia("white_anemone", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia ALPINE_BELLFLOWER = new HerbaPedia("alpine_bellflower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia LAZARUS_BELLFLOWER = new HerbaPedia("lazarus_bellflower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PEACH_LEATHER_FLOWER = new HerbaPedia("peach_leather_flower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia VIOLET_LEATHER_FLOWER = new HerbaPedia("violet_leather_flower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia ANGELICA = new HerbaPedia("angelica", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BEGONIA = new HerbaPedia("begonia", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BISTORT = new HerbaPedia("bistort", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia CALIFORNIA_POPPY = new HerbaPedia("california_poppy", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia CROCUS = new HerbaPedia("crocus", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia DELPHINIUM = new HerbaPedia("delphinium", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia FAIRY_SLIPPER = new HerbaPedia("fairy_slipper", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia FOXGLOVE = new HerbaPedia("foxglove", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia GUZMANIA = new HerbaPedia("guzmania", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia INCAN_LILY = new HerbaPedia("incan_lily", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia IRIS = new HerbaPedia("iris", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia JAPANESE_ORCHID = new HerbaPedia("japanese_orchid", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia KOVAN_FLOWER = new HerbaPedia("kovan_flower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia LOLLIPOP_FLOWER = new HerbaPedia("lollipop_flower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia ORANGE_DAISY = new HerbaPedia("orange_daisy", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PROTEA_FLOWER = new HerbaPedia("protea_flower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia RICHEA = new HerbaPedia("richea", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia SILVER_VASE_FLOWER = new HerbaPedia("silver_vase_flower", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia HORSEWEED = new HerbaPedia("horseweed", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WINTER_SUCCULENT = new HerbaPedia("winter_succulent", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia SNOWDROPS = new HerbaPedia("snowdrops", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WINTER_CYCLAMEN = new HerbaPedia("winter_cyclamen", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WINTER_ROSE = new HerbaPedia("winter_rose", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WINTER_SCILLA = new HerbaPedia("winter_scilla", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia TALL_PRAIRIE_GRASS = new HerbaPedia("tall_prairie_grass", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia PRAIRIE_GRASS = new HerbaPedia("prairie_grass", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia TALL_BEACH_GRASS = new HerbaPedia("tall_beach_grass", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BEACH_GRASS = new HerbaPedia("beach_grass", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia CLOVER_PATCH = new HerbaPedia("clover_patch", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia FLOWER_PATCH = new HerbaPedia("flower_patch", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WITCH_HAZEL_BRANCH = new HerbaPedia("witch_hazel_branch", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia WITCH_HAZEL_BLOSSOM = new HerbaPedia("witch_hazel_blossom", 1, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia SHELF_FUNGI = new HerbaPedia("shelf_fungi", 1, ClocheRenderType.GENERIC, PlantCategory.FUNGI);
        public static final HerbaPedia MINI_CACTUS = new HerbaPedia("mini_cactus", 1, ClocheRenderType.GENERIC, PlantCategory.CACTUS);
        public static final HerbaPedia PRICKLY_PEAR_CACTUS = new HerbaPedia("prickly_pear_cactus", 1, ClocheRenderType.GENERIC, PlantCategory.CACTUS);
        public static final HerbaPedia GOLDEN_SPINED_CACTUS = new HerbaPedia("golden_spined_cactus", 1, ClocheRenderType.GENERIC, PlantCategory.CACTUS);
        public static final HerbaPedia BARREL_CACTUS = new HerbaPedia("barrel_cactus", 1, ClocheRenderType.GENERIC, PlantCategory.CACTUS);
        public static final HerbaPedia FLOWERING_BARREL_CACTUS = new HerbaPedia("flowering_barrel_cactus", 1, ClocheRenderType.GENERIC, PlantCategory.CACTUS);
        public static final HerbaPedia ALOE_VERA = new HerbaPedia("aloe_vera", 2, ClocheRenderType.GENERIC, PlantCategory.FLOWER);
        public static final HerbaPedia BLUE_GLOWCANE_SHOOT = new HerbaPedia("blue_glowcane_shoot", 3, ClocheRenderType.GENERIC, PlantCategory.REED);
        public static final HerbaPedia GREEN_GLOWCANE_SHOOT = new HerbaPedia("green_glowcane_shoot", 3, ClocheRenderType.GENERIC, PlantCategory.REED);
        public static final HerbaPedia RED_GLOWCANE_SHOOT = new HerbaPedia("red_glowcane_shoot", 3, ClocheRenderType.GENERIC, PlantCategory.REED);
        public static final HerbaPedia YELLOW_GLOWCANE_SHOOT = new HerbaPedia("yellow_glowcane_shoot", 3, ClocheRenderType.GENERIC, PlantCategory.REED);
        public static final HerbaPedia PALE_PUMPKIN = new HerbaPedia("pale_pumpkin", 1, ClocheRenderType.STEM, PlantCategory.PUMPKIN);
        public static final HerbaPedia BLUEBERRIES = new HerbaPedia("blueberries", 1, ClocheRenderType.GENERIC, PlantCategory.FRUIT);
        public static final HerbaPedia ODDION_BULB = new HerbaPedia("oddion_bulb", 3, ClocheRenderType.CROP, PlantCategory.VEGETABLE);
        public static final HerbaPedia WHITE_PUFFBALL_CAP = new HerbaPedia("white_puffball_cap", 1, ClocheRenderType.GENERIC, PlantCategory.FUNGI);
        public static final HerbaPedia CATTAIL_SPROUT = new HerbaPedia("cattail_sprout", 1, ClocheRenderType.GENERIC, PlantCategory.REED);
        public static final HerbaPedia FLUORESCENT_CATTAIL_SPROUT = new HerbaPedia("fluorescent_cattail_sprout", 1, ClocheRenderType.GENERIC, PlantCategory.REED);

        public static final List<HerbaPedia> HERBAPEDIA = List.of(
                HYDRANGEA_BUSH, SHRUB, FIRECRACKER_FLOWER_BUSH, GREEN_MUSHROOM, WEEPING_MILKCAP,WOOD_BLEWIT, TALL_ALLIUM,
                ALLIUM_FLOWER_BUSH, PINK_ALLIUM, TALL_PINK_ALLIUM, PINK_ALLIUM_FLOWER_BUSH, WHITE_ALLIUM,
                TALL_WHITE_ALLIUM, WHITE_ALLIUM_FLOWER_BUSH,
                // CYAN_PITCHER_PLANT, MAGENTA_PITCHER_PLANT,
                ROSE, OSIRIA_ROSE,
                BLACK_ROSE, CYAN_ROSE, BLUE_ROSE_BUSH, CYAN_TULIP, GREEN_TULIP, MAGENTA_TULIP, PURPLE_TULIP, YELLOW_TULIP,
                AMARANTH, CYAN_AMARANTH, MAGENTA_AMARANTH, ORANGE_AMARANTH, PURPLE_AMARANTH, BLUE_SAGE, PURPLE_SAGE,
                WHITE_SAGE, DAFFODIL, PINK_DAFFODIL, YELLOW_DAFFODIL, PINK_ANEMONE, WHITE_ANEMONE, ALPINE_BELLFLOWER,
                LAZARUS_BELLFLOWER, PEACH_LEATHER_FLOWER, VIOLET_LEATHER_FLOWER, ANGELICA, BEGONIA, BISTORT,
                CALIFORNIA_POPPY, CROCUS, DELPHINIUM, FAIRY_SLIPPER, FOXGLOVE, GUZMANIA, INCAN_LILY, IRIS, JAPANESE_ORCHID,
                KOVAN_FLOWER, LOLLIPOP_FLOWER, ORANGE_DAISY, PROTEA_FLOWER, RICHEA, SILVER_VASE_FLOWER, HORSEWEED,
                WINTER_SUCCULENT, SNOWDROPS, WINTER_CYCLAMEN, WINTER_ROSE, WINTER_SCILLA, TALL_PRAIRIE_GRASS, PRAIRIE_GRASS,
                TALL_BEACH_GRASS, BEACH_GRASS, CLOVER_PATCH, FLOWER_PATCH, WITCH_HAZEL_BRANCH, WITCH_HAZEL_BLOSSOM,
                SHELF_FUNGI, MINI_CACTUS, PRICKLY_PEAR_CACTUS, GOLDEN_SPINED_CACTUS, BARREL_CACTUS, FLOWERING_BARREL_CACTUS,
                ALOE_VERA, BLUE_GLOWCANE_SHOOT, GREEN_GLOWCANE_SHOOT, RED_GLOWCANE_SHOOT, YELLOW_GLOWCANE_SHOOT, PALE_PUMPKIN,
                BLUEBERRIES, ODDION_BULB, WHITE_PUFFBALL_CAP, CATTAIL_SPROUT, FLUORESCENT_CATTAIL_SPROUT
        );

        public ResourceLocation seedItem() {
            if (this.herbType.equals("white_puffball_cap")) {
                return ModPedia.ATBWG.id("white_puffball_spores");
            } else if (this.herbType.equals("pale_pumpkin")) {
                return ModPedia.ATBWG.id("pale_pumpkin_seeds");
            } else return ModPedia.ATBWG.id(this.herbType);
        }

        public Holder<Item> getItemHolder(ResourceLocation id) {
            ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
            return BuiltInRegistries.ITEM.getHolderOrThrow(key);
        }

        public Ingredient getIngredient(ResourceLocation id) {
            return Ingredient.of(getItemHolder(id).value());
        }

        public ResourceLocation cropRenderBlock() {
            if (this.herbType.equals("oddion_bulb")) {
                return ModPedia.ATBWG.id("oddion_crop");
            } else if (this.herbType.equals("blueberries")) {
                return ModPedia.ATBWG.id("blueberry_bush");

            }
            return ModPedia.ATBWG.id(this.herbType);
        }

        public Block getCropRenderBlock() {

            return BuiltInRegistries.BLOCK.get(cropRenderBlock());
        }

        public ResourceLocation stemRenderBlock() {
            if (this.herbType.equals("pale_pumpkin")) {
                return ModPedia.ATBWG.id("pale_pumpkin_stem");
            }
            throw new IllegalStateException("This crop has no stem!");
        }

        public Block getStemRenderBlock() {
            return BuiltInRegistries.BLOCK.get(stemRenderBlock());
        }

        public ResourceLocation attachedStemRenderBlock() {
            if (this.herbType.equals("pale_pumpkin")) {
                return ModPedia.ATBWG.id("attached_pale_pumpkin");
            }
            throw new IllegalStateException("This crop has no attached stem!");
        }

        public Block getAttachedStemRenderBlock() {
            return BuiltInRegistries.BLOCK.get(attachedStemRenderBlock());
        }

        public ResourceLocation produceItem() {
            return ModPedia.ATBWG.id(this.herbType);
        }

        public ClocheRenderFunction getClocheRenderFunction() {
            return switch (this.renderType) {
                case CROP ->
                    new ClocheRenderFunctions.RenderFunctionCrop(getCropRenderBlock());
                case GENERIC ->
                    new ClocheRenderFunctions.RenderFunctionGeneric(getCropRenderBlock());
                case STEM ->
                    new ClocheRenderFunctions.RenderFunctionStem(getCropRenderBlock(), getStemRenderBlock(), getAttachedStemRenderBlock());
            };
        }

        public int getYield() {
            return this.yield;
        }

        public Ingredient getSoil() {
            return switch (this.category) {
                case FUNGI ->
                        Ingredient.of(Items.MYCELIUM);
                case FLOWER ->
                        Ingredient.of(Items.DIRT);
                case VEGETABLE ->
                        Ingredient.of(Items.DIRT);
                case FRUIT ->
                        Ingredient.of(Items.DIRT);
                case CACTUS ->
                        Ingredient.of(Tags.Items.SANDS);
                case PUMPKIN ->
                        Ingredient.of(Items.DIRT);
                case REED ->
                        Ingredient.of(Items.DIRT);
                case SWAMP ->
                        Ingredient.of(Items.WATER_BUCKET);
            };
        }

        public boolean worksOnRichSoil() {
            return this.category == PlantCategory.FLOWER
                    || this.category == PlantCategory.VEGETABLE
                    || this.category == PlantCategory.PUMPKIN
                    || this.category == PlantCategory.REED;
        }
    }
}
