package jmanz7.CustomBadgesMod.proxy;

import jmanz7.CustomBadgesMod.init.ModItems;
//
public class ClientProxy implements CommonProxy
{

	@Override
	public void init() 
	{
		ModItems.registerRenders();
	}

}
