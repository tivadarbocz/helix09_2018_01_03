package hu.tb;

import java.io.File;

//TODO refactor to singleton
public class Menu {

	public Menu() {
	}

	//TODO Console-os menü megvalósítása
	public void run(){
		FileViewer fileViewer = new FileViewer(new File("C:\\Users\\Admin\\Desktop\\resources"));
		fileViewer.listFilesInDir();
	}

	// TODO választható menüpontok
	// TODO - 1. *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Következő *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Előző *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Név alapján *.txt tartalmának a megnyitása(console-ra írása)
	// TODO - Kilépés
	// TODO - file létrehozás név + tartalom
	// TODO - file tartalom módosítás név alapján
	// TODO - file törlése
	// TODO - legnagyobb méretű file megkeresése, tartalmának elfelezése és 2 külön file-ba írása


}
