package practice;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args)  throws IOException {

		File path =new File ("D:\\RidzyJava\\ProgramToCreateFile\\abc.doc");
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("radha"); //unicode transformation formats

	}

}
