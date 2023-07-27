package practical;

public class practic1 {
	private static void easyWay(String name) {
		if (name.length() >= 2) {

			char nameArray[] = name.toCharArray();

			char a = nameArray[name.length() - 1];//last
		char b = nameArray[name.length() - 2];//2nd last

			System.out.println("old a= " + a + " b= " + b);
			char c = a;
			a = b;
			b = c;
			System.out.println("new a= " + a + " and b= " + b);

		    nameArray[name.length() - 1] = a;//last
			nameArray[name.length() - 2] = b;//2nd last

			name = new String(nameArray);
		} else {
			System.out.println("please enter name more than two character");
		}

		System.out.println(name);
	

}


	public static void main(String[] args) {
		 easyWay("laxmi");
	}
}
