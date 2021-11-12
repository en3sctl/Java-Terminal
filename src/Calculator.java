import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;

class Calculator extends JFrame {

    private JPanel contentPane;
    private JTextField input;
    private JButton Button14;
    private double answer,number;
    int operation;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void addInput(String str) {
        input.setText(input.getText()+str);
    }

    public void calculate() {
        switch (operation){
            case 1:
                answer = number + Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 2:
                answer = number - Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 3:
                answer = number * Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 4:
                answer = number / Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;

        }
    }

    /**
     * Create the frame.
     */
    public Calculator() {
        setFont(new Font("Arial Black", Font.BOLD, 12));
        setBackground(Color.LIGHT_GRAY);
        setType(Type.UTILITY);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 474);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.textHighlight);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel Screen = new JPanel();
        Screen.setBackground(Color.BLACK);
        Screen.setBounds(10, 11, 364, 60);
        contentPane.add(Screen);
        Screen.setLayout(null);

        input = new JTextField();
        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        input.setFont(new Font("Tahoma", Font.PLAIN, 20));
        input.setBounds(10, 11, 344, 38);
        Screen.add(input);
        input.setColumns(10);

        JLabel LBL = new JLabel("");
        LBL.setForeground(Color.WHITE);
        LBL.setFont(new Font("Tahoma", Font.BOLD, 11));
        LBL.setHorizontalAlignment(SwingConstants.RIGHT);
        LBL.setBounds(0, 0, 364, 15);
        Screen.add(LBL);//label

        JPanel Buttons = new JPanel();
        Buttons.setBackground(SystemColor.textHighlight);
        Buttons.setBounds(10, 82, 364, 318);
        contentPane.add(Buttons);
        Buttons.setLayout(new GridLayout(4, 4, 20, 20));

        JButton Button7 = new JButton("7");
        Button7.setForeground(Color.WHITE);
        Button7.setBackground(Color.DARK_GRAY);
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button7.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button7);

        JButton Button8 = new JButton("8");
        Button8.setForeground(Color.WHITE);
        Button8.setBackground(Color.DARK_GRAY);
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button8.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button8);

        JButton Button9 = new JButton("9");
        Button9.setForeground(Color.WHITE);
        Button9.setBackground(Color.DARK_GRAY);
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button9.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button9);

        JButton Button10 = new JButton("*");
        Button10.setForeground(Color.WHITE);
        Button10.setBackground(Color.BLACK);
        Button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 3;
                input.setText("");
                LBL.setText(number+ e.getActionCommand());
            }
        });
        Button10.setFont(new Font("Arial Black", Font.BOLD, 20));
        Buttons.add(Button10);

        JButton Button11 = new JButton("4");
        Button11.setForeground(Color.WHITE);
        Button11.setBackground(Color.DARK_GRAY);
        Button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button11.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button11);

        JButton Button12 = new JButton("5");
        Button12.setForeground(Color.WHITE);
        Button12.setBackground(Color.DARK_GRAY);
        Button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button12.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button12);

        JButton Button13 = new JButton("6");
        Button13.setForeground(Color.WHITE);
        Button13.setBackground(Color.DARK_GRAY);
        Button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button13.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button13);

        Button14 = new JButton("-");
        Button14.setForeground(Color.WHITE);
        Button14.setBackground(Color.BLACK);
        Button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 2;
                input.setText("");
                LBL.setText(number + e.getActionCommand());
            }
        });
        Button14.setFont(new Font("Arial Black", Font.BOLD, 20));
        Buttons.add(Button14);

        JButton Button15 = new JButton("1");
        Button15.setForeground(Color.WHITE);
        Button15.setBackground(Color.DARK_GRAY);
        Button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button15.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button15);

        JButton Button16 = new JButton("2");
        Button16.setForeground(Color.WHITE);
        Button16.setBackground(Color.DARK_GRAY);
        Button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button16.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button16);

        JButton Button17 = new JButton("3");
        Button17.setForeground(Color.WHITE);
        Button17.setBackground(Color.DARK_GRAY);
        Button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button17.setFont(new Font("Tahoma", Font.BOLD, 23));
        Buttons.add(Button17);

        JButton Button18 = new JButton("+");
        Button18.setForeground(Color.WHITE);
        Button18.setBackground(Color.BLACK);
        Button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 1;
                input.setText("");
                LBL.setText(number+ e.getActionCommand());

            }
        });
        Button18.setFont(new Font("Arial Black", Font.BOLD, 20));
        Buttons.add(Button18);

        JButton Button19 = new JButton("0");
        Button19.setForeground(Color.WHITE);
        Button19.setBackground(Color.DARK_GRAY);
        Button19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        Button19.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Buttons.add(Button19);

        JButton Button20 = new JButton("=");
        Button20.setForeground(Color.WHITE);
        Button20.setBackground(Color.BLACK);
        Button20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
                LBL.setText("");
            }
        });
        Button20.setFont(new Font("Arial Black", Font.BOLD, 20));
        Buttons.add(Button20);

        JButton Button21 = new JButton("C");
        Button21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText("");
            }
        });
        Button21.setBackground(Color.BLACK);
        Button21.setForeground(Color.WHITE);
        Button21.setFont(new Font("Arial Black", Font.BOLD, 20));
        Buttons.add(Button21);

        JButton Button22 = new JButton("%");
        Button22.setForeground(Color.WHITE);
        Button22.setBackground(Color.BLACK);
        Button22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 4;
                input.setText("");
                LBL.setText(number+ e.getActionCommand());
            }
        });
        Button22.setFont(new Font("Arial Black", Font.BOLD, 20));
        Buttons.add(Button22);
    }
}


