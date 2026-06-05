public class InnerClass{
    class Toy{
        int price = 450;
    }
    static class PlayStation{
        int games = 10;
    }
    public static void main(String[] args){
        Toy t1 = new InnerClass().new Toy();
        System.out.println("The price of toy is "+t1.price);
        PlayStation p1 = new PlayStation();
        System.out.println("Total no.games in playstation is "+p1.games);
    }
}