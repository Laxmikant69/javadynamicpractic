package practical;

public class Findduplicatewordinstring {
	public static void findword(String sentence) {
		sentence=sentence.toLowerCase();
		String s[]=sentence.split(" ");
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if (s[i].equals(s[j])) {
					System.out.println("got the duplicate");
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findword("hello sir hello student");
	}

}
