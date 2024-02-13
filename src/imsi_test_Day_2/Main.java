package imsi_test_Day_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	private void print_output(String [] finalwords) {
		for (String word : finalwords) {
			System.out.print(word +" ");
		}
	}
	private void run() {
		String words;
		System.out.println("Enter the word you want to reverse");
		//main function
		words = scan.nextLine();
		String [] finalwords = words.split(" ",-1);
		 Collections.reverse(Arrays.asList(finalwords)); 
		 String chs;
		print_output(finalwords);
		
		//end main function
		do {
			System.out.println();
			System.out.println("do you want to reenter string?[YES|NO]");
			chs = scan.nextLine();
		}
		while(!chs.equals("YES")&&!chs.equals("NO"));
		if(chs.equals("YES")) {
			run();
		}
		return;
	}
	public Main() {
		run();
		System.out.println("Thank you for using this app");
		
	}

	public static void main(String[] args) {
		
		new Main();
	}

}
