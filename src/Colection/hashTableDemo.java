package Colection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class hashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>(10);
        table.put("1000", "abcd");
        table.put("100", "Spongebob");

        table.put("321", "Sandy");
        table.put("123", "Patrick");

        table.put("abc", "Squidward");
        table.put("777", "Gary");


//        for (String key :table.keySet()) {
//            System.out.println(key.hashCode()+"\t"+key+"\t"+table.get(key));
//        }

        System.out.println(table);


    }
}
