package com.github.chaosindustry.dimension_conflict;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;


//はいやー整地
public class Firegarden {
    private final Dimension_conflict plugin;

    public Firegarden(Dimension_conflict plugin) {
        this.plugin = plugin;
    }

    public void fireseichi(Player player, String number) {
        if (!(player instanceof Player)) {
            player.sendMessage("プレーヤーのみが実行できます");
        }
        Location player_location = player.getLocation();
        Location location = new Location(player_location.getWorld(), player_location.getBlockX(), player_location.getBlockY(), player_location.getBlockZ());
        int i = 1;
        int count = Integer.parseInt(number);
        for (int s = 0; s <= count; s++) {
            while (i == 1) {
                location.subtract(0, i, 0);
                Block block = player_location.getBlock();
                if (block.getType() != Material.AIR) {
                    location.subtract(15, 0, 15);
                    for (int l = location.getBlockX(); l <= location.getBlockX() + 30; l++) {
                        for (int j = location.getBlockY(); j <= location.getBlockX() + 30; j++) {
                            for (int k = location.getBlockZ(); k <= location.getBlockX() + 30; k++) {
                                block.setType(Material.FIRE);
                            }

                        }
                    }
                }
                break;
            }

        }
    }
}
