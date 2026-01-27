import java.util.*;
public class BitStrings{
 static final long MOD=1000000007L;
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  long n=sc.nextLong(),res=1,base=2;
  while(n>0){
   if((n&1)==1) res=res*base%MOD;
   base=base*base%MOD;
   n>>=1;
  }
  System.out.println(res);
 }
}