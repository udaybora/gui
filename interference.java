

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.text.BreakIterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;




import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;






public class interference {
	private JFrame frame;
	public static void frame2() { 
		
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	interference window = new interference();
	window.frame.setVisible(true);
	} 
	catch (Exception e) {
	e.printStackTrace();
	}
	}
    });
	}

	
	
	public interference() {
	initialize();
	}

		private void initialize() {
		frame = new JFrame();
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 753, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(231, 69, 456, 323);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(12, 12, 434, 300);
		panel.add(textPane_1);
		
		
		JButton btnChooseDomain = new JButton("Start");
		frame.getContentPane().add(btnChooseDomain);
		btnChooseDomain.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				String output =   "\n\n";
				output += "Training the modules\n";
				output += "\n";
				output += "\n";
				output += "Invoking Weka\n";
				output += "\n";
				output += "\n";
				output += "Supplying the training set to weka machine\n";
				textPane_1.setText(output);
			}
		});
		btnChooseDomain.setBounds(36, 125, 148, 23);
		frame.getContentPane().add(btnChooseDomain);
		
		
		
		JButton btnAddNewPaper = new JButton("Add new Paper");
		btnAddNewPaper.setBounds(36, 304, 148, 23);
		frame.getContentPane().add(btnAddNewPaper);
		btnAddNewPaper.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)  {
			addpaper ap = new addpaper();
			ap.addpaper();
		 
			}
		});
		
		
		JButton btnChooseDirectory = new JButton("Choose Directory");
		btnChooseDirectory.setBounds(36, 51, 148, 23);
		frame.getContentPane().add(btnChooseDirectory);
		btnChooseDirectory.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)  {
			
			 JFileChooser chooser = new JFileChooser();
			    chooser.setCurrentDirectory(new java.io.File("."));
			    chooser.setDialogTitle("choosertitle");
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    chooser.setAcceptAllFileFilterUsed(false);

			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			      System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
			      String output =   "\n\n";
					
			      output += "\n" + chooser.getCurrentDirectory();
					output += "\n\n" + "Directory path Successfully added";
					textPane_1.setText(output);
			      System.out.println("getSelectedFile() : " + chooser.getSelectedFile());

				   
			    } else {
			      System.out.println("No Selection ");
			    }
			
			   
	 		
		}
		            

			    

		});
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setBackground(Color.WHITE);
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOutput.setBounds(409, 10, 200, 50);
		frame.getContentPane().add(lblOutput);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 217, 148, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Select Classifier");
		comboBox.addItem("SVM");
		comboBox.addItem("J48");
		comboBox.addItem("LOGISTIC");
		comboBox.addItem("RANDOM FOREST");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JComboBox comboBox = (JComboBox) event.getSource();
		        Object selected = comboBox.getSelectedItem();
		        if (selected.toString().equals("LOGISTIC"))
		        {
		        	String output = "\n\n";
					
					output += " you have choosen logistic";
					textPane_1.setText(output);
		        	System.out.println("you have choosen j48");
		        }
							
		        
		        
		        
						else if (selected.toString().equals("RANDOM FOREST")) 
						{
							String output = "\n\n";
							
							output += " you have choosen random forest";
							textPane_1.setText(output);
							System.out.println("you have choosen j48");
						}
						
						
						
						
						else if (selected.toString().equals("J48")) {
							System.out.println("you have choosen j48");
							String output = "\n\n";
							
							output += " you have choosen j48";
							textPane_1.setText(output);
						}
							
						
							
	
						else if (selected.toString().equals("SVM")){
							System.out.println("you have choosen j48");
							String output = "\n\n";
							
							output += " you have choosen svm";
							textPane_1.setText(output);
						}
		
			}
			});
	
		
		JLabel lblChooseClassifier = new JLabel("Choose Classifier");
		lblChooseClassifier.setForeground(Color.WHITE);
		lblChooseClassifier.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChooseClassifier.setBounds(36, 174, 200, 50);
		frame.getContentPane().add(lblChooseClassifier);
		
		
				
		}
}

	

