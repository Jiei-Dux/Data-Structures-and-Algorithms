/* * * * * * * * * * * * * * * * * * * * * * * *
 *                                             *
 * Java Console Application                    *
 * 07 Hands-On Activity 1 - HandsOnAct1.java   *
 * Data Structures and Algorithm               *
 *                                             *
 * * * * * * * * * * * * * * * * * * * * * * * */




// ========== // ========== // Library Imports // ========== // ========== //

import java.util.*;
import static java.lang.System.*;




// ========== // ========== // Main Class // ========== // ========== //

public class BirthMonth {
    
    
    
    
    public static Scanner usrInput = new Scanner(System.in);

    
    // ========== // ========== // ========== // ========== // ========== //
    
    
    static void print(Object cmdLine) { out.print(cmdLine); }

    static void println(Object cmdLine) { out.println(cmdLine); }
            
            
    // ========== // ========== // ========== // ========== // ========== //
    
    
    static void ERROR(Object cmdLine) { print("Something happend bro...\n" + cmdLine); }
    
    
    
    
    static Set<Object> group1 = new HashSet<>();
    static Set<Object> group2 = new HashSet<>();
    static Set<Object> self = new HashSet<>();
    
    
    
    
    static void firstGroup() {
        
        try {
        
            println("===== Enter 6 birth months =====\n\n");
            println("===== First Group =====");
            
            int count = 1;
            
            do {
            
                print( count + " of 3: ");
                String birthMonths = usrInput.nextLine();
                group1.add(birthMonths);
                count++;
            
            } while ( count <= 3 );
            
            secondGroup();
        
        } catch (Exception e) { ERROR(e); }
        
    }
    
    
    
    
    static void secondGroup() {
        
        try {
        
            println("Second Group");
            
            int count = 1;
            
            do {
            
                print( count + " of 3: ");
                String birthMonths = usrInput.nextLine();
                group2.add(birthMonths);
                count++;
            
            } while ( count <= 3 );
            
            println(group1);
            println(group2);
            
            Ask();
        
        } catch (Exception e) { ERROR(e); }
    
    }
    
    
    
    
    static void Ask() {
    
        print("Enter your birth month: ");
        String birthMonth = usrInput.nextLine();
        
        self.add(birthMonth);
        
        Set<Object> union = new HashSet<>(group1);
        Set<Object> inter = new HashSet<>(group1);
        Set<Object> diff = new HashSet<>(group1);
        
        union.addAll(group2);
        inter.retainAll(group2);
        diff.removeAll(group2);
        
        println("Union: " + union);
        println("Intersection: " + inter);
        println("Difference: " + diff);
        
        if ( union.containsAll(self) ) {
        
            println("You have the same birth month with your classmates...");
            System.exit(0);
        
        }
        
        println("You dont have same birth months as your classmates...");
    
    }

    
    
    
    public static void main(String[] args) {
        
        firstGroup();
        
    }
    
}
