import java.util.Random;

public class Enemy {
    public String enemyName = "default enemy name";
    public Enemy(String name){
        this.enemyName = name;
    }
    public void makeEvilIntroduction(){
        System.out.println("I'm "+enemyName);
    }
    public void attack(Billionaire billionaire){
        Random rand = new Random();
        int walka = rand.nextInt();
        if (walka>=0.5){
            billionaire.attacked = true;
            System.out.println("Watch out "+billionaire.billName+" "+billionaire.billSurname+". I'll kill you!");
        }
    }
}
