/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekvon.bukkit.residence.event;
import com.bekvon.bukkit.residence.protection.ClaimedResidence;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Administrator
 */
public class ResidenceEnterEvent extends ResidencePlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public ResidenceEnterEvent(ClaimedResidence resref, Player player)
    {
        super("RESIDENCE_ENTER", resref, player);
    }
}
