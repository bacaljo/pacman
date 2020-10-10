package com.gd.pm.main;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FontLoader {
    private FontLoader() {
    }

    public static void load() throws IOException, FontFormatException {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("fonts");
        String path = url.getPath();

        for (File file : new File(path).listFiles()) {
            graphicsEnvironment.registerFont(
                    Font.createFont(Font.TRUETYPE_FONT, new File(file.getPath()))
                            .deriveFont(12f));
        }
    }
}
