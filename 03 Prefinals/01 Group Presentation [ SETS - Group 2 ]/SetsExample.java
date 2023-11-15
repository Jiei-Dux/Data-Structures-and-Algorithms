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

    static void ERROR(Object cmdLine) {
        print("Something happend bro...\n" + cmdLine);
    }
    
    static void ENTER() {
        print("\n\nPress <ENTER> to Continue...");
    }

    
    // ========== // SET IMPLEMENTATIONS // ========== //
    
    
    static void HASH() {

        try {
            
            Set<Integer> HashA = new HashSet<>();
            Set<Integer> HashB = new HashSet<>();

            //Collections.addAll(HashA, "This", "Is", "The", "Sentence");
            //Collections.addAll(HashB, "Its", "The", "Second", "Sentence");
            Collections.addAll(HashA, 5, 3, 9, 7);
            Collections.addAll(HashB, 4, 3, 5, 2);

            Set<Integer> union = new HashSet<>(HashA);
            Set<Integer> inter = new HashSet<>(HashA);
            Set<Integer> diff = new HashSet<>(HashA);

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
            ERROR(e);
        }

    }

    static void TREE() {

        try {
            
            Set<Integer> TreeA = new TreeSet<>();
            Set<Integer> TreeB = new TreeSet<>();

            /*Collections.addAll(TreeA, "This", "Is", "The", "Sentence");
            Collections.addAll(TreeB, "Its", "The", "Second", "Sentence");*/
            Collections.addAll(TreeA, 5, 3, 9, 7);
            Collections.addAll(TreeB, 4, 3, 5, 2);

            Set<Integer> union = new TreeSet<>(TreeA);
            Set<Integer> inter = new TreeSet<>(TreeA);
            Set<Integer> diff = new TreeSet<>(TreeA);

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
            ERROR(e);
        }

    }

    static void LINKEDHASH() {

        try {
            
            Set<Integer> LHashA = new LinkedHashSet<>();
            Set<Integer> LHashB = new LinkedHashSet<>();

            //Collections.addAll(LHashA, "This", "Is", "The", "Sentence");
            //Collections.addAll(LHashB, "Its", "The", "Second", "Sentence");
            Collections.addAll(LHashA, 5, 3, 9, 7);
            Collections.addAll(LHashB, 4, 3, 5, 2);

            Set<Integer> union = new TreeSet<>(LHashA);
            Set<Integer> inter = new TreeSet<>(LHashA);
            Set<Integer> diff = new TreeSet<>(LHashA);

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
            ERROR(e);
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
                        ERROR(e);
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
            ERROR(e);
        }
         
    }

    
    // ========== // ========== // ========== // ========== // ========== //
    
    
    public static void main(String[] args) {
        MainMenu();
    }

} 
