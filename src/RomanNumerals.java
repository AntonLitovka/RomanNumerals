
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
		if( number < 40 ){
			return "X"+toRoman(number-10);
		}
		if( number < 50 ){
			return "XL" + toRoman(number-40);
		}
		if ( number < 90 ){
			return "L" + toRoman(number-50);
		}
		if(number < 99 ){
			return "XC"+ toRoman(number-90);
		}
		if(number < 400){
			return "C"+toRoman(number-100);
		}
		if(number< 500){
			return "CD"+toRoman(number-400);
		}
		if(number <900){
			return "D"+toRoman(number-500);
		}
		if(number < 1000){
			return "CM" + toRoman(number-900);
		}
		if(number < 4000){
			return "M" + toRoman(number-1000);
		}
		return "very big number";
	}

}
