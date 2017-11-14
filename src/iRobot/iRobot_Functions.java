/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iRobot;

import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 *
 * @author tduarte
 */
public class iRobot_Functions {
  Robot r = new Robot();
  private void MouseClick(String Type, int X, int Y)
  {
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
  }
  private void Send(int i)
  {
    r.delay(40);
    r.keyPress(i);
    r.keyRelease(i);
  }
  private void Send(String s)
  {
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int code = b;
      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
      if (code > 96 && code < 123) code = code - 32;
      r.delay(40);
      r.keyPress(code);
      r.keyRelease(code);
    }
  }
}
