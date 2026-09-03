package com.dragn0007.nomadic_herbs.util;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class NHTags {

    public static class Items {
        public static final TagKey<Item> MAKES_PLANT_FIBER = forgeTag("makes_plant_fiber");
        public static final TagKey<Item> SALT = forgeTag("salt");
        public static final TagKey<Item> LILY_PADS = forgeTag("lily_pads");
        public static final TagKey<Item> STRING = forgeTag("string");
        public static final TagKey<Item> HERBAL_WATER_ITEMS = forgeTag("herbal_water_items");
        public static final TagKey<Item> CACTI = forgeTag("cacti");
        public static final TagKey<Item> HONEY = forgeTag("honey");
        public static final TagKey<Item> CAN_DRY = forgeTag("can_dry");

        public static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(NomadicHerbs.MODID, name));
        }
    }
}
