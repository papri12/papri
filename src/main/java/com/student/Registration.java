package com.student;

// import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registration extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField Father_name;
	private JTextField Mother_name;
	private JTextField DOB;
	private JTextField roll;
	private JTextField gender;
	private JTextField email_id;
	private JTextField department;
	private JTextField phone_number;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 716);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(154, 0, 542, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(63, 124, 70, 13);
		contentPane.add(lblNewLabel_1);
		
		Name = new JTextField();
		Name.setBackground(Color.WHITE);
		Name.setBounds(242, 124, 250, 19);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FATHER'S NAME : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(63, 179, 151, 13);
		contentPane.add(lblNewLabel_2);
		
		Father_name = new JTextField();
		Father_name.setBounds(242, 179, 250, 19);
		contentPane.add(Father_name);
		Father_name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MOTHER'S NAME :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(63, 235, 215, 13);
		contentPane.add(lblNewLabel_3);
		
		Mother_name = new JTextField();
		Mother_name.setBounds(242, 235, 250, 19);
		contentPane.add(Mother_name);
		Mother_name.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DATE OF BIRTH :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(63, 286, 151, 13);
		contentPane.add(lblNewLabel_4);
		
		DOB = new JTextField();
		DOB.setBounds(242, 286, 250, 19);
		contentPane.add(DOB);
		DOB.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ROLL :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(63, 326, 115, 13);
		contentPane.add(lblNewLabel_5);
		
		roll = new JTextField();
	    roll.setBounds(242, 326, 250, 19);
		contentPane.add(roll);
		roll.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("GENDER :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(63, 375, 151, 13);
		contentPane.add(lblNewLabel_6);
		
		gender = new JTextField();
		gender.setBounds(242, 375, 250, 19);
		contentPane.add(gender);
		gender.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("EMAIL ID :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(63, 422, 115, 13);
		contentPane.add(lblNewLabel_7);
		
		email_id= new JTextField();
		email_id.setBounds(242, 422, 250, 19);
		contentPane.add(email_id);
		email_id.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("DEPARTMENT :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(63, 472, 151, 13);
		contentPane.add(lblNewLabel_8);
		
		department = new JTextField();
		department.setBounds(242, 472, 250, 19);
		contentPane.add(department);
		department.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("ADDRESS :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(63, 557, 130, 13);
		contentPane.add(lblNewLabel_9);
		
		phone_number = new JTextField();
		phone_number.setBounds(242, 516, 250, 19);
		contentPane.add(phone_number);
		phone_number.setColumns(10);
		
        final JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name.setText(" ");
				Father_name.setText(" ");
				Mother_name.setText(" ");
				DOB.setText(" ");
				roll.setText(" ");
				gender.setText(" ");
				email_id.setText(" ");
				department.setText(" ");
				phone_number.setText(" ");
				address.setText(" ");
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(520, 633, 122, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String StudentName = Name.getText();
                String FatherName = Father_name.getText();
                String MotherName = Mother_name.getText();
                String date_of_birth = DOB.getText();
                String Roll = roll.getText();
                String Gender = gender.getText();
                String mobilenumber = phone_number.getText();
                int length = mobilenumber.length();
                String email = email_id.getText();
                String dept = department.getText();
                String add= address.getText();

                String string = " " + StudentName;
                if (length != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/allstudentdatabase ", "root", "Papribera@1234");

                   String query = "INSERT INTO btechstudentdata values('" + StudentName + "','" + FatherName + "','" + MotherName + "','" +
                        date_of_birth + "','" + email + "','" + mobilenumber + "', '" + add + "','" + dept + "','" + Roll + "', '" + Gender + "')";
                    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + string + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });	
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(693, 633, 122, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("PHONE NUMBER :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(63, 519, 177, 13);
		contentPane.add(lblNewLabel_10);
		
		address = new JTextField();
		address.setBounds(242, 557, 250, 19);
		contentPane.add(address);
		address.setColumns(10);
	}
}
