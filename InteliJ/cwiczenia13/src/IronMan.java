public class IronMan {
    public String ironName;
    public String ironSurname;
    public IronMan(Billionaire billionaire){
        ironName = billionaire.billName;
        ironSurname = billionaire.billSurname;
    }
    public void attack(Enemy enemy){
        System.out.println("I'll crush you "+enemy.enemyName);
    }
    public void printNameOfOwner(){
        System.out.println(ironName+" "+ironSurname);
    }
}
