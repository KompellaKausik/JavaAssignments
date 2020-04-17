package Assignment7.PartThree;

interface InterfaceOne {
    public void method1();
    public void method2();
}
interface InterfaceTwo {
    public void method3();
    public void method4();
}
interface InterfaceThree {
    public void method5();
    public void method6();

}
interface InterfaceFour extends InterfaceOne, InterfaceTwo, InterfaceThree {
    public void method7();
}
class ConcreteClass {
    public void baseClassMethod() {
        System.out.println("inside the  baseClass method");
    }
}
class Derive extends ConcreteClass implements InterfaceFour {

    @Override
    public void method1() {
        System.out.println("This is method 1");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2");
    }

    @Override
    public void method3() {
        System.out.println("This is method 3");
    }

    @Override
    public void method4() {
        System.out.println("This is method 4");
    }

    @Override
    public void method5() {
        System.out.println("This is method 5");
    }

    @Override
    public void method6() {
        System.out.println("This is method 6");
    }

    @Override
    public void method7() {
        System.out.println("This is method 7");
    }


}

public class PartThree {
    void m1(InterfaceOne one){
        one.method1();
    }
    void m2(InterfaceOne one){
        one.method2();
    }
    void m3(InterfaceFour four){
        four.method5();
    }
    void m4(InterfaceThree three){
        three.method5();
    }
    public static void main(String[] args){
        Derive d = new Derive();
        PartThree p =new PartThree();
        p.m1(d);
        p.m2(d);
        p.m3(d);
        p.m4(d);
    }
}