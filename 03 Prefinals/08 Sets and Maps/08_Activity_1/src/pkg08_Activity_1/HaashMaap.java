/* * * * * * * * * * * * * * * * * * * * * * * *
 *                                             *
 * Java Console Application                    *
 * 08 Activity 1 - HashMap.java                *
 * Data Structures and Algorithm               *
 *                                             *
 * * * * * * * * * * * * * * * * * * * * * * * */




// ========== // ========== // Library Imports // ========== // ========== //

import java.util.*;
import static java.lang.System.*;




// ========== // ========== // Main Class // ========== // ========== //

public class HaashMaap {
    
    
    
    // ========== // ========== // ========== // ========== // ========== //
    
    
    static void print(Object cmdLine) { out.print(cmdLine); }

    static void println(Object cmdLine) { out.println(cmdLine); }
    
    static void Hashmap() {
        
        HashMap<String, String> programs = new HashMap<String, String>();
        
        programs.put("BSIT", "Bachelor of Science in Information Technology");
        programs.put("BSCS", "Bachelor of Science in Computer Science");
        programs.put("BSIS", "Bachelor of Science in Information Systems");
        
        HashMap.Entry<String,String> entry = programs.entrySet().iterator().next();
        String key = entry.getKey();
        
        programs.remove(key);
        
        println(programs);
        
    }

    public static void main(String[] args) {
        
        Hashmap();
               
    }
    
}
