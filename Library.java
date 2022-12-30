public class Library {

    //Each library has a name, an address (single string), an assigned librarian, 
    //a number of library items (Book or Disc Media) and a number of study rooms.
    String name;
    String address;
    Librarian librarian;
    Item[] libraryItems;
    Room[] rooms;
    
    public Library() {}

    public Library(String name, String address, Librarian librarian, Item[] libraryItems, Room[] rooms) {
        this.name = name;
        this.address = address;
        this.librarian = librarian;
        this.libraryItems = libraryItems;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Librarian getLibrarian() {
        return librarian;
    }
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    public Item[] getLibraryItems() {
        return libraryItems;
    }
    public void setLibraryItems(Item[] libraryItems) {
        this.libraryItems = libraryItems;
    }
    public Room[] getRooms() {
        return rooms;
    }
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

}
