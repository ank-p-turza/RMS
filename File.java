
import java.io.*;
import java.util.*;

public class File
{
	public static void main (String [] args)
	
	{
		Scanner sc = new Scanner(System.in);
            
		
		/*File file = new File("Data.txt");
		File f = new File("C:\\Users\\HP\\Documents\\Project x");
		
	try
		{
			file.createNewFile();
			//Formatter formatter = new Formatter(C:/Users/HP/Documents/Data.txt);
			
		}
                
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}*/

		
	try{
		FileOutputStream fos = new FileOutputStream("demo.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		dos.writeUTF("My Tv,hmm,Ankan,001,Barua,002,Shrabon vai,003,Whoever,Whatever");
		
		
		
		
		
		
		
		
	
		FileInputStream fis = new FileInputStream("demo.txt");
		DataInputStream dis = new DataInputStream (fis);
		String s = dis.readUTF();
		String substrings[] = s.split(",");
		
		System.out.println (Arrays.toString(substrings));
		
		
		System.out.println ("Enter Username");
	String name = sc.nextLine();
	System.out.println ("Enter Password");
	String pass = sc.next();
	if ( substrings[0].equals(name) && substrings[1].equals (pass))
	{
		System.out.println ("Welcome Manager.....");
	}
	else if (substrings[2].equals(name) && substrings[3].equals(pass) || substrings[4].equals(name) && substrings[5].equals(pass) || substrings[6].equals(name) && substrings[7].equals(pass) || substrings[8].equals(name) && substrings[9].equals(pass) )
	{
		System.out.println ("Welcome");
	}
	
	else
	{
		System.out.println ("Access Denied...Try Again");
	}
		
		
	}
	catch(Exception e)
	{
		System.out.println (e);
	}
	/*System.out.println ("Enter Username");
	String name = sc.next();
	System.out.println ("Enter Password");
	String pass = sc.next();
	if ( name == s)
	{
		System.out.println ("Welcome");
	}
	else if (pass == s)
	{
		System.out.println ("Welcome");
	}
	else
	{
		System.out.println ("Access Denied...Try Again");
	}*/
	
		
	
	}
	}
	
	
	
	
	
	

 




    
			
		