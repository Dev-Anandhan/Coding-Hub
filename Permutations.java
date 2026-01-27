import java.util.*;
public class Permutations{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n==1){System.out.println(1);return;}
  if(n<4){System.out.println("NO SOLUTION");return;}
  StringBuilder sb=new StringBuilder();
  for(int i=2;i<=n;i+=2) sb.append(i).append(' ');
  for(int i=1;i<=n;i+=2) sb.append(i).append(' ');
  System.out.println(sb.toString().trim());
 }
}