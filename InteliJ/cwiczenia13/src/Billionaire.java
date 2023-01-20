public class Billionaire {
    public long hajs;
    public String billName;
    public String billSurname;
    public boolean attacked;
    public Billionaire(RegularPerson regularPerson){
        billName= regularPerson._name;
        billSurname = regularPerson._familyName;
    }
    public void setMoney(long money){
        if(money <0){
            return;
        }
        hajs = money;
    }
    public void goParty(){
        System.out.println("Party time!");
        hajs = 0;
    }
    public boolean isInDanger(){
        return attacked;
    }
}
