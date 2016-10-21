package fcu.iecs.oop.password;


public class PasswordEncorder {
	public String encode (String code){
		code=code.replace('A','4');
		code=code.replace('a','4');
		code=code.replace('E','3');
		code=code.replace('e','3');
		code=code.replace('I','1');
		code=code.replace('i','1');
		code=code.replace('O','0');
		code=code.replace('o','0');
		code=code.replace('T','7');
		code=code.replace('t','7');
		
		return code;
	}
	

}
