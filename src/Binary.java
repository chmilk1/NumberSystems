

import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Binary {

	private int num;
	private PrintWriter pw = null;
	String s;
	int dec;
	

	public Binary(PrintWriter pw) {
		this.pw = pw;
	}

	public void binToDec() {
		inputBin();
		toDec();
		outDec();
	}

	public void binToHex() {
		inputBin();
		toHex();
		outHex();

	}

	private void outHex() {
		// TODO Auto-generated method stub

	}

	private void toHex() {
		// TODO Auto-generated method stub

	}

	private void outDec() {
		JOptionPane.showMessageDialog(null, s + " in decimal is: " + dec);

	}

	private void toDec() {
		int sum = 0;
		int i = 0;
		while(i < 32) {
			int thisDigit = Integer.parseInt(s.charAt(32-i-1) + "");
			sum += thisDigit * Math.pow(2.0, i);
			i++;
		}
		dec = sum;
	}

	private void inputBin() {
		String cheese = JOptionPane.showInputDialog("What number?");
		num = Integer.parseInt(cheese);
		s = cheese;
	}

}
