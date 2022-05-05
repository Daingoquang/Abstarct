public class TestShape {
    public static void main(String[] args) {
        Shape shape=new Rectangle("red",8,8);
        System.out.println(shape);
        System.out.println("area is: "+shape.getArea());
        Shape shape1=new Triangle("blue",6, 6);
        System.out.println(shape1);
        System.out.println("area is: "+shape1.getArea());
    }
}
