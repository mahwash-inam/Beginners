import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles1
{
public static void main(String[] s)
{
try
{	
	FileOutputStream fos = new FileOutputStream("test1.zip");
	ZipOutputStream zos = new ZipOutputStream(fos);
	String file1Name ="abc.txt";
	String file2Name ="ab.txt";
	addToZipFile(file1Name,zos);
	addToZipFile(file2Name,zos);
	zos.close();
	fos.close();
}
catch(FileNotFoundException e)
{
		e.printStackTrace();
	}
catch(IOException e)
{
		e.printStackTrace();
	}
}

public static void	addToZipFile(String fileName,ZipOutputStream zos)throws FileNotFoundException, IOException
{
	System.out.println("Writing"+ fileName+"to zip File");
	FileInputStream fis = new FileInputStream(fileName);
	//FileInputStream fis = new FileInputStream(file);
	ZipEntry zipEntry = new ZipEntry(fileName);
	zos.putNextEntry(zipEntry);
	byte[] bytes = new byte[fis.available()];
	fis.read(bytes);
	zos.write(bytes);
	zos.closeEntry();
	fis.close();
	}

}	