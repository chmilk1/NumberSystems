
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Decimal {
	private String input;
	private int number;
	private StringBuilder output = new StringBuilder();
	private static String MESSAGE = "Input Your Number";
	private PrintWriter pw;

	public Decimal(PrintWriter pw) {
		this.pw = pw;
	}

	public void decToBin() {
		inputDec();
		toBin();
		outBin();
	}

	public void decToHex() {
		inputDec();
		toHex();
		outHex();
	}

	private void outHex() {

		JOptionPane.showMessageDialog(null, "Your Awnser Is: " + output.toString());


	}

	private void toHex() {

		boolean let = false;
		int letn;
		char[] numbers = input.toCharArray();
		for (int i=0;i<numbers.length;i++) {
			if (Integer.parseInt(""+numbers[i]) > 6) {
				output.append(numbers[i]);
			} else if(Integer.parseInt(""+numbers[i]) != 1 && Integer.parseInt(""+numbers[i+1]) != 1){
				output.append(numbers[i]);
			} else if (Integer.parseInt(""+numbers[i]) != 1 && Integer.parseInt(""+numbers[i+1]) == 1) {
				let = true;
				letn = Integer.parseInt(""+numbers[i]);
			} else  if (let){
				let = false;
				int ccode = (numbers[i-1]-48)+65;
				output.append((char) ccode);

			}
		}
	}

	private void outBin() {
		// TODO Auto-generated method stub

	}

	private void toBin() {
		// TODO Auto-generated method stub

	}

	private void inputDec() {
		input = JOptionPane.showInputDialog(null, MESSAGE);
		number = Integer.parseInt(input);
	}

}
