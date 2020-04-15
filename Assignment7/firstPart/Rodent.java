package Assignment7.firstPart;


public abstract class Rodent {
    public Rodent() {
        System.out.println("These Rodents are mammals and have different subgroups");
    }

    public void foodHabits() {
        System.out.println("Rodents eat grass and available trees");
    }

    public abstract void availability();

}

class Hamster extends Rodent {

    public Hamster() {
        System.out.println(" Hamsters are small rodents");

    }

    public void foodHabits() {
        System.out.println("Hamsters eat leafy greens and few fruits like pears etc");
    }

    @Override
    public void availability() {
        System.out.println("The first hamsters were discovered in Syria, though they also live in Greece, Romania, Belgium and northern China.");
    }

}

class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse is also belongs to the family of rodents");
    }

    public void foodHabits() {
        System.out.println("Mice eat grains and seeds");
    }

    @Override
    public void availability() {
        System.out.println("Mice are small rodents we can see everywhere");
    }


}