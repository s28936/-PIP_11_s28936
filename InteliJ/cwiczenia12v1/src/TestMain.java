public class TestMain {
    public static void main (String[] args){
        TestClient client1 = new TestClient();
        client1.name = "Jan";
        client1.surname = "Kowalski";
        client1.yearOfBirth = 1974;
        client1.increaseTmp2();
        System.out.println(client1.getTmp2());
        TestClient client2 = new TestClient();
        client2.name = "Adam";
        client2.surname = "Nowak";
        client2.yearOfBirth = 1975;

        TestClient[] clients = new TestClient[2];
        clients[0]=client1;
        clients[1]=client2;
    }
}
