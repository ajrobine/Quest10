package edu.unca.ajrobine.AndrewRobinetteQuest10;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;


public class AndrewRobinetteQuest10 extends JavaPlugin {
	public TestItem pencil;
	AndrewRobinetteQuest10CommandExecutor executor = new AndrewRobinetteQuest10CommandExecutor(
			this);

	
	//Modifies code shown in class to create a pencil
	
	@Override
	public void onEnable() {
		
		pencil = new TestItem(plugin, "pencil", http://cs.unca.edu/~robineaj/pencil.png");
		addpencilRecipe();
		
		getLogger().log(Level.INFO, "[Spout Block Test Plugin] Enabled!");

		
		saveDefaultConfig();

		
		new AndrewRobinetteQuest10Listener(this);

		
		this.getCommand("message").setExecutor(executor);
		this.getCommand("inventoryBlock").setExecutor(executor);
		this.getCommand("worldBlock").setExecutor(executor);

	}


	@Override
	public void onDisable() {
		getLogger().log(Level.INFO, "[Spout Test Plugin] Disabled!");

	}
	
	//Creates the recipe for making a pencil
	
	public void addpencilRecipe() {
		SpoutItemStack item = new SpoutItemStack(pencil, 1);
		SpoutShapedRecipe recipe = new SpoutShapedRecipe(item);
		recipe.shape(" X ", " X ", " X ");
		recipe.setIngredient('X', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	}

}
