package hu.tb;

import java.io.File;


public class FileViewer {
	private File folder;
	private File[] listOfFiles;

	public FileViewer() {

	}

	public FileViewer(File folder) {
		this.folder = folder;
	}

	//TODO file-ok listázása név + méret kb-ban
	//TODO rendezés méret szerint, mely paraméterezhető, hogy csökkenő vagy növekvő
	public void listFilesInDir(){
		listOfFiles = folder.listFiles();
		for(File file : listOfFiles){
			System.out.println("name: " + " size: " + " kb");
		}
	}


}
