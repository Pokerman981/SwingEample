/*
 * Developed by Troy Gidney on 1/17/19 8:11 AM.
 * Last modified 1/17/19 7:59 AM.
 * Copyright (c) 2019. All rights reserved
 */

import javax.swing.*;

public class main {

    public static void main(String[] args) {

        ConnectFour.jFrame = new JFrame("Connect Four");
        ConnectFour.jFrame.setContentPane(new ConnectFour().panel1);
        ConnectFour.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ConnectFour.jFrame.setResizable(false);
        ConnectFour.jFrame.setLocationRelativeTo(null);
        ConnectFour.jFrame.pack();
        ConnectFour.jFrame.setVisible(true);
    }

}
