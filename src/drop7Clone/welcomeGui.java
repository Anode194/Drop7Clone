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

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					welcomeGui frame = new welcomeGui();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public welcomeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Welcome to DropClone");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBorder(new EmptyBorder(13, 13, 13, 13));
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel rightNamep = new JPanel();
		rightNamep.setBackground(Color.DARK_GRAY);
		contentPane.add(rightNamep, BorderLayout.CENTER);
		rightNamep.setLayout(new GridLayout(2, 3, 0, 70));

		JLabel lblNewLabel_2 = new JLabel("\t\t Name:");
		lblNewLabel_2.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		rightNamep.add(lblNewLabel_2);

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
		rightNamep.add(firstNameTXT);
		firstNameTXT.setColumns(10);

		JLabel rightsidnamel = new JLabel("");
		rightNamep.add(rightsidnamel);

		JLabel lblFileName = new JLabel("\t\t   File Name:");
		lblFileName.setForeground(Color.WHITE);
		rightNamep.add(lblFileName);

		fileNameTXT = new JTextField();
		fileNameTXT.setHorizontalAlignment(SwingConstants.CENTER);
		fileNameTXT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileName = fileNameTXT.getText();
				
			}
		});
		fileNameTXT.setBorder(new LineBorder(new Color(0, 0, 0)));
		fileNameTXT.setFont(new Font("Monaco", Font.BOLD, 20));
		fileNameTXT.setForeground(new Color(128, 0, 0));
		fileNameTXT.setBackground(Color.GRAY);
		rightNamep.add(fileNameTXT);
		fileNameTXT.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JButton startBtn = new JButton("Start Game ");

		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomeGui.DISPOSE_ON_CLOSE();
				BoardGui trip = new BoardGui();
				trip.setVisible(true);
				
				if (startBtn != null) {
					
					
				}
			}
		});
		JLabel lblNewLabel_7 = new JLabel("");
		panel_1.add(lblNewLabel_7);

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
		highScore1.setHorizontalAlignment(SwingConstants.CENTER);
		highScore1.setForeground(new Color(255, 250, 205));
		highScore1.setFont(new Font("Monaco", Font.BOLD, 10));
		panel_1.add(highScore1);

		JLabel highScore2 = new JLabel(" Score: Joebida:0434876");
		highScore2.setHorizontalAlignment(SwingConstants.CENTER);
		highScore2.setForeground(new Color(255, 250, 205));
		highScore2.setFont(new Font("Monaco", Font.BOLD, 10));
		panel_1.add(highScore2);
		
//		JLabel highScore3 = new JLabel(" Score: AmberToTaco:0234696");
//		highScore3.setHorizontalAlignment(SwingConstants.CENTER);
//		highScore3.setForeground(new Color(255, 250, 205));
//		highScore3.setFont(new Font("Monaco", Font.BOLD, 10));
//		panel_1.add(highScore3);

		JLabel lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.EAST);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_2, BorderLayout.WEST);
	}

	protected static void DISPOSE_ON_CLOSE() {
	}
}
