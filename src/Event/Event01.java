package Event;

import Main.GameManager;

public class Event01 {

    GameManager gm;

    public Event01(GameManager gm) {

        this.gm = gm;
    }

    //Act1Forest1
    public void irpara1() {

        gm.sChanger.showScene1d1();
        gm.ui.lifeLabel[2].setText(String.valueOf(gm.player.energy-=5));
    }

    public void olharPara1() {
        gm.ui.messageText2.setText("Você vê alguma coisa estranha se movendo na escuridão da floresta....");
    }

    public void investP1() {
        gm.ui.messageText2.setText("Você vê umas penas de um passáro preto no chão.....\nNisso você ouve uma voz " +
                "bem no fundo da floresta, mas você não consegue entender o que se foi dito....");

    }
    public void apanel1c1B(){
        gm.sChanger.showScene1d2();
    }
    public void apanel1c2B(){

        gm.ui.messageText2.setText("Você ouve um barulho de alguma coisa caindo em uma poça de água");
    }
    public void apanel1c3B(){

        gm.ui.messageText2.setText("Está bem escuro nessa região você não consegue ver muita coisa");
    }


    //Act1Forest2
    public void convCor() {
        gm.ui.messageText2.setText("Você pergunta para o corvo qual é o nome dele, e ele te responde:\nCorvo: NEVER MORE!!!!");
        gm.playSE(gm.voices01.raven);
    }
    public void olharCor(){
        gm.ui.messageText2.setText("Você observa o Corvo, e nota que ele olha para você de volta, com um olhar estranho " +
                "meio que de suspense, como que se ele soubesse alguma coisa, que você não sabe, ou que talvez você " +
                "ache que não saiba.....");
        gm.playSE(gm.voices01.raven);
    }
    public void seApro (){
        gm.ui.messageText2.setText("Você se aproxima para falar com o Corvo, " +
                "mas o Corvo diz:\nCorvo: NEVER MORE!!!!");
        gm.playSE(gm.voices01.raven);
    }
    public void voltFor1 (){

        gm.sChanger.showScene1Base1();
    }
    public void olharFor2 (){
        gm.ui.messageText2.setText("Você olha para o chão e vê algumas pegadas de sapatos, que não são suas.....");
    }
    public void investFor2 () {
        gm.ui.messageText2.setText("Você investiga a região e encontra um papel, que estava escrito:\nPapel: Cuidado com " +
                "os seus desejos....\nNisso o Corvo diz:\nCorvo: NEVER MORE!");
        gm.playSE(gm.voices01.raven);
    }
    //Act1Forest3
    public void panel5c1a () {
        gm.sChanger.showScene1Base1();
    }
    public void panel5c2a () {
        gm.ui.messageText2.setText("você olha a região, e o clima está meio nebuloso, com uma atmosfera estranha");
    }
    public void panel5c3a () {
        if(gm.player.gainHealth == 0) {
            gm.ui.messageText2.setText("Você acha uma fruta no chão e vê que ainda está comestivel\nvocê come a fruta e " +
                    "se sente um pouco mais revigorado");
            gm.ui.lifeLabel[1].setText(String.valueOf(gm.player.health+=5));
            gm.player.gainHealth = 1;
            gm.player.updatePlayerStatus();
            gm.playSE(gm.effects.healSound);
        }
        else{
            gm.ui.messageText2.setText("Não há mais nada aqui");
        }
    }
    int beberAg01 = 0;
    public void panel5c1b (){
        if(beberAg01 == 0) {
            gm.ui.messageText2.setText("Você está com sede, e tenta beber dessa poça de água.\nO gosto está horrível e você se arrepende " +
                    "de ter bebido");
            gm.ui.lifeLabel[1].setText(String.valueOf(gm.player.health-=5));
            gm.player.updatePlayerStatus();
            gm.playSE(gm.effects.cough01);
            beberAg01 = 1;

        }
        else{
            gm.ui.messageText2.setText("Você não quer beber dessa água, ela não está limpa");
        }
    }
    public void panel5c2b (){

        if(gm.player.hasItem1 == 1) {
            gm.ui.messageText2.setText("Você usa o lampião para ver a poça, e você nota que a água está muito suja");
        }
        else{
            gm.ui.messageText2.setText("Está muito escuro para ver alguma coisa");
        }

    }
    public void panel5c3b (){
        if(gm.player.hasItem1 == 1 && gm.player.hasItem2 != 1) {
            gm.ui.messageText2.setText("Você usa o lampião para ver a poça de água e vê que há algo " +
                    "dentro da poça, você coloca sua mão dentro da poça para ver o que era aquilo que você " +
                    "viu, e você sente um objeto dentro da poça.\nVocê pega o objeto e vê que era uma faca");
            gm.player.hasItem2 = 1;
            gm.player.updatePlayerStatus();
            gm.playSE(gm.effects.itemSound);
        }
        else{
            gm.ui.messageText2.setText("você olha para a água, e vê que a água esta suja");
        }
    }
    //ActForest1Level2
    public void choice1Panel4obj1 (){

        if(gm.player.lossHealth == 0) {
            gm.ui.messageText2.setText("Você tenta ir por esse caminho, mas derrepente uma árvore cai em sua direção " +
                    " , e parte da árvore bate bem forte em seu braço, te machucando, e os restos da árvore começam a barrar " +
                    " o caminho que você tinha ido, não o permitindo mais ir nessa direção");
            gm.ui.lifeLabel[1].setText(String.valueOf(gm.player.health-=10));
            gm.player.lossHealth = 1;
            gm.player.updatePlayerStatus();
            gm.playSE(gm.effects.hitEffect01);
        }
        else{
            gm.ui.messageText2.setText("Você não consegue ir mais por essa direção...");
        }
    }
    public void choice2Panel4obj1 (){
        gm.ui.messageText2.setText("Você olha e vê uma luz estranha que acende e apaga bem distante entre as árvores");
    }
    public void choice3Panel4obj1 (){

        if (gm.player.hasItem1==0){
            gm.ui.messageText2.setText("Você investiga um arbusto próximo e encontra um lampião azul");
            gm.player.hasItem1 = 1;
            gm.player.updatePlayerStatus();
            gm.playSE(gm.effects.itemSound);
        }
        else {
            gm.ui.messageText2.setText("Você não encontra nada");
        }
    }
    public void panel4c1B (){
        gm.sChanger.showScene1d2();
    }
    public void panel4c2B (){

        gm.ui.messageText2.setText("Você não encontra nada");
    }
    public void panel4c3B (){
        gm.ui.messageText2.setText("Você não encontra nada");
    }
    public void panel4c1c (){
        if(gm.player.gainEnergy == 0) {
            gm.ui.messageText2.setText("Você deita no chão e descansa por alguns minutos, e fica pensando sobre o que está " +
                    "acontecendo e se perguntando sobre quem é você, e onde você está, e por que você não se lembra de nada...");
            gm.ui.lifeLabel[2].setText(String.valueOf(gm.player.energy+=10));
            gm.player.gainEnergy = 1;
            gm.player.updatePlayerStatus();
            gm.playSE(gm.effects.healSound);

        }
        else{
            gm.ui.messageText2.setText("Você não consegue desansar mais aqui, você está se sentindo inseguro pelo ambiente");
        }
    }
    public void panel4c2c (){
        gm.ui.messageText2.setText("Você não encontra nada");

    }
    public void panel4c3c (){
        gm.ui.messageText2.setText("Você não encontra nada");
    }

    public void panel4c1dSwitch01 (){
        gm.ui.continuePanel02.setVisible(false);
            gm.ui.messageText2.setText("Essa é apenas uma versão de testes, obrigado por jogar\n Lost- versão Alpha0.08");


    }
    public void panel4c1dSwitch02 (){
        gm.ui.continuePanel02.setVisible(false);
        gm.ui.messageText2.setText("Você preferiu não ir por causa da sensação estranha que você sentiu por esse " +
                "caminho...");
    }
    public void panel4c2d(){
        gm.ui.messageText2.setText("Parece que há alguma coisa bem estranha se mexendo por esse caminho");
    }
    public void panel4c3d(){
        gm.ui.messageText2.setText("Você dá uma boa olhada pela região e tem uma forte sensação que está sendo seguido " +
                "e observado...");
    }

}
