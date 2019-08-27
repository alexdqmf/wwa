package com.worldwarofants.game.module.scouting.arch;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class ScoutingModule extends AbstractModule<ScoutingCommandHandler> {

    public ScoutingModule(World world, IModuleNavigator navigator) {
        super(world, navigator);
    }

    @Override
    protected ScoutingCommandHandler initDependencies() {
        ScoutingView scoutingView = new ScoutingView(new ScoutingViewModel());
        ScoutingController scoutingController = new ScoutingController(scoutingView, navigator);
        return new ScoutingCommandHandler(scoutingController);
    }

    @Override
    public ModuleName getModuleName() {
        return ModuleName.SCOUTING;
    }
}
