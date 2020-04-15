package Assignment7.partTwo;

public class Cycle {
    public Cycle(){
        System.out.println("this is Cycle class");
    }


}
class UniCycle extends Cycle{
    public UniCycle(){
        System.out.println("this is UniCycle class");
    }
    public void balance() {
        System.out.println("this is Balancing in the UniCycle");
    }

}
class Bicycle extends Cycle{
    public Bicycle(){
        System.out.println("bicycle class");
    }
    public void balance() {
        System.out.println("this is Balancing in the Bicycle");
    }


}
class TriCycle extends Cycle{
    public TriCycle(){
        System.out.println("this is TriCycle class");
    }

}
