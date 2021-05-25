package be.zvz.kookie.command

import be.zvz.kookie.command.defaults.VanillaCommand

class SimpleCommandMap : CommandMap {

    val knownCommands: MutableMap<String, Command> = mutableMapOf()

    override fun registerAll(fallbackPrefix: String, commands: List<Command>) {
        TODO("Not yet implemented")
    }

    override fun register(fallbackPrefix: String, command: Command, label: String?): Boolean {
        var modifiedLabel = label
        if (modifiedLabel == null) {
            modifiedLabel = command.name
        }
        modifiedLabel = modifiedLabel.trim()
        val modifiedFallbackPrefix = fallbackPrefix.trim().lowercase()
        val registered = registerAlias(command, false, modifiedFallbackPrefix, modifiedLabel)

        val aliases = command.aliases

        aliases.forEach {
            if (!registerAlias(command, true, modifiedFallbackPrefix, it)) {
                aliases.remove(it)
            }
        }
        command.aliases = aliases

        if (!registered) {
            command.setLabel("$modifiedFallbackPrefix:$modifiedLabel")
        }

        command.register(this)
        return registered
    }

    override fun dispatch(sender: CommandSender, cmdLine: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun clearCommands() {
        TODO("Not yet implemented")
    }

    override fun getCommand(name: String): Command? {
        TODO("Not yet implemented")
    }

    private fun registerAlias(command: Command, isAlias: Boolean, fallbackPrefix: String, label: String): Boolean {
        knownCommands["$fallbackPrefix:$label"] = command
        if ((command is VanillaCommand || isAlias) && knownCommands.containsKey(label)) {
            return false
        }
        val cmd = knownCommands.getOrDefault(label, null)
        if (cmd != null && cmd.label == label) {
            return false
        }
        if (!isAlias) {
            command.setLabel(label)
        }
        knownCommands[label] = command
        return true
    }
}