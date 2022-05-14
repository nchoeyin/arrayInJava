import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		float[] arr= new float[size];
		while(true)
		{
		System.out.println("1.Insertion \n2.Display \n3.Average \n4.exit \nEnter your choice: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: {
		            System.out.println("Enter your marks");
		            for(int i=0;i<size;i++){
		            arr[i]=sc.nextFloat();
		            }
		            break;
		         }
		 case 2: {
		           for(int i=0;i<size;i++)
		             {
		               System.out.println(arr[i]+"--->"+String.valueOf(i));
		              }
		              break;
		          }
		case 3: {
		          float sum=0, avg = 0;
		          for(int i=0;i<size;i++)
		           {
		             sum = sum+arr[i];
		           }
		           avg = sum/size;
		           System.out.println("The average is : "+ String.valueOf(avg));
		           break;
		         }
        case 4: {
		          return;
		        }
		}
	    }//while loop   
    }//main
}//Main
	

