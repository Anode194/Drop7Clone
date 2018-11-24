package drop7Clone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

import canvas.Home;
import canvas.Programming;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcomeGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnter;
	private JTextField textField;
	private JTextField textField_1;

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

		JLabel lblNewLabel = new JLabel("Welcome to DropClone");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBorder(new EmptyBorder(13, 13, 13, 13));
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 40, 40));

		JLabel lblNewLabel_2 = new JLabel("\t\tFirst Name:");
		lblNewLabel_2.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		panel.add(lblNewLabel_2);

		txtEnter = new JTextField();
		txtEnter.setBackground(Color.GRAY);
		txtEnter.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtEnter.setFont(new Font("Monaco", Font.BOLD, 20));
		txtEnter.setForeground(new Color(128, 0, 0));
		panel.add(txtEnter);
		txtEnter.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("");
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_3 = new JLabel("\t\tLast Name: ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Monaco", Font.BOLD, 13));
		panel.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField.setFont(new Font("Monaco", Font.BOLD, 20));
		textField.setForeground(new Color(128, 0, 0));
		textField.setBackground(Color.GRAY);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("");
		panel.add(lblNewLabel_6);

		JLabel lblFileName = new JLabel("\t\t   File Name:");
		lblFileName.setForeground(Color.WHITE);
		panel.add(lblFileName);

		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField_1.setFont(new Font("Monaco", Font.BOLD, 20));
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setBackground(Color.GRAY);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JButton startBtn = new JButton("Start Game ");

		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (startBtn.isSelected())
					welcomeGui.DISPOSE_ON_CLOSE();
				boardGui trip = new boardGui();
				trip.setVisible(true);
			}
		});
		JLabel lblNewLabel_7 = new JLabel("");
		panel_1.add(lblNewLabel_7);
		startBtn.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		startBtn.setBorderPainted(false);
		startBtn.setOpaque(true);
		startBtn.setBackground(new Color(0, 0, 0));
		startBtn.setForeground(new Color(128, 0, 0));
		startBtn.setFont(new Font("Monaco", Font.BOLD, 20));
		panel_1.add(startBtn);

		JLabel lblNewLabel_4 = new JLabel("Top High Score:0550123");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 250, 205));
		lblNewLabel_4.setFont(new Font("Monaco", Font.BOLD, 13));
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.EAST);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_2, BorderLayout.WEST);
	}

	protected static void DISPOSE_ON_CLOSE() {
		// TODO Auto-generated method stub

	}
}
