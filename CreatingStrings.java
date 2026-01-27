import java.util.*;
public class CreatingStrings{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  char[] s=sc.next().toCharArray();
  Arrays.sort(s);
  List<String> res=new ArrayList<>();
  do{res.add(new String(s));}while(next(s));
  System.out.println(res.size());
  for(String x:res)System.out.println(x);
 }
 static boolean next(char[]a){
  int i=a.length-2;
  while(i>=0&&a[i]>=a[i+1])i--;
  if(i<0)return false;
  int j=a.length-1;
  while(a[j]<=a[i])j--;
  char t=a[i];a[i]=a[j];a[j]=t;
  for(int l=i+1,r=a.length-1;l<r;l++,r--){
   t=a[l];a[l]=a[r];a[r]=t;
  }
  return true;
 }
}