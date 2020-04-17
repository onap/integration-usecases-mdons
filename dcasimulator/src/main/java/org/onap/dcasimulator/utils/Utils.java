package org.onap.dcasimulator.utils;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.util.ResourceUtils;

public class Utils {

	public void readFileclasspath() throws IOException {
		File file = ResourceUtils.getFile("classpath:config/sample.txt");

		// File is found
		System.out.println("File Found : " + file.exists());

		// Read File Content
		String content = new String(Files.readAllBytes(file.toPath()));
		System.out.println(content);
	}

	public static String readFromFile(String file) {
		String content = "";
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			content = bufferedReader.readLine();
			String temp;
			while ((temp = bufferedReader.readLine()) != null) {
				content = content.concat(temp);
			}
			content = content.trim();
			bufferedReader.close();
		} catch (Exception e) {
			content = null;
		}
		return content;
	}

}
