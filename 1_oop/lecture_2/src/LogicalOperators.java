public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logiska operatorer");

        /*
        &&  and  och
        ||  or   eller
        !   not  inte
         */

        System.out.println(true);
        System.out.println(!true);
        System.out.println(false);
        System.out.println(!false);

        System.out.println("-- AND --");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && !false);
        System.out.println(true && true && true && true && true && true && true);
        System.out.println(false && true && true && true && true && true && true);
        System.out.println(true && true && true && true && true && true && false);
        System.out.println(true && true && true && true && true && false && true);

        System.out.println("-- OR --");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(false || false || false || false || false || false || true);
    }
}
