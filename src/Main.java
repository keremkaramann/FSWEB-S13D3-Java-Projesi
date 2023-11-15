import com.workintech.oop.Person;
import com.workintech.oop.Wall;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20, 88, 193, "black");
        System.out.println(person);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("IsTeen: " + person.isTeen());
        System.out.println("-------");

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}