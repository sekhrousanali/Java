package JAVA;

import java.lang.reflect.Array;
import java.util.Arrays;

import Opps.MethodClass;

public class ReverseString {
	public static void main(String[] args) {
		try {
			String s ="Sekh Rousan Ali";
			String[] splitString = s.split(" ");
			 System.out.println(Arrays.toString(splitString));
			 testInfo("###############Reverse A string whole word and line###############");
			StringBuilder ReverseWord = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {
				// System.out.print(s.charAt(i));
				ReverseWord.append(s.charAt(i));
			}
			ReverseWord.append(" ");
			System.out.println(ReverseWord + " --->Reverse A string whole word and line");
			//#####################Reverse string without changing there position##############
			StringBuilder revrseWord = new StringBuilder();
			for (int k = 0; k < splitString.length; k++) {
				String reversString = splitString[k];
				for (int j = reversString.length() - 1; j >= 0; j--) {
					revrseWord.append(reversString.charAt(j));
				}
				revrseWord.append(" ");
			}
			System.out.println(revrseWord + "---> Reverse string without changing there position");
			//################Reverse string###########################
			StringBuilder ReverseWord1 = new StringBuilder();
			for (int i = splitString.length - 1; i >= 0; i--) {
				// System.out.print(s.charAt(i));
				ReverseWord1.append(splitString[i]).append(" ");
			}
			System.out.println(ReverseWord1 + " --->Reverse string");
			//############Reverse string using StringBuilder ##############
			//Need to check remove white space from last;
			StringBuilder ReverseWord2 = new StringBuilder();
			for (String a : splitString)
				ReverseWord2.append(a).append(" ");
			System.out.println(ReverseWord2.reverse().toString().trim() + " --->Reverse string using StringBuilder");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static <T> void testInfo(T info) {
        System.out.println(info);
    }


}
