package net.firecup.mods.techborn.util;
import net.firecup.mods.techborn.Techborn;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;




public class ModTags {
public  static class Blocks{
   public static final TagKey<Block> TITANIUM_PICKAXE
           = tag("needs_titanium_tool");
   private static TagKey<Block> tag(String name){
       return  BlockTags.create(new ResourceLocation(Techborn.MOD_ID, name));
   }
    private static TagKey<Block> forgetag(String name){
        return  BlockTags.create(new ResourceLocation("forge", name));
    }

}

    public  static class Items{

        private static TagKey<Item> tag(String name){
            return  ItemTags.create(new ResourceLocation(Techborn.MOD_ID, name));
        }
        private static TagKey<Item> forgetag(String name){
            return  ItemTags.create(new ResourceLocation("forge", name));
        }


    }
}
