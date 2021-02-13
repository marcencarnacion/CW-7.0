//---------------------------------------------------
//  Book2.java
//
//  Represents a book. Used as the parent of a derived    //  class to demonstrate inheritance and the use of the
//  super reference
//---------------------------------------------------
public class Book2
{
  public int pages;
  //---------------------------------------
  //  Sets up the book with the specified number of pages 
  //---------------------------------------
  public Book2 (int numPages)
  {
    pages = numPages;
  }//end Book2
  //---------------------------------------
  //  Prints a message about the pages of this book
  //---------------------------------------
  public void pageMessage()
  {
    System.out.println("Number of pages: " + pages);
  }//end pageMessage
}//end class Book2