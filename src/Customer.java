import java.util.*;

/**
@author Harrison Lingren
Defines the Customer object for use in the La Food program.
*/

public class Customer
{
  String partyName;
  String color;
  String species;
  int fins;
  
  public static int count=0;

  /** Default basic constructor  */
  public Customer()
  {
    name=""; color=""; species="";
	  fins=0;
	  count++;
  }
  
  /**
    @param n name of the fish
    @param c color of the fish
    @param s species of the fish
    @param f number of fins, if applicable
  */
  
  public Customer(String n,String c,String s, int f)
  {
    name=n; color=c; species=s; fins=f;
	  count++;
  }
  
  /** @param s Scanner (connected to a text file)
      to read in to initialize the customer */
      
  public Fish(Scanner s)
  {
    name=s.next();
	  color=s.next();
	  species=s.next();
	  fins=s.nextInt();
  }

  /**
    @return the name of the customer
  */
  public String getName()
    { return name; }
  public String getColor()
    { return color; }
  public String getSpecies()
    { return species; }
  public int getFins()
    { return fins; }
	
  public String toString()
  {
    return name+" color="+color+" species="+species+" #fins="+fins;
  }

}