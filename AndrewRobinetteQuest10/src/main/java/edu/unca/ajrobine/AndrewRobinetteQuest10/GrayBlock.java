package edu.unca.ajrobine.AndrewRobinetteQuest10;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

//this class modifies the code provided in class to create a Gray Block

public class GrayBlock extends GenericCubeCustomBlock {
	public GrayBlock(Plugin plugin) {
		super(plugin, "GrayBlock",
				"http://www.cs.unca.edu/~robineaj/grayBlock.png", 16);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z,
			int changedId) {
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z) {
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z,
			LivingEntity living) {
	}

	@Override
	public void onBlockDestroyed(World world, int x, int y, int z) {
	}

	@Override
	public boolean onBlockInteract(World world, int x, int y, int z,
			SpoutPlayer player) {
		return true;
	}

	@Override
	public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) {
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z,
			SpoutPlayer player) {
	}

	@Override
	public boolean isProvidingPowerTo(World world, int x, int y, int z,
			BlockFace face) {
		return false;
	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World world, int x, int y,
			int z, BlockFace face) {
		return false;
	}
}
