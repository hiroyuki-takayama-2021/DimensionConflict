package com.github.chaosindustry.dimension_conflict;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class MotionCommandExecutor implements CommandExecutor{
    private final Dimension_conflict plugin;

    public MotionCommandExecutor(Dimension_conflict plugin) {
        this.plugin = plugin;
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("IwannabeaDiamondman")) {
           //Diamond hyer = new Diamond();
            //この後でメソッドを設定する。
            //よく使いコマンドは一番上のifに入れる

        }
        else if (cmd.getName().equalsIgnoreCase("firegarden")) {
            //Firegarden hyer = new Firegarden();
            //この後でメソッドを設定する。
            //if文を何個も書いたら全部実行

        }
    return false;
    }
}