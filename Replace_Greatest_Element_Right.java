import java.util.*;
public class Replace_Greatest_Element_Right
 {

	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter size: ");
	int n = s.nextInt();
	int ele[] = new int[n]; 
	System.out.println("Ente elements :");
	for(int i = 0; i<n; i++)
	{
		ele[i] = s.nextInt();
	}
	
	for(int i = 0; i< (n-1); i++)
	{
		int max = 0;
		for(int j = 1; j<n; j++)
		{
			if(ele[j] > max )
				max = ele[j];
		}
		ele[i] = max;
	}
	ele[n-1]  = -1;
	for(int i =0; i<n; i++)
	{
		System.out.print(ele[i] +" ");
	}

   s.close();
}
}