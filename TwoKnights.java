import java.util.*;
public class TwoKnights{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(long k=1;k<=n;k++){
   long total=k*k*(k*k-1)/2;
   long attack=4*(k-1)*(k-2);
   System.out.println(total-attack);
  }
 }
}