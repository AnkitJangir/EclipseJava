package linearSearch;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int k=1,loc=0,item;
		int a[]=new int[n];
		System.out.println("Enter the values of the array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the item to be searched");
		item=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(loc==0&&k<=n)
			{
				if(item==a[i])
				{
					loc=k;
				}
				k=k++;
			}
		}
		if(loc==0)
		{
			System.out.println("Item not found");
		}
		else
		{
			System.out.println("item found "+item +"and location is"+loc);
		}
	}
}