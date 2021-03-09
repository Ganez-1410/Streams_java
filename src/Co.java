import java.util.Scanner;

public class Co {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
   long a[]=new long[n];
   long b[]=new long[n];
   for(int i=0;i<n;i++)
	   a[i]=sc.nextLong();
   for(int i=0;i<n;i++)
	   b[i]=sc.nextLong();
    long max=Integer.MAX_VALUE;
	for(int i=0;i<b.length;i++) {
		if(b[i]==1) {
			for(int j=0;j<b.length;j++) {
				if(b[j]==2) {
				   if(max>(a[i]+a[j]))
					  max=a[i]+a[j];
				}
			}
		}
		else if(b[i]==3) {
			if(max>a[i])
				max=a[i];
		}
	}
	System.out.println(max);
	}
}
