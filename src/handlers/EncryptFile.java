package handlers;

public class EncryptFile {
	public static byte[] Encrypt(byte[] data,int key) {
		int i =0;
		for(byte b:data) {
			System.out.println(b);
			data[i]=(byte)(b^key);
			i++;
		}
		return data;
	}
}
