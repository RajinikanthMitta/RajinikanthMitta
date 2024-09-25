package Java.MethodOverLoading;

//Overloading Constructors

public class Box {
	private double width, height, depth;

    // Constructor used when all dimensions are provided
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
 
    // Constructor used when no dimensions are provided (default)
    public Box() {
        width = height = depth = 0;
    }

    // Constructor used when a cube is created
    public Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box();
        Box box3 = new Box(5);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }

}
