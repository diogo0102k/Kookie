package be.zvz.kookie.event.inventory

import be.zvz.kookie.inventory.Inventory
import be.zvz.kookie.player.Player

abstract class InventoryEvent(val inventory: Inventory) {
    fun getViewers(): MutableList<Player> = inventory.getViewers()
}
