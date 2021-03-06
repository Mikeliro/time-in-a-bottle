package com.haoict.tiab;

import com.haoict.tiab.item.ItemTimeInABottle;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistryHandler {
  // create DeferredRegister object
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Config.MOD_ID);
  // register item
  public static final RegistryObject<Item> BOTTLE = ITEMS.register("timeinabottle", () -> new ItemTimeInABottle());

  public static void init() {
    // attach DeferredRegister to the event bus
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }
}
