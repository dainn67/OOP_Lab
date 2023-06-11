package hust.soict.globalict.garbage;

import java.io.*;

public class NoGarbage {
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + File.separator + "garbage.txt";

        StringBuilder sb = new StringBuilder();
        
        int i=0;
        
        try {
        	File file = new File(filePath);
        	while(i < 100) {        		

        		FileReader fr = new FileReader(file);
        		BufferedReader br = new BufferedReader(fr);
        		
        		int c;
        		while ((c = br.read()) != -1) {

        			sb.append((char)c);
        		}
        		br.close();
        		i++;
        	}
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println(sb.toString());
	}
}
