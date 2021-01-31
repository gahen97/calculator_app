package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField calculation;

	private double first;
	private double second;
	private char operation;
	private boolean result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(10, 53, 416, 72);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		calculation = new JTextField();
		calculation.setBounds(10, 24, 416, 19);
		frame.getContentPane().add(calculation);
		calculation.setColumns(10);
		
		JButton btn_clear = new JButton("Clear");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				calculation.setText("");
				first = 0;
				second = 0;
				operation = 0;
			}
		});
		btn_clear.setBounds(10, 381, 85, 72);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_0.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_0.getText());
			}
		});
		btn_0.setBounds(120, 381, 85, 72);
		frame.getContentPane().add(btn_0);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_1.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_1.getText());
			}
		});
		btn_1.setBounds(10, 299, 85, 72);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_2.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_2.getText());
			}
		});
		btn_2.setBounds(120, 299, 85, 72);
		frame.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_3.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_3.getText());
			}
		});
		btn_3.setBounds(230, 299, 85, 72);
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_4.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_4.getText());
			}
		});
		btn_4.setBounds(10, 217, 85, 72);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_5.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_5.getText());
			}
		});
		btn_5.setBounds(120, 217, 85, 72);
		frame.getContentPane().add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_6.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_6.getText());
			}
		});
		btn_6.setBounds(230, 217, 85, 72);
		frame.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_7.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_7.getText());
			}
		});
		btn_7.setBounds(10, 135, 85, 72);
		frame.getContentPane().add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_8.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_8.getText());
			}
		});
		btn_8.setBounds(120, 135, 85, 72);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_9.getText());
				if (result) {
					textField.setText("");
					result = false;
				}
				textField.setText(textField.getText() + btn_9.getText());
			}
		});
		btn_9.setBounds(230, 135, 85, 72);
		frame.getContentPane().add(btn_9);
		
		JButton btn_decimal = new JButton(".");
		btn_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() != 0)
					calculation.setText(calculation.getText() + btn_decimal.getText());
				textField.setText(textField.getText() + btn_decimal.getText());
			}
		});
		btn_decimal.setBounds(230, 381, 85, 72);
		frame.getContentPane().add(btn_decimal);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() == 0) {
					calculation.setText(textField.getText() + " " + btn_minus.getText() + " ");
					first = Double.parseDouble(textField.getText());
				} else {
					calculation.setText(calculation.getText().substring(0, (calculation.getText().length()-1)) + btn_minus.getText());
				}
				operation = '-';
				textField.setText("");
			}
		});
		btn_minus.setBounds(341, 299, 85, 72);
		frame.getContentPane().add(btn_minus);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() == 0) {
					calculation.setText(textField.getText() + " " + btn_add.getText() + " ");
					first = Double.parseDouble(textField.getText());
				} else {
					calculation.setText(calculation.getText().substring(0, (calculation.getText().length()-1)) + btn_add.getText());
				}
				operation = '+';
				textField.setText("");
			}
		});
		btn_add.setBounds(341, 217, 85, 72);
		frame.getContentPane().add(btn_add);
		
		JButton btn_multiply = new JButton("x");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculation.getText().length() == 0) {
					calculation.setText(textField.getText() + " " + btn_multiply.getText() + " ");
					first = Double.parseDouble(textField.getText());
				} else {
					calculation.setText(calculation.getText().substring(0, (calculation.getText().length()-1)) + btn_multiply.getText());
				}
				operation = 'x';
				textField.setText("");
			}
		});
		btn_multiply.setBounds(341, 135, 85, 72);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_equals = new JButton("=");
		btn_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				switch(operation) {
				case '+':
					textField.setText(String.format("%.2f", first + second));
					break;
				case '-':
					textField.setText(String.format("%.2f", first - second));
					break;
				case 'x':
					textField.setText(String.format("%.2f", first * second));
					break;
				}
				result = true;
				calculation.setText("");
				
			}
		});
		btn_equals.setBounds(341, 381, 85, 72);
		frame.getContentPane().add(btn_equals);
		
	}
}
