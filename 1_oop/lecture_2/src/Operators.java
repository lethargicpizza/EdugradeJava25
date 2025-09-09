public class Operators {
    public static void main(String[] args) {
        System.out.println("Operatorer");

        System.out.println(10 + 5);  // summa
        System.out.println(10 - 5);  // differans
        System.out.println(10 * 5);  // multiplikation
        System.out.println(10 / 5);  // division
        System.out.println("Modulus");
        System.out.println(10 % 5); // Modulus, returnerar eventuell rest
        System.out.println(10 % 3); // Modulus, returnerar eventuell rest   3, 6, 9, 12
        System.out.println(11 % 3); // Modulus, returnerar eventuell rest

        /*
        ==  lika med
        !=  inte lika med
        >   större än
        <   mindre än
        >=   större eller lika med
        < =  mindre eller lika med
         */

        System.out.println("Jämförelse Operatorer");
        boolean isEqual = (5 == 5);
        boolean isNotEqual = (5 != 4);
        boolean isGreater = (5 > 3);
        boolean isLesser = (3 < 5);
        boolean isGreaterOrEqual = (5 >= 5);
        boolean isLesserOrEqual = (3 <= 5);

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreater);
        System.out.println(isLesser);
        System.out.println(isGreaterOrEqual);
        System.out.println(isLesserOrEqual);
        System.out.println("---");
        System.out.println(isEqual);
        isEqual = (5 == 4);
        System.out.println(isEqual);
    }
}
