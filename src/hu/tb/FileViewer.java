package hu.tb;

import java.io.*;

public class FileViewer {
	private File folder;
	private File[] listOfFiles;
	private File lastPrintedFile;

	public FileViewer(File folder) {
		this.folder = folder;
		listOfFiles = folder.listFiles();
	}

	// file-ok listázása név + méret kb-ban
	//TODO rendezés méret szerint, mely paraméterezhető, hogy csökkenő vagy növekvő
	public void listFilesInDir(){
		for(File file : listOfFiles){
			System.out.println("name: " + file.getName() + " size: " + file.length() / 1024.0 +  " kb");
		}
	}

	public void printNextFileContent(){

	}

	public void printPreviousFileContent(){

	}

	/**
	 * Kiírja az első *.txt tartalmát console-ra
	 */
	public void printFirstTextFile(){
		lastPrintedFile = searchFirstTextFile();
		printFileContent(lastPrintedFile);

	}

	public void printFileContent(File file){
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private File searchFirstTextFile(){
		for(File file : listOfFiles){
			if(file.getName().endsWith("txt")){
				return file;
			}
		}

		return null;
	}


}
