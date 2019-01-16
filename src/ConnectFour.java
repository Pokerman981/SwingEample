import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectFour {

    public static JFrame jFrame;
    public JPanel panel1;
    private JLabel playerOneLabel;
    private JLabel playerTwoLabel;
    private JLabel playerThreeLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private List<JButton> jButtonList = new ArrayList<>();
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

    private ActionListener listener;

    private JButton startANewGameButton;

    int playerOne = 0;
    int playerTwo = 1;
    int playerThree = 1;

    public ConnectFour() {
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();

                int rgb = clickedButton.getBackground().getRGB();
                boolean textField1Filled = textField1.getText().isEmpty();
                boolean textField2Filled = textField2.getText().isEmpty();
                boolean textField3Filled = textField3.getText().isEmpty();

                /*if (textField1Filled || textField2Filled || textField3Filled) {
                *    JOptionPane.showMessageDialog(null, "All players must enter their name!");
                *    return;
                }*/

                if (rgb == -16776961 || rgb == -16711936 || rgb == -65536) {
                    JOptionPane.showMessageDialog(null, "This spot has already been selected!");
                    return;
                }

                if (playerOne == 0) {
                    clickedButton.setBackground(new Color(0, 0, 255));
                    playerOneLabel.setForeground(new Color(0, 0, 0));
                    playerTwoLabel.setForeground(new Color(0, 255, 0));

                    playerOne = 1;
                    playerTwo = 0;
                    playerThree = 1;
                    checkWin(clickedButton);
                    return;
                }

                if (playerTwo == 0) {
                    clickedButton.setBackground(new Color(0, 255, 0));
                    playerTwoLabel.setForeground(new Color(0, 0, 0));
                    playerThreeLabel.setForeground(new Color(255, 0, 0));

                    playerOne = 1;
                    playerTwo = 1;
                    playerThree = 0;
                    checkWin(clickedButton);
                    return;
                }

                if (playerThree == 0) {
                    clickedButton.setBackground(new Color(255, 0, 0));
                    playerThreeLabel.setForeground(new Color(0, 0, 0));
                    playerOneLabel.setForeground(new Color(0, 0, 255));

                    playerOne = 0;
                    playerTwo = 1;
                    playerThree = 1;
                    checkWin(clickedButton);
                    return;
                }
            }
        };

        /*int count = 0;
        getButtonList();
        for (JButton jButton : jButtonList) {
            jButton.addActionListener(listener);
            jButton.setName(String.valueOf(count+1));
            count++;
        }*/

        getButtonList();
        setNames();
        registerButtonListener();





        startANewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                jFrame = new JFrame("Connect Four");
                jFrame.setContentPane(new ConnectFour().panel1);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setResizable(false);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }

    public void setNames() {
        for (int i = 0; i < jButtonList.size(); i++) {
            jButtonList.get(i).setName(String.valueOf(i+1));
        }
    }

    public void registerButtonListener() {
        for (JButton jButton1 : jButtonList) {
            jButton1.addActionListener(listener);
        }
    }

    public void checkWin(JButton buttonClicked) {
        int player1RGB = -16776961;
        int player2RGB = -16711936;
        int player3RGB = -65536;
        int blank = -1118482;

        int currentRGB;
        int lastRGB = -1;

        int count = 0;


        List<JButton> row1 = jButtonList.subList(0,9);
        for (JButton jButton : row1) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }

        }

        List<JButton> row2 = jButtonList.subList(8,17);
        for (JButton jButton : row2) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        List<JButton> row3 = jButtonList.subList(16,25);
        for (JButton jButton : row3) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        List<JButton> row4 = jButtonList.subList(24,33);
        for (JButton jButton : row4) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        List<JButton> row5 = jButtonList.subList(32,41);
        for (JButton jButton : row5) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        List<JButton> row6 = jButtonList.subList(40,49);
        for (JButton jButton : row6) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        List<JButton> row7 = jButtonList.subList(48,57);
        for (JButton jButton : row7) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        List<JButton> row8 = jButtonList.subList(56,64);
        for (JButton jButton : row8) {
            currentRGB = jButton.getBackground().getRGB();

            if (lastRGB == -1 && currentRGB != blank) {
                lastRGB = currentRGB;
            }

            if (lastRGB == currentRGB && currentRGB != blank) {
                count++;
            } else {
                count = 1;
                lastRGB = currentRGB;
            }

            if (count == 4) {
                Utils.messageConsole(count);
            }
        }

        {
            currentRGB = -2;
            lastRGB = -1;
            count = 0;
        }

        int clickButtonInt = Integer.valueOf(buttonClicked.getName()) % 8;
        if (clickButtonInt == 0) {
            clickButtonInt = 8;
        }


        List<JButton> col1 = new ArrayList<>();
        {
            for (int i = 0; i < 9; i++) {

                if (clickButtonInt > 64) {
                    break;
                }

                col1.add(jButtonList.get(clickButtonInt-1));
                clickButtonInt = clickButtonInt + 8;
                if (clickButtonInt > 64) {
                    break;
                }
            }

            for (JButton jButton : col1) {
                currentRGB = jButton.getBackground().getRGB();

                //Utils.messageConsole(currentRGB);

                if (lastRGB == -1 && currentRGB != blank) {
                    lastRGB = currentRGB;
                }

                if (lastRGB == currentRGB && currentRGB != blank) {
                    count++;
                } else {
                    count = 1;
                    lastRGB = currentRGB;
                }

                if (count == 4) { //This is vert win area
                    if (lastRGB == player1RGB) {
                        JOptionPane.showMessageDialog(null, "Player 1 Wins!");
                    }

                    if (lastRGB == player2RGB) {
                        JOptionPane.showMessageDialog(null, "Player 2 Wins!");
                    }

                    if (lastRGB == player3RGB) {
                        JOptionPane.showMessageDialog(null, "Player 3 Wins!");
                    }


                    for (JButton jButton1 : jButtonList) {
                        jButton1.setEnabled(false);
                    }

                }

            }
        }
    }






























    public void getButtonList() {
        jButtonList.add(button1);
        jButtonList.add(button2);
        jButtonList.add(button3);
        jButtonList.add(button4);
        jButtonList.add(button5);
        jButtonList.add(button6);
        jButtonList.add(button7);
        jButtonList.add(button8);
        jButtonList.add(button9);
        jButtonList.add(button10);
        jButtonList.add(button11);
        jButtonList.add(button12);
        jButtonList.add(button13);
        jButtonList.add(button14);
        jButtonList.add(button15);
        jButtonList.add(button16);
        jButtonList.add(button17);
        jButtonList.add(button18);
        jButtonList.add(button19);
        jButtonList.add(button20);
        jButtonList.add(button21);
        jButtonList.add(button22);
        jButtonList.add(button23);
        jButtonList.add(button24);
        jButtonList.add(button25);
        jButtonList.add(button26);
        jButtonList.add(button27);
        jButtonList.add(button28);
        jButtonList.add(button29);
        jButtonList.add(button30);
        jButtonList.add(button31);
        jButtonList.add(button32);
        jButtonList.add(button33);
        jButtonList.add(button34);
        jButtonList.add(button35);
        jButtonList.add(button36);
        jButtonList.add(button37);
        jButtonList.add(button38);
        jButtonList.add(button39);
        jButtonList.add(button40);
        jButtonList.add(button41);
        jButtonList.add(button42);
        jButtonList.add(button43);
        jButtonList.add(button44);
        jButtonList.add(button45);
        jButtonList.add(button46);
        jButtonList.add(button47);
        jButtonList.add(button48);
        jButtonList.add(button49);
        jButtonList.add(button50);
        jButtonList.add(button51);
        jButtonList.add(button52);
        jButtonList.add(button53);
        jButtonList.add(button54);
        jButtonList.add(button55);
        jButtonList.add(button56);
        jButtonList.add(button57);
        jButtonList.add(button58);
        jButtonList.add(button59);
        jButtonList.add(button60);
        jButtonList.add(button61);
        jButtonList.add(button62);
        jButtonList.add(button63);
        jButtonList.add(button64);
    }
}




