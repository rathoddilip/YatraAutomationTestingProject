package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;

import java.awt.*;
import java.awt.event.InputEvent;

public class MenuBar extends BaseClass {
    Robot robot = new Robot();

    public MenuBar() throws AWTException {
    }

    public void menuBarHotelIconClick() {
        // move mouse point to specific location
        robot.mouseMove(560, 33);
        robot.delay(300);
        // press left click
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
