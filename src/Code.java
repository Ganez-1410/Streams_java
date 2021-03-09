import java.math.BigInteger;
import java.util.Scanner;

public class Code {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int n=5;

//	int n=sc.nextInt();
	BigInteger[] a=new BigInteger[n];
	BigInteger[] b=new BigInteger[n];
	a[0]=BigInteger.valueOf(1);
	a[1]=BigInteger.valueOf(3);
	a[2]=BigInteger.valueOf(4);
	a[3]=BigInteger.valueOf(6);
	a[4]=BigInteger.valueOf(8);
	b[0]=BigInteger.valueOf(1);
	b[1]=BigInteger.valueOf(2);
	b[2]=BigInteger.valueOf(1);
	b[3]=BigInteger.valueOf(2);
	b[4]=BigInteger.valueOf(3);
	//	for(int i=0;i<b.length;i++)
//	    a[i]=sc.nextBigInteger();
//	for(int i=0;i<b.length;i++)
//		b[i]=sc.nextBigInteger();
	 //BigInteger max=new BigInteger("1000000000000000");
	BigInteger max=BigInteger.valueOf(Integer.MAX_VALUE);
		for(int i=0;i<b.length;i++) {
			if(b[i].equals("1")) {
				for(int j=0;j<b.length;j++) {
					if(b[j].equals("2")) {
					   if(max.compareTo((a[i].add(a[j])))==1)
						  max=a[i].add(a[j]);
					}
				}
			}
			else if(b[i].equals("3")) {
				if(max.compareTo(a[i])==1)
					max=a[i];
			}
		}
		System.out.println(max);
		}
}
