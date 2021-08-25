import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.*;
import java.util.*;

import javax.naming.Context;


public class FileOperations {

	 
	Scanner cin=new Scanner(System.in);
	ArrayList a1=new ArrayList();
	
	public  void displayAscending()
	{                      
		                
			  			  Collections.sort(a1);
			  			  
			  			 if(a1.isEmpty())
		                 {
		                	System.out.println("please add some files first through more operations"); 
		                	 
		                 }
			  			 else
			  			 {
			  				System.out.println(a1); 
			  			    	 
			  			 }
			  			
			  
		
	}
	
	public  void moreOptions()
	{
		int n;
		do
		{  
			
			System.out.println("1. create new file");
			System.out.println("2. delete a file");
			System.out.println("3. search file");
			System.out.println("4. exit from more operations");
			System.out.println();
			System.out.println("enter your choice");
			n=cin.nextInt();
			
			if(n==1)
			{
				createNewFile();
				
			}
			if(n==2)
			{
				deleteFile(); 
			}
			if(n==3)
			{
				
				searchFile();
			}
		}while(n!=4);
		
		
	}
	
	String s;
	public  void createNewFile()
	{
		System.out.println("enter the name of a file");
		cin.nextLine();
	      s=cin.nextLine();
		try {
			FileOutputStream fos=new FileOutputStream("A:\\FileIO\\"+s);
			
			DataOutputStream dos=new DataOutputStream(fos);
			System.out.println("enter your data in file");
			
			String data=cin.nextLine();
			cin.nextLine();
			
			dos.writeChars(data);
			a1.add(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  void deleteFile()
	{
		
		System.out.println("enter the name of file that you want to delete");
		cin.nextLine();
		String fileName=cin.nextLine();

		Path path = FileSystems.getDefault().getPath("A://FileIO//"+fileName);
        try {
            Files.delete(path);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
        } catch (IOException x) {
            System.err.println(x);
        
		}  
    }
		
	
	public  void searchFile()
	{
		boolean found=false;
		System.out.println("enter the name of file you want to search");
		cin.nextLine();
		String str=cin.nextLine();
		cin.nextLine();
		
		
		for(int i=0;i<a1.size();i++)
		{
		//	System.out.println(a1.get(i));
			if(a1.get(i).equals(str))
			{
				found=true;
				System.out.println(a1.get(i));
				try {
					FileInputStream fis=new FileInputStream("A:\\FileIO\\"+str);
					DataInputStream dis=new DataInputStream(fis);
					System.out.println(dis.readLine());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			
		}
		
		if(found==false)
		{
			
			System.out.println("file not found");
		}
		
		
		
		
	}
	
	
}
