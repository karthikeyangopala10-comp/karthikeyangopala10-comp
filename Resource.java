import java.util.Scanner;
import java.util.*;
public class Resource {
    public void askChoice(){
        System.out.println("1. Add Resource" + "\n2. View Resources" + "\n3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public void option1(){

        
        System.out.print("Enter Resource Name: ");
        resource = scanner.nextLine();
        System.out.print("Enter family name: ");
        name = scanner.nextLine();
        System.out.print("Enter number of resources: ");
        qty = scanner.nextInt();
        scanner.nextLine();
                
        logBook.add(Arrays.asList(resource, qty, name));
        System.out.println("Resource added successfully!");
        resource = "";
        qty = 0;
        name = "";
        }
    
    public static void option2(){
        System.out.println("==========================================");
        for (int i=0; i < logBook.size(); i++){
            System.out.println("ENTRY #" + i);
            System.out.println("Resource: " + logBook.get(i).get(0) + "\nDonor: " + logBook.get(i).get(2) + "\nQTY: " + logBook.get(i).get(1));
            numResources+=1;
            System.out.println("");
        }
        System.out.println("==========================================");
        System.out.println("Number of resources logged: " + numResources);
        numResources = 0;
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Object>> logBook = new ArrayList<>();
        String resource;
        String name;
        int qty;
        int numResources = 0;
        System.out.println("Welcome to the Resource Manager!");
        String option = askChoice();
        while (option != 3){
            if (option == 1){
                option1();
                option = askChoice();
            }
            else if (option == 2){
                option2();
                option=askChoice();
            }
        }
        System.out.println("Thank you for your service!");
        
    }
}