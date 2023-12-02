//package studentlist;

import static java.lang.System.out;
import java.util.*;

public class StudentList {
    
    public static Scanner usrInput = new Scanner(System.in);

    // ========== // ========== // ========== // ========== // ========== //
    
    static void print(Object cmdLine) {
        out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        out.println(cmdLine);
    }

    // ========== // ========== // ========== // ========== // ========== //
    
    static void ERROR(Object cmdLine) {
        print("Something happend bro...\n" + cmdLine);
    }
    
    static HashMap<Integer,String> students = new HashMap<>();
    
    static int stdNum;
    static String usrName;

    static void AskNames() {
        
        int x = 1;
        
        do {
        
            print("Enter student number " + x + ": ");
            stdNum = usrInput.nextInt();

            
            print("Enter first name " + x + ": ");
            usrName = usrInput.next();
            
            students.put(stdNum, usrName);
            x++;
            
        } while ( x <= 3 );
        
    }
    
    static void RemoveEntry() {
        
        int entryNum = 1;
        
        print("Student List:\n");
        
        for ( HashMap.Entry<Integer, String> entry : students.entrySet() ) {
        
            println(entry.getKey() + " " + entry.getValue());
            
            if ( entryNum == 3 ) {
            
                students.remove(entry.getKey());
                break;
            }
            
            entryNum++;
        
        }
        
    }
    
    static void AskNameAgain() {
    
        print("Now enter your student number: ");
        stdNum = usrInput.nextInt();
        
        print("And then your first name: ");
        usrName = usrInput.next();
        
        students.put(stdNum, usrName);
        
        print("Student List:\n");
        
        for ( HashMap.Entry<Integer, String> entry : students.entrySet() ) {
        
            println(entry.getKey() + " " + entry.getValue());
        
        }
    
    }
    
    public static void main(String[] args) {

        AskNames();
        RemoveEntry();
        AskNameAgain();

    }
    
}