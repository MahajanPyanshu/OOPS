class Rectangle{
    private int length;
    private int width;
    public Rectangle(int length,int width){
        this.length=length>0?length:1;
        this.width=width>0?width:1;
    }
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
    public boolean isSquare(){
        return length==width;
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5,5);
        System.out.println(r1.area());
        System.out.println(r1.isSquare());
    }
}