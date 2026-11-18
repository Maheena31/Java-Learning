package OOPSs.Inheritance;

class User{
    int userID = 101;
    String userName = "Mahee";
    String email = "maheena25@gmail.com";

    void displayUserDetails(){
        System.out.println("UserID" +userID);
        System.out.println("User Name" +userName);
        System.out.println("User Email"+email);
    }
} 

class Order extends User{
    int oredrID = 500;
    String productName = "Laptop";
    int quantity = 3;
    double price = 50000;

    void calculateTotalAmount(){
        System.out.println("Total"+quantity*price);
    } 

    void displayOrderDetails(){
        System.out.println("OrderID" +oredrID);
        System.out.println("Product"+productName);
        System.out.println("Quantity"+quantity);
        System.out.println("Price"+price);
    }
}

class Payment extends Order{

}
public class PaymentManagement {
    
}
