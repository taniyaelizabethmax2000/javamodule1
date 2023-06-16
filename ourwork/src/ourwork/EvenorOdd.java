
package ourwork;

public class EvenorOdd {
	int a[]= {1,2,3,4,5,6,7,8,9,7,5,6,7,8,45,76,89};
//	int b[]=new int[10];
//	int c[] = new int[10];
	int j=0;
	int k=0;
	int count=0;
	int count1=0;
	public  void evenorodd() {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			
//				b[j]=a[i];
//				j++;
			count++;
				
				
			}
			else
			{
				
//				c[k]=a[i];
//				k++;
				count1++;
			}
		}
		int b[]=new int[count];
		int c[]=new int[count1]; 
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				b[j]=a[i];
				j++;
			}
			else
			{
				
				
					c[k]=a[i];
					k++;
				}
			}
			
		System.out.println("even elements:");
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		System.out.println("odd elements:");
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}
		int countfinal=count+count1;
		int d[]=new int[countfinal];
		int i=0;
		j=0;
		k=0;
		System.out.println("final array");
		for(int m=0;m<countfinal;m++) {
			
			while(j<count) {
			d[m]=b[j];
			j++;
			System.out.print(d[m]);
		}
			while(k<count1) {
				d[m]=c[k];
				k++;
				System.out.print(d[m]);
			}
		}
		
		}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenorOdd obj = new EvenorOdd();
		obj.evenorodd();
		

	}

}
