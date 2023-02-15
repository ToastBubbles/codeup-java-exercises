public class Person {

    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        this.name = name;
//TODO: change the name field to the passed value
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Howdy %s%n",this.name);
    }

    public static void main(String[] args) {
        Person jimbo = new Person("Jimbo");
    }

}
