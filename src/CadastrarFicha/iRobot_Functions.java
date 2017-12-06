/*
 * Local iRobot Functions para setar os timers
 */
package CadastrarFicha;

import java.awt.AWTException;
import java.awt.MouseInfo;
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
  public void MouseInfo()
  {
    Wait(2500);
    // get mouse pos
    int mouseY = MouseInfo.getPointerInfo().getLocation().y;
    int mouseX = MouseInfo.getPointerInfo().getLocation().x;   
    JOptionPane.showMessageDialog(null, "Mouse X:" + mouseX + "\nMouse Y:" + mouseY);
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
                  r.delay(500);
                  r.mousePress(InputEvent.BUTTON1_MASK);
                  r.delay(500);
                  r.mouseRelease(InputEvent.BUTTON1_MASK);
                  r.delay(500);
                  break;
              case "middle":
                  r.mouseMove(X, Y);
                  r.delay(500);
                  r.mousePress(InputEvent.BUTTON2_MASK);
                  r.delay(500);
                  r.mouseRelease(InputEvent.BUTTON2_MASK);
                  r.delay(500);
                  break;
              case "right":
                  r.mouseMove(X, Y);
                  r.delay(500);
                  r.mousePress(InputEvent.BUTTON3_MASK);
                  r.delay(500);
                  r.mouseRelease(InputEvent.BUTTON3_MASK);
                  r.delay(500);
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
        r.delay(500);
        r.keyRelease(keyCode);
        r.delay(500);
      } catch (AWTException ex) {
        Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  // mandar textos     
  public void Send(int i)
  {
      try {
        r = new Robot();
        r.delay(100);
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
            r.delay(100);
            r.keyPress(code);
            r.keyRelease(code);
        } catch (AWTException ex) {
            Logger.getLogger(iRobot_Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }
}
