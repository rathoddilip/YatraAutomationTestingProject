package com.selenium.yatra.pages;

import com.selenium.yatra.base.BaseClass;

import java.awt.*;
import java.awt.event.InputEvent;

public class YatraIConRobotClass extends BaseClass {
    Robot robot = new Robot();

    public YatraIConRobotClass() throws AWTException {
    }

    public void YatraIcon()
    {
        robot.mouseMove(1367,34);
        //robot.mouseMove(340,31);// move mouse point to specific location
        robot.delay(200);        // delay is to make code wait for mentioned milliseconds before executing next step
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click
    }
}
