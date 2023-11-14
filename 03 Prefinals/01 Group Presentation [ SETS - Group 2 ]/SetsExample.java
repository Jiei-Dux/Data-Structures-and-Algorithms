/* * * * * * * * * * * * * * * * * * * * * * * *
 *                                             *
 * Java Console Application                    *
 * Group Presentation - SetsExample.java       *
 * Data Structures and Algorithm               *
 *                                             *
 * * * * * * * * * * * * * * * * * * * * * * * */

import java.util.*;
import java.io.IOException;
import static java.lang.System.out;

public class SetsExample {

    public static Scanner scanInput = new Scanner(System.in);

    
    // ========== // ========== // ========== // ========== // ========== //
    
    
    static void print(Object cmdLine) {
        out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        out.println(cmdLine);
    }
            
            
    // ========== // ========== // ========== // ========== // ========== //
    
    
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

    
    // ========== // SET IMPLEMENTATIONS // ========== //
    
    
    static void HASH() {

        try {
            
            Set<String> HashA = new HashSet<>();
            Set<String> HashB = new HashSet<>();

            Collections.addAll(HashA, "This", "Is", "A", "Sentence");
            Collections.addAll(HashB, "This", "The", "Second", "Sentence");

            Set<String> union = new HashSet<>(HashA);
            Set<String> inter = new HashSet<>(HashA);
            Set<String> diff = new HashSet<>(HashA);

            union.addAll(HashB);
            inter.retainAll(HashB);
            diff.removeAll(HashB);

            println(HashA);
            println(HashB);

            print("\n");

            println("Union: " + union);
            println("Intersection: " + inter);
            println("Difference: " + diff);

            print("\n");

            println(HashA.containsAll(HashB));
            
            ENTER();
            System.in.read();
            
        } catch ( IOException e ) {
            ERROR();
        }

    }

    static void TREE() {

        try {
            
            Set<String> TreeA = new TreeSet<>();
            Set<String> TreeB = new TreeSet<>();

            Collections.addAll(TreeA, "This", "Is", "A", "Sentence");
            Collections.addAll(TreeB, "This", "The", "Second", "Sentence");

            Set<String> union = new TreeSet<>(TreeA);
            Set<String> inter = new TreeSet<>(TreeA);
            Set<String> diff = new TreeSet<>(TreeA);

            union.addAll(TreeB);
            inter.retainAll(TreeB);
            diff.removeAll(TreeB);

            println(TreeA);
            println(TreeB);

            print("\n");

            println("Union: " + union);
            println("Intersection: " + inter);
            println("Difference: " + diff);
            
            print("\n");
            
            println(TreeA.containsAll(TreeB));
            
            ENTER();
            System.in.read();
            
        } catch ( IOException e ) {
            ERROR();
        }

    }

    static void LINKEDHASH() {

        try {
            
            Set<String> LHashA = new LinkedHashSet<>();
            Set<String> LHashB = new LinkedHashSet<>();

            Collections.addAll(LHashA, "This", "Is", "A", "Sentence");
            Collections.addAll(LHashB, "This", "The", "Second", "Sentence");

            Set<String> union = new TreeSet<>(LHashA);
            Set<String> inter = new TreeSet<>(LHashA);
            Set<String> diff = new TreeSet<>(LHashA);

            union.addAll(LHashB);
            inter.retainAll(LHashB);
            diff.removeAll(LHashB);

            println(LHashA);
            println(LHashB);

            print("\n");

            println("Union: " + union);
            println("Intersection: " + inter);
            println("Difference: " + diff);

            print("\n");

            println(LHashA.containsAll(LHashB));
        
            ENTER();
            System.in.read();
            
        } catch ( IOException e ) {
            ERROR();
        }
        
    }

    
    // ========== // ========== // ========== // ========== // ========== //
    
    
    static void MainMenu() {
        
        boolean CONDITION = true;
        
        try {
        
            do {

                String SetImpl = "SET IMPLEMENTATIONS:\n";
                SetImpl += "    a. HASH SET\n";
                SetImpl += "    b. TREE SET\n";
                SetImpl += "    c. LINKED HASH SET\n";
                SetImpl += "    q. Quit\n";
                SetImpl += "\n\nPICK ONE: ";
            
                clearConsole();
                print(SetImpl);
                String readUserInput = scanInput.nextLine();
            
                while ( readUserInput.equals("") || readUserInput.equals(" ") ) {
                    try {
                        print("Input something bro...");
                        Thread.sleep(1000);
                        clearConsole();
                        print(SetImpl);
                        readUserInput = scanInput.nextLine();
                    } catch ( InterruptedException e ) {
                        ERROR();
                    }
                }
            
                char usrInput = readUserInput.charAt(0);

            if ( usrInput == 'a' || usrInput == 'A' ) {
                clearConsole();
                println("HASH SET");
                HASH();
            }

            if ( usrInput == 'b' || usrInput == 'B' ) {
                clearConsole();
                println("TREE SET");
                TREE();
            }

            if ( usrInput == 'c' || usrInput == 'C' ) {
                clearConsole();
                println("LINKEDHASH SET");
                LINKEDHASH();
            }
            
            if ( usrInput == 'q' || usrInput == 'Q' ) {
                CONDITION = false;
            }
            
        } while ( CONDITION == true );
            
        } catch ( Exception e ) {
            ERROR();
        }
         
    }

    
    // ========== // ========== // ========== // ========== // ========== //
    
    
    public static void main(String[] args) {
        MainMenu();
    }

} 
