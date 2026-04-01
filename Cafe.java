 /**
 * This is a stub for the Cafe class
 * A Cafe is a Building that keeps track of coffee inventory.
 */
public class Cafe extends Building implements CafeRequirements {
    /**
     * The ounces of coffee remaining in stock.
     */
    private int nCoffeeOunces;
    /**
     * The number of sugar packets remaining in stock.
     */
    private int nSugarPackets;
    /**
     * The number of creams remaining in stock.
     */
    private int nCreams;
    /**
     * The number of cups remaining in stock.
     */
    private int nCups;

    /**
     * Constructor for cafe
     *
     * @param name the name of the cafe
     * @param address the address of the cafe
     * @param nFloors the number of floors
     * @param nCoffeeOunces the ounces of coffee in stock
     * @param nSugarPackets the sugar packets in stock
     * @param nCreams the creams in stock
     * @param nCups the cups in stock
     */
    public Cafe(String name, String address, int nFloors,
                int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Sell one cup of coffee and updates inventory
     *
     * @param size the coffee size in ounces
     * @param nSugarPackets the number of sugar packets
     * @param nCreams the number of creams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces < size || this.nSugarPackets < nSugarPackets
                || this.nCreams < nCreams || this.nCups < 1) {
            restock(size, nSugarPackets, nCreams, 1);
        }

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    /**
     * Restock inventory
     *
     * @param nCoffeeOunces the ounces of coffee to add
     * @param nSugarPackets the sugar packets to add
     * @param nCreams the creams to add
     * @param nCups the cups to add
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe("Campus Center Cafe", "100 Elm St", 1, 50, 20, 20, 10);
        cafe.sellCoffee(12, 2, 1);
    }
}