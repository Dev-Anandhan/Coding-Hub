import java.util.*;
public class TowerOfHanoi{
 static StringBuilder sb=new StringBuilder();
 static void solve(int n,int a,int b,int c){
  if(n==0)return;
  solve(n-1,a,c,b);
  sb.append(a+" "+c+"\n");
  solve(n-1,b,a,c);
 }
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long moves=(1L<<n)-1;
  System.out.println(moves);
  solve(n,1,2,3);
  System.out.print(sb.toString());
 }
}