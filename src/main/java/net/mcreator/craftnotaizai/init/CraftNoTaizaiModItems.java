
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.craftnotaizai.item.PlusonexpItem;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<Item> PLUSONEXP = REGISTRY.register("plusonexp", () -> new PlusonexpItem());
}
