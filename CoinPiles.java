import java.util.*;
public class CoinPiles{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t-->0){
   long a1=sc.nextLong(),b1=sc.nextLong();
   long x=Math.max(a1,b1),y=Math.min(a1,b1);
   System.out.println((x<=2*y && (a1+b1)%3==0)?"YES":"NO");
  }
 }
}