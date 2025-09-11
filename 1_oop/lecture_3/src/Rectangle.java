package lecture_3.src;

public class Rectangle {
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int width;
    int height;

    public void calculateArea() {
        System.out.println("Area of rectangle is " + width * height);
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
