

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class addpaper {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void addpaper() {
																											
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addpaper window = new addpaper();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addpaper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClick = new JButton("Click");
		btnClick.setBounds(46, 114, 89, 23);
		frame.getContentPane().add(btnClick);
		
		JButton btnClick_1 = new JButton("Click");
		btnClick_1.setBounds(271, 114, 89, 23);
		frame.getContentPane().add(btnClick_1);
		
		JLabel lblAddPaperFrom = new JLabel("Add Paper From");
		lblAddPaperFrom.setForeground(Color.WHITE);
		lblAddPaperFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddPaperFrom.setBounds(137, 0, 200, 50);
		frame.getContentPane().add(lblAddPaperFrom);
		
		JLabel lblGoogleDrive = new JLabel("Google Drive");
		lblGoogleDrive.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGoogleDrive.setForeground(Color.WHITE);
		lblGoogleDrive.setBounds(46, 61, 200, 50);
		frame.getContentPane().add(lblGoogleDrive);
		
		JLabel lblExternalDrive = new JLabel("External Drive");
		lblExternalDrive.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblExternalDrive.setForeground(Color.WHITE);
		lblExternalDrive.setBounds(271, 61, 133, 50);
		frame.getContentPane().add(lblExternalDrive);
		
		JLabel lblNote = new JLabel("Note: ");
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNote.setBounds(25, 180, 200, 50);
		frame.getContentPane().add(lblNote);
		
		JLabel lblPleaseMakeSure = new JLabel("Please make sure that file size do not exceed more than  100 KB");
		lblPleaseMakeSure.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPleaseMakeSure.setBounds(66, 180, 358, 50);
		frame.getContentPane().add(lblPleaseMakeSure);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
