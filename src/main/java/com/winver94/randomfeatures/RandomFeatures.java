package com.winver94.randomfeatures;

import com.winver94.randomfeatures.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomFeatures implements ModInitializer {
	public static final String MOD_ID = "randomfeatures";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}