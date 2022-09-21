package graphicalUI;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import handlers.FileOperations;

public class CreateUI {
	private static JFrame f = new JFrame();
	private static JButton button= new JButton();
	private static JTextField textField = new JTextField(10);
	private static int key ;
	private static boolean isDone;
	
	public static void show() {
		
		f.setTitle("Image Operation");
		f.setSize(500,500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(setButton());
		f.add(setTextField());
		f.setVisible(true);
	}
	
	private static JButton setButton() { 
		button.setText("Open Image");
		button.setFont(setFont());
		button.addActionListener(e->{
			System.out.print(false);
			String text=textField.getText();
			int key =Integer.parseInt(text);
			isDone = FileOperations.selectAndWriteFile(key);
			if(isDone==true) {
				JOptionPane.showMessageDialog(null, "Done");
			}
		});
		return button;
	}
	
	private static JTextField setTextField() {
		textField.setFont(setFont());
		return textField;
	}
	
	private static Font setFont() {
		Font font= new Font("Roboto",Font.BOLD,15);
		return font;
	}
}
