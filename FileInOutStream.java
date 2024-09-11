import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileInOutStream 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis=new FileInputStream("C:/Core Java/source.txt");
		FileOutputStream fos=new FileOutputStream("C:/Core Java/destination.txt");
		int info;
		while((info=fis.read())!=-1){
			System.out.print((char)info);
			fos.write(info);
		}
		
		fis.close();
		fos.close();
	}
}
