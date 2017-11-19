/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tduarte
 */
public class iRobot_Functions {
  Robot r;
  private void MouseClick(String Type, int X, int Y)
  {
      try {
        r = new Robot();
        /*  
        Types:
        left
        right
        middle
        */
        r.mouseMove(X, Y);
        r.delay(200);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.delay(200);
        r.mouseRelease(InputEvent.BUTTON1_MASK);
        r.delay(200);
      } catch (AWTException ex) {
        Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  private void Send(int i)
  {
      try {
        r = new Robot();
        r.delay(40);
        r.keyPress(i);
        r.keyRelease(i);
      } catch (AWTException ex) {
          Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  private void Send(String s)
  {
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
        try {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) code = code - 32;
            r = new Robot();
            r.delay(40);
            r.keyPress(code);
            r.keyRelease(code);
        } catch (AWTException ex) {
            Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }
}
