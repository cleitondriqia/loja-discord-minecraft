package com.loja.discordlink;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DiscordLinkPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[DiscordLink] Plugin habilitado com sucesso!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[DiscordLink] Plugin desativado.");
    }
}
