//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World");
        System.out.println(7);
        System.out.println(7.23);
        System.out.println('A');
        System.out.println(true);
        System.out.println(false);

        int age = 25;
        double price = 19.99;
        char grade = 'A';
        String name = "Anna";
        boolean isStudent = false;

        System.out.println("----------");

        System.out.println(age);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(name);
        System.out.println(isStudent);

        System.out.println("----------");
        System.out.println(age);
        age = 28;
        System.out.println(age);

        System.out.println("----------");
        //    ((Object) name).getClass().getName()
        System.out.println((name));
        System.out.println(((Object) name));
        System.out.println(((Object) name).getClass());
        System.out.println(((Object) name).getClass().getName());

        System.out.println("----------");
        System.out.println(((Object) age).getClass().getName());
        System.out.println(((Object) price).getClass().getName());
        System.out.println(((Object) grade).getClass().getName());
        System.out.println(((Object) name).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());

    }
}
