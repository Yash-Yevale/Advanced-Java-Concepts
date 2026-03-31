
class Rectangle{
    int length, width;
    Rectangle(int x, int y)
    {
        length = x;
        width = y;
    }
    int rectArea()
    {
        return (length*width);
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(100, 20);
        int area1 = rectangle1.rectArea();
        System.out.println("Area1 = "+ area1);
    }
}
