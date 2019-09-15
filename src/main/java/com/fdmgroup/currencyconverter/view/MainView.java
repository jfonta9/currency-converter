package com.fdmgroup.currencyconverter.view;

import java.util.Scanner;

public class MainView {
	
	public MainView() {
		Scanner in = new Scanner(System.in);
		menu();
	}
	
	public void menu() {
		System.out.println("Please select a currency to convert from: ");
	}

}
