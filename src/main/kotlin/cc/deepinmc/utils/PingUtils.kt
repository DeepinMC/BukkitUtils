package cc.deepinmc.utils

import org.bukkit.entity.Player
import java.lang.reflect.Field

private val ping: Field = getNMSClass("EntityPlayer").getField("ping")

fun getPing(player: Player): Int = ping.get(getNMSPlayer(player)) as Int

