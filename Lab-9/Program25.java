// 25. WAP in Java to create an abstract class (abs class A -> class B)

abstract class A{
    abstract void display();
    void displayA(){
        System.out.println("This is from class A");
    }
}

class B extends A{
    void display(){
        System.out.println("This is from class B");
    }
}

class Program25{
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.displayA();
    }
}