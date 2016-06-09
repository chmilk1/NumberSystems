
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Decimal {
	private String input;
	private int number;
	private StringBuilder output;
	
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
		output = new StringBuilder();
		ArrayList<String> ret = new ArrayList<String>();
		int x = number;
		int r = 0;
		while(x!=0){
			r= x%16;
			x=x/16;
			switch(r){
			case 10:
				ret.add("A");
				break;
			case 11:
				ret.add("B");
				break;
			case 12:
				ret.add("C");
				break;
			case 13:
				ret.add("D");
				break;
			case 14:
				ret.add("E");
				break;
			case 15:
				ret.add("F");
				break;
			default:
				ret.add(""+r);
				
			}
		}
		for (int i = ret.size(); i > 0; i--) {
			output.append(ret.get(i-1));
		}
		input = output.toString();
			
	}

	private void outBin() {
		JOptionPane.showMessageDialog(null, "Your Awnser Is: " + output.toString());

	}

	private void toBin() {
		output = new StringBuilder();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int x = number;
			for (int i = 32; i > 0; i--) {
				if (x-(2^i)>=0) {
					ret.add(1);
				} else {
					ret.add(0);
				}
			}
			for (int i = ret.size(); i < 0; i++) {
				output.append(ret.get(i));
			}
	}

	private void inputDec() {
		input = JOptionPane.showInputDialog(null, MESSAGE);
		number = Integer.parseInt(input);
	}

}
