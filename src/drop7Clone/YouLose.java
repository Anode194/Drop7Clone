package drop7Clone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import canvas.Home;
import canvas.Java1400;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YouLose extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YouLose frame = new YouLose(new inputOutput("hello"));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private inputOutput vio;
	private JPanel contentPane;
	public YouLose(inputOutput vio) {
		this.vio = vio;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(vio.getColor(12));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("     \"YOU LOSE !\"     ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Exit Game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				welcomeGui.DISPOSE_ON_CLOSE();
				//YouLose pho = new YouLose(vio);
				//pho.setVisible(true);
				
				
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		panel.add(btnNewButton);
		
		JLabel highScore1 = new JLabel("Top High Score: David Mendez:0550123");
		highScore1.setOpaque(true);
		highScore1.setBackground(Color.DARK_GRAY);
		highScore1.setHorizontalAlignment(SwingConstants.CENTER);
		highScore1.setForeground(new Color(255, 250, 205));
		highScore1.setFont(new Font("Monaco", Font.BOLD, 10));
		//.add(highScore1);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
	}

}
