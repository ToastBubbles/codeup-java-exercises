import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Person[] persons = new Person[3];
        Person p1 = new Person("dave");
        Person p2 = new Person("daved");
        Person p3 = new Person("daver");
        Person p4 = new Person("denver");
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        for(Person p : persons){
            System.out.println(p.getName());
        }
//        person[0] = "ss";
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(addPerson(persons,p4)));

    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPeople = new Person[people.length + 1];
        int i;
        for(i = 0; i < people.length; i++){
            newPeople[i] = people[i];
        }
        newPeople[i] = person;
        for(Person p : newPeople){
            System.out.println(p.getName());
        }
        return newPeople;
    }
}
