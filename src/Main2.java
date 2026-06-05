class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Name: "+name+", Age: "+age;
    }
    public boolean equals(Person obj){
        return name.equals(obj.getName())&&this.age==obj.getAge();
    }
    public static void main(String[] args) {
        Person p=new Person("Jatin",20);
        Person p2=new Person("Jatin",20);
        System.out.println(p.equals(p2));
    }
}
