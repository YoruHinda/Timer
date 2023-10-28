package com.github.yoruhinda.timer.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class IconImage {
    public static BufferedImage getIcon() {
        BufferedImage read = null;
        try {
            read = ImageIO.read(IconImage.class.getResource("/resources/TimerIcon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return read;
    }
}
