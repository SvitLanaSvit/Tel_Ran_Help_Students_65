package task4;

public class BoxNew {
    private double length;
    private double width;
    private double height;

    public BoxNew(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("AllArgumentsConstructor: V = " + length * width * height);
    }

    public BoxNew(double width, double height){
        this(10,width,height);
    }

    public BoxNew(double height){
        this(10,15,height);
    }

    public BoxNew(){
        this(10,15,20);
    }
}
