import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingWorker;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TestAL extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAL frame = new TestAL();
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
	public TestAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 438, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SwingWorker<String, Integer>() {
					int  oriy = lblNewLabel.getY();

					@Override
					protected String doInBackground() throws Exception {
						while (true) {
							Thread.sleep(20);
							//System.out.println("a");
							publish((int)(Math.cos(System.currentTimeMillis()/80)*50));
						}
					}

					@Override
					protected void process(List<Integer> chunks) {
						for (int y:chunks) {
							//System.out.println("bcd");
							lblNewLabel.setLocation(lblNewLabel.getX(), oriy+y);
						}
						super.process(chunks);
					}	
				}.execute();
				
			}
		});
//		btnNewButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				new SwingWorker<String, Integer>() {
//					int  oriy = lblNewLabel.getY();
//
//					@Override
//					protected String doInBackground() throws Exception {
//						while (true) {
//							Thread.sleep(20);
//							//System.out.println("a");
//							publish((int)(Math.cos(System.currentTimeMillis()/80)*50));
//						}
//					}
//
//					@Override
//					protected void process(List<Integer> chunks) {
//						for (int y:chunks) {
//							//System.out.println("bcd");
//							lblNewLabel.setLocation(lblNewLabel.getX(), oriy+y);
//						}
//						super.process(chunks);
//					}	
//				}.execute();
//
//			}
//		});
		btnNewButton.setBounds(6, 59, 117, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setLocation(135, 128);
		lblNewLabel.setSize(200, 50);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("New button1");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("hello");
//				btnNewButton.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						
//						new SwingWorker<String, Integer>() {
//							int  oriy = lblNewLabel.getY();
//
//							@Override
//							protected String doInBackground() throws Exception {
//								while (true) {
//									Thread.sleep(20);
//									//System.out.println("a");
//									publish((int)(Math.cos(System.currentTimeMillis()/80)*50));
//								}
//							}
//
//							@Override
//							protected void process(List<Integer> chunks) {
//								for (int y:chunks) {
//									//System.out.println("bcd");
//									lblNewLabel.setLocation(lblNewLabel.getX(), oriy+y);
//								}
//								super.process(chunks);
//							}	
//						}.execute();
//						
//					}
//				});
				
			}
		});
		btnNewButton_1.setBounds(6, 140, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}
