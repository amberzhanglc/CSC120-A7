import java.util.Hashtable;

/**
 * This is a stub for the Library class
 * A library is a building with a collection of books.
 */
public class Library extends Building implements LibraryRequirements {
   /**
    * The collection of titles in the library and their availability.
    */
    private Hashtable<String, Boolean> collection;

    /**
     * Constructor for library
     *
     * @param name the name of the library
     * @param address the address of the library
     * @param nFloors the number of floors
     */
    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.collection = new Hashtable<String, Boolean>();
        System.out.println("You have built a library: 📖");
    }

    /**
     * Add a title to the collection
     *
     * @param title the title to add
     */
    public void addTitle(String title) {
        this.collection.put(title, true);
    }

    /**
     * Remove a title from the collection
     *
     * @param title the title to remove
     * @return the title that was removed
     */
    public String removeTitle(String title) {
        this.collection.remove(title);
        return title;
    }

    /**
     * Check out a title from the library
     *
     * @param title the title to check out
     */
    public void checkOut(String title) {
        this.collection.replace(title, false);
    }

    /**
     * Return a title to the library
     *
     * @param title the title to return
     */
    public void returnBook(String title) {
        this.collection.replace(title, true);
    }

    /**
     * Check whether the library contains a title
     *
     * @param title the title to check
     * @return true if the title is in the collection, false otherwise
     */
    public boolean containsTitle(String title) {
        return this.collection.containsKey(title);
    }

    /**
     * Check whether a title is available
     *
     * @param title the title to check
     * @return true if the title is available, false otherwise
     */
    public boolean isAvailable(String title) {
        if (!this.collection.containsKey(title)) {
            return false;
        }
        return this.collection.get(title);
    }

    /**
     * Print the full collection and each title's availability
     */
    public void printCollection() {
        for (String title : this.collection.keySet()) {
            System.out.println(title + ": " + this.collection.get(title));
        }
    }

    public static void main(String[] args) {
        Library library = new Library("Neilson", "7 Neilson Drive", 4);
        library.addTitle("The Lorax by Dr. Seuss");
        library.addTitle("Charlotte's Web by E.B. White");
        library.printCollection();
    }
}