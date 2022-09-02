import java.util.Scanner;

public class Jmain
{
    public static void main(String args[])
    {
        int opt = 0;
        float nmber1, nmber2;
        float add,less,product,divide; 
        
        do {
            Scanner getnumber = new Scanner(System.in);
            System.out.println("--------Menu--------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Select one option: ");
            opt = getnumber.nextInt();
            System.out.println("");
            switch (opt) {
                case 1:
                    System.out.print("\nEnter the first number: ");
                    nmber1 = getnumber.nextFloat();
                    System.out.print("\nEnter the second number: ");
                    nmber2 = getnumber.nextFloat();
                    add = nmber1 + nmber2; //Do the sum
                    System.out.println("\nThe result is : " + add + "\n");
                    break;
                    
                case 2:
                    System.out.print("\nEnter the first number: ");
                    nmber1 = getnumber.nextFloat();
                    System.out.print("\nEnter the second number: ");
                    nmber2 = getnumber.nextFloat();
                    less = nmber1 - nmber2; //Do the subtraction
                    System.out.println("\nThe result is : " + less + "\n");
                    break;

                case 3:
                    System.out.print("\nEnter the first number: ");
                    nmber1 = getnumber.nextFloat();
                    System.out.print("\nEnter the second number: ");
                    nmber2 = getnumber.nextFloat();
                    product = nmber1 * nmber2; //Do the product
                    System.out.println("\nThe result is : " + product + "\n");
                    break;    

                case 4:
                    System.out.print("\nEnter the first number: ");
                    nmber1 = getnumber.nextFloat();
                    System.out.print("\nEnter the second number: ");
                    nmber2 = getnumber.nextFloat();
                    if(nmber2==0){ // Verify if number 2 is equal to 0
                        System.out.println("\nCan't divide by 0\n");
                    }else{
                    divide = nmber1 / nmber2; //Do the division
                    System.out.println("\nThe result is : " + divide + "\n");
                    }                    
                    break;  
                    
                default:
                    System.out.println("Need to choice one option of the menu\n");
                    break;
            }
        } while (opt!=5);
    }
}