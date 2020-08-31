import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

    public static ArrayList getPersons() {
        ArrayList<Person> persons = new ArrayList<>();
        try {
            Scanner console = new Scanner(new File("src/persons.txt"));
            while (console.hasNextLine()) {
                String s1 = console.next();
                String s2 = console.next();
                Person p = new Person(s1, s2);
                persons.add(p);
            }
        } catch (Exception e) {
            System.out.println("File couldn't be found");
        }
        return persons;
    }

    public static ArrayList getArrayList() {
        return (getPersons());
    }
}