public class Practice_1 {
    public static void main(String[] args) {
        // Uppgift 1

        System.out.println("Uppgift 1:");
        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println(((Object) age).getClass().getName());

        System.out.println("Height: " + height);
        System.out.println(((Object) height).getClass().getName());

        System.out.println("Initial: " + initial);
        System.out.println(((Object) initial).getClass().getName());

        System.out.println("Name: " + name);
        System.out.println(((Object) name).getClass().getName());

        System.out.println("isStudent: " + isStudent);
        System.out.println(((Object) isStudent).getClass().getName());


        // Uppgift 2
        System.out.println("----------");
        System.out.println("Uppgift 2:");

        int sum1 = 10 + 20;
        int diff1 = 100 - 30;
        int prod1 = 5 * 7;
        int quote1 = 20 / 4;
        int rest1 = 10 % 3;

        System.out.println("sum1: " + sum1);
        System.out.println("diff1: " + diff1);
        System.out.println("prod1: " + prod1);
        System.out.println("quote1: " + quote1);
        System.out.println("rest1: " + rest1);

        int a = 15;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a <= b);

        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println((x>y) && (z>y));
        System.out.println((x>y) || (z<y));

        if (x > y) {
            System.out.println("x är större än y");
        } else {
            System.out.println("x är mindre än y");
        }

        System.out.println( (10+5)*2 > 20);
    }
}
