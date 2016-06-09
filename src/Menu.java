

import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Menu {
	private PrintWriter pw = null;
	String returnChoice;
	
	public Menu(PrintWriter pw) {

		this.pw = pw;
	}

	public void display() {

		char[] c = {'A','B','C','D','E','F'};
		for (char d : c) {
			int x = d;
			System.out.println(x);
		}
		String choice = JOptionPane.showInputDialog("Type 1 for decimal to binary, type 2 for decimal to hexadecimal,"
				+ "type 3 for binary to decimal, type 4 for binary to hexadecimal, type 5 for hexadeimal to decimal"
				+ "type 6 for hexadecimal to binary");
		returnChoice = choice;
		
	}

	public int getSelection() {
		int i = Integer.parseInt(returnChoice);
		if(i >= 1 && i <=6) 
		return i;
		else
		return 7;
	}
}

