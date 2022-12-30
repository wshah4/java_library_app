public class Disc extends Item {
   // The disc media has the
   // additional attributes of type (CD, DVD, BLURAY) and duration.

    String type;
    String duration;
    
    public Disc(String isbn, String title, int numberOfCopies, int availableCopies, String[] checkoutHoldersId,
            String[] dueDate, String type, String duration) {
        super(isbn, title, numberOfCopies, availableCopies, checkoutHoldersId, dueDate);
        this.type = type;
        this.duration = duration;
    }

    public Disc(String type, String duration) {
        this.type = type;
        this.duration = duration;
    }

       
    public Disc(Item item){
        this.isbn = item.getIsbn();
        this.title = item.getTitle();
        this.numberOfCopies = item.getNumberOfCopies();
        this.availableCopies = item.getAvailableCopies();
        this.checkoutHoldersId = item.getCheckoutHoldersId();
        this.dueDate = item.getDueDate();
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toString(){
        String str = "ISBN: " + this.isbn + "\n" + 
           "Title: " + this.title + "\n" + 
           "Number Of Copies: " + this.numberOfCopies + "\n" +
           "Available Copies: " + this.availableCopies + "\n" +
           "Type: " + this.type + "\n" +
           "Duration: " + this.duration
           ;
        return str;
     }

}
