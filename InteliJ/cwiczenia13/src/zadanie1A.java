public class zadanie1A {
    public static void main(String[] args) {
        String name = "Tony";
        String familyName = "Stark";
        RegularPerson tony = new RegularPerson(name, familyName);
        Billionaire tonyStark = new Billionaire(tony);
        tonyStark.setMoney(1000000000000l);
        Enemy enemy = new Enemy("Justin Hammer");
        enemy.makeEvilIntroduction(); // Wyświetla: "I'm Justin Hammer!"
        enemy.attack(tonyStark); // 50% szans, że Tony Stark został pomyślnie zaatakowany
        if (tonyStark.isInDanger()) {
            IronMan ironMan = new IronMan(tonyStark);
            ironMan.attack(enemy);
            ironMan.printNameOfOwner(); // Wyświetla: "Tony Stark"
        } else {
            tonyStark.goParty(); // Wyświetla: "Party time!"
        }
    }
}
