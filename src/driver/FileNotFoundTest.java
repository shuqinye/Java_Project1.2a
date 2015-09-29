package driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import adapter.BuildAuto;
import adapter.ProxyAutomobile;

/**
 * This class tests FILENOTFOUND exception.
 * @author ShuqinYe
 *
 */

public class FileNotFoundTest {

	public static void main(String[] args) {
		
		ProxyAutomobile auto = new BuildAuto();
		
		/**
		 * Test for SETNAMENOTFOUND exception.
		 */
		auto.buildAuto("file.txt");

		// Check the log files - to see whether the log files have recorded the
		// exception
		try {
			FileReader reader = new FileReader("log.txt");
			BufferedReader buffer = new BufferedReader(reader);
			System.out.println(buffer.readLine());
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		
	}
}
