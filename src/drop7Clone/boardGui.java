package drop7Clone;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;

public class boardGui extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					try
						{
							boardGui frame = new boardGui();
							frame.setVisible(true);
						} catch (Exception e)
						{
							e.printStackTrace();
						}
				}
			});
	}

	/**
	 * Create the frame.
	 */
	public boardGui()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel(); // TODO rename all these variables so I know where they are on the form.
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(7, 7, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setForeground(new Color(128, 0, 0));
		contentPane.add(panel_1, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Score Board : 0000000 ");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(250, 235, 215));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 18));
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("  Level : 001  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setFont(new Font("Monaco", Font.BOLD, 18));
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(lblNewLabel_1);

		JLabel lblBalls = new JLabel("  Balls : 14  ");
		lblBalls.setForeground(new Color(0, 0, 128));
		lblBalls.setFont(new Font("Monaco", Font.BOLD, 18));
		lblBalls.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(lblBalls);
		JButton[][] btnArray = new JButton[7][7];

		Compare comp = new Compare();
		for (int x = 6; x >= 0; x--)
			{
				for (int y = 6; y >= 0; y--)
					{
						btnArray[x][y] = new JButton();
						btnArray[x][y].setBorder(new LineBorder(new Color(0, 0, 0), 2));
						btnArray[x][y].setBackground(Color.DARK_GRAY);
						btnArray[x][y].setForeground(Color.RED);
						btnArray[x][y].setOpaque(true);
						btnArray[x][y].setText(String.format("%d", x));
						panel.add(btnArray[x][y]);
						

					}
			}
	}
}
