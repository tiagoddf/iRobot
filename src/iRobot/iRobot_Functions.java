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
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.KeyStroke;

/**
 *
 * @author tduarte
 */
public class iRobot_Functions {
  Robot r;
  // http://www.java2s.com/Code/JavaAPI/java.awt/RobotcreateScreenCaptureRectanglescreenRect.htm (futuro)
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
    public void Send(String s) {
        if (null == s) return;
        Robot r = null;
        char[] chars = s.toCharArray();
        try {
            for (char c : chars) {
                int code = c;
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(code);
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("!", "1");
                map.put("@", "2");
                map.put("#", "3");
                boolean shiftRequired = false;
                String key = String.valueOf(c);
                String value = map.get(key);
                if (value != null) {
                    shiftRequired = true;
                    key = value;
                }
                else if (Character.isUpperCase(key.charAt(0))) { shiftRequired = true; }
                else { key = key.toUpperCase(); }
                if (shiftRequired) {
                    KeyStroke ks = KeyStroke.getKeyStroke("pressed " + key.toUpperCase());
                    keyCode = ks.getKeyCode();
                }
                r = new Robot();
                r.delay(40);
                if (shiftRequired) { r.keyPress(KeyEvent.VK_SHIFT); }
                r.keyPress(keyCode);
                r.keyRelease(keyCode);
                if (shiftRequired) { r.keyRelease(KeyEvent.VK_SHIFT); }
            } 
        } catch (AWTException ex) {
            System.err.println(ex.getMessage());
        }
    }   
  // Email Sender
  public void SendMail(String username, String password, String title, String msg, String reciver) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(reciver));
            message.setSubject(title);
            
            
            message.setContent(msg, "text/html; charset=utf-8");
            
            Transport.send(message);
            System.out.println("Done");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
  }
}
