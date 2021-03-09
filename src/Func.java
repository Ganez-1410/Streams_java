@FunctionalInterface
interface Odd {
   boolean isOdd(int number);
}
@FunctionalInterface
interface Prime {
            boolean isPrime(int number);
}
@FunctionalInterface
interface Palindrome {
            boolean isPalindrome(int number);
 }
public class Func {
	public static void main(String[] args) {
		Odd o=n->n%2==1;
		Prime p=n->{
			int sum=0;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
					sum+=i;
			}
			if(sum==n)
				return true;
			else
				return false;
		};
		Palindrome pl=n->{
			if(new StringBuffer(String.valueOf(n)).reverse().toString().equals(String.valueOf(n).toString()))
				return true;
			else
				return false;
		};
		System.out.println("Is 4 odd "+o.isOdd(4));
		System.out.println("Is 6 prime "+p.isPrime(6));
		System.out.println("Is 121 palindrome "+pl.isPalindrome(121));
	}

}
