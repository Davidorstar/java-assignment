package guessing_game;

import javax.swing.*;
import java.awt.*;

			public class Main extends Frame{
            
			public static void main(String[] args) { 
			
			int guess = 10;
			int noofguesses = 1;
			int answer=(int)(Math.random()*100+1);
			
			int guesses[] = new int[guess]; 
			
			for (int i = 0; i < guesses.length; i++) { 
				String response=JOptionPane.showInputDialog(null, "Enter a guess between 0 and 100", "Guessing Game", JOptionPane.YES_NO_CANCEL_OPTION);
			      guesses[i] = Integer.parseInt(response); 
			      
					if(guesses[i] <=0 || guesses[i] > 100) {
						JOptionPane.showMessageDialog(null, " Your guess is invalid ");
							}
					else if(guesses[i] == answer) {
							JOptionPane.showMessageDialog(null, "Correct! You got the answer \n It took you "+ noofguesses++ +" guesses to guess right :)");
							if(i == 0) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your first guess  was : "+ guesses[0]);
				    		}
				    		else if(i == 1) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0]+"\n Your 2nd guess was : "+ guesses[1]);
				 
				    		}
				    		else if(i == 2) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]);
				    			
				    		}
				    		else if(i == 3) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]);
				    	
				    		}
				    		else if(i == 4) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]);
				    			
				    		}
				    		else if(i == 5) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]);
				    		}
				    		else if(i == 6) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]);
				    		}
				    		else if(i == 7) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]);
				    		}
				    		else if(i == 8) {
				    	
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]+ "\n Your 9th guess was : "+ guesses[8]);
				    		}
				    		else if(i == 9) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]+ "\n Your 9th guess was : "+ guesses[8]+ "\n Your 10th guess was : "+ guesses[9]);
				    		}
				    		else {
				    			JOptionPane.showMessageDialog(null, "\n Invalid : ");
				    		}
							return;
					}
					
				    else if(guesses[i] < answer) {
				    		JOptionPane.showMessageDialog(null, "Your guess is too low, try again \n Guess number "+ noofguesses++ );
				    		if(i == 0) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your first guess  was : "+ guesses[0]);
				    		}
				    		else if(i == 1) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0]+"\n Your 2nd guess was : "+ guesses[1]);
				 
				    		}
				    		else if(i == 2) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]);
				    			
				    		}
				    		else if(i == 3) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]);
				    	
				    		}
				    		else if(i == 4) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]);
				    			
				    		}
				    		else if(i == 5) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]);
				    		}
				    		else if(i == 6) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]);
				    		}
				    		else if(i == 7) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]);
				    		}
				    		else if(i == 8) {
				    	
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]+ "\n Your 9th guess was : "+ guesses[8]);
				    		}
				    		else if(i == 9) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]+ "\n Your 9th guess was : "+ guesses[8]+ "\n Your 10th guess was : "+ guesses[9]);
				    		}
				    		else {
				    			JOptionPane.showMessageDialog(null, "\n Invalid : ");
				    		}
				    		
				    	}
				    	
				    
				   else  {
			    			JOptionPane.showMessageDialog(null, "Your guess is too high, try again \n Guess number "+ noofguesses++ );
			    			if(i == 0) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your first guess  was : "+ guesses[0]);
				    		}
				    		else if(i == 1) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0]+"\n Your 2nd guess was : "+ guesses[1]);
				 
				    		}
				    		else if(i == 2) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]);
				    			
				    		}
				    		else if(i == 3) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]);
				    	
				    		}
				    		else if(i == 4) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]);
				    			
				    		}
				    		else if(i == 5) {
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]);
				    		}
				    		else if(i == 6) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]);
				    		}
				    		else if(i == 7) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]);
				    		}
				    		else if(i == 8) {
				    	
				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]+ "\n Your 9th guess was : "+ guesses[8]);
				    		}
				    		else if(i == 9) {

				    			JOptionPane.showMessageDialog(null, "GUESS HISTORY: \n Your 1st guess was : "+ guesses[0] + "\n Your 2nd guess was : "+ guesses[1]+ "\n Your 3rd guess was : "+ guesses[2]+ "\n Your 4th guess was : "+ guesses[3]+ "\n Your 5th guess was : "+ guesses[4]+ "\n Your 6th guess was : "+ guesses[5]+ "\n Your 7th guess was : "+ guesses[6]+ "\n Your 8th guess was : "+ guesses[7]+ "\n Your 9th guess was : "+ guesses[8]+ "\n Your 10th guess was : "+ guesses[9]);
				    		}
				    		else {
				    			JOptionPane.showMessageDialog(null, "\n Invalid : ");
				    		}
				   }
			}
			JOptionPane.showMessageDialog(null, "Game Over :( , You are out of guesses", "Guessing Game", JOptionPane.YES_NO_CANCEL_OPTION);
			}
			}
			