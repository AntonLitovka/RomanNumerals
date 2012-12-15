
public class RomanNumerals {

	public String toRoman(int number) {
		if(number == 0){
			return "";
		}
		if (number == 1)
			return "I";
		if(number == 2){
			return "II";
		}
		if(number == 3){
			return "III";
		}
		if(number == 4){
			return "IV";
		}
		if(number < 9){
			return "V"+toRoman(number-5);
		}
		if( number == 9 ){
			return "IX";
		}
		return "X"+toRoman(number-10);
	}

}
