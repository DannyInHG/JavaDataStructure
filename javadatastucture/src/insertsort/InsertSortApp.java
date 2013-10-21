package insertsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertSortApp {
	public static void main(String[] args)
	{

		try {
			System.out.println("you want to enter the number of the seri:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int numOfSeri = (int)br.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
