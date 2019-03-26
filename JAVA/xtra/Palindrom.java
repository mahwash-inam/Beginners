class Palindrom
{
public static void palin(String s)
{
StringBuilder sb=new StringBuilder(s);
sb.reverse();
String rev=sb.toString();
if(s.equals(rev))
{
	System.out.println("IS PALINDROM");
}
else{
	System.out.println("IS NOT PALINDROM");
}
}
public static void main(String args[])
{
String str="abacs";
palin(str);
}
}