package jmanz7.CustomBadgesMod;

public class Reference 
{
	public static final String MOD_ID = "cpb";
	public static final String NAME = "CustomBadgesMod";
	public static final String VERSION = "1.0";
	
	public static final String CLIENT_PROXY_CLASS = "jmanz7.CustomBadgesMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "jmanz7.CustomBadgesMod.proxy.ServerProxy";		
			
	
	
	public static enum CBPItems
    {
    	SIMPLE("badge1", "ItemBadge1");
		//SHELL("badge2", "ItemBadge2");
    	
    	private String unlocalizedName;
    	private String registeryName;
    	
        CBPItems(String unlocalizedName, String registeryName)
        {
        	this.unlocalizedName = unlocalizedName;
        	this.registeryName = registeryName;
        }
        
        public String getUnlocalizedName()
        {
        	return unlocalizedName;
        }
        public String getRegisteryName()
        {
        	return registeryName;
        }
    }

}
