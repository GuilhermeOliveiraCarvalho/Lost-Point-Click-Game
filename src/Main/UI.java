package Main;

import javax.swing.*;
import java.awt.*;

public class UI {
    GameManager gm;

    public JFrame window;
    public JTextArea messageText;
    public JTextArea messageText2;
    public JPanel bgPanel[] = new JPanel[50];
    public JLabel bgLabel[] = new JLabel[50];
    public JLabel itemsLabel[] = new JLabel[8];
    public JLabel lifeLabel[] = new JLabel[4];
    public JPanel lifePanel, inventoryPanel;
    public JPanel continuePanel;
    public JPanel continuePanel02;


    // Player UI
    // Game over UI
    public JLabel titleLabel;
    public JButton restartButton;
    public JButton choice01Button, choice01, choice02;



    public UI(GameManager gm){

        this.gm = gm;

        createMainField();
        createPlayerField();
        createGameOverField();
        //generateScene();

        window.setVisible(true);

    }
    public void createMainField (){

        ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("Background/Title/title.jpg"));
        window = new JFrame();
        window.setTitle("Lost");
        window.setIconImage(image.getImage());
        window.setSize(800,650);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setLocationRelativeTo(null);

        messageText = new JTextArea();
        messageText.setBounds(50,420,700,115);
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Boonk Antiqua", Font.PLAIN, 14));
        window.add(messageText);

        messageText2 = new JTextArea();
        messageText2.setBounds(50,420,700,115);
        messageText2.setBackground(Color.black);
        messageText2.setForeground(Color.WHITE);
        messageText2.setEditable(false);
        messageText2.setLineWrap(true);
        messageText2.setWrapStyleWord(true);
        messageText2.setFont(new Font("Boonk Antiqua", Font.PLAIN, 14));
        window.add(messageText2);


        continuePanel = new JPanel();
        continuePanel.setBounds(50,550,700,70);
        continuePanel.setBackground(Color.black);
        window.add(continuePanel);

        continuePanel02 = new JPanel();
        continuePanel02.setBounds(50,550,700,70);
        continuePanel02.setBackground(Color.black);
        window.add(continuePanel02);


    }

    public void createPlayerField() {

        lifePanel = new JPanel();
        lifePanel.setBounds(50, 0, 300, 50);
        lifePanel.setBackground(Color.black);
        lifePanel.setLayout(new GridLayout(1, 5));
        window.add(lifePanel);

        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(350, 0, 370, 50);
        inventoryPanel.setBackground(Color.black);
        inventoryPanel.setLayout(new GridLayout(1, 7));
        window.add(inventoryPanel);


        lifeLabel[1] = new JLabel();
        lifeLabel[1].setText(String.valueOf(gm.player.health));
        lifeLabel[1].setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ImageIcon heartIcon = new ImageIcon(getClass().getClassLoader().getResource("Objects/Heart.png"));

        lifeLabel[1].setIcon(heartIcon);
        lifePanel.add(lifeLabel[1]);

        lifeLabel[2] = new JLabel();
        lifeLabel[2].setText(String.valueOf(gm.player.energy));
        lifeLabel[2].setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ImageIcon energyIcon = new ImageIcon(getClass().getClassLoader().getResource("Objects/energy.png"));

        lifeLabel[2].setIcon(energyIcon);
        lifePanel.add(lifeLabel[2]);

        lifeLabel[3] = new JLabel();
        lifeLabel[3].setText(String.valueOf(gm.player.coin));
        lifeLabel[3].setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ImageIcon coinIcon = new ImageIcon(getClass().getClassLoader().getResource("Objects/coin.png"));

        lifeLabel[3].setIcon(coinIcon);
        lifePanel.add(lifeLabel[3]);

        itemsLabel[1] = new JLabel();
        ImageIcon icon01 = new ImageIcon(getClass().getClassLoader().getResource("Objects/lantern.png"));
        itemsLabel[1].setIcon(icon01);
        inventoryPanel.add(itemsLabel[1]);

        itemsLabel[2] = new JLabel();
        ImageIcon icon02 = new ImageIcon(getClass().getClassLoader().getResource("Objects/knife.png"));
        itemsLabel[2].setIcon(icon02);
        inventoryPanel.add(itemsLabel[2]);

    }

    public void createBackground(int bgNum, String bgFileName){
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,700,350);
        bgPanel[bgNum].setBackground(Color.CYAN);
        bgPanel[bgNum].setLayout(null);

        window.add(bgPanel[bgNum]);

        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,350);
        bgLabel[bgNum].setHorizontalAlignment(JLabel.CENTER);
        bgLabel[bgNum].setVerticalAlignment(JLabel.CENTER);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);
        bgPanel[bgNum].setVisible(false);
    }

    public void createButtons (){

        JButton choice01Button = new JButton("Continuar");
        choice01Button.setBounds(400,550,50,50);
        choice01Button.setBackground(Color.green);
        choice01Button.setContentAreaFilled(true);
        choice01Button.setFocusPainted(false);
        choice01Button.setFont(new Font("Boonk Antiqua", Font.PLAIN, 15));
        choice01Button.setForeground(Color.WHITE);
        choice01Button.addActionListener(gm.aHandler);
        choice01Button.setActionCommand("contBAct1");
        choice01Button.setBorderPainted(false);

        JButton choice01 = new JButton("1-Opção");
        choice01.setBounds(0,550,50,50);
        choice01.setBackground(Color.orange);
        choice01.setContentAreaFilled(true);
        choice01.setFocusPainted(false);
        choice01.setFont(new Font("Boonk Antiqua", Font.PLAIN, 15));
        choice01.setForeground(Color.WHITE);
        choice01.addActionListener(gm.aHandler);
        choice01.setActionCommand("choice00");
        choice01.setBorderPainted(false);

        JButton choice02 = new JButton("2-Opção");
        choice02.setBounds(200,550,50,50);
        choice02.setBackground(Color.blue);
        choice02.setContentAreaFilled(true);
        choice02.setFocusPainted(false);
        choice02.setFont(new Font("Boonk Antiqua", Font.PLAIN, 15));
        choice02.setForeground(Color.WHITE);
        choice02.addActionListener(gm.aHandler);
        choice02.setActionCommand("choice01");
        choice02.setBorderPainted(false);

        continuePanel.add(choice01Button);
        continuePanel02.add(choice01);
        continuePanel02.add(choice02);

    }


    public void createGameOverField(){

        titleLabel = new JLabel("",JLabel.CENTER);
        titleLabel.setBounds(200,150,400,200);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Times New Roman", Font.PLAIN,40));
        titleLabel.setVisible(false);
        window.add(titleLabel);

        restartButton = new JButton();
        restartButton.setBounds(340,320,120,50);
        restartButton.setBorder(null);
        restartButton.setBackground(null);
        restartButton.setForeground(Color.white);
        restartButton.setFocusPainted(false);
        restartButton.addActionListener(gm.aHandler);
        restartButton.setActionCommand("restart");
        restartButton.setVisible(false);
        window.add(restartButton);
    }
    }

