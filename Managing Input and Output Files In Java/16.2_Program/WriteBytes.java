// Writing bytes to a file (PROGRAM 16.2)
import java.io.*;
class WriteBytes
{
	public static void main (String args [] )
	{
		//Declare and initialize a byte array
		byte cities[ ] = {'D', 'E', 'L', 'H', 'I', '\n' , 'M', 'A', 'D', 'R', 'A', 'S', '\n' , 'L', 'O', 'N','D', 'O', 'N',  '\n' , 'P' , 'U' , 'N' , 'E', '\n' };
		//create an output file stream
		FileOutputStream outfile = null;
		
		try
		{
			outfile = new FileOutputStream("city.txt");
			outfile.write (cities);
			outfile.close();
		}
		
		catch (IOException ioe)
		{
			System.out.println (ioe);
			System.exit (-1);
		}
	}
}

// To get output :-
//step 1:- javac WriteBytes.java
//step 2:- java WriteBytes
//step 3:- city.txt
// first create city.txt file in your java folder 