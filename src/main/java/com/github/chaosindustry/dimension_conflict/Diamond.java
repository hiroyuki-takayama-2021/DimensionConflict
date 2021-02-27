package com.github.chaosindustry.dimension_conflict;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;


public class Diamond{
    public void DiamondMan(Player sender) {
        //サーバーからの命令を無視するために必要。バグを発生させないために必要らしい。
        if (!(sender instanceof Player)) {
            sender.sendMessage("プレーヤーのみが実行できます");
        }

        Player player = (Player) sender;

        //playerの装備（武器、防具）の情報を取得。
        PlayerInventory inventory = player.getInventory();

        //playerの武器、防具の情報を上書き。全部ダイアモンドにする。
        //どうやらInventory.(set + ItemStack系のメソッド)でプレイヤーの持ち物を変更できる。
        ItemStack DiamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
        inventory.setHelmet(DiamondHelmet);
        ItemStack DiamondChestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        inventory.setChestplate(DiamondChestPlate);
        ItemStack DiamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
        inventory.setBoots(DiamondBoots);
        ItemStack DiamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        inventory.setLeggings(DiamondLeggings);
        ItemStack DiamondSword = new ItemStack(Material.DIAMOND_SWORD);
        inventory.setItemInMainHand(DiamondSword);
    }
}

//FULLダイヤモンド装備
//https://wiki.yama2211.biz/javadoc/1.15.2/org/bukkit/inventory/PlayerInventory.html#getLeggings--
//https://wiki.yama2211.biz/javadoc/1.15.2/org/bukkit/inventory/ItemStack.html#addEnchantment-org.bukkit.enchantments.Enchantment-int-
//はいやー整地
//https://techacademy.jp/22235
//