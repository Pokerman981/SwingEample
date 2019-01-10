import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {

    public static JFrame jFrame;
    public JPanel panel1;
    private JLabel playerOneLabel;
    private JLabel playerTwoLabel;
    private JLabel playerThreeLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JButton button50;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button54;
    private JButton button55;
    private JButton button56;
    private JButton button57;
    private JButton button58;
    private JButton button59;
    private JButton button60;
    private JButton button61;
    private JButton button62;
    private JButton button63;
    private JButton button64;

    private JButton startANewGameButton;

    int playerOne = 0;
    int playerTwo = 1;
    int playerThree = 1;

    public mainForm() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                int rgb = clickedButton.getBackground().getRGB();
                if (rgb == -16776961 || rgb == -16711936 || rgb == -65536) {
                    JOptionPane.showMessageDialog(null, "This spot has already been selected!");
                    return;
                }

                if (playerOne == 0) {
                    Color color = new Color(0, 0, 255);
                    clickedButton.setBackground(color);
                    playerOneLabel.setForeground(new Color(0, 0, 0));
                    playerTwoLabel.setForeground(new Color(0, 255, 0));

                    playerOne = 1;
                    playerTwo = 0;
                    playerThree = 1;
                    return;
                }

                if (playerTwo == 0) {
                    Color color = new Color(0, 255, 0);
                    clickedButton.setBackground(color);
                    playerTwoLabel.setForeground(new Color(0, 0, 0));
                    playerThreeLabel.setForeground(new Color(255, 0, 0));

                    playerOne = 1;
                    playerTwo = 1;
                    playerThree = 0;
                    return;
                }

                if (playerThree == 0) {
                    Color color = new Color(255, 0, 0);
                    clickedButton.setBackground(color);
                    playerThreeLabel.setForeground(new Color(0, 0, 0));
                    playerOneLabel.setForeground(new Color(0, 0, 255));

                    playerOne = 0;
                    playerTwo = 1;
                    playerThree = 1;
                    return;
                }
            }
        };

        registerListeners(listener);

        startANewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                jFrame = new JFrame("Connect Four");
                jFrame.setContentPane(new mainForm().panel1);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setResizable(false);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }

    public void registerListeners(ActionListener listener) {
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button10.addActionListener(listener);
        button11.addActionListener(listener);
        button12.addActionListener(listener);
        button13.addActionListener(listener);
        button14.addActionListener(listener);
        button15.addActionListener(listener);
        button16.addActionListener(listener);
        button17.addActionListener(listener);
        button18.addActionListener(listener);
        button19.addActionListener(listener);
        button20.addActionListener(listener);
        button21.addActionListener(listener);
        button22.addActionListener(listener);
        button23.addActionListener(listener);
        button24.addActionListener(listener);
        button25.addActionListener(listener);
        button26.addActionListener(listener);
        button27.addActionListener(listener);
        button28.addActionListener(listener);
        button29.addActionListener(listener);
        button30.addActionListener(listener);
        button31.addActionListener(listener);
        button32.addActionListener(listener);
        button33.addActionListener(listener);
        button34.addActionListener(listener);
        button35.addActionListener(listener);
        button36.addActionListener(listener);
        button37.addActionListener(listener);
        button38.addActionListener(listener);
        button39.addActionListener(listener);
        button40.addActionListener(listener);
        button41.addActionListener(listener);
        button42.addActionListener(listener);
        button43.addActionListener(listener);
        button44.addActionListener(listener);
        button45.addActionListener(listener);
        button46.addActionListener(listener);
        button47.addActionListener(listener);
        button48.addActionListener(listener);
        button49.addActionListener(listener);
        button50.addActionListener(listener);
        button51.addActionListener(listener);
        button52.addActionListener(listener);
        button53.addActionListener(listener);
        button54.addActionListener(listener);
        button55.addActionListener(listener);
        button56.addActionListener(listener);
        button57.addActionListener(listener);
        button58.addActionListener(listener);
        button59.addActionListener(listener);
        button60.addActionListener(listener);
        button61.addActionListener(listener);
        button62.addActionListener(listener);
        button63.addActionListener(listener);
        button64.addActionListener(listener);


    }
}




