public class RectangleComputation {
    public static void main(String[] args) {
        double height = Integer.parseInt(args[0]);
        double width = Integer.parseInt(args[1]);
        double area = height*width;
        double perimeter = 2*height + 2*width;
        System.out.println("shape: rectangle");
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}