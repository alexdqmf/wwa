package com.worldwarofants.game.module.scouting.arch;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class ScoutingController extends AbstractController<ScoutingView> {
    public ScoutingController(ScoutingView view, IModuleNavigator navigator) {
        super(view, navigator);
    }
}
