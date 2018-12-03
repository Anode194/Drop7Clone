package drop7Clone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.awt.event.ActionEvent;

public class welcomeGui extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTXT;
	private JTextField fileNameTXT;
	private JTextArea charLabel;

	private String firstName;
	private String bigFeild;
	private String fileName;
	private JLabel bigTXTField;
	private inputOutput vio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomeGui frame = new welcomeGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public welcomeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel welcomelabel = new JLabel("Welcome to DropClone");
		welcomelabel.setOpaque(true);
		welcomelabel.setBackground(Color.DARK_GRAY);
		welcomelabel.setBorder(new EmptyBorder(13, 13, 13, 13));
		welcomelabel.setFont(new Font("Monaco", Font.BOLD, 20));
		welcomelabel.setForeground(Color.WHITE);
		welcomelabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(welcomelabel, BorderLayout.NORTH);

		JPanel midsection = new JPanel();
		midsection.setBackground(Color.DARK_GRAY);
		contentPane.add(midsection, BorderLayout.CENTER);
		midsection.setLayout(new GridLayout(2, 3, 0, 70));

		JLabel NameLabel = new JLabel("\t\t Name:");
		NameLabel.setFont(new Font("Monaco", Font.PLAIN, 13));
		NameLabel.setForeground(Color.WHITE);
		midsection.add(NameLabel);

		firstNameTXT = new JTextField();
		firstNameTXT.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameTXT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstName = firstNameTXT.getText();
				bigTXTField.setText(firstName);
			}
		});
		firstNameTXT.setBackground(Color.GRAY);
		firstNameTXT.setBorder(new LineBorder(new Color(0, 0, 0)));
		firstNameTXT.setFont(new Font("Monaco", Font.BOLD, 20));
		firstNameTXT.setForeground(new Color(128, 0, 0));
		midsection.add(firstNameTXT);
		firstNameTXT.setColumns(10);

		JLabel rightsidnamel = new JLabel("");
		midsection.add(rightsidnamel);

		JLabel lblFileName = new JLabel("\t\t   File Name:");
		lblFileName.setForeground(Color.WHITE);
		midsection.add(lblFileName);

		fileNameTXT = new JTextField();
		fileNameTXT.setHorizontalAlignment(SwingConstants.CENTER);

		fileNameTXT.setBorder(new LineBorder(new Color(0, 0, 0)));
		fileNameTXT.setFont(new Font("Monaco", Font.BOLD, 20));
		fileNameTXT.setForeground(new Color(128, 0, 0));
		fileNameTXT.setBackground(Color.GRAY);
		midsection.add(fileNameTXT);
		fileNameTXT.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JButton startBtn = new JButton("Start Game ");

		JLabel spacer = new JLabel("");
		spacer.setBackground(Color.DARK_GRAY);
		spacer.setOpaque(true);
		panel_1.add(spacer);

		bigTXTField = new JLabel();
		bigTXTField.setOpaque(true);
		bigTXTField.setHorizontalAlignment(SwingConstants.CENTER);
		bigTXTField.setForeground(new Color(128, 0, 0));
		bigTXTField.setBorder(new LineBorder(new Color(0, 0, 0)));
		bigTXTField.setFont(new Font("Monaco", Font.BOLD, 20));
		bigTXTField.setBackground(Color.GRAY);
		panel_1.add(bigTXTField);
		startBtn.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		startBtn.setBorderPainted(false);
		startBtn.setOpaque(true);
		startBtn.setBackground(new Color(0, 0, 0));
		startBtn.setForeground(new Color(128, 0, 0));
		startBtn.setFont(new Font("Monaco", Font.BOLD, 20));
		panel_1.add(startBtn);

		JLabel highScore1 = new JLabel("Top High Score: David Mendez:0550123");
		highScore1.setOpaque(true);
		highScore1.setBackground(Color.DARK_GRAY);
		highScore1.setHorizontalAlignment(SwingConstants.CENTER);
		highScore1.setForeground(new Color(255, 250, 205));
		highScore1.setFont(new Font("Monaco", Font.BOLD, 10));
		panel_1.add(highScore1);

		JLabel highScore2 = new JLabel(" Score: Joebida:0434876");
		highScore2.setBackground(Color.DARK_GRAY);
		highScore2.setOpaque(true);
		highScore2.setHorizontalAlignment(SwingConstants.CENTER);
		highScore2.setForeground(new Color(255, 250, 205));
		highScore2.setFont(new Font("Monaco", Font.BOLD, 10));
		panel_1.add(highScore2);

		JLabel lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.EAST);
		fileNameTXT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random Gap = new Random();
				fileName = fileNameTXT.getText();
				try {

					if (firstName != null) {
						vio = new inputOutput(firstName);
						int Trip = Gap.nextInt(4);
						switch (Trip) {
						case 0:
							welcomelabel.setBackground(vio.getColor(6));
							midsection.setBackground(vio.getColor(6));
							NameLabel.setBackground(vio.getColor(6));
							lblFileName.setBackground(vio.getColor(6));
							spacer.setBackground(vio.getColor(6));
							firstNameTXT.setBackground(vio.getColor(7));
							fileNameTXT.setBackground(vio.getColor(7));
							bigTXTField.setBackground(vio.getColor(7));
							startBtn.setBackground(Color.white);
							highScore1.setBackground(vio.getColor(6));
							highScore2.setBackground(vio.getColor(6));
							break;

						case 1:
							welcomelabel.setBackground(vio.getColor(12));
							midsection.setBackground(vio.getColor(12));
							NameLabel.setBackground(vio.getColor(12));
							spacer.setBackground(vio.getColor(12));
							lblFileName.setBackground(vio.getColor(12));
							firstNameTXT.setBackground(vio.getColor(11));
							fileNameTXT.setBackground(vio.getColor(11));
							bigTXTField.setBackground(vio.getColor(11));
							startBtn.setBackground(vio.getColor(12));
							highScore1.setBackground(vio.getColor(12));
							highScore2.setBackground(vio.getColor(12));
							NameLabel.setBackground(vio.getColor(12));
							lblFileName.setBackground(vio.getColor(12));
							break;

						case 2:
							welcomelabel.setBackground(vio.getColor(5));
							midsection.setBackground(vio.getColor(5));
							NameLabel.setBackground(vio.getColor(5));
							lblFileName.setBackground(vio.getColor(5));
							spacer.setBackground(vio.getColor(5));
							firstNameTXT.setBackground(vio.getColor(2));
							fileNameTXT.setBackground(vio.getColor(2));
							bigTXTField.setBackground(vio.getColor(2));
							startBtn.setBackground(vio.getColor(6));
							highScore1.setBackground(vio.getColor(5));
							highScore2.setBackground(vio.getColor(5));
							NameLabel.setBackground(vio.getColor(5));
							lblFileName.setBackground(vio.getColor(5));
							break;

						case 3:
							welcomelabel.setBackground(vio.getColor(8));
							midsection.setBackground(vio.getColor(8));
							NameLabel.setBackground(vio.getColor(8));
							lblFileName.setBackground(vio.getColor(8));
							spacer.setBackground(vio.getColor(8));
							firstNameTXT.setBackground(vio.getColor(7));
							fileNameTXT.setBackground(vio.getColor(7));
							bigTXTField.setBackground(vio.getColor(7));
							startBtn.setBackground(vio.getColor(8));
							highScore1.setBackground(vio.getColor(8));
							highScore2.setBackground(vio.getColor(8));
							NameLabel.setBackground(vio.getColor(8));
							lblFileName.setBackground(vio.getColor(8));
							break;
						}
					} else if (fileName != null && firstName != null) {
						int Trip = Gap.nextInt(4);
						switch (Trip) {
						case 0:
							welcomelabel.setBackground(vio.getColor(6));
							midsection.setBackground(vio.getColor(6));
							NameLabel.setBackground(vio.getColor(6));
							lblFileName.setBackground(vio.getColor(6));
							spacer.setBackground(vio.getColor(6));
							firstNameTXT.setBackground(vio.getColor(7));
							fileNameTXT.setBackground(vio.getColor(7));
							bigTXTField.setBackground(vio.getColor(7));
							startBtn.setBackground(Color.white);
							highScore1.setBackground(vio.getColor(6));
							highScore2.setBackground(vio.getColor(6));
							break;

						case 1:
							welcomelabel.setBackground(vio.getColor(13));
							midsection.setBackground(vio.getColor(13));
							NameLabel.setBackground(vio.getColor(13));
							spacer.setBackground(vio.getColor(13));
							lblFileName.setBackground(vio.getColor(13));
							firstNameTXT.setBackground(vio.getColor(13));
							fileNameTXT.setBackground(vio.getColor(13));
							bigTXTField.setBackground(vio.getColor(13));
							startBtn.setBackground(vio.getColor(13));
							highScore1.setBackground(vio.getColor(13));
							highScore2.setBackground(vio.getColor(13));
							NameLabel.setBackground(vio.getColor(12));
							lblFileName.setBackground(vio.getColor(12));
							break;

						case 2:
							welcomelabel.setBackground(vio.getColor(17));
							midsection.setBackground(vio.getColor(17));
							NameLabel.setBackground(vio.getColor(17));
							lblFileName.setBackground(vio.getColor(17));
							spacer.setBackground(vio.getColor(17));
							firstNameTXT.setBackground(vio.getColor(17));
							fileNameTXT.setBackground(vio.getColor(17));
							bigTXTField.setBackground(vio.getColor(17));
							startBtn.setBackground(vio.getColor(17));
							highScore1.setBackground(vio.getColor(17));
							highScore2.setBackground(vio.getColor(17));
							NameLabel.setBackground(vio.getColor(17));
							lblFileName.setBackground(vio.getColor(17));
							break;
						case 3:
							welcomelabel.setBackground(vio.getColor(6));
							midsection.setBackground(vio.getColor(6));
							NameLabel.setBackground(vio.getColor(6));
							lblFileName.setBackground(vio.getColor(6));
							spacer.setBackground(vio.getColor(6));
							firstNameTXT.setBackground(vio.getColor(7));
							fileNameTXT.setBackground(vio.getColor(7));
							bigTXTField.setBackground(vio.getColor(7));
							startBtn.setBackground(vio.getColor(6));
							highScore1.setBackground(vio.getColor(6));
							highScore2.setBackground(vio.getColor(6));
							NameLabel.setBackground(vio.getColor(6));
							lblFileName.setBackground(vio.getColor(6));
							break;
						}

						vio = new inputOutput(new File(fileName), firstName);
					} else {
						bigTXTField.setName("Make sure you press enter on the name field");
					}

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
					bigTXTField.setName("Oops that file doesn't exist!");
				}

			}
		});
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomeGui.DISPOSE_ON_CLOSE();

				try {

					if (firstName != null && fileName == null) {
						vio = new inputOutput(firstName);
						BoardGui trip = new BoardGui(vio);
						trip.setVisible(true);

					} else if (fileName != null && firstName != null) {

						vio = new inputOutput(new File(fileName), firstName);
						BoardGui trip = new BoardGui(vio);
						trip.setVisible(true);

					} else if (firstName == null) {
						
						bigTXTField.setText("Make sure you press enter on the name field");
						
					} 

				} catch (FileNotFoundException e1) {
					bigTXTField.setText("Oops that file doesn't exist!");
					//e1.printStackTrace();
				}

			}
		});
	}

	protected static void DISPOSE_ON_CLOSE() {

	}
}
