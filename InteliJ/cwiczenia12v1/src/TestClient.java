public class TestClient {
    public String name;
    public String surname;
    public int yearOfBirth;
    int tmp;
    private int tmp2=0;

    public int getTmp2()
    {
        return tmp2;
    }

    public void increaseTmp2(){
        tmp2++;
    }

    public void setTmp2(int newTmp2){
        if(newTmp2 <0){
            return;
        }
        tmp2 = newTmp2;
    }
}
