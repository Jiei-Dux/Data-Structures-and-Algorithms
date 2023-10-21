//  ==========  //  ==========  //  ==========  //  ==========  //  ==========  //
//                                                                              //
//                               Java Application                               //
//                    05 Hands On Activity 1 - MovieTime.java                   //
//                         Data Structures and Algorithms                       //
//                                                                              //
//  ==========  //  ==========  //  ==========  //  ==========  //  ==========  //




//  ==========  //  ==========  //  == Package ==  //  ==========  //  ==========  //
//package movietime;




//  ==========  //  ==========  //  == Library Imports ==  //  ==========  //  ==========  //
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import static java.lang.System.*;




//  ==========  //  ==========  //  == MAIN CLASS ==  //  ==========  //  ==========  //
public class MovieTime {
    
    static void print(Object cmdLine) {
        System.out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        System.out.println(cmdLine);
    }
    
    static void clearConsole() {
        print("\033[H\033[2J");
        out.flush();
    }

    public static void main(String[] args) {

        Queue movies = new LinkedList<>();
        Queue snacks = new LinkedList<>();
        
        Scanner usrInput = new Scanner(System.in);
        
        int MovieNum = 1;
        int SnackNum = 1;
        int EatSnacc = 3;
        
        do {
        
            println( MovieNum + " out of 3");
            print("Enter a movie you would like to watch in a cinema: ");
            String Movie = usrInput.nextLine();
            movies.offer(Movie);
            //clearConsole();
            MovieNum++;
        
        } while ( MovieNum <= 3 );
        
        do {
        
            println( SnackNum + " out of 3" );
            print("Enter a snack or beverages that you would like \nto eat or drink while watching these movies: ");
            String Snack = usrInput.nextLine();
            snacks.offer(Snack);
            //clearConsole();
            SnackNum++;
            
        } while ( SnackNum <= 3 );
        
        print("\n\nThe movies that you would like to watch in a cinema: \n" + movies );
        print("\n\nThe snacks and/or beverages that you would like to \neat and/or drink while watching these movies: \n" + snacks );
        print("\n\n\n\n");
        
        do {
        
            try {
                
                if ( snacks.isEmpty() ) {
                    //clearConsole();
                    println("No mo' snacks fo' ye...");
                    break;
                }
            
                print("You got " + EatSnacc + " snacks...\n");
                print("Enter 'S' to eat/drink a snack/beverage: ");
                char s = usrInput.nextLine().charAt(0);
            
                if ( s == 's' | s == 'S' ) {
                    snacks.poll();
                    EatSnacc--;
                }
                
            } catch ( Exception e ) {
                System.exit(1);
                print(e);
            }
            
        
        } while ( EatSnacc > 0 );
        
        if ( snacks.isEmpty() ) {
            //clearConsole();
            println("No mo' snacks fo' ye...");
            System.exit(0);
        }
        
    }
    
}
