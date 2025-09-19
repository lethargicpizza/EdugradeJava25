import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double a = 5;
        double b = 10;

        SimpleCalculator simpleCalculator = new SimpleCalculator(a, b);

        System.out.println(simpleCalculator.add(a, b)  );
        System.out.println(simpleCalculator.sub(a, b));
        System.out.println(simpleCalculator.mul(a, b));
        System.out.println(simpleCalculator.div(a, b));

        Person person = new Person("Per", 45, "Västerhaninge");
        System.out.println("Namn: " + person.getName()  );
        System.out.println("Ålder: " + person.getAge());
        System.out.println("Stad: " + person.getCity());

        Car car1 = new Car();
        Car car2 = new Car("Volvo", "V70", "2013");

        car1.displayCarInfo();
        car2.displayCarInfo();

        Book book = new Book("Liftarens guide till galaxen", "Douglas Adams", 500);
        book.showDetails();

        book.setDiscount(10);
        book.showDetails();

        Student student = new Student("Per", "Ö", 45);
        student.showDetails();

        student.setGrade("A");
        student.showDetails();
    }
}