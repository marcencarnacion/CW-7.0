//Marc Encarnacion
//2/12/21
//7.0 CW

//---------------------------------------------------
//  Words2.java     Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of the super reference
//---------------------------------------------------
class Main 
{
  public static void main(String[] args) 
  {
    //---------------------------------------
    //  Instantiates a derived class and invokes its 
    //  inherited and local methods
    //---------------------------------------
    System.out.println("Marc Encarnacion, 7.0 CW");
    Dictionary2 webster = new Dictionary2 (1500, 52500);
    webster.pageMessage();
    webster.definitionMessage();
  }//end main method
}//end main class