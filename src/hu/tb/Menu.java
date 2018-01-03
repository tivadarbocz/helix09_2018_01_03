package hu.tb;

import java.util.Scanner;
import java.io.*;

//refactor to singleton
public class Menu {

	private static Menu INSTANCE;

	private FileViewer fileViewer;


	private Menu(){
		fileViewer = new FileViewer(new File("C:\\Users\\Admin\\Desktop\\resources"));
	}

	public static Menu getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Menu();
		}
		return INSTANCE;
	}

	/*public Menu() {
		fileViewer = new FileViewer(new File("C:\\Users\\Admin\\Desktop\\resources"));
	}*/

	//TODO Console-os menü megvalósítása
	public void run() {

		int flag = -1;

		while (flag != 0) {
			printMenu();
			System.out.println("Menü pont kiválasztása: ");
			Scanner scanner = new Scanner(System.in);
			flag = scanner.nextInt();

			switch (flag) {
			case 1:
				fileViewer.listFilesInDir();
				break;
			case 2:
				fileViewer.printFirstTextFile();
				break;
			case 3:
				//TODO
				break;
			case 4:
				//TODO
				break;
			case 5:
				//ODO
				break;
			case 6:
				//TODO
				break;
			case 7:
				//TODO
				break;
			case 8:
				//TODO
				break;
			}
			System.out.println("\n");

		}
	}

	//  választható menüpontok
	//  - 1. *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Következő *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Előző *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Név alapján *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - file létrehozás név + tartalom
	// TODO - file tartalom módosítás név alapján
	// TODO - file törlése
	// TODO - legnagyobb méretű file megkeresése, tartalmának elfelezése és 2 külön file-ba írása
	// TODO - Kilépés

	private void printMenu() {
		System.out.println("**********Menu***********");
		System.out.println("**File-ok listázása(1)***");
		System.out.println("** 1 txt file kiírása(2)*");
		System.out.println("*******Kilépés (0)******");
	}
}
