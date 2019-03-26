import java.io.*;
class MyByteWriter
{
public static void main(String...args)throws IOException
{
	ByteArrayOutputStream fw= new ByteArrayOutputStream();
	String s="India is my country";
	byte b[]=s.getBytes();
	for(int i=0; i<b.length; i++)
		fw.write(b[i]);
	fw.writeTo(new FileOutputStream("r1.txt"));
	fw.writeTo(new FileOutputStream("r2.txt"));
	System.out.println(fw.toString());
	
	byte z[]= fw.toByteArray();
	ByteArrayInputStream fr= new ByteArrayInputStream(z);
	int i=0;
	while((i=fr.read())!=-1)
	{
	 System.out.print((char)i);
	}
}
}	