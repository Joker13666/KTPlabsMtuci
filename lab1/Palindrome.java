public class Palindrome{
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
			String s = args[i];

			if(isPalindrome(s) == true) System.out.println("Данное слово полиндром : " + s);
			else System.out.println("Данное слово не является полиндромом : " + s);

		}
	}

	//Данная функия переворачивает строку
	public static String reverseString(String a){
		String s = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			s = s + a.charAt(i);
		}
		return s;
	}
	//Проверка на то, что перевёрнутая строка равна начальной
	public static boolean isPalindrome(String s){
		String s1 = reverseString(s);
		if(s.equals(s1)) return true;
		else return false;
	}
}
