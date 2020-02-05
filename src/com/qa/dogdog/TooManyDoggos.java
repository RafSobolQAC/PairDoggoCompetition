package com.qa.dogdog;

import java.util.ArrayList;
import java.util.List;

public class TooManyDoggos {
	public static List<String> doggoComp(int place) {
		List<String> output = new ArrayList<>();
		String append = "";
		for (int i = 1; i < 101; i++) {
//			System.out.println(i);
			if (i >= 11 && i <= 13) {
				append = "th";
			}
			else if (i % 10 == 1) {
				append = "st";
			}
			else if (i % 10 == 2) {
				append = "nd";
			}
			else if (i % 10 == 3) {
				append = "rd";
			}
			else {
				append = "th";
			}
			
			if( i == place) {
				continue;
			}
			
			
			output.add(i+append);
			
		}
		return output;
	}
	public static void main(String[] args) {
		List<String> doggos = (ArrayList<String>) doggoComp(5);
		for (String str : doggos) {
			System.out.println(str);
		}
	}
}
