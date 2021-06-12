/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstring;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author Dubai
 */
public class ComparingString {

    public static boolean compareString(BiPredicate<String,String> p, String s1, String s2){
            return p.test(s1,s2);
    }
    
    public static boolean checkAlpha(String x) {
      
    for (int i = 0 ; i < x.length() ; i++) {
        
           if (Character.isLetter(x.charAt(i)) == false && x.charAt(i) != ' ' && x.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        boolean isBetter = compareString((s1,s2) -> s1.length() < s2.length(), "Hello World", "Hello World 2");
        System.out.println("Is String 1 better than sTring 2 ?");
        System.out.println(isBetter);
        
        
        System.out.println(checkAlpha("Hello World"));
        System.out.println(checkAlpha("Hello World 2"));
    }
}
