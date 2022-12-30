public class Item {
    /*
        Each library item should
        have an ISBN, title, total number of copies, available copies, checkout holder’s GMU ID, and due
        date (MMDDYYYY).
     */

    String isbn;
    String title;
    int numberOfCopies;
    int availableCopies;
    String[] checkoutHoldersId;
    String[] dueDate;
    
    public Item(String isbn, String title, int numberOfCopies, int availableCopies, String[] checkoutHoldersId,
            String[] dueDate) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
        this.availableCopies = availableCopies;
        this.checkoutHoldersId = checkoutHoldersId;
        this.dueDate = dueDate;
    }

    public Item() {
    }
    
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
    public String[] getCheckoutHoldersId() {
        return checkoutHoldersId;
    }
    public void setCheckoutHoldersId(String[] checkoutHoldersId) {
        this.checkoutHoldersId = checkoutHoldersId;
    }
    public String[] getDueDate() {
        return dueDate;
    }
    public void setDueDate(String[] dueDate) {
        this.dueDate = dueDate;
    }



}
