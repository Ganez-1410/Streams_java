import java.util.Scanner;
public class Alien {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n*2];
	for(int i=0;i<n*2;i++)
		a[i]=sc.nextInt();
	int t=sc.nextInt();
	int[] ans=new int[t];
	int l=0;
	while(t-->0) {
		int count=0,flag=0;
		int m=sc.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		String s="";
		int x;
		for(int j=0;j<m;j++) {
			for(int k=0;k<(n*2)-1;k+=2) {
				/*if(k>0) {
					if(b[j]>=a[k]&&b[j]<=a[k+1]) {
						for(x=0;x<s.length();x++) {
							if(Integer.valueOf(String.valueOf(s.charAt(x)))==k)
								break;
						}
					if(x==s.length())
						count++;
					s+=k;
					}
					
				}
				else*/ if(b[j]>=a[k]&&b[j]<=a[k+1]) {
					//s+=k;
					count++;
					a[k]=0;
					a[k+1]=0;
				}
			}
		}
		ans[l++]=count;
	}
	for(int i=0;i<l;i++)
		System.out.println(ans[i]);
}
}
