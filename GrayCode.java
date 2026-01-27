import java.util.*;
public class GrayCode{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int N=1<<n;
  for(int i=0;i<N;i++){
   int g=i^(i>>1);
   String s=Integer.toBinaryString(g);
   while(s.length()<n)s="0"+s;
   System.out.println(s);
  }
 }
}