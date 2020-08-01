/**			Programming Fundamentals	Second Program Assignment
 * 	
 * 			Figures						Author: Nick Hutson
 */

import java.util.Scanner;

public class Figures {

    private static Scanner scn = new Scanner (System.in);
    
    private static int size = 0;
    
    public static void main (String[]args) {
	
    	System.out.println ("\nSecond Program Assignment\nNick Hutson\nFigures Program\n");
	
    	//Request user input for size
    	
        System.out.print ("Renter the size of the figure: ");
        
        int n = scn.nextInt ();
        
        //Verification of odd number input and error case
        
        while (n % 2 == 0) {
        	
            System.out.println ("\nInvalid figure size - must be an odd number\n");
            
            System.out.print ("What size fugure would you like? (odd numbers only): ");
            
            n = scn.nextInt();
            
            System.out.println (" ");
        }
        
        int size = n;
        
        printMenu();
        
        int option = scn.nextInt();
        
        //Flow control for input menu options
        
        while (true){
        	
            switch (option) {
            
                case 1:
                	
                	System.out.println (" ");
                    printBox (n);
                    System.out.println (" ");
                    break;
                    
                case 2:
                	
                	System.out.println (" ");
                    printDiamond (n);
                    System.out.println (" ");
                    break;
                    
                case 3:
                	
                	System.out.println (" ");
                    printX (n);
                    System.out.println (" ");
                    break;
                    
                case 4:
                	
                	System.out.println (" ");
                    System.out.println ("Good bye!");
                    System.exit (0);
            }

            printMenu();
            
            option = scn.nextInt();
        }
        
    }

    //Input menu
    
    private static void printMenu () {
        
    	System.out.println("");
    	
    	System.out.println ("MENU:");
    	
    	System.out.println("");
        
        System.out.println ("1. Print box");
        
        System.out.println ("2. Print diamond");
        
        System.out.println ("3. Print X");
        
        System.out.println ("4. Quit program");
        
        System.out.println("");
        
        System.out.print ("Select An Option And Press Enter: ");
    }
    
    //Print Box Method
    
    private static void printBox (int size) {
    	
		for(int x = 0; x < size; x++) {

		for(int y = 0; y < size; y++) 

		System.out.print ("X");
		
		System.out.println ();
		}
        
   }
    
    //Print Diamond Method
    
	public static void printDiamond(int size)
	{
		for(int i = 0; i < size; i++)
		{
			// Define variable for middle and inner space
			int m = size / 2;
			int k = Math.abs(m - i);
			
			for (int j = 0; j < k; j++)
				System.out.print(" ");
			System.out.print("X");
			
			for (int j = 0; j < (m - k) * 2 ; j++)
				System.out.print(" ");
			System.out.println("X");
		}
	}
    
    //Print X Method
    
	public static void printX(int size)
	{
		for(int i = 1 ; i <= size; i++)
		{
			// Define midpoint
			int m = (size / 2) + 1;
			// Define inner spaces
			int k = Math.abs(m - i);
			
			for (int j = 0; j < (m - k -1); j++)
				System.out.print(" ");
			System.out.print("X");
			
			//skip midpoint
			if(i == m)
				System.out.println("");
			
			for (int j = 0; j < (2 * k) - 1 ; j++)
				System.out.print(" ");
			if(i != m)
				System.out.println("X");
		}
	}

    public static int getSize() {
        return size;
    }
}
