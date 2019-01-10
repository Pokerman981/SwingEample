import javax.swing.*;

public class main {

    public static void main(String[] args) {
        choosePlayer.jFrame = new JFrame("Choose your character");
        choosePlayer.jFrame.setContentPane(new choosePlayer().JPanel);
        choosePlayer.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        choosePlayer.jFrame.setResizable(false);
        choosePlayer.jFrame.pack();
        choosePlayer.jFrame.setVisible(true);
    }

}
