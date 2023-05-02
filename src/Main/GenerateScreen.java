package Main;

public class GenerateScreen {

    GameManager gm;

    public GenerateScreen(GameManager gm) {
        this.gm=gm;

        //TitleTheme
        gm.ui.createBackground(1, "Background/Title/Intro1.png");
        gm.buttonB.createStartButton(1,250,250,150,70, "Background/Title/Start.png", "goScene1");
        gm.ui.bgPanel[1].add(gm.ui.bgLabel[1]);
        //Act1Forest1
        gm.ui.createBackground(2, "Background/Act1/ActForest1.png");
        gm.ui.gm.popup.createObject(2,350,100,100,100, "Objects/blank.png",
                "Ir para essa direção","Olhar","Investigar",
                "Irpara1","olharpara1","InvestP");
        gm.ui.gm.popup.createObject(2,0,300,100,100, "Objects/blank.png",
                "Ir para essa direção","Olhar","Investigar",
                "1Panel1c1B","1Panel1c2B","1Panel1c3B");
        gm.ui.createButtons();


        gm.ui.bgPanel[2].add(gm.ui.bgLabel[2]);
        //Act1Forest 2
        gm.ui.createBackground(3, "Background/Act1/Act1Forest2.png");
        gm.ui.gm.popup.createObject(3,350,100,100,100, "Objects/blank.png",
                "Conversar com o Corvo","Olhar","Se aproximar",
                "ConvC","OlharCor","SeA");
        gm.ui.gm.popup.createObject(3,50,250,100,100, "Objects/blank.png",
                "Voltar de onde veio","Olhar","Investigar",
                "Volfor1","Olharforest2","InvestFor2");
        gm.ui.bgPanel[3].add(gm.ui.bgLabel[3]);
        //Action1Forest1Level2
        gm.ui.createBackground(4, "Background/Act1/Act1Forestn1.png");
        gm.ui.gm.popup.createObject(4,350,100,100,100, "Objects/blank.png",
                "Ir para esse caminho","Olhar","Investigar",
                "1Panel4c1","1Panel4c2","1Panel4c3");
        gm.ui.gm.popup.createObject(4,0,300,100,100, "Objects/blank.png",
                "Ir para essa direção","Olhar","Investigar",
                "Panel4c1B","Panel4c2B","Panel4c3B");
        gm.ui.gm.popup.createObject(4,250,200,100,100, "Objects/blank.png",
                "Tentar descansar no chão","Olhar","Investigar",
                "Panel4c1c","Panel4c2c","Panel4c3c");
        gm.ui.gm.popup.createObject(4,600,250,100,100, "Objects/blank.png",
                "Ir para essa direção","Olhar","Investigar",
                "Panel4c1d","Panel4c2d","Panel4c3d");
        gm.ui.bgPanel[4].add(gm.ui.bgLabel[4]);
        //Action1Forest3
        gm.ui.createBackground(5, "Background/Act1/Act1Forest3.png");
        gm.ui.gm.popup.createObject(5,500,300,100,100, "Objects/blank.png",
                "Voltar para esse caminho","Olhar","Investigar",
                "1Panel5c1","1Panel5c2","1Panel5c3");
        gm.ui.gm.popup.createObject(5,350,200,100,100, "Objects/blank.png",
                "Arriscar beber essa água?","Olhar","Investigar",
                "Panel5c1b","Panel5c2b","Panel5c3b");
        gm.ui.bgPanel[5].add(gm.ui.bgLabel[5]);


    }








}
