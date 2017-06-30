package main;

import java.util.Scanner;

public class MainExMultithreading {

	
	private static Scanner s;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);

		
			int n = 0;
			try{
				System.out.println("Enter array length");
				n = s.nextInt();
				
				int[] array = new int[n];
				for(int i = 0; i < n; i++)
					array[i] = (int) (Math.random() * 1000);
	
				System.out.println("Start sort");
				
				Sorted sort = new Sorted(array);
				Thread th = new Thread(() -> {
						
							try {
								while ((int)(sort.progress()+1) < 100){
									String str = s.nextLine().toLowerCase();
									if (str.equals("status"))
										System.out.println("Progress: " + sort.progress());
								}
								Thread.sleep(0);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Progress: " + sort.progress());
						
					});
				
				th.start();
				sort.startSort();
				
				
				while (th.isAlive());
				System.out.println("That's all!");
				
			}catch (Exception e) {
				System.err.println("Please enter number");
			}
		}
		
		
	
	
	
	
	
	

}
