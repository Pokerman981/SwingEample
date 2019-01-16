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












































        /*
        choosePlayer.jFrame = new JFrame("Choose your character");
        choosePlayer.jFrame.setContentPane(new choosePlayer().JPanel);
        choosePlayer.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        choosePlayer.jFrame.setResizable(false);
        choosePlayer.jFrame.pack();
        choosePlayer.jFrame.setVisible(true);
        */
    }

}
