package com.redfx.demokrat;


import com.google.inject.Inject;

import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;

import org.spongepowered.api.plugin.Plugin;


@Plugin(id = "demokrat", name = "DemoKrat", version = "1.0")
public class DemoKrat {
	
	@Inject
	private Logger logger;
	
	private Logger getLogger() {
		return logger;
	}
	
	@Listener
	private void onInitialize(GameInitializationEvent event) {
		this.getLogger().error("Demokrat is Enabled");	
	}
}
