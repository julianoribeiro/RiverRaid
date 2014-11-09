package game.riverRaid;

import java.io.IOException;

import jline.ConsoleReader;

/**
 * Hello world!
 * 
 */
public class App {
	
	public static void main(String[] args) throws IOException {
	
		ConsoleReader reader = new ConsoleReader();
        while (true) {
            int k = reader.readVirtualKey();
            System.out.println(k);
        }
		
//		System.out.println("Hello World!");
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String line = "";
//
//		while (line.equalsIgnoreCase("quit") == false) {
//			try {
//				line = in.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//			System.out.print("recebi: ");
//			System.out.println(line);
//		}
//
//		try {
//			in.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
