package Main;

public class SceneChanger {

    GameManager gm;
    public SceneChanger(GameManager gm) {

        this.gm = gm;
    }
    //TitleScreen
    public void titleScreen(){
        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.lifePanel.setVisible(false);
        gm.ui.continuePanel.setVisible(false);
        gm.ui.continuePanel02.setVisible(false);

        gm.stopMusic(gm.track.currentMusic);
        gm.track.currentMusic = gm.track.titleMusic;
        gm.playMusic(gm.track.currentMusic);
    }
    //Act1Forest1
    public void showScene1(){

        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.lifePanel.setVisible(true);
        gm.ui.continuePanel.setVisible(true);
        gm.ui.inventoryPanel.setVisible(true);
        gm.ui.lifeLabel[1].setText(String.valueOf(gm.player.health+=60));
        gm.ui.lifeLabel[2].setText(String.valueOf(gm.player.energy+=40));
        gm.ui.bgPanel[2].setVisible(true);


        gm.ui.messageText.setText("Você acordou em um lugar desconhecido, você não se lembra de nada, " +
                "não se lembra do seu nome, do seu passado e nenhuma outra informação sobre você.\nVocê olha em seu corpo " +
                "e vê alguns machucados, como cortes e manchas.\nVocê precisa fazer alguma coisa, visto que se ficar " +
                "na floresta você pode morrer\n(INVESTIGUE O CENÁRIO E CLIQUE COM O BOTÃO DIREITO DO MOUSE EM " +
                "ALGUMA PARTE DO CENÁRIO PARA APARECER UMA OPÇÃO)");
        gm.ui.messageText2.setText("Mas agora você está por conta própria, será que você irá conseguir recuperar suas " +
                "memórias ou ficará perdido para sempre ?\nTome cuidado, você não está sozinho na floresta..");

        gm.stopMusic(gm.track.currentMusic);
        gm.track.currentMusic = gm.track.introMusic;
        gm.playMusic(gm.track.currentMusic);
        gm.track.currentMusic = gm.sfXs.night01;
        gm.playMusic(gm.track.currentMusic);
    }

    //Act1Forest2
    public void showScene1d1 (){
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true);

        gm.ui.messageText2.setText("");
    }

    public void showScene1d2 (){
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(true);

        gm.ui.messageText2.setText("Você ouve um barulho estranho vindo um pouco distante atrás de você....");
    }
    public void showScene1Base1(){
        /*gm.ui.bgPanel[1].setVisible(false);*/
        /*gm.ui.bgPanel[2].setVisible(false);*/
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[4].setVisible(true);
        gm.ui.messageText2.setText("Você voltou para o mesmo lugar onde você havia acordado, e você sente que alguém esteve " +
                "ali minutos antes de você ter saído do lugar....");
    }


    public void showGameOverScreen(int currentBgNum){

        gm.ui.bgPanel[currentBgNum].setVisible(false);
        gm.ui.titleLabel.setVisible(true);
        gm.ui.titleLabel.setText("GAME OVER");
        gm.ui.restartButton.setVisible(true);
        gm.ui.restartButton.setText("RETURN ?");

        gm.stopMusic(gm.track.currentMusic);
        gm.playSE(gm.effects.deathSound);


    }
    public void existGameOverScreen(){
        gm.ui.titleLabel.setVisible(false);
        gm.ui.restartButton.setVisible(false);
        gm.player.setPlayerDefaultStatus();
    }
}
