package Assignment7.partTwo;

public class CycleMain {
    public static void main(String[] args) {
        UniCycle unicycle = new UniCycle();
        Bicycle bicycle = new Bicycle();
        TriCycle tricycle = new TriCycle();

        Cycle[] cycle = new Cycle[3];
        //Upcasting
        cycle[0] = (Cycle) unicycle;
        cycle[1] = (Cycle) bicycle;
        cycle[2] = (Cycle) tricycle;

        for (Cycle c : cycle) {

//           cycle.balance();
//            This method will give an error because the Cycle class does not have balance method
        }

        Cycle first = new UniCycle();
        Cycle second = new Bicycle();
        Cycle third = new TriCycle();
        //Downcasting
        UniCycle u = (UniCycle) first;
        Bicycle b = (Bicycle) second;
        TriCycle t = (TriCycle) third;

        u.balance();
        b.balance();
//        t.balance();
        //The above throws an error as Tricycle does not have a balance method.

    }

}
