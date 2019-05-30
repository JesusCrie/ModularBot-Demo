package com.jesus_crie.examplebot.commands;

import com.jesus_crie.modularbot.command.CommandModule;
import com.jesus_crie.modularbot.core.dependencyinjection.InjectorTarget;
import com.jesus_crie.modularbot.core.module.Module;

public class CommandRegistryModule extends Module {

    @InjectorTarget
    public CommandRegistryModule(final CommandModule commandModule) {
        // Register our command for later use
        commandModule.registerCommands(
                new PingCommand(),
                new StopCommand()
        );
    }
}
