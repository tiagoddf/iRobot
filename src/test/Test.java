package test;

import iRobot.iRobot_Functions;

public class Test {
    public static void main(String[] args) {
        String admUsr = "HOMP\\adm03!@";
        iRobot_Functions irf = new iRobot_Functions();
        irf.Wait(3000);
        irf.Send(admUsr);
    }
}