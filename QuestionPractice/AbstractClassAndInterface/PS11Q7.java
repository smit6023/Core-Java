package QuestionPractice.AbstractClassAndInterface;
interface TvRemote1{
    void remote();
}
class Tv implements TvRemote1{
   public void remote(){
     System.out.println("Tv remote is working");
   }
}