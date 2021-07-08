package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;

import java.awt.*;
import java.awt.event.InputEvent;

public class MenuBarIcon extends BaseClass {

    Robot robot = new Robot();

    public MenuBarIcon() throws AWTException {
    }

    public void menuBarHotelIconClick() throws InterruptedException {

        // move mouse point to specific location
        LogClass.info("Move mouse point to specific location");
        robot.mouseMove(817, 40);
        robot.delay(300);
        // press left click
        LogClass.info("Mouse press left click");
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);
        LogClass.info("Mouse release left click and navigate to bar hotel home page");
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
    }
}
