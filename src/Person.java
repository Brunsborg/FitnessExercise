import java.util.ArrayList;

public class Person {
    private  String name;
    private  String cpr;

    public Person() {
    }
    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public static void print(){
        ArrayList<Person> pList = new ArrayList<>();
        Person p1 = new Person("Alan", "150853-1451");
        pList.add(p1);
        Person p2 = new Person("Tove", "210200-5465");
        pList.add(p2);
        Person p3 = new Person("Josuke", "151196-4564");
        pList.add(p3);
        Person p4 = new Person("Rasmus", "030482-9819");
        pList.add(p4);
        Person p5 = new Person("Brian", "150753-1451");
        pList.add(p5);
        Person p6 = new Person("Elise", "210400-5465");
        pList.add(p6);
        Person p7 = new Person("Muhammad", "042069-8845");
        pList.add(p7);
        Person p8 = new Person("Bent", "140872-4575");
        pList.add(p8);

        HelperClass.Layout("Name", "CPR");
        HelperClass.stars();
        for(Person p : pList){
            HelperClass.Layout(p.getName(), p.getCpr());
        }
        HelperClass.bars();
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }
}
