package hust.soict.globalict.garbage;

import java.io.*;

public class GarbageCreator {
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + File.separator + "garbage.txt";

        String fileContent = "";
        
        int i=0;
        
        try {
        	File file = new File(filePath);
        	while(i < 1000) {
        		FileReader fr = new FileReader(file);
        		BufferedReader br = new BufferedReader(fr);
        		
        		int c;
        		while ((c = br.read()) != -1) fileContent += (char)c;
        		br.close();
        		i++;
        	}
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println(fileContent);
	}
}
