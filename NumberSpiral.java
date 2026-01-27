import java.util.*;
public class NumberSpiral{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t-->0){
   long y=sc.nextLong(),x=sc.nextLong();
   long z=Math.max(x,y),z2=(z-1)*(z-1);
   if(z%2==0){
    System.out.println(y==z?z2+x:z2+2*z-y);
   }else{
    System.out.println(x==z?z2+y:z2+2*z-x);
   }
  }
 }
}