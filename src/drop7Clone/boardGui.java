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


public class boardGui extends JFrame
{
	private JPanel Border;
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

	public boardGui(inputOutput vio)
	{
		
		Compare comp = new Compare();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 950);
		Border = new JPanel();
		Border.setBackground(vio.getColor(15));
		Border.setBorder(new EmptyBorder(5, 5, 5, 5));
		Border.setLayout(new BorderLayout(0, 0));
		setContentPane(Border);

		JPanel midSection2 = new JPanel(); // TODO rename all these variables so I know where they are on the form.
		midSection2.setBackground(Color.DARK_GRAY);
		midSection2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Border.add(midSection2, BorderLayout.CENTER);
		midSection2.setLayout(new GridLayout(7, 7, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(vio.getColor(15));
		panel_1.setForeground(vio.getColor(12));
		Border.add(panel_1, BorderLayout.NORTH);

		JLabel Scorelabel = new JLabel(String.format("%8d", comp.getScore()));
		Scorelabel.setOpaque(true);
		Scorelabel.setBackground(vio.getColor(15));
		Scorelabel.setForeground(vio.getColor(12));
		Scorelabel.setFont(new Font("Monaco", Font.BOLD, 18));
		panel_1.add(Scorelabel);

		JLabel levelLabel = new JLabel("Level: "+comp.getLevel());
		levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		levelLabel.setForeground(vio.getColor(12));
		levelLabel.setFont(new Font("Monaco", Font.BOLD, 18));
		levelLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(levelLabel);

		JLabel ballsLabel = new JLabel("Balls left: "+comp.getBallsLeft());
		ballsLabel.setForeground(vio.getColor(12));
		ballsLabel.setFont(new Font("Monaco", Font.BOLD, 18));
		ballsLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(ballsLabel);


		JLabel nextNumLbl = new JLabel(String.format("Next Ball: %d",comp.getNextBallNum()));
		nextNumLbl.setForeground(vio.getColor(12));
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
				midSection2.add(btnArray[x][y]);
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
							
							redrawScreen(comp);

							if(comp.isNull(xCoord, yCoord)) 
							{
								btnArray[xCoord][yCoord].setText(""+comp.getNextBallNum());
								btnArray[xCoord][yCoord].setBackground(comp.getNextBallCol());
								
								comp.setNextBallPos(xCoord, yCoord);
								if(!comp.gameLost())
								{
									for(BallButton[] b : btnArray)
									{
										for(BallButton bb : b)
										{
											bb.setBackground(Color.red);
											bb.setText("you lose!!!!!");
											
											try
											{
												Thread.sleep(9000);
											} catch (InterruptedException e1)
											{
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											YouLose yl = new YouLose(vio);
											yl.setVisible(true);
											System.exit(0);
										}
									}
								}
								
								redrawScreen(comp);
								comp.popBalls();
								redrawScreen(comp);
								nextNumLbl.setText(String.format("next ball number: %d", comp.getNextBallNum()));
								levelLabel.setText(String.format("Level: %d",comp.getLevel()));
								Scorelabel.setText(String.format("Score: %04d", comp.getScore()));
								ballsLabel.setText(String.format("You Have %d Balls Left.", comp.getBallsLeft()));
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
