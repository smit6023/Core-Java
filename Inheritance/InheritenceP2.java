public class InheritenceP2{
    public static void main(String[] args){
    EmailNotification e1 = new EmailNotification();
    e1.sends();
    }
}
class Notification{
    void sends(){
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification{
    void sends(){
        super.sends();
        System.out.println("Sending email notification");
    }
}