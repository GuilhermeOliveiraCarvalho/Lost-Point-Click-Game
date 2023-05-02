package Main;

import javax.swing.*;
import java.awt.*;

public class Button {

    GameManager gm;

    public Button (GameManager gm) {
        this.gm = gm;
    }

    public void createStartButton(int bgNum, int x, int y, int width, int height, String buttonFileName, String command){

       ImageIcon startIcon = new ImageIcon(getClass().getClassLoader().getResource(buttonFileName));

        JButton startButton = new JButton();
        startButton.setBounds(x,y,width,height);
        startButton.setBackground(null);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setIcon(startIcon);
        startButton.addActionListener(gm.aHandler);
        startButton.setActionCommand(command);
        startButton.setBorderPainted(false);

        gm.ui.bgPanel[bgNum].add(startButton);

    }

}
