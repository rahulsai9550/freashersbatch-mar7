class Strings{
	static boolean compare(String a,String b){
		if(a.equalsIgnoreCase(b))
			return true;
		return false;
	}
	public static void main(String [] s){
		String s1 = "Object OrientEd Programming Language";
		String s2 = "Object Oriented Programming Language";
		System.out.println(compare(s1,s2));
		// commented
	}
}
