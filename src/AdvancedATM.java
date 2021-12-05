package atm_Systems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class atm {

	private JFrame frame;
	private JTextField lblDisplay;
	private JTextField jtxtInterestRate;
	private JTextField jtxtNumberOfYears;
	private JTextField jtxtAmountOfLoan;
	private JTextField jtxtMonthlyPayment;
	private JTextField jtxtTotalPayment;
	
	private JButton buttonExit;
	private JButton buttonReset;
	private JButton buttonLoan;
	private JButton buttonReceipt;
	
	private JButton jbtnLoan,jbtnBalance,jbtnWithdrawal,jbtnDeposit;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
	private JTextField jtxtEnter;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atm window = new atm();
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
	public atm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 135, 134);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtnWithdrawal = new JButton("");
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/lArrow.png")));
		jbtnWithdrawal.setBounds(10, 71, 115, 52);
		panel.add(jbtnWithdrawal);
		
		JButton jbtnBalance = new JButton("");
		jbtnBalance.setEnabled(false);
		jbtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnBalance.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/lArrow.png")));
		jbtnBalance.setBounds(10, 11, 115, 49);
		panel.add(jbtnBalance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(119, 136, 153));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(166, 11, 260, 134);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setFont(new Font("Arial", Font.BOLD, 14));
		lblBalance.setBounds(10, 11, 82, 42);
		panel_1.add(lblBalance);
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoan.setFont(new Font("Arial", Font.BOLD, 14));
		lblLoan.setBounds(168, 12, 82, 41);
		panel_1.add(lblLoan);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeposit.setFont(new Font("Arial", Font.BOLD, 14));
		lblDeposit.setBounds(168, 82, 82, 41);
		panel_1.add(lblDeposit);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setFont(new Font("Arial", Font.BOLD, 14));
		lblWithdrawal.setBounds(10, 82, 82, 41);
		panel_1.add(lblWithdrawal);
		
		lblDisplay = new JTextField();
		lblDisplay.setBackground(new Color(178, 34, 34));
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDisplay.setBounds(10, 56, 240, 27);
		panel_1.add(lblDisplay);
		lblDisplay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(436, 11, 135, 134);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnLoan = new JButton("");
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonExit.setEnabled(true);
				buttonReset.setEnabled(true);
				buttonLoan.setEnabled(true);
				buttonReceipt.setEnabled(true);
				
			}
		});
		jbtnLoan.setEnabled(false);
		jbtnLoan.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/rArrow.png")));
		jbtnLoan.setBounds(10, 11, 115, 49);
		panel_2.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("");
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/rArrow.png")));
		jbtnDeposit.setBounds(10, 71, 115, 52);
		panel_2.add(jbtnDeposit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 167, 556, 390);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton button1 = new JButton("");
		button1.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/1.jpg")));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"1";
				lblDisplay.setText(enterNumber);
			}
		});
		button1.setBounds(25, 11, 101, 81);
		panel_3.add(button1);
		
		JButton button2 = new JButton("");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"2";
				lblDisplay.setText(enterNumber);
			}
		});
		button2.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/2.jpg")));
		button2.setBounds(145, 11, 101, 81);
		panel_3.add(button2);
		
		JButton button3 = new JButton("");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"3";
				lblDisplay.setText(enterNumber);
			}
		});
		button3.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/3.jpg")));
		button3.setBounds(269, 11, 101, 81);
		panel_3.add(button3);
		
		JButton buttonCancel = new JButton("");
		buttonCancel.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/cancel.jpg")));
		buttonCancel.setBounds(389, 11, 122, 81);
		panel_3.add(buttonCancel);
		
		JButton button4 = new JButton("");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"4";
				lblDisplay.setText(enterNumber);
			}
		});
		button4.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/4.jpg")));
		button4.setBounds(25, 103, 101, 81);
		panel_3.add(button4);
		
		JButton button5 = new JButton("");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"5";
				lblDisplay.setText(enterNumber);
			}
		});
		button5.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/5.jpg")));
		button5.setBounds(145, 103, 101, 81);
		panel_3.add(button5);
		
		JButton button6 = new JButton("");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"6";
				lblDisplay.setText(enterNumber);
			}
		});
		button6.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/6.jpg")));
		button6.setBounds(269, 103, 101, 81);
		panel_3.add(button6);
		
		JButton buttonClear = new JButton("");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblDisplay.setText("");
			}
		});
		buttonClear.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/clear.jpg")));
		buttonClear.setBounds(389, 103, 122, 81);
		panel_3.add(buttonClear);
		
		JButton buttonEmpty = new JButton("");
		buttonEmpty.setBounds(25, 294, 101, 81);
		panel_3.add(buttonEmpty);
		
		JButton button0 = new JButton("");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"0";
				lblDisplay.setText(enterNumber);
			}
		});
		button0.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/0.jpg")));
		button0.setBounds(145, 294, 101, 81);
		panel_3.add(button0);
		
		JButton buttonEmpty2 = new JButton("");
		buttonEmpty2.setBounds(269, 294, 101, 81);
		panel_3.add(buttonEmpty2);
		
		JButton buttonEmpty3 = new JButton("");
		buttonEmpty3.setBounds(389, 294, 122, 81);
		panel_3.add(buttonEmpty3);
		
		JButton button7 = new JButton("");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"7";
				lblDisplay.setText(enterNumber);
			}
		});
		button7.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/7.jpg")));
		button7.setBounds(25, 195, 101, 81);
		panel_3.add(button7);
		
		JButton button8 = new JButton("");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"8";
				lblDisplay.setText(enterNumber);
			}
		});
		button8.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/8.jpg")));
		button8.setBounds(145, 195, 101, 81);
		panel_3.add(button8);
		
		JButton button9 = new JButton("");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = lblDisplay.getText()+"9";
				lblDisplay.setText(enterNumber);
			}
		});
		button9.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/9.jpg")));
		button9.setBounds(269, 195, 101, 81);
		panel_3.add(button9);
		
		JButton buttonEnter = new JButton("");
		buttonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin1 = Integer.parseInt(lblDisplay.getText());
				int pin2 = Integer.parseInt(lblDisplay.getText());
				int pin3 = Integer.parseInt(lblDisplay.getText());
				int pin4 = Integer.parseInt(lblDisplay.getText());
				
				if(pin1 == 1234) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					lblLoan.setVisible(true);
					lblBalance.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
				}
				
				else if(pin2 == 2345) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					lblLoan.setVisible(true);
					lblBalance.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
				}
				
				else if(pin3 == 3456) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					lblLoan.setVisible(true);
					lblBalance.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
				}
				
				else if(pin4 == 4567) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					lblLoan.setVisible(true);
					lblBalance.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
				}
				else
				{
					lblDisplay.setText("Invalid Pin");
				}
			}
		});
		buttonEnter.setIcon(new ImageIcon(atm.class.getResource("/atm_Systems/enter.jpg")));
		buttonEnter.setBounds(389, 195, 122, 81);
		panel_3.add(buttonEnter);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(581, 11, 779, 546);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel jlblInterestRate = new JLabel("Interest Rate");
		jlblInterestRate.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblInterestRate.setBounds(10, 37, 165, 46);
		panel_4.add(jlblInterestRate);
		
		jtxtInterestRate = new JTextField();
		jtxtInterestRate.setBounds(255, 43, 135, 46);
		panel_4.add(jtxtInterestRate);
		jtxtInterestRate.setColumns(10);
		
		JLabel jlblNumberOfYears = new JLabel("Number Of Years");
		jlblNumberOfYears.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblNumberOfYears.setBounds(10, 123, 235, 46);
		panel_4.add(jlblNumberOfYears);
		
		jtxtNumberOfYears = new JTextField();
		jtxtNumberOfYears.setColumns(10);
		jtxtNumberOfYears.setBounds(255, 123, 135, 46);
		panel_4.add(jtxtNumberOfYears);
		
		JLabel jlblAmountOfLoan = new JLabel("Amount Of Loan");
		jlblAmountOfLoan.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblAmountOfLoan.setBounds(10, 208, 235, 46);
		panel_4.add(jlblAmountOfLoan);
		
		jtxtAmountOfLoan = new JTextField();
		jtxtAmountOfLoan.setColumns(10);
		jtxtAmountOfLoan.setBounds(255, 208, 135, 46);
		panel_4.add(jtxtAmountOfLoan);
		
		JLabel jlblMonthlyPayment = new JLabel("Monthly Payment");
		jlblMonthlyPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblMonthlyPayment.setBounds(10, 290, 235, 46);
		panel_4.add(jlblMonthlyPayment);
		
		jtxtMonthlyPayment = new JTextField();
		jtxtMonthlyPayment.setColumns(10);
		jtxtMonthlyPayment.setBounds(255, 290, 135, 46);
		panel_4.add(jtxtMonthlyPayment);
		
		JLabel jlblTotalPayment = new JLabel("Total Payment");
		jlblTotalPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblTotalPayment.setBounds(10, 376, 235, 46);
		panel_4.add(jlblTotalPayment);
		
		jtxtTotalPayment = new JTextField();
		jtxtTotalPayment.setColumns(10);
		jtxtTotalPayment.setBounds(255, 376, 135, 46);
		panel_4.add(jtxtTotalPayment);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(400, 45, 369, 377);
		panel_4.add(jtxtReceipt);
		
		JButton buttonLoan = new JButton("Loan");
		buttonLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double annualInterestRate = Double.parseDouble(jtxtEnter.getText());
				double monthlyInterestRate = annualInterestRate / 1200;
				int numberOfYears = Integer.parseInt(jtxtNumberOfYears.getText());
				double loanAmount = Double.parseDouble(jtxtAmountOfLoan.getText());
				//------------------------------------------------------------------------
				double monthlyPayment = loanAmount * monthlyInterestRate/(1-1/Math.pow(1+ 
						monthlyInterestRate,
						numberOfYears * 12));
				String iMonthlyPayment;
				iMonthlyPayment = Double.toString(monthlyPayment);
				iMonthlyPayment = String.format("$%.2f" ,monthlyPayment);
				jlblMonthlyPayment.setText(iMonthlyPayment);
				//-------------------------------------------------------------------------
				double totalPayment = monthlyPayment * numberOfYears * 12;
				String iTotalPayment;
				iTotalPayment = String.format("$%.2f",totalPayment);
				jlblTotalPayment.setText(iTotalPayment);
				
				
			}
		});
		buttonLoan.setFont(new Font("Tahoma", Font.BOLD, 24));
		buttonLoan.setBounds(27, 454, 172, 81);
		panel_4.add(buttonLoan);
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtEnter.setText(null);
				jtxtNumberOfYears.setText(null);
				jtxtAmountOfLoan.setText(null);
				jtxtMonthlyPayment.setText(null);
				jtxtTotalPayment.setText(null);
				jtxtReceipt.setText(null);
			}
		});
		buttonReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		buttonReset.setBounds(391, 454, 172, 81);
		panel_4.add(buttonReset);
		
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm If You Want To Exit",
						"Millenium Bank",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		buttonExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		buttonExit.setBounds(573, 454, 172, 81);
		panel_4.add(buttonExit);
		
		JButton buttonReceipt = new JButton("Receipt");
		buttonReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String annualInterestRate = String.format(jtxtEnter.getText());
				String numberOfYears = String.format(jtxtNumberOfYears.getText());
				String loanAmount = String.format(jtxtAmountOfLoan.getText());
				
				String monthlyPayment = String.format(jtxtMonthlyPayment.getText());
				String totalPayment = String.format(jtxtTotalPayment.getText());
				//================================================================
				int ref = 1325 * (int) (Math.random()*4328);
				
				//================================================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
				tDate.format(timer.getTime());
				
				//==============================================================jtxtReceipt
				jtxtReceipt.append("\tLoan Management Systems\n"+
				"Reference:\t\t\t"+ref+
				"\n===========================================\t "+
				"\nInterest Rate:\t\t\t "+annualInterestRate+
				"\nAmount Of Loan:\t\t\t "+"$"+loanAmount+
				"\nMonthly Payment:\t\t "+monthlyPayment+
				"\nTotal Payment:\t\t\t "+totalPayment+
				"\n============================================\t "+
				"\nDate: "+tDate.format(timer.getTime())+
				"\t\tTime: "+tTime.format(timer.getTime())+
				"n\n\t\tThank You\n");
			}
		});
		buttonReceipt.setFont(new Font("Tahoma", Font.BOLD, 24));
		buttonReceipt.setBounds(209, 454, 169, 81);
		panel_4.add(buttonReceipt);
		
		jtxtEnter = new JTextField();
		jtxtEnter.setColumns(10);
		jtxtEnter.setBounds(255, 43, 135, 46);
		panel_4.add(jtxtEnter);
	}
}
