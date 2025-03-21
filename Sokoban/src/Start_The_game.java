import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

public class Start_The_game extends JFrame {

	private JPanel contentPane;
	private JTextField playername;

	private JFrame SG = new JFrame("Start_The_game");
	
	private JButton Level1 = new JButton("Level 1");	
	
	private JButton Level2 = new JButton("Level 2");
	
	private JButton Level3 = new JButton("Level 3");
	
	private JButton Level4 = new JButton("Level 4");
	
	private JButton Level5 = new JButton("Level 5");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start_The_game frame = new Start_The_game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start_The_game() {
		setTitle("Sokoban");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		Level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String PN = playername.getText();
				SG.dispose();
		        new Sokoban(1,PN);
			}
		});

		Level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String PN = playername.getText();
				SG.dispose();
		        new Sokoban(2,PN);
			}
		});
		
		Level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String PN = playername.getText();
				SG.dispose();
		        new Sokoban(3,PN);
			}
		});

		Level4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String PN = playername.getText();
				SG.dispose();
		        new Sokoban(4,PN);
			}
		});
		

		Level5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String PN = playername.getText();
				SG.dispose();
		        new Sokoban(5,PN);
			}
		});
		
		JLabel ImageLabel = new JLabel("");
		ImageLabel.setIcon(new ImageIcon("C:\\Users\\Reaper\\eclipse-workspace\\Sokoban\\img\\Title.png"));
		
		JLabel NameLabel = new JLabel("Player Name :");
		NameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		playername = new JTextField();
		playername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		playername.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addComponent(ImageLabel, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(83, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(76)
							.addComponent(NameLabel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(Level1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(playername)
							.addGap(144))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Level2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addComponent(Level3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(63))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(119)
					.addComponent(Level4, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(69)
					.addComponent(Level5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(139, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(ImageLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(playername, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(NameLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(Level1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(Level2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(Level3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Level4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(Level5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
