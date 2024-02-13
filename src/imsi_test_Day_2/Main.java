package imsi_test_Day_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	public void print_output(String [] finalwords) {
		for (String word : finalwords) {
			System.out.print(word +" ");
		}
	}
	public Main() {
		String words;
		words = scan.nextLine();
		String [] finalwords = words.split(" ",-1);
		 Collections.reverse(Arrays.asList(finalwords)); 
		print_output(finalwords);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
