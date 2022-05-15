import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.Font;


public class GeneralComonentProperty extends JFrame {

	private JPanel contentPane;
	private JTextField txtdesktop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralComonentProperty frame = new GeneralComonentProperty();
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
	public GeneralComonentProperty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 418);
		contentPane = new JPanel();
		contentPane.setToolTipText("“123”");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("在这里输入文件路径：");
		label.setToolTipText("“123”");
		label.setOpaque(true);
		label.setBackground(new Color(0, 0, 0));
		label.setForeground(new Color(255, 0, 255));
		
		txtdesktop = new JTextField();
		txtdesktop.setToolTipText("“123”");
		txtdesktop.setFont(new Font("Lantinghei SC", Font.BOLD, 14));
		txtdesktop.setBackground(new Color(25, 25, 112));
		txtdesktop.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		txtdesktop.setText(".../desktop");
		txtdesktop.setColumns(10);
		
		JButton button = new JButton("打开");
		button.setFocusable(false);
		button.setToolTipText("“123”");
		button.setBackground(new Color(0, 128, 0));
		button.setForeground(new Color(255, 0, 255));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setToolTipText("“123”");
		progressBar.setValue(60);
		
		JSeparator separator = new JSeparator();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("呼呼呼");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Java", "Swift", "C#"}));
		
		JCheckBox chckbxA = new JCheckBox("a");
		chckbxA.setFocusable(false);
		chckbxA.setForeground(new Color(255, 0, 255));
		chckbxA.setSelected(true);
		
		JCheckBox chckbxB = new JCheckBox("b");
		chckbxB.setFocusable(false);
		chckbxB.setToolTipText("“123”");
		chckbxB.setForeground(new Color(255, 0, 255));
		
		JCheckBox chckbxC = new JCheckBox("c");
		chckbxC.setFocusable(false);
		chckbxC.setForeground(new Color(255, 0, 255));
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setForeground(new Color(255, 0, 255));
		radioButton.setSelected(true);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setForeground(new Color(255, 0, 255));
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setForeground(new Color(255, 0, 255));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JList list = new JList();
		list.setToolTipText("“123”");
		list.setForeground(new Color(0, 0, 255));
		list.setBorder(new LineBorder(new Color(128, 128, 128)));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Java", "Swift", "C#"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtdesktop, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button))
				.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxA)
							.addComponent(chckbxB)
							.addComponent(chckbxC)
							.addComponent(radioButton)
							.addComponent(radioButton_1)
							.addComponent(radioButton_2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(txtdesktop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxA)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxB)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxC)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(list, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		JTextArea txtrPublicStaticVoid = new JTextArea();
		txtrPublicStaticVoid.setToolTipText("“123”");
		txtrPublicStaticVoid.setFont(new Font("Lantinghei SC", Font.BOLD, 14));
		txtrPublicStaticVoid.setBackground(new Color(25, 25, 112));
		txtrPublicStaticVoid.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		txtrPublicStaticVoid.setTabSize(1);
		txtrPublicStaticVoid.setText("public static void main(String[] args) {\n\t\tEventQueue.invokeLater(new Runnable() {\n\t\t\tpublic void run() {\n\t\t\t\ttry {\n\t\t\t\t\tGeneralComonentProperty frame = new GeneralComonentProperty();\n\t\t\t\t\tframe.setVisible(true);\n\t\t\t\t} catch (Exception e) {\n\t\t\t\t\te.printStackTrace();\n\t\t\t\t}\n\t\t\t}\n\t\t});\n\t}");
		scrollPane.setViewportView(txtrPublicStaticVoid);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		tabbedPane.addTab("A", null, panel, null);
		
		JButton button_1 = new JButton("1");
		button_1.setToolTipText("“123”");
		
		JButton button_2 = new JButton("2");
		button_2.setToolTipText("“123”");
		
		JButton button_3 = new JButton("3");
		
		JCheckBox chckbxA_1 = new JCheckBox("a");
		chckbxA_1.setSelected(true);
		
		JCheckBox chckbxB_1 = new JCheckBox("b");
		
		JRadioButton radioButton_3 = new JRadioButton("1");
		radioButton_3.setSelected(true);
		
		JRadioButton radioButton_4 = new JRadioButton("2");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(chckbxA_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxB_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(radioButton_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_4)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxA_1)
						.addComponent(chckbxB_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioButton_3)
						.addComponent(radioButton_4))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		tabbedPane.addTab("B", null, panel_1, null);
		
		JSpinner spinner = new JSpinner();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
