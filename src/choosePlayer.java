import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

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
            mainForm.jFrame = new JFrame("mainForm");
            mainForm.jFrame.setContentPane(new mainForm().panel1);
            mainForm.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainForm.jFrame.setResizable(false);
            mainForm.jFrame.pack();
            mainForm.jFrame.setVisible(true);

            choosePlayer.jFrame.setVisible(false);
            choosePlayer.jFrame.dispose();
        }
    }
}
