import java.io.FileOutputStream;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		FileOperations fo=new FileOperations();
				//System.out.println(fo);;
		//System.out.println("enter your choice");
		//int n=cin.nextInt();
        int choice;
		  do
		  {
			  
				System.out.println("enter your choice");
				System.out.println();
				System.out.println("1. display all the files in ascending order");
				System.out.println("2. Some more operations:");
				System.out.println("3. close the application");
			 choice=cin.nextInt();
			 
			 if(choice==1)
			 {
				 fo.displayAscending();
				 
			 }
			 
			 if(choice==2)
			 {
				fo.moreOptions();
				 
			 }
			 
			  
			  
		  }while(choice!=3);
		  
	}
	
	

}
