package com.loja;

import org.bukkit.plugin.java.JavaPlugin;

public class DiscordLinkPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DiscordLink ativado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DiscordLink desativado!");
    }
}
