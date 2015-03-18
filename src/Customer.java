import java.util.*;

/**
@author Ethan Miller
Defines the Customer object for use in the La Food program.
*/

public class Customer
{
	int arrivalTime;
	int groupNumber;
	int bribe;
	String name;

	/** Default basic constructor  */
	public Customer()
	{
		arrivalTime = 0;
		groupNumber = 0;
		bribe = 0;
		name = "";
	}
  
	/**
	@param a arrival time of customer
	@param g number of people in group
	@param b bribe total from customer
	@param n name of customer
	*/
	public Customer(int a, int g, int b, String n)
	{
		arrivalTime = a;
		groupNumber = g;
		bribe = b;
		name = n;
	}
  
	/** @param s Scanner (connected to a text file) */
	public Customer(Scanner s)
	{
		arrivalTime = s.nextInt();
		groupNumber = s.nextInt();
		bribe = s.nextInt();
		name = s.next();
	}

	/** @return the arrival time of the customer */
	public int getArrivalTime()
		{ return arrivalTime; }
	/** @return the number of people in the group */
	public int getGroupNumber()
		{ return groupNumber; }
	/** @return the bribe presented by the customer */
	public int getBribe()
		{ return bribe; }
	/** @return the name of the customer */
	public String getName()
		{ return name; }
	
	public String toString()
	{
		if (groupNumber > 1)
		{
			return ("party " + name + " of " + groupNumber + " people. (time=" + arrivalTime + ")");
		}
		else
		{
			return ("party " + name + " of " + groupNumber + " person. (time=" + arrivalTime + ")");
		}
	}

}
