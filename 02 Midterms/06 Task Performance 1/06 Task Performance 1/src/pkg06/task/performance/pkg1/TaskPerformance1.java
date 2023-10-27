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
    
    
    
    
    static void print(Object cmdLine) {
        out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        out.println(cmdLine);
    }
    
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

    public static void main(String[] args) {
        
        bookPrompt();
        popBook();
        if(stack.isEmpty()) {
            try {
                
                println("\n\nStack is now empty\n\n");
                Thread.sleep(1000);
                
            } catch ( Exception e ) {
            
                
            
            }
        }
        
    }
    
}
