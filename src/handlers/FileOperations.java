package handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;

public class FileOperations {
	private static JFileChooser fileChooser= new JFileChooser();
	
	public static boolean selectAndWriteFile(int key) {
		fileChooser.showOpenDialog(null);
		File file=fileChooser.getSelectedFile();
		
		try {
			FileInputStream fis =new FileInputStream(file);
			byte[] data=new byte[fis.available()];
			fis.read(data);
			fis.close();
			data = EncryptFile.Encrypt(data, key);
			
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(data);
			fos.close();
			
		}catch(Exception e){
			e.printStackTrace();
			//System.out.print(false);
			return false;
		}
		return true;
	}
}
