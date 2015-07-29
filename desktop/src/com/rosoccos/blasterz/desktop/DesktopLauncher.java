package com.rosoccos.blasterz.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rosoccos.blasterz.Blasterz;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Blasterz(), config);
		config.resizable = false;
		config.height = 720;
		config.width = 1240;
	}
}
