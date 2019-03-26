class Reverse
{

public static void main(String args[])
{
  String str="Hello";
 StringBuilder s= new StringBuilder(str);
  s.reverse();
String rev=s.toString();
System.out.println(rev);
}
}