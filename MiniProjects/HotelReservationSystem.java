package MiniProjects;
import java.util.*;

public class HotelReservationSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Deluxe", 2500, true));
        rooms.add(new Room(202, "Standard", 4000, true));
        rooms.add(new Room(301, "Suite", 1200, true));

        ArrayList<Reservation> reservations = new ArrayList<>();
        System.out.println("***** Available Rooms *****");
        for(Room r : rooms){
            r.displayRoom();
        }
                    
          System.out.println("Enter the customer name");
          String customerName = sc.next();
          System.out.println("Enter no. of days");
          int days = sc.nextInt();
          System.out.println("Enter the Room Types");
          String roomType = sc.next();
          boolean found = false;
          for(Room r : rooms){
           if(r.roomType.equalsIgnoreCase(roomType) && r.isAvailable){
           Reservation r1 = new Reservation(customerName, r, days);
           reservations.add(r1);
           r.isAvailable = false;
           found = true;
           System.out.println("\nROOM BOOKED SUCCESSFULLY");
           break;
          }
        }
        if(! found){
            System.out.println("\nRoom not Available");
        }
        System.out.println();
        System.out.println("***** Reservations *****");
        for(Reservation r : reservations){
            r.displayReservation();
        }
         System.out.println("\n****** Updated Room Status *****");
        for(Room r1 : rooms){
            r1.displayRoom();
        }

        System.out.println("Enter customer name to cancel reservation");
        String cancelName = sc.next();
        boolean cancelled = false;
        
        for(Reservation r : reservations){
            if(r.customerName.equalsIgnoreCase(cancelName)){
                r.room.isAvailable = true;
                reservations.remove(0);
                cancelled = true;
                System.out.println();
                System.out.println("RESERVATION CANCELLED SUCCESSFULLY");
                break;
            }
        }
        if(! cancelled){
            System.out.println("RESERVATION NOT FOUND");
        }

        System.out.println("\n****** Updated Room Status *****");
        for(Room r2 : rooms){
            r2.displayRoom();
        }
        }
    }


class Room{
    int roomNumber;
    String roomType;
    double roomPrice;
    boolean isAvailable;

    Room(int roomNumber, String roomType, double roomPrice, boolean isAvailable){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isAvailable = isAvailable;
    }

    public void displayRoom(){
        if(isAvailable){
            System.out.println("Room Number = "+roomNumber);
            System.out.println("Room Type = "+roomType);
            System.out.println("Room Price = "+roomPrice);

        }
        else{
            System.out.println("Room " + roomNumber+" is not Available");
        }
        System.out.println();
    }
}

class Reservation{
    String customerName;
    Room room;
    int days;

    Reservation(String customerName, Room room, int days){
        this.customerName = customerName;
        this.room = room;
        this.days = days;
    }
     
    public void displayReservation(){
        System.out.println("Customer name = "+customerName);
        System.out.println("Room Number = "+room.roomNumber);
        System.out.println("Room Type = "+room.roomType);
        System.out.println("Room Price = "+room.roomPrice);
        System.out.println("Days to Stay = "+days);

        double totalCost = room.roomPrice * days;
        System.out.println("PAYMENT DONE SUCCESSFULLY");
        System.out.println("Total Cost = "+totalCost);
        System.out.println();
    }
}
