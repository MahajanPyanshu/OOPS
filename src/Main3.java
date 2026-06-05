class Circle {
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }

    public static void compare(Circle c1,Circle c2){
        if(c1.radius>c2.radius){
            System.out.println("Circle 1 is greater");
        }
        else if(c2.radius>c1.radius){
            System.out.println("Circle 2 is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }

}
public class Main3{
    public static void main(String[] args) {
       Circle c1=new Circle(5);
       Circle c2=new Circle(7);
       Circle.compare(c1,c2);
    }
}