package Ultils;

public class BaseUtils {
	public static boolean IsEmpty(String sValue) {
		return sValue.isEmpty() ? true : false;
	}

	public static boolean IsNumeric(String sValue) {
		return sValue.matches("^[-+]?\\d+(\\.\\d+)?$");
	}

	public static boolean IsSatisfy(byte bValue) {
		return (bValue < 1 || bValue > 6) ? false : true;
	}
}
