class Parent {
    static int x = 10;
    int y = 20;
    static {
        System.out.println("In Parent Static block");
    }

    Parent() {
        System.out.println("In Parent Constructor");
    }
}

class Child extends Parent {
    int a = 10;
    static int b = 30;
    static {
        System.out.println("In Child Static Block");
    }

    Child() {
        System.out.println("In Child Constructor");
    }

    void access() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Parent.x);
        System.out.println(super.y);
    }

}

class Client {
    public static void main(String[] args) {
        System.out.println("In main");
        Child obj = new Child();
        obj.access();
    }
}
