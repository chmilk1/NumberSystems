
public class test {
	public static void main(String[] args) {
		String s = "0000000000000000000000000001111";
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
		
		System.out.println(sum);
		
	}
	
}
