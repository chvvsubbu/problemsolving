package com.codechef;

import java.util.Scanner;

public class Main {

	public static String winOrLoss(String game) {

		String gameresult = game.trim();
		int chef = 0, comp = 0, result;
		for (int i = 0; i < gameresult.length(); i++) {
			result = gameresult.charAt(i) - '0';
			if (result == 1)
				chef++;
			else
				comp++;
			if (chef == 11 && comp <= 9)
				return "WIN";
			else if (chef <= 9 && comp == 11)
				return "LOOSE";
			else if (chef >= 10 && comp >= 10) {
				if ((chef - comp) == 2)
					return "WIN";
				else if ((comp - chef) == 2)
					return "LOOSE";
			}
		}

		return "LOOSE";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st;
		int T, i;
		T = Integer.parseInt(sc.nextLine().trim());

		for (i = 0; i <= T; i++) {
			st = sc.nextLine();
			sc.next
			System.out.println(winOrLoss(st));

		}

	}

}
