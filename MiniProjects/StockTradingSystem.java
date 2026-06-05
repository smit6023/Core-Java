package MiniProjects;
import java.util.*;

public class StockTradingSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("TCS", 3500));
        stocks.add(new Stock("Reliance", 4600.6));
        stocks.add(new Stock("Tata", 5800.48));
        stocks.add(new Stock("HDFC", 2300));

        System.out.println("***** Avaliable Stocks *****");

        for(Stock s : stocks){
            s.stockDisplay();
        }
         
        ArrayList<Portfolio> portfolios = new ArrayList<>();
        System.out.println("Enter the stock Name to buy");
        String stockName = sc.next();

        boolean found = false;

        for(Stock s : stocks){
            if(s.stockName.equalsIgnoreCase(stockName)){
            System.out.println("Enter quantity ");
            int quantity = sc.nextInt();
            Portfolio p1 = new Portfolio(s, quantity);
            portfolios.add(p1);
            found = true;
            System.out.println("Stock Purchased Successfully");
            break;
        }
    }
    
    if(! found){
        System.out.println("Stock not found");

    }
     boolean stockFound = false;
    System.out.println("Enter the stock name to sell");
    String sellStock = sc.next();
     for(Portfolio p : portfolios){
        if(p.stock.stockName.equalsIgnoreCase(sellStock)){
        System.out.println("Enter quantity to sell");
        int sellQuantity = sc.nextInt();
        p.quantity = p.quantity - sellQuantity;
        stockFound = true;
        System.out.println("Stocks Sold Successfully");
        System.out.println("Remaining Stocks = "+p.quantity);
        break;
     }
    }
    if (! stockFound){
        System.out.println("Stock not found");
    }
     
    System.out.println("***** Your Portfolio *****");

    for(Portfolio p : portfolios){
        p.displayPortfolio();
    }
}
}

class Stock{
    String stockName;
    double stockPrice;

    Stock(String stockName, double stockPrice){
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public void stockDisplay(){
     System.out.println("Stock Name = "+stockName);
     System.out.println("Stock Price = "+stockPrice);
     System.out.println();
    }
}

class Portfolio{
    Stock stock;
    int quantity;

    Portfolio(Stock stock, int quantity){
        this.stock = stock;
        this.quantity = quantity;
    }

    public void displayPortfolio(){
        System.out.println("Owned Stock = "+stock.stockName);
        System.out.println("Stock Price = "+stock.stockPrice);
        double totalInvestment = stock.stockPrice * quantity;
        System.out.println("Total Investment Value = "+totalInvestment);
        System.out.println();
    }
}


    