package exercises;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var person1 = new People();
        person1.setName("José");
        person1.setAge(19);

        var person2 = new People();
        person2.setName("Lorena");
        person2.setAge(20);

        var person3 = new People();
        person3.setName("Pedro");
        person3.setAge(15);

        ArrayList<People> listPeople = new ArrayList<>();
        listPeople.add(person1);
        listPeople.add(person2);
        listPeople.add(person3);

        System.out.println("Array size: " + listPeople.size());
        System.out.println("First person: " + listPeople.get(0).getName());
        System.out.println("Completed Array: \n" + listPeople);
    }
}
