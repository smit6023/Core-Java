public class FinalMethodP2{
    public static void main(String[] args){

    }
}
 class Parent{
    final void show(){
        System.out.println("Parents are showing their watch");
    }
 }

 class Child extends Parent{
   // here it will show compilation error  
   // void show(){                                             

   //     System.out.println("Child is showing his watch");
   // }
 }