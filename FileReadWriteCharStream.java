import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileReadWriteCharStream 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileReader fr=new FileReader("C:/Core Java/source.txt");
		FileWriter fw=new FileWriter("C:/Core Java/destination.txt");
		int info;
		while((info=fr.read())!=-1){
			System.out.print((char)info);
			fw.write(info);
		}
		
		fr.close();
		fw.close();
	}
}
