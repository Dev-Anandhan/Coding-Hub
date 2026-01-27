import java.util.*;
public class AppleDivision{
 static long best=Long.MAX_VALUE,sum=0;
 static int n;
 static long[]a;
 static void dfs(int i,long cur){
  if(i==n){best=Math.min(best,Math.abs(sum-2*cur));return;}
  dfs(i+1,cur+a[i]);
  dfs(i+1,cur);
 }
 public static void main(String[]a0){
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt(); a=new long[n];
  for(int i=0;i<n;i++){a[i]=sc.nextLong();sum+=a[i];}
  dfs(0,0);
  System.out.println(best);
 }
}