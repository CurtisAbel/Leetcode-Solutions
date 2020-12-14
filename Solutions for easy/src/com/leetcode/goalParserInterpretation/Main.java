package com.leetcode.goalParserInterpretation;

public class Main {
public static void main(String[] args) {
	
	
	System.out.println(interpret("G()(al)"));
	
}
public static String interpret(String command) {

  
  
  
	return command.replace("()", "o").replace("(al)", "al");
}

}
