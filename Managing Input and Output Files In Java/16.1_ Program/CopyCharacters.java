// Copying characters from one file into another (PROGRAM 16.1)
import java.io.*;
class CopyCharacters
{ public static void main (String args [])
{
File inFile = new File ("input.txt");
File outFile = new File("output.txt");
FileReader ins = null;            // Creates filestream ins
FileWriter outs = null;           //Creates filestream outs
try
{
ins = new FileReader (inFile);   // Opens inFile
outs = new FileWriter (outFile);   //Opens outFile
// REad and write till the end
int ch;
while ((ch = ins.read( )) != - 1)
{
outs.write (ch) ;
}
}
catch (IOException e)
{
System.out.println (e) ;
System.exit (- 1) ;
}
finally  //close files
{
try
{
ins.close ( );
outs.close ( );
}
catch (IOException e) { }
}
}
}
