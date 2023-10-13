package fruitbasket;

/**
 *
 * @author dux
 * 
 */

import java.util.*;

public class FruitBasket {
    
    public static Scanner usrInput = new Scanner(System.in);
    public static Stack<String> basket = new Stack<String>();
    
    static void print(Object cmdLine) {
        System.out.print(cmdLine);
    }

    static void println(Object cmdLine) {
        System.out.println(cmdLine);
    }
    
    static void numOfFruits() {
        print("Enter the number of fruits you would like to catch: ");
        int usrFruitCount = usrInput.nextInt();
    }

    public static void main(String[] args) {
       
    }
    
}
