import java.util.ArrayList;

/**
 * House class.
 * A house is a building that can have residents and may have a dining room.
 */
public class House extends Building implements HouseRequirements {
    /**
     * The list of students living in the house.
     */
    private ArrayList<Student> residents;
    /**
     * Whether the house has a dining room.
     */
    private boolean hasDiningRoom;

    /**
     * Constructor for house
     *
     * @param name the name of the house
     * @param address the address of the house
     * @param nFloors the number of floors
     * @param hasDiningRoom whether the house has a dining room
     */
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.residents = new ArrayList<Student>();
        this.hasDiningRoom = hasDiningRoom;
        System.out.println("You have built a house: 🏠");
    }

    /**
     * Return whether the house has a dining room
     *
     * @return true if the house has a dining room, false otherwise
     */
    public boolean hasDiningRoom() {
        return this.hasDiningRoom;
    }

    /**
     * Return the number of residents in the house
     *
     * @return number of residents
     */
    public int nResidents() {
        return this.residents.size();
    }

    /**
     * Add a student to the list of residents
     *
     * @param s the student moving in
     */
    public void moveIn(Student s) {
        this.residents.add(s);
    }

    /**
     * Remove a student from the list of residents
     *
     * @param s the student moving out
     * @return the student who moved out
     */
    public Student moveOut(Student s) {
        this.residents.remove(s);
        return s;
    }

    /**
     * Check whether a student is a resident of the house
     *
     * @param s the student to check
     * @return true if the student is a resident, false otherwise
     */
    public boolean isResident(Student s) {
        return this.residents.contains(s);
    }

    public static void main(String[] args) {
        House house = new House("Duckett", "41 Elm St", 2, true);
        System.out.println(house.hasDiningRoom());
        System.out.println(house.nResidents());
    }
}