/*
 * Developed by Troy Gidney on 1/17/19 8:11 AM.
 * Last modified 1/17/19 7:59 AM.
 * Copyright (c) 2019. All rights reserved
 */

import javax.swing.*;

//Main class of program
public class main {

    //main method
    public static void main(String[] args) {

        ConnectFour.jFrame = new JFrame("Connect Four"); //Setting jFrame to a JFrame object
        ConnectFour.jFrame.setContentPane(new ConnectFour().panel1); //Setting the main content pane aka GUI to the top JPanel
        ConnectFour.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Setting the close operation to default
        ConnectFour.jFrame.setResizable(false); //Make it so users cannot resize the window
        ConnectFour.jFrame.pack(); //This packs everything up aka makes sure everything is set to the proper sizes defined in the form creation
        ConnectFour.jFrame.setVisible(true); //Displaying the GUI to the user
    }

}
