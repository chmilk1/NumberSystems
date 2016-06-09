
public class test {
	public static void main(String[] args) {
		String s = "00000000000000000000000000000100";
		int sum = 0;
		int i = 0;
		while(i < 32) {
			int thisDigit = Integer.parseInt(s.charAt(32-i-1) + "");
			sum += thisDigit * Math.pow(2.0, i);
			i++;
		}
		System.out.println(sum);
		
	}
	
}
