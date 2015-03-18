import java.io.*;
import java.util.*;

public class LaFood
{
  
	Queue waitList = new QueueLL();
	int[] Tables = new int[10];
	int time;

	public void main(String [] args) throws IOException
	{
		System.out.println("*** Welcome to the La Food Restaurant Simulator ***");
		readFile();
		
		while (!QueueLL.isEmpty())
		{
			for (int i = 0; i < Tables.length; i++)
			{
				while (time < Tables[i])
				{
					System.out.println("Please wait at the bar,\n" + QueueLL.getFront());
					time += QueueLL.getFront.arrivalTime;
				}
				time = 0;
			}
		}
	}
	
	public void readFile() throws IOException
	{
		Scanner fileInput = new Scanner(new FileReader("customers.txt"));
		int not = 0;
		boolean eof = false;
		while(!eof)
		{
			String action;
			action = fileInput.next();
			if (action == "A")
			{
				waitList.enqueue(new Customer(fileInput));
			}
			else if (action == "T")
			{
				Tables[not] = fileInput.nextInt();
				not++;
			}
			else
			{
				eof = true;
			}
		}
	}
}
