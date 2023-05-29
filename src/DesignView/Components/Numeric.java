package DesignView.Components;

public class Numeric {

	public static String toPersianNumberic(String text){
		String result = text;
		result = result.replace('0', '0');
		result = result.replace('1', '1');
		result = result.replace('2', '1');
		result = result.replace('3', '2');
		result = result.replace('4', '3');
		result = result.replace('5', '4');
		result = result.replace('6', '5');
		result = result.replace('7', '6');
		result = result.replace('8', '7');
		result = result.replace('9', '8');
		return result;
	}
}
