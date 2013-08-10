/** code generated by Kinyoshi */
package net.minecraft.src;

import java.io.*;
import java.util.*;
//import net.minecraft.src.mod_ChertCraft;
import net.minecraft.client.Minecraft;

public class mod_mushroomTorch extends BaseMod
{
	public mod_mushroomTorch()
	{

		readWriteProperties();

        BlockRedMushroomTorch = new BlockRedMushroomTorch(BlockRedMushroomTorchID).setUnlocalizedName("mushroom_red");
        ModLoader.addName(BlockRedMushroomTorch, "Red Mushroom Torch");

        BlockBrownMushroomTorch = new BlockBrownMushroomTorch(BlockBrownMushroomTorchID).setUnlocalizedName("mushroom_brown");
        ModLoader.addName(BlockBrownMushroomTorch, "Brown Mushroom Torch");

        ModLoader.addRecipe(new ItemStack(BlockRedMushroomTorch, 3), new Object[] {"C", "R", "S", 'R', Block.mushroomRed, 'C', Item.coal, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(BlockBrownMushroomTorch, 3), new Object[] {"C", "B", "S", 'B', Block.mushroomBrown, 'C', Item.coal, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(BlockRedMushroomTorch, 3), new Object[] {"C", "R", "S", 'R', Block.mushroomRed, 'C', new ItemStack(Item.coal, 1, 1), 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(BlockBrownMushroomTorch, 3), new Object[] {"C", "B", "S", 'B', Block.mushroomBrown, 'C', new ItemStack(Item.coal, 1, 1), 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(BlockRedMushroomTorch, 3), new Object[] {"C", "R", "S", 'R', Block.mushroomRed, 'C', mod_ChertCraft.ItemUnstableChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(BlockBrownMushroomTorch, 3), new Object[] {"C", "B", "S", 'B', Block.mushroomBrown, 'C', mod_ChertCraft.ItemUnstableChert, 'S', Item.stick});

    }



	public void readWriteProperties() {
		Properties properties = new Properties();
		try
		{
            File file = new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/MushroomTorch.config").toString());
            boolean flag = file.createNewFile();
            if(flag)
            {
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                properties.setProperty("BlockRedMushroomTorchID", Integer.toString(227));
                properties.setProperty("BlockBrownMushroomTorchID", Integer.toString(228));
                properties.store(fileoutputstream, "Change the ID's to fix ID incompatibilities.");
                fileoutputstream.close();
            }
            properties.load(new FileInputStream((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/MushroomTorch.config").toString()));
            BlockRedMushroomTorchID = Integer.parseInt(properties.getProperty("BlockRedMushroomTorchID"));
            BlockBrownMushroomTorchID = Integer.parseInt(properties.getProperty("BlockBrownMushroomTorchID"));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            BlockRedMushroomTorchID = 227;
            BlockBrownMushroomTorchID = 228;
        }
	}
	
	public String getVersion() {
		return "Minecraft1.5.2__MushroomTorch_1.5.2r1(ChertCraft)";
	}

    public static Block BlockRedMushroomTorch;
    public static int BlockRedMushroomTorchID;
    public static Block BlockBrownMushroomTorch;
    public static int BlockBrownMushroomTorchID;

	public void load()
	{
	    ModLoader.registerBlock(BlockRedMushroomTorch);
        ModLoader.registerBlock(BlockBrownMushroomTorch);
	}
}
