/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VegaTrain;

/**
 *
 * @author tduarte
 */
public class beansVegaTrain {
    private boolean rodandobot;
    private int delayinterval;
    private int XposTela1;
    private int YposTela1;
    private int XposTela2;
    private int YposTela2;
    
    public boolean getBotStatus() {
        return rodandobot;
    }
    public void setBotStatus(boolean rodandobot) {
        this.rodandobot = rodandobot;
    }
    
    
    
    public int getDelayinterval() {
        return delayinterval;
    }
    public void setDelayinterval(int delayinterval) {
        this.delayinterval = delayinterval;
    }
    
    
    public int getXposTela1() {
        return XposTela1;
    }
    public void setXposTela1(int XposTela1) {
        this.XposTela1 = XposTela1;
    }


    public int getYposTela1() {
        return YposTela1;
    }
    public void setYposTela1(int YposTela1) {
        this.YposTela1 = YposTela1;
    }


    public int getXposTela2() {
        return XposTela2;
    }
    public void setXposTela2(int XposTela2) {
        this.XposTela2 = XposTela2;
    }


    public int getYposTela2() {
        return YposTela2;
    }
    public void setYposTela2(int YposTela2) {
        this.YposTela2 = YposTela2;
    }
}
