package com.Reader;

import java.io.IOException;

public class FileReaderManger {
	
	private FileReaderManger() {
		
		
	}
	
	public static FileReaderManger getinstanceFRM() {
		
		FileReaderManger FRM = new  FileReaderManger();
		
		return FRM;

	}
	public static ConfigReader getInstance() throws IOException {
		
		ConfigReader reader = new ConfigReader();
		
		return reader;
		
		

	}

}
