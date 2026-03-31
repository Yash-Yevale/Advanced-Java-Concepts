//Appending to a text file using random access (PROGRAM 16.9)
import java.io.*;
class RandomAccess
{
static public void main (String args[])
{
RandomAccessFile rFile;
try
{
rFile = new RandomAccessFile ("city.txt", "rw");
rFile.seek (rFile.length ()) ; //Go to the end
rFile.writeBytes ("MUMBAI/n") ; //Append MUMBAI
rFile.close ();
}
catch (IOException ioe)
{
System.out.println (ioe) ;
}
}
}