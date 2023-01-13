public class SecretStudent {
    private String name = "secret name";
    public String getName(){
        return name;
    }
    public  void setName(String newName){
        if(newName == null || newName.isEmpty() || newName.isBlank()){
            System.out.println("Blad! Ilosc znakow musi byc wieksza niz 0");
            return;
        }
        name = newName;
    }
}
