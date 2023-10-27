/* * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                   *
 * Java Console Application                          *
 * 06 Task Performance 1 - TaskPerformance1.java     *
 * Data Structures and Algorithm                     *
 * @author https://github.com/Jiei-Dux               *
 *                                                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * */




// ========== // ========== // ==== Package ==== // ========== // ========== //
package pkg06.task.performance.pkg1;




// ========== // ========== // ==== Library Imports ==== // ========== // ========== //
import java.util.*;
import static java.lang.System.*;




// ========== // ========== // ==== Main Class ==== // ========== // ========== //
public class TaskPerformance1 {
    
    // ----- // --- Variables START --- // ----- //
    
    static Queue<String> queue = new LinkedList<>();
    
    static Stack stack = new Stack();
    
    static Scanner usrInput = new Scanner(System.in);
    
    static int BookNum = 1;
    static int BookNumm = 4;
    
    // ----- // --- Variables END --- // ----- //
    
    
    
    
    // ----- // --- Print START --- // ----- //
    
    static void print(Object cmdLine) {
        out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        out.println(cmdLine);
    }
    
    // ----- // --- Print END --- // ----- //
    
    
    
    
    // ----- // --- Main Prompt END --- // ----- //
    
    static void bookPrompt() {
        
        do {
            
            println("\n" + BookNum + " out of 4");
            print("Enter a book title: ");
            String Book = usrInput.nextLine();
            stack.push(Book);
            BookNum++;
        
        } while ( BookNum <= 4 );
        
    }
    
    static void popBook() {
        do {
            
            queue.add(stack.pop().toString());
            BookNumm--;
        
        } while ( BookNumm > 0 );
    }
    
    // ----- // --- Main Prompt END --- // ----- //

    
    
    
    // ----- // --- Main Method START --- // ----- //
    
    public static void main(String[] args) {
        
        bookPrompt();
        popBook();
        
        if(stack.isEmpty()) {
            
            try {
                
                println("\n\nStack is now empty\n");
                Thread.sleep(1000);
                
                println("Displaying queue:");
                Thread.sleep(1000);
                
                println(queue);
                
            } catch ( InterruptedException e ) {
                print(e);
            }
            
        }
        
    }
    
    // ----- // --- Main Method END --- // ----- //
    
}
