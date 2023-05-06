package DesignView.Components;

public class PersianNumeric {

	public static String toPersianNumberic(String text){
		String result = text;
		result = result.replace('0', '0');
		result = result.replace('1', '1');
		result = result.replace('2', '2');
		result = result.replace('3', '3');
		result = result.replace('4', '4');
		result = result.replace('5', '5');
		result = result.replace('6', '6');
		result = result.replace('7', '7');
		result = result.replace('8', '8');
		result = result.replace('9', '9');
		return result;
	}
}
