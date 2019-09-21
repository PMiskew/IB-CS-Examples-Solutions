package thing_explainer_writer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Thing_Explainer {

	//Should I use a hash set?
	//Data Variables
	private ArrayList<String> wordList = new ArrayList<String>();
	private int[] keyCodeList = {32,46,49,47,10};
	
	//GUI Variables
	private JFrame frame;
	private JTextArea text;
	
	//ActionListener
	private KeyListener kl = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//46 .
			//517 !
			//191 ?
			int kcode = e.getKeyCode();
			System.out.println(e.getKeyCode());
			
			for (int i = 0; i < keyCodeList.length; i++) {
				if (kcode == keyCodeList[i])  {
					processText1();
					break;
				}
			}
		}
		
		
	};

	/**
	 * Default Constructor:  Takes not parameters
	 */
	public Thing_Explainer() {
	
		//Populate wordList
		try {
			Scanner s = new Scanner(new File("wordlist.txt"));
			while (s.hasNext()) {
				wordList.add(s.nextLine());
			}
			
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		
		
		//Create GUI
		frame = new JFrame("Thing Explainer");
		text = new JTextArea(20	,100);
		frame.add(text);
		frame.pack();
		
		//add listener text. 
		text.addKeyListener(kl);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	}
	
	/*
	 * This is the first processText I wrote.  It only accounts for spaces
	 */
	public void processText1() {
		
		String temp = text.getText();
		int ind1 = 0;
		
		for (int i = temp.length() - 2; i >= 0; i = i - 1) {
			
			for (int j = 0; j < keyCodeList.length; j++) {
				if (temp.charAt(i) == (char)(keyCodeList[j])) {
					ind1 = i;
					i = -1;
					break;
				}
			}
			if (i == 0) {
				ind1 = -1;
				break;
			}
		
		}
		
		//Pull out word
		String word = temp.substring(ind1 + 1,temp.length() - 1);
		
		//Assume word is valid 
		boolean remove = true;
		
		//iterative loop - SL/HL
		for (int j = 0; j < wordList.size(); j = j + 1 ) {
			
			if (word.equalsIgnoreCase(wordList.get(j))) {
				remove = false;
				break;
			}
			
		}
	
		if (remove) {
			System.out.println(ind1);
			temp = temp.substring(0,ind1+1);
		}
		
		System.out.println(temp);
		text.setText("");
		text.setText(temp);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing_Explainer te1 = new Thing_Explainer();
	}

}
