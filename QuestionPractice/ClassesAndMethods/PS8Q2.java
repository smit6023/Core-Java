package QuestionPractice;
public class PS8Q2{
    public static void main(String[] args){
     CellPhone cp = new CellPhone();
     cp.ringing();
     cp.vibrating();
    }
}
class CellPhone{
    public void ringing(){
        System.out.println("The phone is ringing");
    }
    public void vibrating(){
        System.out.println("The phone is vibrating");
    }
}