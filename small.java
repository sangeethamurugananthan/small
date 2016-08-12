import java.util.*;
class small
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String h=String.valueOf(a);
StringBuffer sb=new StringBuffer();
int c[]=new int[h.length()];
int i=0;
while(a!=0)
{
c[i]=a%10;
i++;
a=a/10;
}
Arrays.sort(c);
for(int k=0;k<c.length;k++)
{
sb.append(String.valueOf(c[k]));
}
int e=h.length();
int aa=e-b;
String hh=sb.substring(0,aa);
System.out.println(hh);
}
}
