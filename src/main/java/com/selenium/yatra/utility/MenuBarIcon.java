package com.selenium.yatra.utility;

import java.awt.*;
import java.awt.event.InputEvent;

public class MenuBarIcon {

    public void menuBarHotelIconClick() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        // move mouse point to specific location
        robot.mouseMove(817, 40);
        robot.delay(300);
        // press left click
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
    }
}
