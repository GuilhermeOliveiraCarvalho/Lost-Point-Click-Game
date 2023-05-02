package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    GameManager gm;
    public ActionHandler (GameManager gm) {

        this.gm = gm;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String yourChoice = e.getActionCommand();

        switch (yourChoice){


            //Act1Forest1
            case "contBAct1": gm.ui.messageText.setVisible(false);
            gm.ui.messageText2.setVisible(true);
            gm.ui.continuePanel.setVisible(false);
            break;
            case "Irpara1" : gm.ev1.irpara1();break;
            case "olharpara1" : gm.ev1.olharPara1();break;
            case "InvestP" : gm.ev1.investP1();break;
            case "1Panel1c1B" : gm.ev1.apanel1c1B();break;
            case "1Panel1c2B" : gm.ev1.apanel1c2B();break;
            case "1Panel1c3B" : gm.ev1.apanel1c3B();;break;
            //Act1Forest2
            case "ConvC" : gm.ev1.convCor();break;
            case "OlharCor" : gm.ev1.olharCor();break;
            case "SeA" : gm.ev1.seApro();break;
            case "Volfor1" : gm.ev1.voltFor1();break;
            case "Olharforest2" : gm.ev1.olharFor2();break;
            case "InvestFor2" : gm.ev1.investFor2();break;
            //Act1Forest1Level2
            case "1Panel4c1": gm.ev1.choice1Panel4obj1();break;
            case "1Panel4c2": gm.ev1.choice2Panel4obj1();break;
            case "1Panel4c3": gm.ev1.choice3Panel4obj1();break;
            case "Panel4c1B": gm.ev1.panel4c1B();break;
            case "Panel4c2B": gm.ev1.panel4c2B();break;
            case "Panel4c3B": gm.ev1.panel4c3B();break;
            case "Panel4c1c": gm.ev1.panel4c1c();break;
            case "Panel4c2c": gm.ev1.panel4c2c();break;
            case "Panel4c3c": gm.ev1.panel4c3c();break;
            case"Panel4c1d": gm.ui.messageText2.setText("Você ouve um barulho bem forte de algo se mexendo nessa região " +
                    "você tem certeza que você vai querer ir para essa direção?\n1-Opção: Ir mesmo assim\n2-Opção: Não ir");
            gm.playSE(gm.sfXs.weirdSound01);
            gm.ui.continuePanel02.setVisible(true);break;
            case "Panel4c2d": gm.ev1.panel4c2d();break;
            case "Panel4c3d": gm.ev1.panel4c3d();break;
            case "choice00": gm.ev1.panel4c1dSwitch01();break;
            case "choice01":gm.ev1.panel4c1dSwitch02();break;
            //Act1Forest3
            case "1Panel5c1": gm.ev1.panel5c1a();break;
            case "1Panel5c2": gm.ev1.panel5c2a();break;
            case "1Panel5c3": gm.ev1.panel5c3a();break;
            case "Panel5c1b": gm.ev1.panel5c1b();break;
            case "Panel5c2b": gm.ev1.panel5c2b();break;
            case "Panel5c3b": gm.ev1.panel5c3b();break;


            // Change Scenes
            case "goScene1": gm.sChanger.showScene1(); break;
           /* case "goScene2": gm.sChanger.showScene2(); break;*/

            //Others
            case "restart": gm.sChanger.existGameOverScreen(); gm.sChanger.showScene1(); break;
        }

    }
}
