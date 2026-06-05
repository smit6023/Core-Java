package QuestionPractice.AbstractClassAndInterface;
public class PS11Q4{
    public static void main(String[] args){
    Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Phone is ringing");
    }
    void lift(){
        System.out.println("Phone is being lifted");
    }
    void disconnect(){
        System.out.println("Phone is being disconnected");
    }
}