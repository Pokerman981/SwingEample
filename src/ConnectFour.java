/*
 * Developed by Troy Gidney on 1/17/19 8:12 AM.
 * Last modified 1/17/19 7:59 AM.
 * Copyright (c) 2019. All rights reserved
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

    private List<List<JButton>> checkWinVertHori = new ArrayList<>();
    private List<List<JButton>> checkWinTopToLeft = new ArrayList<>();
    private List<List<JButton>> checkWinTopToRight = new ArrayList<>();

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

                if (textField1Filled || textField2Filled || textField3Filled) {
                    JOptionPane.showMessageDialog(null, "All players must enter their name!");
                    return;
                }

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

    public void checkWin(JButton buttonClicked) {
        int player1RGB = -16776961;
        int player2RGB = -16711936;
        int player3RGB = -65536;
        int blank = -1118482;

        //Horizontal
        {
            int clickButtonInt = Integer.valueOf(buttonClicked.getName());
            if (clickButtonInt <= 8) {
                List<JButton> row = jButtonList.subList(0, 9);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 16) {
                List<JButton> row = jButtonList.subList(8, 17);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 24) {
                List<JButton> row = jButtonList.subList(16, 25);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 32) {
                List<JButton> row = jButtonList.subList(24, 33);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 40) {
                List<JButton> row = jButtonList.subList(32, 41);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 48) {
                List<JButton> row = jButtonList.subList(40, 49);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 56) {
                List<JButton> row = jButtonList.subList(48, 57);
                checkWinVertHori.add(row);
            } else if (clickButtonInt <= 64) {
                List<JButton> row = jButtonList.subList(56, 64);
                checkWinVertHori.add(row);
            }
        }

        //Vertical
        {
            int clickButtonIntVert = Integer.valueOf(buttonClicked.getName()) % 8;
            if (clickButtonIntVert == 0) {
                clickButtonIntVert = 8;
            }


            List<JButton> col = new ArrayList<>();
            {
                for (int i = 0; i < 9; i++) {

                    if (clickButtonIntVert > 64) {
                        break;
                    }

                    col.add(jButtonList.get(clickButtonIntVert - 1));
                    clickButtonIntVert = clickButtonIntVert + 8;
                    if (clickButtonIntVert > 64) {
                        break;
                    }
                }

                checkWinVertHori.add(col);
            }
        }

        //Diagonal Top-To-Left
        {
            List<JButton> diag1 = new ArrayList<>();
            {
                diag1.add(jButtonList.get(3));
                diag1.add(jButtonList.get(10));
                diag1.add(jButtonList.get(17));
                diag1.add(jButtonList.get(24));
            }

            List<JButton> diag2 = new ArrayList<>();
            {
                diag2.add(jButtonList.get(4));
                diag2.add(jButtonList.get(11));
                diag2.add(jButtonList.get(18));
                diag2.add(jButtonList.get(25));
                diag2.add(jButtonList.get(32));
            }

            List<JButton> diag3 = new ArrayList<>();
            {
                diag3.add(jButtonList.get(5));
                diag3.add(jButtonList.get(12));
                diag3.add(jButtonList.get(19));
                diag3.add(jButtonList.get(26));
                diag3.add(jButtonList.get(33));
                diag3.add(jButtonList.get(40));
            }

            List<JButton> diag4 = new ArrayList<>();
            {
                diag4.add(jButtonList.get(6));
                diag4.add(jButtonList.get(13));
                diag4.add(jButtonList.get(20));
                diag4.add(jButtonList.get(27));
                diag4.add(jButtonList.get(34));
                diag4.add(jButtonList.get(41));
                diag4.add(jButtonList.get(48));
            }

            List<JButton> diag5 = new ArrayList<>();
            {
                diag5.add(jButtonList.get(7));
                diag5.add(jButtonList.get(14));
                diag5.add(jButtonList.get(21));
                diag5.add(jButtonList.get(28));
                diag5.add(jButtonList.get(35));
                diag5.add(jButtonList.get(42));
                diag5.add(jButtonList.get(49));
                diag5.add(jButtonList.get(56));
            }

            List<JButton> diag6 = new ArrayList<>();
            {
                diag6.add(jButtonList.get(15));
                diag6.add(jButtonList.get(22));
                diag6.add(jButtonList.get(29));
                diag6.add(jButtonList.get(36));
                diag6.add(jButtonList.get(43));
                diag6.add(jButtonList.get(50));
                diag6.add(jButtonList.get(57));
            }

            List<JButton> diag7 = new ArrayList<>();
            {
                diag7.add(jButtonList.get(23));
                diag7.add(jButtonList.get(30));
                diag7.add(jButtonList.get(37));
                diag7.add(jButtonList.get(44));
                diag7.add(jButtonList.get(51));
                diag7.add(jButtonList.get(58));
            }

            List<JButton> diag8 = new ArrayList<>();
            {
                diag8.add(jButtonList.get(31));
                diag8.add(jButtonList.get(38));
                diag8.add(jButtonList.get(45));
                diag8.add(jButtonList.get(52));
                diag8.add(jButtonList.get(59));
            }

            List<JButton> diag9 = new ArrayList<>();
            {
                diag9.add(jButtonList.get(39));
                diag9.add(jButtonList.get(46));
                diag9.add(jButtonList.get(53));
                diag9.add(jButtonList.get(60));
            }

            checkWinTopToLeft.add(diag1);
            checkWinTopToLeft.add(diag2);
            checkWinTopToLeft.add(diag3);
            checkWinTopToLeft.add(diag4);
            checkWinTopToLeft.add(diag5);
            checkWinTopToLeft.add(diag6);
            checkWinTopToLeft.add(diag7);
            checkWinTopToLeft.add(diag8);
            checkWinTopToLeft.add(diag9);

        }

        //Diagonal Top-To-Right
        {
            List<JButton> diag1 = new ArrayList<>();
            {
                diag1.add(jButtonList.get(4));
                diag1.add(jButtonList.get(13));
                diag1.add(jButtonList.get(22));
                diag1.add(jButtonList.get(31));
            }

            List<JButton> diag2 = new ArrayList<>();
            {
                diag2.add(jButtonList.get(3));
                diag2.add(jButtonList.get(12));
                diag2.add(jButtonList.get(21));
                diag2.add(jButtonList.get(30));
                diag2.add(jButtonList.get(39));
            }

            List<JButton> diag3 = new ArrayList<>();
            {
                diag3.add(jButtonList.get(2));
                diag3.add(jButtonList.get(11));
                diag3.add(jButtonList.get(20));
                diag3.add(jButtonList.get(29));
                diag3.add(jButtonList.get(38));
                diag3.add(jButtonList.get(47));
            }

            List<JButton> diag4 = new ArrayList<>();
            {
                diag4.add(jButtonList.get(1));
                diag4.add(jButtonList.get(10));
                diag4.add(jButtonList.get(19));
                diag4.add(jButtonList.get(28));
                diag4.add(jButtonList.get(37));
                diag4.add(jButtonList.get(46));
                diag4.add(jButtonList.get(55));
            }

            List<JButton> diag5 = new ArrayList<>();
            {
                diag5.add(jButtonList.get(0));
                diag5.add(jButtonList.get(9));
                diag5.add(jButtonList.get(18));
                diag5.add(jButtonList.get(27));
                diag5.add(jButtonList.get(36));
                diag5.add(jButtonList.get(45));
                diag5.add(jButtonList.get(54));
                diag5.add(jButtonList.get(63));
            }

            List<JButton> diag6 = new ArrayList<>();
            {
                diag6.add(jButtonList.get(8));
                diag6.add(jButtonList.get(17));
                diag6.add(jButtonList.get(26));
                diag6.add(jButtonList.get(35));
                diag6.add(jButtonList.get(44));
                diag6.add(jButtonList.get(53));
                diag6.add(jButtonList.get(62));
            }

            List<JButton> diag7 = new ArrayList<>();
            {
                diag7.add(jButtonList.get(16));
                diag7.add(jButtonList.get(25));
                diag7.add(jButtonList.get(34));
                diag7.add(jButtonList.get(43));
                diag7.add(jButtonList.get(52));
                diag7.add(jButtonList.get(61));
            }

            List<JButton> diag8 = new ArrayList<>();
            {
                diag8.add(jButtonList.get(24));
                diag8.add(jButtonList.get(33));
                diag8.add(jButtonList.get(42));
                diag8.add(jButtonList.get(51));
                diag8.add(jButtonList.get(60));
            }

            List<JButton> diag9 = new ArrayList<>();
            {
                diag9.add(jButtonList.get(32));
                diag9.add(jButtonList.get(41));
                diag9.add(jButtonList.get(50));
                diag9.add(jButtonList.get(59));
            }

            checkWinTopToRight.add(diag1);
            checkWinTopToRight.add(diag2);
            checkWinTopToRight.add(diag3);
            checkWinTopToRight.add(diag4);
            checkWinTopToRight.add(diag5);
            checkWinTopToRight.add(diag6);
            checkWinTopToRight.add(diag7);
            checkWinTopToRight.add(diag8);
            checkWinTopToRight.add(diag9);


        }

        for (List<JButton> jButtonList : checkWinVertHori) {
            int currentRGB;
            int lastRGB = -1;

            int count = 0;

            for (JButton jButton : jButtonList) {
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


                    for (JButton jButton1 : this.jButtonList) {
                        jButton1.setEnabled(false);
                    }

                }
            }
        }

        for (List<JButton> jButtonList : checkWinTopToRight) {
            int currentRGB;
            int lastRGB = -1;

            int count = 0;

            for (JButton jButton : jButtonList) {
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

                if (count == 4) { //This is vert win area
                    if (lastRGB == player1RGB) {
                        JOptionPane.showMessageDialog(null, "Player 1 wins!");
                    }

                    if (lastRGB == player2RGB) {
                        JOptionPane.showMessageDialog(null, "Player 2 Wins!");
                    }

                    if (lastRGB == player3RGB) {
                        JOptionPane.showMessageDialog(null, "Player 3 Wins!");
                    }


                    for (JButton jButton1 : this.jButtonList) {
                        jButton1.setEnabled(false);
                    }

                }
            }
        }

        for (List<JButton> jButtonList : checkWinTopToLeft) {
            int currentRGB;
            int lastRGB = -1;

            int count = 0;

            for (JButton jButton : jButtonList) {
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


                    for (JButton jButton1 : this.jButtonList) {
                        jButton1.setEnabled(false);
                    }

                }
            }
        }

        checkWinVertHori.clear();
        checkWinTopToRight.clear();
        checkWinTopToLeft.clear();

    }


    public void setNames() {
        for (int i = 0; i < jButtonList.size(); i++) {
            jButtonList.get(i).setName(String.valueOf(i + 1));
        }
    }

    public void registerButtonListener() {
        for (JButton jButton1 : jButtonList) {
            jButton1.addActionListener(listener);
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

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setToolTipText("Temp");
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel2, gbc);
        playerOneLabel = new JLabel();
        playerOneLabel.setEnabled(true);
        playerOneLabel.setForeground(new Color(-16776961));
        playerOneLabel.setText("Player One");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel2.add(playerOneLabel, gbc);
        playerTwoLabel = new JLabel();
        playerTwoLabel.setText("Player Two");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel2.add(playerTwoLabel, gbc);
        playerThreeLabel = new JLabel();
        playerThreeLabel.setText("Player Three");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel2.add(playerThreeLabel, gbc);
        textField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(textField1, gbc);
        textField2 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(textField2, gbc);
        textField3 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(textField3, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel3, gbc);
        button1 = new JButton();
        button1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button1, gbc);
        button2 = new JButton();
        button2.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button2, gbc);
        button3 = new JButton();
        button3.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button3, gbc);
        button4 = new JButton();
        button4.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button4, gbc);
        button5 = new JButton();
        button5.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button5, gbc);
        button6 = new JButton();
        button6.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button6, gbc);
        button7 = new JButton();
        button7.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button7, gbc);
        button8 = new JButton();
        button8.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button8, gbc);
        button9 = new JButton();
        button9.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button9, gbc);
        button10 = new JButton();
        button10.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button10, gbc);
        button11 = new JButton();
        button11.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button11, gbc);
        button12 = new JButton();
        button12.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button12, gbc);
        button13 = new JButton();
        button13.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button13, gbc);
        button14 = new JButton();
        button14.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button14, gbc);
        button15 = new JButton();
        button15.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button15, gbc);
        button16 = new JButton();
        button16.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button16, gbc);
        button17 = new JButton();
        button17.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button17, gbc);
        button18 = new JButton();
        button18.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button18, gbc);
        button19 = new JButton();
        button19.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button19, gbc);
        button20 = new JButton();
        button20.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button20, gbc);
        button21 = new JButton();
        button21.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button21, gbc);
        button22 = new JButton();
        button22.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button22, gbc);
        button23 = new JButton();
        button23.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button23, gbc);
        button24 = new JButton();
        button24.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button24, gbc);
        button25 = new JButton();
        button25.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button25, gbc);
        button26 = new JButton();
        button26.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button26, gbc);
        button27 = new JButton();
        button27.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button27, gbc);
        button28 = new JButton();
        button28.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button28, gbc);
        button29 = new JButton();
        button29.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button29, gbc);
        button30 = new JButton();
        button30.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button30, gbc);
        button31 = new JButton();
        button31.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button31, gbc);
        button32 = new JButton();
        button32.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button32, gbc);
        button33 = new JButton();
        button33.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button33, gbc);
        button34 = new JButton();
        button34.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button34, gbc);
        button35 = new JButton();
        button35.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button35, gbc);
        button36 = new JButton();
        button36.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button36, gbc);
        button37 = new JButton();
        button37.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button37, gbc);
        button38 = new JButton();
        button38.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button38, gbc);
        button39 = new JButton();
        button39.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button39, gbc);
        button40 = new JButton();
        button40.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button40, gbc);
        button41 = new JButton();
        button41.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button41, gbc);
        button42 = new JButton();
        button42.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button42, gbc);
        button43 = new JButton();
        button43.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button43, gbc);
        button44 = new JButton();
        button44.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button44, gbc);
        button45 = new JButton();
        button45.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button45, gbc);
        button46 = new JButton();
        button46.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button46, gbc);
        button47 = new JButton();
        button47.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button47, gbc);
        button48 = new JButton();
        button48.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button48, gbc);
        button49 = new JButton();
        button49.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button49, gbc);
        button50 = new JButton();
        button50.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button50, gbc);
        button51 = new JButton();
        button51.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button51, gbc);
        button52 = new JButton();
        button52.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button52, gbc);
        button53 = new JButton();
        button53.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button53, gbc);
        button54 = new JButton();
        button54.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button54, gbc);
        button55 = new JButton();
        button55.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button55, gbc);
        button56 = new JButton();
        button56.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button56, gbc);
        button57 = new JButton();
        button57.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button57, gbc);
        button58 = new JButton();
        button58.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button58, gbc);
        button59 = new JButton();
        button59.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button59, gbc);
        button60 = new JButton();
        button60.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button60, gbc);
        button61 = new JButton();
        button61.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button61, gbc);
        button62 = new JButton();
        button62.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button62, gbc);
        button63 = new JButton();
        button63.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button63, gbc);
        button64 = new JButton();
        button64.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button64, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel4, gbc);
        startANewGameButton = new JButton();
        startANewGameButton.setText("Start a new Game");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel4.add(startANewGameButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }


}
