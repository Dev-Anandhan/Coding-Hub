import java.util.*;
public class TrailingZeros{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  long n=sc.nextLong(),ans=0;
  for(long p=5;p<=n;p*=5) ans+=n/p;
  System.out.println(ans);
 }
}