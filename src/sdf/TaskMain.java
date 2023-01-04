package sdf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TaskMain {

    public static void main(String[] args) {
        
        List <Car> garage = new LinkedList<>();
        Set <String> addressbook = new HashSet<>();
        Map <String,Integer> debts = new HashMap<>();

        // Add some cars to garage
        garage.add(new Car());
        garage.add(new Porche());
        System.out.println(garage);

        // Add names to my addressbook
        addressbook.add("fred");
        addressbook.add("tim");
        System.out.println(addressbook);

        // Add my debtors
        debts.put("fred", 100);
        debts.put("time", 200);
        System.out.println(debts);
    }
    
}
