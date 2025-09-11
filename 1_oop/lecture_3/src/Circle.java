package lecture_3.src;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public void calculateCircumreference() {
        System.out.println("Circumreference: " + this.radius*2*Math.PI);
    }
}
