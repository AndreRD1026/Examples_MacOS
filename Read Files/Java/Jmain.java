import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Jmain
{
    public static Scanner entrada = new Scanner(System.in);
    static String alltext;
    public static void main(String args[])
    {
        int opt = 0;
        
        do {
            Scanner getnumber = new Scanner(System.in);
            System.out.println("--------Menu--------");
            System.out.println("1. Read Local File");
            System.out.println("2. Read File with Path");
            System.out.println("3. See Content");
            System.out.println("4. Exit");
            System.out.print("Select one option: ");
            opt = getnumber.nextInt();
            System.out.println("");
            switch (opt) {
                case 1:
                    read();
                    break;
                case 2:
                    readfilepath();
                    break;
                case 3:
                    if (alltext == null){
                        System.out.println("Need read a file before");
                    }
                    else{
                        System.out.println(alltext);
                    }
                    
                    break;    
                case 4:
                    System.out.println("Finish Program\n");
                    break;  
                default:
                    System.out.println("Need to choice one option of the menu\n");
                    break;
            }
        } while (opt!=4);
    }

//==========================Using functions==========================

//Function that get the content of local file
    private static void read() {
        File nuevo = new File("text.txt");
        //Read the file
        try {
            FileReader file = new FileReader(nuevo);
            BufferedReader mi_buffer = new BufferedReader(file);
            String line = mi_buffer.readLine();
            System.out.println("Successful upload");
            alltext = line;
        } catch (Exception e) {
            System.out.println("Can't open the file");
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
        }
}

// Function that get the path and open the file
    private static void readfilepath() {
        System.out.println("Put the path of file:");
        String prueba = entrada.nextLine();
        File nuevo = new File(prueba);
        //Read the file
        try {
            FileReader file = new FileReader(nuevo);
            BufferedReader mi_buffer = new BufferedReader(file);
            String line = mi_buffer.readLine();
            System.out.println("Successful upload");
            alltext = line;
        } catch (Exception e) {
            System.out.println("Can't open the file");
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
        }
}

}