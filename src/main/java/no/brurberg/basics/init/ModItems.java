package no.brurberg.basics.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import no.brurberg.basics.reference.Names;
import no.brurberg.basics.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);
    }
}
