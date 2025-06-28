package example;

import java.util.HashSet;
import java.util.TreeSet;

import objects.Customer;
import objects.Staff;

import java.util.TreeMap;

public class TestContainer {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("1", 'M', "123");
        System.out.println(newCustomer.signUp());
        Staff newStaff = new Staff("null", "nill");
        System.out.println(newStaff.signUp());


        // TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        // map.put(1, "Hello");
        // map.put(2, "World");
        
        // HashSet<String> set = new HashSet<String>();
        
        // set.add("mummy");
        // set.add("mummy");
        // set.add("World");
        // set.add("World");
        // set.add("Hello");
        // for (String string : set) {
        //     System.out.println(string);
        // }
        
        // ArrayList<String> list = new ArrayList<String>(5);
        // list.add("Hello");
        // list.add("World");
        // list.add("World");
        // list.add(1, "my");

        // for (String string : list) {
        //     System.out.println(string);
        // }
    }
}
