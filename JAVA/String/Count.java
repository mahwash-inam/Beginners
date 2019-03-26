public class Count{

static int wordCount(String s) 
{
	int count=1;
for( int i=0; i<s.length()-1; i++)
{
	
		 if((s.charAt(i)!=' ') && (s.charAt(i+1)==' '))
	count++;
}
return count;
}
public static void main(String args[])
{
String s="India is my country";
System.out.println(wordCount(s));
}
}