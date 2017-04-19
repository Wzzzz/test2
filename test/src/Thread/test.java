/*
 * œﬂ≥ÃÀ¿—≠ª∑
 * */

package Thread;

import java.io.*;

public class test {
	public static void busy()
	{
		Thread thread = new Thread(new Runnable(){
			public void run(){
				while(true);}
		},"test");
	thread.start();	
	}
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	busy();
	br.readLine();
   }
}