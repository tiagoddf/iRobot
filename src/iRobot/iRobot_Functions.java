/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iRobot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tduarte
 */
public class iRobot_Functions {
  Robot r;
  // http://www.java2s.com/Code/JavaAPI/java.awt/RobotcreateScreenCaptureRectanglescreenRect.htm (futuro)
  public void MouseInfo()
  {
    Wait(5000);
    // get mouse pos
    PointerInfo a = MouseInfo.getPointerInfo();
    Point b  = a.getLocation();
    int x = (int)b.getX();
    int y = (int)b.getY();
    // get pixel colors
    Color color = r.getPixelColor(x, y);
    JOptionPane.showMessageDialog(null, "Mouse X:" + x + "\nMouse Y" + y);
    //JOptionPane.showMessageDialog(null, "Mouse X:" + x + "\nMouse Y" + y + "\n\nRed:"+ color.getRed() + "Green" + color.getGreen() + "Blue:" + color.getBlue());
  }
  public void Wait(int i)
  {
      Robot r;
      try {
          r = new Robot();
          r.delay(i);
      } catch (AWTException ex) {
          Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  public void MouseClick(String Type, int X, int Y)
  {
      try {
        r = new Robot();
        switch (Type) {
              case "left":
                  r.mouseMove(X, Y);
                  r.delay(200);
                  r.mousePress(InputEvent.BUTTON1_MASK);
                  r.delay(200);
                  r.mouseRelease(InputEvent.BUTTON1_MASK);
                  r.delay(200);
                  break;
              case "middle":
                  r.mouseMove(X, Y);
                  r.delay(200);
                  r.mousePress(InputEvent.BUTTON2_MASK);
                  r.delay(200);
                  r.mouseRelease(InputEvent.BUTTON2_MASK);
                  r.delay(200);
                  break;
              case "right":
                  r.mouseMove(X, Y);
                  r.delay(200);
                  r.mousePress(InputEvent.BUTTON3_MASK);
                  r.delay(200);
                  r.mouseRelease(InputEvent.BUTTON3_MASK);
                  r.delay(200);
                  break;
              default:
                  break;
          }
      } catch (AWTException ex) {
        Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  // pressionar teclas
  public void Press(int keyCode) {
      try {
        r = new Robot();
        r.keyPress(keyCode);
        r.delay(200);
        r.keyRelease(keyCode);
        r.delay(200);
      } catch (AWTException ex) {
        Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  // mandar textos     
  public void Send(int i)
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
  public void Send(String s)
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
