package Assignment7.firstPart;




public class Execute {
    public static void main(String[] args) {
        // array of Rodent, filled  with different specific types of Rodent
        Rodent[] rodents = new Rodent[2];
        rodents[0] = new Mouse();
        rodents[1] = new Hamster();
        //prints the characteristics of the different types of rodents
        for (Rodent r : rodents) {
            r.foodHabits();
            r.availability();
        }

    }
}
