import java.util.*;
public class TwoSets{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long sum=(long)n*(n+1)/2;
  if(sum%2==1){System.out.println("NO");return;}
  System.out.println("YES");
  boolean[] take=new boolean[n+1];
  long need=sum/2;
  for(int i=n;i>=1;i--){
   if(need>=i){take[i]=true;need-=i;}
  }
  List<Integer>A=new ArrayList<>(),B=new ArrayList<>();
  for(int i=1;i<=n;i++) if(take[i])A.add(i); else B.add(i);
  System.out.println(A.size());
  for(int x:A)System.out.print(x+" ");
  System.out.println();
  System.out.println(B.size());
  for(int x:B)System.out.print(x+" ");
 }
}