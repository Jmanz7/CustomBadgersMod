package jmanz7.CustomBadgesMod.init;


import jmanz7.CustomBadgesMod.items.ItemBadge1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item badge1;
	//public static Item badge2;
	//public static Item badge3;
	//public static Item badge4;
	//public static Item badge5;
	//public static Item badge6;
	//public static Item badge7;
	//public static Item badge8;
	//public static Item badge9;
	//public static Item badge10;
	//public static Item badge11;
	//public static Item badge12;
	//public static Item badge13;
	//public static Item badge14;
	//public static Item badge15;
	//public static Item badge16;
	//public static Item badge17;
	//public static Item badge18;
	
	
	public static void init()
	{
		badge1 = new ItemBadge1();
	}
	public static void register()
	{
		GameRegistry.register(badge1);
	}
	public static void registerRenders()
	{
		registerRender(badge1);
	}
	private static void registerRender(Item item)
	{
		  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
