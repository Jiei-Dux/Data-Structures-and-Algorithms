/* * * * * * * * * * * * * * * * * * * * * * * *
 *                                             *
 * Java Console Application                    *
 * 07 Hands-On Activity 1 - HandsOnAct1.java   *
 * Data Structures and Algorithm               *
 *                                             *
 * * * * * * * * * * * * * * * * * * * * * * * */




// ========== // ========== // Library Imports // ========== // ========== //

import java.util.Scanner;
import java.util.PriorityQueue;

import java.io.IOException;
import static java.lang.System.*;




// ========== // ========== // Main Class // ========== // ========== //

public class HandsOnAct1 {

    
    
    
    // ========== // ========== // Static Objects // ========== // ========== //
    
    static PriorityQueue<Object> nicknames = new PriorityQueue<>();
    
    static Scanner usrInput = new Scanner(in);
    
    
    // ========== // ========== // My Personal Components // ========== // ========== //
    
    static void print(Object cmdLine) { out.print(cmdLine); }
    
    static void println(Object cmdLine) { out.println(cmdLine); }
    
    static void ENTER() { print("\n\nPress <ENTER> to Continue..."); }
    
    static void ERROR(Object cmdLine) { print("Something happend bro...\n" + cmdLine); }
    
    
    // ========== // ========== // User Inputs Section // ========== // ========== //
    
    static void AskNickname() {
        
        try {
            
            println("Pick 4 of your classmates and enter their nicknames");
        
            int count = 1;
        
            do {
            
                print( count + " of 4: ");
                String nickname = usrInput.nextLine();
                nicknames.add(nickname);
                count++;
            
            } while ( count <= 4 );
        
            ENTER();
            in.read();
            
            SayHi();
            
        } catch ( IOException e) { ERROR(e); }
        
    }
    
    static void SayHi() {
    
        try {
            
            do {
        
                print("Enter 'H' to say Hi to each of them: ");
                char usrSaid = usrInput.nextLine().charAt(0);
        
                if(usrSaid == 'H') { println("\nHi " + nicknames.poll()); }
                
                if(usrSaid != 'H') { 
                    print("read the instructions again\n\n"); 
                    Thread.sleep(100);
                }
        
            } while ( !nicknames.isEmpty() );
        
            print("\n\nDone saying Hi...\n\n");
            
            ENTER();
            in.read();
            
        } catch ( IOException | InterruptedException e ) { ERROR(e); }
    
    }
    
    
    // ========== // ========== // PSVM // ========== // ========== //
    
    public static void main(String[] args) {
        AskNickname();
    }
    
    
    
    
}
