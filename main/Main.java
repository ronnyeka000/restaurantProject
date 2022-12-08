package main;

import java.util.Scanner;

import factories.BaratFactory;
import factories.ItemMenuFactories;
import factories.LokalFactory;
import itemMenu.MakananBarat;
import itemMenu.MakananLokal;
import itemMenu.MinumanBarat;
import itemMenu.MinumanLokal;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		menuAddMenu();
	}
	
	private void menuAddMenu() {
		int choose;
		ItemMenuFactories itemMenuFactories = null;
		do {
			System.out.println("Add Menu");
			System.out.println("1. Makanan Lokal");
			System.out.println("2. Makanan Barat");
			System.out.println("3. Minuman Lokal");
			System.out.println("4. Minuman Barat");
			System.out.println("5. Exit");
			System.out.print(">> ");
			choose = scan.nextInt(); scan.nextLine();
			switch (choose) {
			case 1:
				itemMenuFactories = new LokalFactory();
				MakananLokal makananLokal = (MakananLokal) itemMenuFactories.makeMakanan();
				System.out.println(makananLokal.getId());
				break;
			case 2:
				itemMenuFactories = new BaratFactory();
				MakananBarat makananBarat = (MakananBarat) itemMenuFactories.makeMakanan();
				System.out.println(makananBarat.getId());
				break;
			case 3:
				itemMenuFactories = new LokalFactory();
				MinumanLokal minumanLokal = (MinumanLokal) itemMenuFactories.makeMinuman();
				System.out.println(minumanLokal.getId());
				break;
			case 4:
				itemMenuFactories = new BaratFactory();
				MinumanBarat minumanBarat = (MinumanBarat) itemMenuFactories.makeMinuman();
				System.out.println(minumanBarat.getId());
				break;
			case 5:
				System.out.println("Thank u for using the apps");
				break;
			default:
				System.out.println("Please choose 1 - 5 Option");
				break;
			}
		}while(choose!=5);
	}

	public static void main(String[] args) {
		new Main();

	}

}
