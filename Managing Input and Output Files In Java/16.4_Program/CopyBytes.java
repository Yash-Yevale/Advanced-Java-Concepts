//In this program we are going to copy bytes from one to another (PROGRAM 16.4)
import java.io.*;
class CopyBytes
{
public static void main(String args[])
{
//Declare input and output file streams
FileInputStream infile = null ;    // Input stream
FileOutputStream outfile = null ;  // Output stream
//Declare a variable to hold a byte
byte byteRead;
try
{
//Connect infile to in.dat
infile = new FileInputStream ("in.dat");
//Connect outfile to out.dat
outfile = new FileOutputStream ("out.dat");
//Reading bytes from in.dat and writing to out.dat
do
{
byteRead = (byte) infile.read ();
outfile.write (byteRead);
}
while (byteRead != -1);
}
catch (FileNotFoundException e)
{
System.out.println ("File not found");
}
catch (IOException e)
{
System.out.println(e.getMessage ());
}
finally //Close files 
{
try
{
infile.close ();
outfile.close ();
}
catch (IOException e) {}
}
}
}

// Output : To get the output create in.dat(txt) file in program local folder and then after compiling the command through command line type out.dat to get your output.
