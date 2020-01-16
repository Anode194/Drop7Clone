package drop7Clone;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class YouLose extends JFrame {
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
		lblNewLabel.setForeground(vio.getColor(12));
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 40));
		panel.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Exit Game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(btnNewButton_1);

		JButton btnNewButton = new JButton("New Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomeGui.DISPOSE_ON_CLOSE();
				welcomeGui pho = new welcomeGui();
				pho.setVisible(true);
			}
		});
		panel.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Top High Score:  David Mendez: 0550123");
		lblNewLabel_1.setForeground(new Color(255, 250, 205));
		lblNewLabel_1.setFont(new Font("Monaco", Font.BOLD, 14));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Top High Score:  Joe Bidah: 0550123");
		lblNewLabel_2.setForeground(new Color(255, 250, 205));
		lblNewLabel_2.setFont(new Font("Monaco", Font.BOLD, 14));
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Top High Score:  Joe MOMA: 0550123");
		lblNewLabel_3.setForeground(new Color(255, 250, 205));
		lblNewLabel_3.setFont(new Font("Monaco", Font.BOLD, 14));
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Top High Score:  AmberAlert: 0550123");
		lblNewLabel_4.setForeground(new Color(255, 250, 205));
		lblNewLabel_4.setFont(new Font("Monaco", Font.BOLD, 14));
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Top High Score:  LoganToTaco: 0550123");
		lblNewLabel_5.setForeground(new Color(255, 250, 205));
		lblNewLabel_5.setFont(new Font("Monaco", Font.BOLD, 14));
		panel.add(lblNewLabel_5);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 1, 0, 0));
	}

	protected static void EXIT_ON_CLOSE() {
		// TODO Auto-generated method stub
	}
}
