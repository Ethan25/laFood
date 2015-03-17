import java.util.*;

/**
@author Harrison Lingren
Defines the Customer object for use in the La Food program.
*/

public class Fish implements Comparable
{
  // fields
  String name;
  String color;
  String species;
  int fins;
  
  public static int count=0;
  
  public int compareTo(Object x)
  {
    if(x instanceof Fish)
	{
	  Fish xfish=(Fish) x;
	  return this.name.compareTo(xfish.name);
	  /*
	  if(this.fins < xfish.fins)
	    return -1;
	  if(this.fins==xfish.fins)
	    return 0;
	  return 1;
	  */
	}
	else
	  System.out.println("Error not a fish!");
    return 0; 
 }
  
  // constructor
  /**
  Default basic constructor
  */
  public Fish()
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
  public Fish(String n,String c,String s,
    int f)
  {
    name=n; color=c; species=s; fins=f;
	count++;
  }
  /**
  @param s Scanner (connected to a text file)
    to read in to initialize the fish
  */
  public Fish(Scanner s)
  {
    name=s.next();
	color=s.next();
	species=s.next();
	fins=s.nextInt();
  }
  
  // accessors
  /**
  @return the name of the fish
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
    return name+" color="+color+
	  " species="+species+" #fins="+fins;
  }
  
  // mutator or transformer or setter
  public void sharkattack()
  {
    if(fins>0) fins--;
  }
	

}
