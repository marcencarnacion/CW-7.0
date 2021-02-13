//---------------------------------------
//  Dictionary2.java  Author: Lewis/Losftus/Cocking
//
//  Represents a dictionary, which is a book. Used to
//  demonstrate the use of the super reference.
//---------------------------------------
public class Dictionary2 extends Book2
{
  private int definitions;
  //---------------------------------------
  //  Sets up the dictionary with the specified number of 
  //  pages (maintained by the Book parent class) and 
  //  defintions
  //---------------------------------------
  public Dictionary2 (int numPages, int numDefinitions)
  {
    super (numPages);
    definitions = numDefinitions;
  }//end Dictionary2
  //---------------------------------------
  //  Prints a message using both local and inherited values
  //---------------------------------------
  public void definitionMessage()
  {
    System.out.println("Number of definitions: " + definitions);
    System.out.println("Defintions per page: " + definitions/pages);
  }//end definitionMessage
}//end class Dictionary2