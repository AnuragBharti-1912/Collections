
public class versionformat {
	public static void main(String[] args) {
	String number = "123";

   number=String.format("%04d", Integer.parseInt(number));
   System.out.println(number);
		
	}

}
