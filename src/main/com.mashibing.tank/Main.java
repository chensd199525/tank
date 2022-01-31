package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description:
 * @Author: chensd
 * @date 2022/1/31 12:19
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Frame f = new TankFrame();

        while (true) {
            Thread.sleep(50);
            f.repaint();
        }
    }
}
