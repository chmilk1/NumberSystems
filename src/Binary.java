

import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Binary {

	private int num;
	private PrintWriter pw = null;
	String s; //s is the number as a string
	int dec;
	String hex;
	

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
		JOptionPane.showMessageDialog(null, s + " in hexadecimal is: " + hex);

	}
	
	private void toHex() {
		String sum = "";
		for(int i = 0; i < 32; i+=4) {
			String nibble = s.substring(i, i+4);
			int j = 0;
			int sum1 = 0;
			while(j < 4) {
				int thisDigit = Integer.parseInt(nibble.charAt(4-j-1) + "");
				sum1 += thisDigit * Math.pow(2.0, j);
				j++;
			}
			if(sum1 == 10) {
				sum+="A";
			} else if(sum1 == 11) {
				sum+="B";
			} else if(sum1 == 12) {
				sum+="C";
			} else if(sum1 == 13) {
				sum+="D";
			} else if(sum1 == 14) {
				sum+="E";
			} else if(sum1 == 15) {
				sum+="F";
			} else {
				sum+=sum1;
			}
		}
		hex = sum;
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
