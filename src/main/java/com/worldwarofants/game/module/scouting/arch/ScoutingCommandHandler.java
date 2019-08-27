package com.worldwarofants.game.module.scouting.arch;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;

import java.util.Map;

public class ScoutingCommandHandler extends AbstractCommandHandler<ScoutingController> {

    public ScoutingCommandHandler(ScoutingController controller) {
        super(controller);
    }

    @Override
    protected void defineCommands(Map commands) {

    }

    @Override
    public void executeStartingCommand(String[] arguments) {

    }
}
