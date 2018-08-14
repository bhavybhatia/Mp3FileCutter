package mp3Cutter;
import java.io.*;
import java.util.*;
public class Mp3Process {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter location of file : ");
		String loc=sc.nextLine();
		File f=new File(loc);
		System.out.println("Enter location where to save file : ");
		String save=sc.nextLine();
		File f1=new File(save);
		System.out.println("Enter location where to save another half file : ");
		String save1=sc.nextLine();
		File f2=new File(save1);
		try
		{
			FileInputStream fis= new FileInputStream(f);
			FileOutputStream fos =new FileOutputStream(f1);
			FileOutputStream fos1 =new FileOutputStream(f2);
			int len=(int)f.length();
			int ctr = 0;
			while (ctr <= len)
			{
				if(ctr<=(len/2))
				{
					fos.write(fis.read());
				}
				else
				{
					fos1.write(fis.read());
				}
				ctr++;
			}
			
			
			System.out.println("Successfully cut...");
		}
		catch(Exception e){System.out.println(e);}
	}
}
