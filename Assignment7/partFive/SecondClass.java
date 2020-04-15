package Assignment7.partFive;

public class SecondClass {
    public SecondClass(){
        System.out.println("Constructor of second outer class");
    }
    class SecondInnerClass extends FirstClass.FirstInnerClass {

        public SecondInnerClass(int number) {
            new FirstClass().super(7);
            System.out.println("Second Inner Class");
        }
    }
}
