package Assignment7.partFive;

public class FirstClass {
    public FirstClass(){
        System.out.println("constructor of first outer class");

    }
    class FirstInnerClass{
        public FirstInnerClass(int number){
            System.out.println(number);
        }
    }
}
