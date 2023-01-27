public class Osoba {
    private String _name = "secret name";
    private String _email = "secret email";
    private String _country = "secret country";
    public Osoba(String name, String email, String country){
        setName(name);
        setEmail(email);
        setCountry(country);
    }
    public String toString(){
        return _name +" "+ _email +" "+_country;
    }
    public String getName(){
        return _name;
    }
    public  void setName(String newName){
        if(newName == null || newName.isEmpty() || newName.isBlank()){
            System.out.println("Blad! Ilosc znakow musi byc wieksza niz 0");
            return;
        }
        _name = newName;
    }
    public String getEmail(){
        return _email;
    }
    public  void setEmail(String newEmail){
        if(newEmail == null || newEmail.isEmpty() || newEmail.isBlank()){
            System.out.println("Blad! Ilosc znakow musi byc wieksza niz 0");
            return;
        }
        _email = newEmail;
    }
    public String getCountry(){
        return _country;
    }
    public  void setCountry(String newCountry){
        if(newCountry == null || newCountry.isEmpty() || newCountry.isBlank()){
            System.out.println("Blad! Ilosc znakow musi byc wieksza niz 0");
            return;
        }
        _country = newCountry;
    }
}
