public class FinalVariableP1{
    public static void main(String[] args){
     Tax t1 = new Tax();
     t1.taxes();
    }
}
class Tax{
    final int GST = 18;
  
    void taxes(){
  // here it will error   GST = 20;
        System.out.println("Total GST Tax is : "+GST+ " %");
    }
}