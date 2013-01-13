public class HashUtilities {

	public static int shortHash(int code){
		int newCode = Math.abs(code%1000);
		return newCode;
	}

}