import java.util.*;
class vowel
{
public static void main(String args[])
{
String s;
System.out.println("enter alphabet");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char ch=s.charAt(0);

switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("vowel");
break;
default:
System.out.println("consonant");
break;
}
}
}