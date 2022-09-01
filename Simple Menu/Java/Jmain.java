import java.util.Scanner;

public class Jmain
{
    public static void main(String args[])
    {
        int opt = 0;
        
        do { // repeat the menu
            Scanner getnumber = new Scanner(System.in); //used to get the input number
            System.out.println("--------Menu--------");
            System.out.println("1. First opc");
            System.out.println("2. Second opc");
            System.out.println("3. Third opc");
            System.out.println("4. Exit");
            System.out.print("Select one option: ");
            opt = getnumber.nextInt(); //get input number
            System.out.println("");
            switch (opt) {
                case 1:
                    System.out.println("Enter to option 1\n");
                    break;
                case 2:
                    System.out.println("Enter to option 2\n");
                    break;
                case 3:
                    System.out.println("Enter to option 3\n");
                    break;    
                case 4:
                    System.out.println("Finish Program\n");
                    break;  
                default:
                    System.out.println("Need to choice one option of the menu\n"); //When you put another number differents 1 to 4
                    break;
            }
        } while (opt!=4); //Finish the loop when you put number 4
    }
}