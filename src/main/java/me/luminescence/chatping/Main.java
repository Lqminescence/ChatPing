package me.luminescence.chatping;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    HashMap<Player, Long> coolDown = new HashMap<>();

    //ArrayList<Player>  toggleList = new ArrayList<>();

}
