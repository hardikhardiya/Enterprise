/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise;
import java.util.* ;
/**
 *
 * @author HCL
 */
public class Enterprise {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
       double total = getTotal();
        print(total);
    }

    private static double getTotal() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double total = 0;
       boolean moreItems = true;
       char response;
       while(moreItems){
           total+=getItemPrice(getItemName());
           System.out.println("More Items? (y/n)");
           response = scan.next().charAt(0);
           if(response != 'y' || response != 'Y'){
               moreItems=false;
               scan.nextLine();
           }
       }
       return total;
        
    }
    public static String getItemName(){
        String name;
        System.out.println("Enter Item name");
        name=scan.nextLine();
        return name;
    }
    public static Double getItemPrice(String value){
        double price = 0;
        try {
         System.out.println("Enter Price"+value+":");
         price=scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Invalid Data Type Entered");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity * price;
    }

    private static int getItemQuantity() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Please Entered The Quatity");
       int quantity;
       quantity=scan.nextInt();
       return quantity;
    }
    
    private static void print(double total) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Thank u for shopping with us"+ total);
    }
    
}
