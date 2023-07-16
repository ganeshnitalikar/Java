class Parent{
    Parent(){
        System.out.println("In Parent Constructor");
    }
    void m1(){
        System.out.println("In parent m1");
    }
    void m2(){
        System.out.println("In parent m2");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("In Child Constructor");
    }
    void m1(){
        System.out.println("In child m1");
    }
    void m3(){
        System.out.println("IN Child m3");
    }

}
class Client{
    public static void main(String[] args) {
        System.out.println("In main");
        Parent obj = new Child(); // here during compile time parents m1() gets binded , but while executing child's m1() gets called 
        System.out.println(obj); // Child@3764951d
        System.out.println(obj.m3());
    }
}
