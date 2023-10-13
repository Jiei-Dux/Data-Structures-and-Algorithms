/* * * * * * * * * * * * * * * * * * * * * * * *
 *                                             *
 * Java Console Application                    *
 * Group Presentation - ExampleProgram.java    *
 * Data Structures and Algorithm               *
 *                                             *
 * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.*;
import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class ExampleProgram {

    public static Scanner inputScanner = new Scanner(System.in);
    public static Stack<String> stackEx = new Stack<String>();


    // ========== // ========== // ========== // ========== // ========== // ========== //


    private void RESTART(String[] strArr) {
        main(strArr);
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void print(Object cmdLine) {
        System.out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        System.out.println(cmdLine);
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void clearConsole() {

        print("\033[H\033[2J");
        out.flush();

    }

    static void ERROR() {
        print("Something happend...");
    }

    static void ENTER() {
        print("\n\nPress <ENTER> to Continue...");
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void STACKMethod() {
        try {

            print(stackEx);
            ENTER();
            System.in.read();

        } catch ( Exception e ) {
            ERROR();
        }
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void EMPTYMethod() {
        try {

            String MSG = "The 'EMPTY' method checks the stack and outputs 'true' or 'false'\n";
            MSG += "depending on what the 'EMPTY' method found";

            clearConsole();
            print(MSG);
            System.in.read();
            

            print("\n\nIs the STACK empty?: " + stackEx.empty());
            ENTER();
            System.in.read();

        } catch ( Exception e ) {
            ERROR();
        }
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void PEEKMethod() {

        try {

            String PeekMSG = "The 'PEEK' method takes the very 'Last-in' item from the STACK\n\n\n";
            String AskMSG = "Do you want the system to print out the STACK elements?";

            clearConsole();
            print(PeekMSG);
            System.in.read();

            print(stackEx.peek());
            System.in.read();

            print("\n\n" + AskMSG + " [y/n]: ");
            char usrInput = inputScanner.nextLine().charAt(0);

            if ( usrInput == 'y' || usrInput == 'Y' ) {
                STACKMethod();
            }
            
        } catch ( Exception e ) {
            ERROR();
        }
        

    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void POPMethod() {

        boolean popCONDITION = true; 
        
        String PopMSG = "The 'POP' method removes the tippy top item from the STACK\n\n";
        String PopPROMPT = "Choose what you want to do:\n";
            PopPROMPT += "a. Remove\n";
            PopPROMPT += "q. Main Menu\n\n";
            PopPROMPT += "Enter your answer: ";
        String HowMany = "How many? [1-5]: ";

        try {
            
            do {
                
                clearConsole();
                print(PopPROMPT);
                char usrInputPOP = inputScanner.nextLine().charAt(0);
    
                if ( usrInputPOP == 'a' || usrInputPOP == 'A' ) {
                    print(HowMany);
                    int usrInputCount = inputScanner.nextInt();
    
                    while ( usrInputCount != 0 ) {
                        stackEx.pop();
                        usrInputCount--;
                    }
                    STACKMethod();
                }
        
                if ( usrInputPOP == 'q' || usrInputPOP == 'Q' ) {
                    popCONDITION = false;
                }
    
            } while ( popCONDITION == true );

        } catch ( Exception e ) {
            ERROR();
        }
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void MainMenu() {

        boolean CONDITION = true;

        do {

            String MainPROMPT = "Choose what you want to do:\n";
            MainPROMPT += "a. STACK - Print out elements of the STACK\n";
            MainPROMPT += "b. EMPTY - Check if STACK is EMPTY\n";
            MainPROMPT += "c. PEEK  - Print out top element of the STACK\n";
            MainPROMPT += "d. POP   - Remove elements from STACK\n";
            MainPROMPT += "q. Quit\n\n";
            MainPROMPT += "Enter your answer: ";

            clearConsole();
            out.flush();
            print(MainPROMPT);
            String readUserInput = inputScanner.nextLine();

            while ( readUserInput.equals("") || readUserInput.equals(" ") ) {
                    
                try {
                    print("\n\nPlease input something...");
                    Thread.sleep(1000);
                    clearConsole();
                    out.flush();
                    print(MainPROMPT);
                    readUserInput = inputScanner.nextLine();
                    // break;
                } catch ( Exception e ) {
                    ERROR();
                }
                    
            }
                
            char usrInput = readUserInput.charAt(0);
            
            if ( usrInput == 'a' || usrInput == 'A' ) {
                clearConsole();
                println("Here're the different types of Linux OS");
                STACKMethod();
            }
        
            if ( usrInput == 'b' || usrInput == 'B' ) {
                EMPTYMethod();
            }

            if ( usrInput == 'c' || usrInput == 'C' ) {
                PEEKMethod();
            }
            
            if ( usrInput == 'd' || usrInput == 'D' ) {
                POPMethod();
            }

            if ( usrInput == 'q' || usrInput == 'Q' ) {
                CONDITION = false;
            }
                
    
        } while ( CONDITION == true );

    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    public static void main(String[] args) {

        stackEx.push("Arch Linux");
        stackEx.push("Debian");
        stackEx.push("Endeavour OS");
        stackEx.push("Fedora");
        stackEx.push("Linux Mint");

        MainMenu();

    }

}
