package QuestionPractice;
public class PS8Q5{
    public static void main(String[] args){
    TommyVecetti tc = new TommyVecetti();
    tc.hitting();
    tc.running();
    tc.firing();
    }
}
class TommyVecetti{
    public void hitting(){
        System.out.println("TommyVecetti is hitting ");
    }
    public void running(){
        System.out.println("TommyVecetti is running ");
    }
    public void firing(){
        System.out.println("TommyVecetti is firing ");
    }
}