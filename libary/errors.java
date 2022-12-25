package libary;

class Errors {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static String valueNotAssigned() {

		return "you cant show this error or writinh an answer that not writing in the board yet cuz of a bureacartic teaching, pls dont think copy";
	}
	public static boolean checkInput(boolean ch1,boolean ch2) {
		if(ch1 || ch2) {
			return true;	
		}
		else {
			return false;
		}
		
	}
}
