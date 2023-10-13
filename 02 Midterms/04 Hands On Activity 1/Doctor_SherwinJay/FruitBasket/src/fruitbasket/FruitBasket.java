/* * * * * * * * * * * * * * * * * * * * * * * *
 *                                             *
 * Java Console Application                    *
 * Group Presentation - ExampleProgram.java    *
 * Data Structures and Algorithm               *
 * @author https://github.com/Jiei-Dux         *
 *                                             *
 * * * * * * * * * * * * * * * * * * * * * * * */

// package FruitBasket;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class FruitBasket {
    
    public static Stack<String> basket = new Stack<String>();


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


    static int numOfFruit;


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void startingPrompt() {
        println("Catch and eat any of these fruits: [ 'Apple' | 'Orange' | 'Mango' | 'Guava' ]");
    }

    static void validationPrompt() {
        print("Your basket now has: " + basket);
    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    static void fruitNum() {
        Scanner fruitNumScanner = new Scanner(System.in);

        print("Enter the number of fruits you would like to catch: ");
        numOfFruit = fruitNumScanner.nextInt();
    }

    static void chooseFruit() {

        Scanner chooseFruitScanner = new Scanner(System.in);

        print("Pick which fruits you want to catch:\n");
        print("A. Apple\n");
        print("O. Orange\n");
        print("M. Mango\n");
        print("G. Guava\n");
        
        do {

            String chosenFruit = chooseFruitScanner.nextLine();

            if ( chosenFruit == "a" | chosenFruit == "A" ) {
                basket.push("Apple");
            }

            if ( chosenFruit == "o" | chosenFruit == "O" ) {
                basket.push("Orange");
            }

            if ( chosenFruit == "m" | chosenFruit == "M" ) {
                basket.push("Mango");
            }

            if ( chosenFruit == "g" | chosenFruit == "G" ) {
                basket.push("Guava");
            }

            numOfFruit--;

        } while ( numOfFruit != 0 );

    }

    static void eatFruit() {

        Scanner eatingFruitScanner = new Scanner(System.in);
        
        do {

            print("Enter 'E' to eat a fruit...");
            char letterE = eatingFruitScanner.nextLine().charAt(0);

            if ( letterE == 'e' | letterE == 'E' ) {
                basket.pop();
            }

            if ( basket.empty() == false ) {
                validationPrompt();
            }

        } while ( basket.empty() != true );

        if ( basket.empty() == true ) {
            print("Theres no more fruits dude...");
        }

    }


    // ========== // ========== // ========== // ========== // ========== // ========== //


    public static void main(String[] args) {
       
        startingPrompt();

        fruitNum();
        chooseFruit();
        validationPrompt();

        eatFruit();

    }
    
}
