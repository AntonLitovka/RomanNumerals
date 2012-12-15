
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
		if( number < 39 ){
			return "X"+toRoman(number-10);
		}
		if( number < 41 ){
			return "XL" + toRoman(number-40);
		}
		if ( number < 89 ){
			return "L" + toRoman(number-50);
		}
		return "L";
	}

}
