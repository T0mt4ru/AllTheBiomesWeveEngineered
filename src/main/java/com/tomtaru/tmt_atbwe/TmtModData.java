package com.tomtaru.tmt_atbwe;

import net.minecraft.resources.ResourceLocation;

public class TmtModData {

    public record ModPedia(String modid, String modName) {
        public static final ModPedia ATBWG  = new ModPedia("biomeswevegone", "All The Biomes We've Gone");
        public static final ModPedia IE     = new ModPedia("immersiveengineering", "Immersive Engineering");
        public static final ModPedia FD     = new ModPedia("farmersdelight", "Farmer's Delight");

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
        public static final TreePedia PALO_VERDE            = new TreePedia("palo_verde");

        public ResourceLocation log() {
            return ModPedia.ATBWG.id(this.treeType + "_log");
        }

        public ResourceLocation wood() {
            return ModPedia.ATBWG.id(this.treeType + "_wood");
        }

        public ResourceLocation strippedLog() {
            return ModPedia.ATBWG.id("stripped_" + this.treeType + "_log");
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
    }
}
