package Main;

public class Player {

    GameManager gm;

    public static int health;
    public static int lossHealth;
    public static int gainHealth;
    public static int gainEnergy;
    public static int lossEnergy;
    public static int energy;
    public static int coin;
    public int hasItem1;
    public int hasItem2;
    public int hasItem3;
    public int hasItem4;
    public int hasItem5;
    public int hasItem6;
    public int hasItem7;

    public Player(GameManager gm) {

        this.gm = gm;

    }

    public void setPlayerDefaultStatus (){

        health = 0;
        energy = 0;
        coin = 0;

        lossHealth = 0;
        gainHealth = 0;
        lossEnergy = 0;
        gainEnergy = 0;
        hasItem1 = 0;
        hasItem2 = 0;
        hasItem3 = 0;
        hasItem4 = 0;
        hasItem5 = 0;
        hasItem6 = 0;
        hasItem7 = 0;

        updatePlayerStatus();
    }
    public void updatePlayerStatus (){

        //Check player items
        if(hasItem1==0) {
            gm.ui.itemsLabel[1].setVisible(false);
        }
        if(hasItem1==1) {
            gm.ui.itemsLabel[1].setVisible(true);
        }
        if(hasItem2==0) {
            gm.ui.itemsLabel[2].setVisible(false);
        }
        if(hasItem2==1) {
            gm.ui.itemsLabel[2].setVisible(true);
        }

    }
}
