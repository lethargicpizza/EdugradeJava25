package polymorfism;

public class Circle extends Shape {
    @Override
    public void Draw() {
       System.out.println("This is a Circle");
        super.Draw();
    }
}
