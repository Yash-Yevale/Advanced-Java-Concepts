//In this program we will be reading bytes from a file (PROGRAM 16.3)
import java.io.*;
class ReadBytes
{
public static void main(String args[])
{
//Create an input file stream
FileInputStream infile = null;
int b;
try
{
//Connect infile stream to the required file
infile = new FileInputStream (args [ 0 ] );
//Read and display data
while ( (b = infile.read () ) != -1)
{
System.out.print( (char) b);
}
infile.close ();
}
catch (IOException ioe)
{
System.out.println (ioe);
}
}
}
// Output : To get the output make city.txt file in program local folder and then after compiling type (java ReadBytes city.txt) to get your output.