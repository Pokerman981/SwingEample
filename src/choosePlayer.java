import javax.swing.*;

public class choosePlayer {
    public static JFrame jFrame;
    private JCheckBox player1CheckBox;
    private JCheckBox player2CheckBox;
    private JCheckBox player3CheckBox;
    public javax.swing.JPanel JPanel;

    public static int count = 0;

    public choosePlayer() {
        player1CheckBox.addActionListener(e -> {
            JCheckBox jCheckBox = (JCheckBox)e.getSource();
            if (jCheckBox.isSelected()) {
                count++;
            }

            launchGame();
        });
        player2CheckBox.addActionListener(e -> {
            JCheckBox jCheckBox = (JCheckBox)e.getSource();
            if (jCheckBox.isSelected()) {
                count++;
            }

            launchGame();

        });
        player3CheckBox.addActionListener(e -> {
            JCheckBox jCheckBox = (JCheckBox)e.getSource();
            if (jCheckBox.isSelected()) {
                count++;
            }

            launchGame();

        });
    }

    public void launchGame() {
        if (count > 2) {
            ConnectFour.jFrame = new JFrame("ConnectFour");
            ConnectFour.jFrame.setContentPane(new ConnectFour().panel1);
            ConnectFour.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ConnectFour.jFrame.setResizable(false);
            ConnectFour.jFrame.pack();
            ConnectFour.jFrame.setVisible(true);

            choosePlayer.jFrame.setVisible(false);
            choosePlayer.jFrame.dispose();
        }
    }
}
