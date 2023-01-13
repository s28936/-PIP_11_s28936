public class Main {
    public static void main(String[] args) {
        //zad1
        Student student1 = new Student();
        student1.name = "Patryk Maliszewski";
        Student student2 = new Student();
        System.out.println(student1.name);
        System.out.println(student2.name);
        student1.yearOfBirth = 1997;
        System.out.println(student1.yearOfBirth);
        System.out.println(student2.yearOfBirth);
        //zad2
        printStaticHello();
        drukujemy new1 = new drukujemy();
        new1.printHello();
        //zad3
        SecretStudent secretStudent = new SecretStudent();
        System.out.println(secretStudent.getName());
        //zad4
        String nowy = "";
        SecretStudent secretStudent2 = new SecretStudent();
        secretStudent2.setName(nowy);
        System.out.println(secretStudent2.getName());
    }
    public static void printStaticHello(){
        System.out.println("Hello");
    }
}
class drukujemy {
    public void printHello(){
        System.out.println("Hello");
    }
}
