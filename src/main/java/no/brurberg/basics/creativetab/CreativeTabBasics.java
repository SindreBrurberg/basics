package no.brurberg.basics.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import no.brurberg.basics.reference.Reference;

public class CreativeTabBasics {
    public static final CreativeTabs BASICS_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
