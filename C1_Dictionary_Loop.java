package com.faisal.codility;

import java.util.*;

/**
 *
 * @author faisa
 */
public class C1_Dictionary_Loop {
    public static void main(String[] args) {
        
        Dictionary<String,String> dict = new Hashtable<String,String>();
        
        dict.put("mon", "Monday");
        dict.put("tue", "Tuesday");
        dict.put("wed", "Wednesday");
        dict.put("thu", "Thursday");
        dict.put("fri", "Friday");
        dict.put("sat", "Saturday");
        dict.put("sun", "Sunday");
        
        Enumeration<String> e = dict.keys();
        while(e.hasMoreElements()) {
            String key = e.nextElement();
            String value = dict.get(key);
            System.out.print("key: " + key);
            System.out.println(" value: " + value);
        }  
    }
}
