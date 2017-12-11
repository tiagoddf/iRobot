/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacaDeVideo;

import iRobot.iRobot_Functions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author tduarte
 */
public class PlacaDeVideo {
    public static void main(String[] args) throws AWTException {
        iRobot_Functions irf = new iRobot_Functions();
        // windows + p
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_P);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_P);
        robot.delay(50);
        // duplicar
        irf.Wait(50);
        irf.Press(KeyEvent.VK_UP);
        irf.Wait(50);
        irf.Press(KeyEvent.VK_ENTER);
        // estender
        irf.Wait(50);
        irf.Press(KeyEvent.VK_DOWN);
        irf.Wait(50);
        irf.Press(KeyEvent.VK_ENTER);
        // fechar
        irf.Wait(50);
        irf.Press(KeyEvent.VK_ESCAPE);
    }
}
