package me.luminescence.chatping;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat (AsyncPlayerChatEvent e) {

        Main main = JavaPlugin.getPlugin(Main.class);

        if (e.getMessage().contains("@")) {

            if (e.getMessage().startsWith("@")) {

                Player sender = e.getPlayer();

                if (main.coolDown.containsKey(sender) && main.coolDown.get(sender) >= System.currentTimeMillis()) {

                    long timeRemaining = main.coolDown.get(sender) - System.currentTimeMillis();
                    int intremaining = (int) ((timeRemaining / 1000));

                    sender.sendMessage(ChatColor.RED + "You cannot ping someone for another " + intremaining + " seconds!");

                } else {

                    int setTime = main.getConfig().getInt("time");

                    main.coolDown.put(sender, System.currentTimeMillis() + (setTime * 1000));

                    String groupOwner = main.getConfig().getString("ownerID");
                    String groupDeveloper = main.getConfig().getString("developerID");
                    String groupAdmin = main.getConfig().getString("adminID");
                    String groupModerator = main.getConfig().getString("moderatorID");
                    String groupHelper = main.getConfig().getString("helperID");
                    String groupDonator1 = main.getConfig().getString("donatorID-1");
                    String groupDonator2 = main.getConfig().getString("donatorID-2");
                    String groupDonator3 = main.getConfig().getString("donatorID-3");
                    String groupDonator4 = main.getConfig().getString("donatorID-4");
                    String groupDonator5 = main.getConfig().getString("donatorID-5");

                    String message = main.getConfig().getString("pingedMessage");
                    assert message != null;
                    message = ChatColor.translateAlternateColorCodes('&', message).replace("%pinger%", sender.getName());

                    assert groupOwner != null;
                    if (e.getMessage().startsWith(groupOwner, 1)) {

                        for (Player player : Bukkit.getOnlinePlayers()) {
                            if (player.hasPermission("mention.owner")) {
                                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                player.sendMessage(message);
                            }
                        }

                    } else {
                        assert groupDeveloper != null;
                        if (e.getMessage().startsWith(groupDeveloper, 1)) {

                            for (Player player : Bukkit.getOnlinePlayers()) {
                                if (player.hasPermission("mention.developer")) {
                                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                    player.sendMessage(message);
                                }
                            }

                        } else {
                            assert groupAdmin != null;
                            if (e.getMessage().startsWith(groupAdmin, 1)) {

                                for (Player player : Bukkit.getOnlinePlayers()) {
                                    if (player.hasPermission("mention.admin")) {
                                        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                        player.sendMessage(message);
                                    }
                                }

                            } else {
                                assert groupModerator != null;
                                if (e.getMessage().startsWith(groupModerator, 1)) {

                                    for (Player player : Bukkit.getOnlinePlayers()) {
                                        if (player.hasPermission("mention.moderator")) {
                                            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                            player.sendMessage(message);
                                        }
                                    }

                                } else {
                                    assert groupHelper != null;
                                    if (e.getMessage().startsWith(groupHelper, 1)) {

                                        for (Player player : Bukkit.getOnlinePlayers()) {
                                            if (player.hasPermission("mention.helper")) {
                                                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                                player.sendMessage(message);
                                            }
                                        }

                                    } else {
                                        assert groupDonator1 != null;
                                        if (e.getMessage().startsWith(groupDonator1, 1)) {

                                            for (Player player : Bukkit.getOnlinePlayers()) {
                                                if (player.hasPermission("mention.donator-1")) {
                                                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                                    player.sendMessage(message);
                                                }
                                            }
                                        } else {
                                            assert groupDonator2 != null;
                                            if (e.getMessage().startsWith(groupDonator2, 1)) {

                                                for (Player player : Bukkit.getOnlinePlayers()) {
                                                    if (player.hasPermission("mention.donator-2")) {
                                                        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                                        player.sendMessage(message);
                                                    }
                                                }

                                            } else {
                                                assert groupDonator3 != null;
                                                if (e.getMessage().startsWith(groupDonator3, 1)) {

                                                    for (Player player : Bukkit.getOnlinePlayers()) {
                                                        if (player.hasPermission("mention.donator-3")) {
                                                            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                                            player.sendMessage(message);
                                                        }
                                                    }

                                                } else {
                                                    assert groupDonator4 != null;
                                                    if (e.getMessage().startsWith(groupDonator4, 1)) {

                                                        for (Player player : Bukkit.getOnlinePlayers()) {
                                                            if (player.hasPermission("mention.donator-4")) {
                                                                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                                                player.sendMessage(message);
                                                            }
                                                        }

                                                    } else {
                                                        assert groupDonator5 != null;
                                                        if (e.getMessage().startsWith(groupDonator5, 1)) {

                                                            for (Player player : Bukkit.getOnlinePlayers()) {
                                                                if (player.hasPermission("mention.donator-5")) {
                                                                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                                                                    player.sendMessage(message);
                                                                }
                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }


        }


    }


}
