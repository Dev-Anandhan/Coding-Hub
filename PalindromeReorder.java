import java.util.*;
public class PalindromeReorder{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  int[] c=new int[26];
  for(char ch:s.toCharArray())c[ch-'A']++;
  int odd=0,mid=-1;
  for(int i=0;i<26;i++) if(c[i]%2==1){odd++;mid=i;}
  if(odd>1){System.out.println("NO SOLUTION");return;}
  StringBuilder l=new StringBuilder(),r=new StringBuilder();
  for(int i=0;i<26;i++){
   for(int k=0;k<c[i]/2;k++){l.append((char)('A'+i));r.append((char)('A'+i));}
  }
  String m=mid==-1?"":String.valueOf((char)('A'+mid)).repeat(c[mid]%2==1?1:0);
  System.out.println(l.toString()+m+r.reverse().toString());
 }
}