public class Book extends Item {
    /* 
     * A library book has the
        additional attributes author, edition, and publishing year (YYYY).
     */

   String author;
   String edition;
   String publishingYear;

   public Book() {
   }
   
   public Book(Item item){
      this.isbn = item.getIsbn();
      this.title = item.getTitle();
      this.numberOfCopies = item.getNumberOfCopies();
      this.availableCopies = item.getAvailableCopies();
      this.checkoutHoldersId = item.getCheckoutHoldersId();
      this.dueDate = item.getDueDate();
   }

   public String getAuthor() {
      return author;
   }
   public void setAuthor(String author) {
      this.author = author;
   }
   public String getEdition() {
      return edition;
   }
   public void setEdition(String edition) {
      this.edition = edition;
   }
   public String getPublishingYear() {
      return publishingYear;
   }
   public void setPublishingYear(String publishingYear) {
      this.publishingYear = publishingYear;
   }

   public String toString(){
      String str = "ISBN: " + this.isbn + "\n" + 
         "Title: " + this.title + "\n" + 
         "Number Of Copies: " + this.numberOfCopies + "\n" +
         "Available Copies: " + this.availableCopies + "\n" +
         "Author: " + this.author + "\n" +
         "Edition: " + this.edition + "\n" + 
         "Publish Year: " + this.publishingYear + "\n"
         ;
      String idAndDates = "Checkout Holders and Due Dates: \n";
      for(int i = 0; i < this.checkoutHoldersId.length && this.checkoutHoldersId[i] != null; i++){
         idAndDates = idAndDates + "- ID: " + this.checkoutHoldersId[i] + ", Due : " + this.dueDate[i] + "\n";
      }
      if(this.checkoutHoldersId[0] != null){
         str = str + idAndDates;
      }
      return str;
   }

}
