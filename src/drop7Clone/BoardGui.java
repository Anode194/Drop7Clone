package drop7Clone;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;


public class BoardGui extends JFrame
{
	private JPanel contentPane;
	private BallButton[][] btnArray;

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
						welcomeGui frame = new welcomeGui();
						frame.setVisible(true);
					} catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			});
	}

	public BoardGui(inputOutput io)
	{
		
		Compare comp = new Compare();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 950);
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

		JLabel lblNewLabel = new JLabel(String.format("%8d", comp.getScore()));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(250, 235, 215));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 18));
		panel_1.add(lblNewLabel);

		JLabel levelLabel = new JLabel("Level: "+comp.getLevel());
		levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		levelLabel.setForeground(new Color(0, 0, 139));
		levelLabel.setFont(new Font("Monaco", Font.BOLD, 18));
		levelLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(levelLabel);

		JLabel lblBalls = new JLabel("Balls: "+comp.getBallsLeft());
		lblBalls.setForeground(new Color(0, 0, 128));
		lblBalls.setFont(new Font("Monaco", Font.BOLD, 18));
		lblBalls.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(lblBalls);


		JLabel nextNumLbl = new JLabel(String.format("Next Ball: %d",comp.getNextBallNum()));
		nextNumLbl.setForeground(new Color(0, 0, 128));
		nextNumLbl.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		nextNumLbl.setFont(new Font("Monaco", Font.BOLD, 18));
		panel_1.add(nextNumLbl);
		btnArray = new BallButton[7][7];

		for (int x = 0; x < 7; x++)
		{
			for (int y = 0; y < 7; y++)
			{
				btnArray[x][y] = new BallButton((x), (y));
				btnArray[x][y].setBorder(new LineBorder(new Color(0, 0, 0), 2));
				btnArray[x][y].setBackground(Color.DARK_GRAY);
				btnArray[x][y].setFont(new Font("Monaco",Font.BOLD,28));
				btnArray[x][y].setForeground(Color.white);
				btnArray[x][y].setOpaque(true);
				panel.add(btnArray[x][y]);
				btnArray[x][y].addActionListener(new ActionListener()
					{
						@Override
						public void actionPerformed(ActionEvent e)
						{
							int yCoord = 0;
							int xCoord = 0;
							for (int xCo = 0; xCo < 7;xCo++)
							{
								for (int yCo = 0; yCo < 7; yCo++)
								{
									if (btnArray[xCo][yCo].equals(e.getSource()))
									{
										xCoord = xCo;
										yCoord = yCo;
									}
								}
							}
							if(comp.isNull(xCoord, yCoord)) 
							{
								btnArray[xCoord][yCoord].setText(""+comp.getNextBallNum());
								btnArray[xCoord][yCoord].setBackground(comp.getNextBallCol());
								comp.setNextBallPos(xCoord, yCoord);
								if(comp.isLost)
								{
									YouLose yl = new YouLose(vio);
									yl.setVisible(true);
								}
								
								redrawScreen(comp);
								comp.popBalls();
								redrawScreen(comp);
								nextNumLbl.setText(String.format("next ball number: %d", comp.getNextBallNum()));
								levelLabel.setText(String.format("Level: %d",comp.getLevel()));
								lblNewLabel.setText(String.format("Score: %04d", comp.getScore()));
								lblBalls.setText(String.format("You Have %d Balls Left.", comp.getBallsLeft()));
								redrawScreen(comp);
							}
						}
					});
			}
		}
		redrawScreen(comp);

	}

	private void redrawScreen(Compare comp)
	{
		for(int q =0; q <7; q++)				//redraws the text and background of the gui after the balls have been popped.
		{
			for(int z =0; z < 7; z++)
			{
				if(comp.isNull(q, z))
				{
					btnArray[q][z].setText(" ");
					btnArray[q][z].setBackground(Color.DARK_GRAY);
				}else
				{
					btnArray[q][z].setText(""+comp.getBallnum(q, z));
					btnArray[q][z].setBackground(comp.getBallColor(q, z));
				}
				
			}
		}
	}
}
