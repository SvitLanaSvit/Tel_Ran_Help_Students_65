package task4;

public class Box {
    private double length = 10;
    private double width = 15;
    private double height = 20;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("AllArgumentsConstructor: V = " + length * width * height);
    }

    public Box(double width, double height){
        this.width = width;
        this.height = height;
        System.out.println("TwoArgumentsConstructor: V = " + length * width * height);
    }

    public Box(double height){
        this.height = height;
        System.out.println("OneArgumentConstructor: V = " + length * width * height);
    }

    public Box()
    {
        System.out.println("NoArgumentsConstructor: V = " + length * width * height);
    }
}
