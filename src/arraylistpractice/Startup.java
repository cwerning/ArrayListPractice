/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 * @author L115student
 */
public class Startup {

    public static void main(String[] args) {
        Person person1 = new Person("Chad", "Werning", "222-22-2222");
        Person person2 = new Person("Jim", "Smith", "333-33-3333");
        Person person3 = new Person("Joe", "Weber", "444-44-4444");
        Person person4 = new Person("Chad", "Anthony", "555-55-5555");

        Collection<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personList.forEach((p) -> {
            System.out.println(p);
        });

        Collection<Person> personList2 = new ArrayList<>(personList);

        personList2.forEach((p) -> {
            System.out.println(p);
        });

        System.out.println(personList2.contains(person1));
//        personList2.clear();
//        System.out.println(personList2.contains(person1));
        System.out.println(personList2.isEmpty());
        System.out.println(personList);
        personList.remove(person1);
        System.out.println(personList);
        
        
        //remove if
        personList2.add(person4);
        Predicate<Person> personPredicate = p-> p.getFirstName().equals("Chad") && 
                                                p.getLastName().equals("Werning");
        personList2.removeIf(personPredicate);
        System.out.println(personList2);
        
        //arraylist size retrieval
        System.out.println(personList2.size());
        
        //to array
        Person [] personArray = new Person[personList2.size()];
        personArray = personList2.toArray(personArray);
        
        for(Person p : personArray){
            System.out.println(p);
        }
        
     
        
//        personList2.add(1, person2);

        
    }
}
