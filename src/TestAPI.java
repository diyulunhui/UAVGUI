import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TestAPI extends JFrame {

	//private MyPanel contentPane;
	private JProgressBar progressBar;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_7;
	private JButton button_6;
	private JButton button_8;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_11;
	private JPanel panel_2;
	private JButton button;
	private JButton button_b;
	private JPanel panel_1;
	private JButton button_9;
	//private JTextArea textArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAPI frame = new TestAPI();
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
	public TestAPI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);
		setBounds(100, 100, 900, 520);
		GlobalVariance.contentPane = new MyPanel();
		GlobalVariance.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(GlobalVariance.contentPane);
		GlobalVariance.contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 0, 900, 500);
		GlobalVariance.contentPane.add(panel);
		
		JLabel label_01 = new JLabel("选择无人机数量：");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		
		JLabel label_02 = new JLabel("选择目的地数目：");
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		
		JLabel label_03 = new JLabel("选择包裹数目：");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"100", "200", "300", "400"}));
		
		progressBar = new JProgressBar();
		
		button = new JButton("分配");
		button.setEnabled(false);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SwingWorker<String, Integer>() {

					@Override
					protected String doInBackground() throws Exception {
						// TODO Auto-generated method stub
						for(int i = 0; i <= 10; i++) {
							Thread.sleep(500);
							publish(i*10);
						}
						//System.out.println("a");
						String all1 = (String)comboBox_3.getSelectedItem();
						GlobalVariance.all = Integer.valueOf(all1).intValue();
						
						String desNum1 = (String)comboBox_2.getSelectedItem();
						GlobalVariance.desNum = Integer.valueOf(desNum1).intValue();
						
						String uavNum1 = (String)comboBox_1.getSelectedItem();
						GlobalVariance.uavNum = Integer.valueOf(uavNum1).intValue();
						
						GlobalVariance.Method2();
						GlobalVariance.textArea.append("打包后的结果是:"+"\r\n");
						GlobalVariance.Method3();
						GlobalVariance.Method4();
						button_b.setEnabled(true);
						return null;
					}

					@Override
					protected void process(List<Integer> chunks) {
						for (Integer integer : chunks) {
							//System.out.println("abc");
							progressBar.setValue( integer);
						}
					}				
				}.execute();;
			}
			
		});

				
		button_b = new JButton("结果");
		button_b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GlobalVariance.erase = true;
				/**
				 * @author bruce
				 *
				 */
				Dimension buttonSize = button_9.getSize();
				Point labelLocPoint = button_9.getLocation();
				
				GlobalVariance.start_x = labelLocPoint.getX() + buttonSize.width/2;
				GlobalVariance.start_y = labelLocPoint.getY() + buttonSize.height/2;
				
				Dimension buttonSize1 = button_1.getSize();
				Point labelLocPoint1 = button_1.getLocation();
				
				Dimension buttonSize2 = button_2.getSize();
				Point labelLocPoint2 = button_2.getLocation();
				
				Dimension buttonSize3 = button_3.getSize();
				Point labelLocPoint3 = button_3.getLocation();
				
				Dimension buttonSize4 = button_4.getSize();
				Point labelLocPoint4 = button_4.getLocation();

				Dimension buttonSize5 = button_5.getSize();
				Point labelLocPoint5 = button_5.getLocation();

				Dimension buttonSize6 = button_6.getSize();
				Point labelLocPoint6 = button_6.getLocation();

				Dimension buttonSize7 = button_7.getSize();
				Point labelLocPoint7 = button_7.getLocation();
				
				Dimension buttonSize8 = button_8.getSize();
				Point labelLocPoint8 = button_8.getLocation();
			
				new SwingWorker<String, String>() {
					@Override
					protected String doInBackground() throws Exception {
						// TODO Auto-generated method stub
						int size = GlobalVariance.bundleNumAll.size();
						int i;
						
						ArrayList<String> tempArrayList = new ArrayList<String>();
						
						for(i = 0; i < size; i++){
							
							tempArrayList.add(GlobalVariance.bundleNumAll.get(i));
							
							if((i + 1) % GlobalVariance.uavNum == 0 && i != 0) {
								for(int j = 0; j < GlobalVariance.divsion * 2; j++ ) {
									for(String s : tempArrayList) {
										publish(s);
//										System.out.println(s);
									}
									try {
										Thread.sleep(100);
									} catch (Exception e) {
										// TODO: handle exception
									}
								}
								tempArrayList.clear();
							}
						}
						if(tempArrayList.isEmpty() == false) {
							GlobalVariance.last = tempArrayList.size();
							GlobalVariance.blast = true;
//							System.out.println(tempArrayList);
//							System.out.println("长度:" + GlobalVariance.last);
							for(int j = 0; j < GlobalVariance.divsion * 2; j++ ) {
								for(String s : tempArrayList) {
									publish(s);
								}
								try {
									Thread.sleep(100);
								} catch (Exception e) {
									// TODO: handle exception
								}
							}
							tempArrayList.clear();
						}
						GlobalVariance.textArea.append("配送完成,请退出!");
						return null;
					}

					protected double calcPointPos(double start, double end, int division, int scale) {
						double res = (end - start) / division * scale + start;
						return res;
					}
					
					
					protected void setPoint(int des, int index) {
						
						switch (des) {
						case 1:
							GlobalVariance.end_x[index] = labelLocPoint1.getX() + buttonSize1.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint1.getY() + buttonSize1.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							break;
						case 2:
							GlobalVariance.end_x[index] = labelLocPoint2.getX() + buttonSize2.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint2.getY() + buttonSize2.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							break;
							
						case 3:
							GlobalVariance.end_x[index] = labelLocPoint3.getX() + buttonSize3.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint3.getY() + buttonSize3.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							break;
							
						case 4:
							GlobalVariance.end_x[index] = labelLocPoint4.getX() + buttonSize4.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint4.getY() + buttonSize4.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 5:
							GlobalVariance.end_x[index] = labelLocPoint5.getX() + buttonSize5.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint5.getY() + buttonSize5.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 6:
							GlobalVariance.end_x[index] = labelLocPoint6.getX() + buttonSize6.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint6.getY() + buttonSize6.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 7:
							GlobalVariance.end_x[index] = labelLocPoint7.getX() + buttonSize7.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint7.getY() + buttonSize7.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 8:
							GlobalVariance.end_x[index] = labelLocPoint8.getX() + buttonSize8.width/2;
							GlobalVariance.end_x[index] = calcPointPos(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint8.getY() + buttonSize8.height/2;
							GlobalVariance.end_y[index] = calcPointPos(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;

						default:
							break;
						}
					}
					
					protected double calcPointPos1(double end, double start, int division, int scale) {
						double res = (end - start) / division * scale + start;
						return res;
					}
					
					protected void setPoint1(int des, int index) {
						
						switch (des) {
						case 1:
							GlobalVariance.end_x[index] = labelLocPoint1.getX() + buttonSize1.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint1.getY() + buttonSize1.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							break;
						case 2:
							GlobalVariance.end_x[index] = labelLocPoint2.getX() + buttonSize2.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint2.getY() + buttonSize2.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							break;
							
						case 3:
							GlobalVariance.end_x[index] = labelLocPoint3.getX() + buttonSize3.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint3.getY() + buttonSize3.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							break;
							
						case 4:
							GlobalVariance.end_x[index] = labelLocPoint4.getX() + buttonSize4.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint4.getY() + buttonSize4.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 5:
							GlobalVariance.end_x[index] = labelLocPoint5.getX() + buttonSize5.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint5.getY() + buttonSize5.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 6:
							GlobalVariance.end_x[index] = labelLocPoint6.getX() + buttonSize6.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint6.getY() + buttonSize6.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 7:
							GlobalVariance.end_x[index] = labelLocPoint7.getX() + buttonSize7.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint7.getY() + buttonSize7.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;
							
						case 8:
							GlobalVariance.end_x[index] = labelLocPoint8.getX() + buttonSize8.width/2;
							GlobalVariance.end_x[index] = calcPointPos1(GlobalVariance.start_x, GlobalVariance.end_x[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							GlobalVariance.end_y[index] = labelLocPoint8.getY() + buttonSize8.height/2;
							GlobalVariance.end_y[index] = calcPointPos1(GlobalVariance.start_y, GlobalVariance.end_y[index], GlobalVariance.divsion, GlobalVariance.scale);
							
							break;

						default:
							break;
						}
					}
					
					@Override
					protected void process(List<String> chunks) {
						// TODO Auto-generated method stub
						ArrayList<String> tempArrayList = new ArrayList<String>();
						
						
						int j = 0;
						for(String ele: chunks) {
							int des = GlobalVariance.Judge(ele);
//							GlobalVariance.t++;
//							System.out.println(GlobalVariance.t + ":" + des);
							if(GlobalVariance.flag == false) {
								setPoint(des, GlobalVariance.index);
//								System.out.println("end_x:" + GlobalVariance.end_x[GlobalVariance.index] + "end_y:" + GlobalVariance.end_y[GlobalVariance.index]);
							}
							else {
								setPoint1(des, GlobalVariance.index);
//								System.out.println("end_x:" + GlobalVariance.end_x[GlobalVariance.index] + "end_y:" + GlobalVariance.end_y[GlobalVariance.index]);
							}
//							System.out.println(GlobalVariance.count);
//							GlobalVariance.count = (GlobalVariance.count + 1) % GlobalVariance.divsion;
							GlobalVariance.count++;
							
							if(GlobalVariance.blast == false) {
								if(GlobalVariance.count == GlobalVariance.divsion * GlobalVariance.uavNum) {
//									System.out.println("switch" + GlobalVariance.count + "准备回去");
									GlobalVariance.flag = !GlobalVariance.flag;
									GlobalVariance.count = 0;
//									System.out.println(GlobalVariance.flag);
								}
							}
							else {
								if(GlobalVariance.count == GlobalVariance.divsion * GlobalVariance.last) {
//									System.out.println("switch1:" + GlobalVariance.count + "准备回去");
									GlobalVariance.flag = !GlobalVariance.flag;
									GlobalVariance.count = 0;
//									System.out.println(GlobalVariance.flag);
								}
							}

								
							tempArrayList.add(ele);
							
							// update 
							GlobalVariance.index = GlobalVariance.index + 1;
							
							//判断是否为做后一次
							if(GlobalVariance.blast == false) {
								// 可以开始绘制，无人机数目个点已经准备完全
								if(GlobalVariance.index == GlobalVariance.uavNum) {
									
									// 打印文本
									if(GlobalVariance.times == 0) {
										for(String s : tempArrayList) {
											GlobalVariance.textArea.append("无人机" + (j + 1) + "运送目的地" + GlobalVariance.Judge(s) + "的包裹" + s + "\n\r");
											j = (j + 1) % GlobalVariance.uavNum;
										}
										tempArrayList.clear();
									}
									GlobalVariance.times = (GlobalVariance.times + 1) % (GlobalVariance.divsion * 2);
									
									// 调用绘制
									GlobalVariance.contentPane.validate();
									GlobalVariance.contentPane.repaint();
									
									// update
									GlobalVariance.scale = GlobalVariance.scale >= GlobalVariance.divsion ? 1 : GlobalVariance.scale + 1;
								}
								
								// update
								if(GlobalVariance.index == GlobalVariance.uavNum)
									GlobalVariance.index = 0;
							}
							else {
								// 可以开始绘制，无人机数目个点已经准备完全
								if(GlobalVariance.index == GlobalVariance.last) {
									
									// 打印文本
									if(GlobalVariance.times == 0) {
										for(String s : tempArrayList) {
											GlobalVariance.textArea.append("无人机" + (j + 1) + "运送目的地" + GlobalVariance.Judge(s) + "的包裹" + s + "\n\r");
											j = (j + 1) % GlobalVariance.uavNum;
										}
										tempArrayList.clear();
									}
									GlobalVariance.times = (GlobalVariance.times + 1) % (GlobalVariance.divsion * 2);
									
									// 调用绘制
									GlobalVariance.contentPane.validate();
									GlobalVariance.contentPane.repaint();
									
									// update
									GlobalVariance.scale = GlobalVariance.scale >= GlobalVariance.divsion ? 1 : GlobalVariance.scale + 1;
								}
								// update
								if(GlobalVariance.index == GlobalVariance.last)
									GlobalVariance.index = 0;
							}

							
							
							
						}
						super.process(chunks);
						
					}
				}.execute();
			}
		});
		button_b.setEnabled(false);

	
		JButton button_a = new JButton("确定");
		button_a.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				button.setEnabled(true);
				
				String all1 = (String)comboBox_3.getSelectedItem();
				GlobalVariance.all = Integer.valueOf(all1).intValue();
				
				String desNum1 = (String)comboBox_2.getSelectedItem();
				GlobalVariance.desNum = Integer.valueOf(desNum1).intValue();
				GlobalVariance.Method1();
				
				String uav = (String)comboBox_1.getSelectedItem();
				int uav1 = Integer.valueOf(uav).intValue();
				GlobalVariance.uavNum = uav1;
				
				
				
				String des = (String)comboBox_2.getSelectedItem();
				int des1 = Integer.valueOf(des).intValue();
				//System.out.println(b);
				switch (uav1) {
				case 1:
					button_11.setVisible(true);
					button_12.setVisible(false);
					button_13.setVisible(false);
					button_14.setVisible(false);
					button_15.setVisible(false);
					button_16.setVisible(false);
					button_17.setVisible(false);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(false);
					label_13.setVisible(false);
					label_14.setVisible(false);
					label_15.setVisible(false);
					label_16.setVisible(false);
					label_17.setVisible(false);
					label_18.setVisible(false);
					
					break;
					
				case 2:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(false);
					button_14.setVisible(false);
					button_15.setVisible(false);
					button_16.setVisible(false);
					button_17.setVisible(false);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(false);
					label_14.setVisible(false);
					label_15.setVisible(false);
					label_16.setVisible(false);
					label_17.setVisible(false);
					label_18.setVisible(false);
					
					break;
					
				case 3:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(false);
					button_15.setVisible(false);
					button_16.setVisible(false);
					button_17.setVisible(false);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(true);
					label_14.setVisible(false);
					label_15.setVisible(false);
					label_16.setVisible(false);
					label_17.setVisible(false);
					label_18.setVisible(false);
					
					break;
					
				case 4:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(true);
					button_15.setVisible(false);
					button_16.setVisible(false);
					button_17.setVisible(false);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(true);
					label_14.setVisible(true);
					label_15.setVisible(false);
					label_16.setVisible(false);
					label_17.setVisible(false);
					label_18.setVisible(false);
					
					break;
					
				case 5:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(true);
					button_15.setVisible(true);
					button_16.setVisible(false);
					button_17.setVisible(false);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(true);
					label_14.setVisible(true);
					label_15.setVisible(true);
					label_16.setVisible(false);
					label_17.setVisible(false);
					label_18.setVisible(false);
					
					break;
					
				case 6:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(true);
					button_15.setVisible(true);
					button_16.setVisible(true);
					button_17.setVisible(false);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(true);
					label_14.setVisible(true);
					label_15.setVisible(true);
					label_16.setVisible(true);
					label_17.setVisible(false);
					label_18.setVisible(false);
					
					break;
					
				case 7:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(true);
					button_15.setVisible(true);
					button_16.setVisible(true);
					button_17.setVisible(true);
					button_18.setVisible(false);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(true);
					label_14.setVisible(true);
					label_15.setVisible(true);
					label_16.setVisible(true);
					label_17.setVisible(true);
					label_18.setVisible(false);
					
					break;
					
				case 8:
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(true);
					button_15.setVisible(true);
					button_16.setVisible(true);
					button_17.setVisible(true);
					button_18.setVisible(true);
					
					label_11.setVisible(true);
					label_12.setVisible(true);
					label_13.setVisible(true);
					label_14.setVisible(true);
					label_15.setVisible(true);
					label_16.setVisible(true);
					label_17.setVisible(true);
					label_18.setVisible(true);
					
					break;

				default:
					break;
				}
				switch (des1) {
				case 1:
					button_1.setVisible(true);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
					button_8.setVisible(false);
					break;
					
				case 2:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
					button_8.setVisible(false);
					break;
					
				case 3:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
					button_8.setVisible(false);
					break;
					
				case 4:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
					button_8.setVisible(false);
					break;
					
				case 5:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					button_6.setVisible(false);
					button_7.setVisible(false);
					button_8.setVisible(false);
					break;
					
				case 6:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					button_6.setVisible(true);
					button_7.setVisible(false);
					button_8.setVisible(false);
					break;
					
				case 7:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					button_6.setVisible(true);
					button_7.setVisible(true);
					button_8.setVisible(false);
					break;
					
				case 8:
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					button_6.setVisible(true);
					button_7.setVisible(true);
					button_8.setVisible(true);
					break;

				default:
					break;
				
					
				}
			}
		});
		
		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		
		panel_2 = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(button_a)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_b))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_01)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_03)
										.addComponent(label_02))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox_3, 0, 127, Short.MAX_VALUE)
										.addComponent(comboBox_2, 0, 127, Short.MAX_VALUE)))
								.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_01)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_02)
										.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_03)
										.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(button_a)
										.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(button_b))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(28)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addGap(35)))
					.addContainerGap())
		);
		
		GlobalVariance.textArea = new JTextArea();
		GlobalVariance.textArea.setLineWrap(true);
		DefaultCaret caret = (DefaultCaret)GlobalVariance.textArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		scrollPane.setViewportView(GlobalVariance.textArea);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		label_11 = new JLabel("无人机1");
		panel_2.add(label_11);
		
		
		button_11 = new JButton("");
		panel_2.add(button_11);
		button_11.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_12 = new JLabel("无人机2");
		panel_2.add(label_12);
		
		button_12 = new JButton("");
		panel_2.add(button_12);
		button_12.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_13 = new JLabel("无人机3");
		panel_2.add(label_13);
		
		button_13 = new JButton("");
		panel_2.add(button_13);
		button_13.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_14 = new JLabel("无人机4");
		panel_2.add(label_14);
		
		button_14 = new JButton("");
		panel_2.add(button_14);
		button_14.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_15 = new JLabel("无人机5");
		panel_2.add(label_15);
		
		button_15 = new JButton("");
		panel_2.add(button_15);
		button_15.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_16 = new JLabel("无人机6");
		panel_2.add(label_16);
		
		button_16 = new JButton("");
		panel_2.add(button_16);
		button_16.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_17 = new JLabel("无人机7");
		panel_2.add(label_17);
		
		button_17 = new JButton("");
		panel_2.add(button_17);
		button_17.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		label_18 = new JLabel("无人机8");
		panel_2.add(label_18);
		
		button_18 = new JButton("");
		panel_2.add(button_18);
		button_18.setIcon(new ImageIcon(TestAPI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		
		button_9 = new JButton("");
		button_9.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		
		JLabel label_1 = new JLabel("1");
		
		JLabel label_2 = new JLabel("2");
		
		JLabel label_3 = new JLabel("3");
		
		JLabel label_4 = new JLabel("4");
		
		JLabel label_5 = new JLabel("5");
		
		JLabel label_6 = new JLabel("6");
		
		JLabel label_7 = new JLabel("7");
		
		JLabel label_8 = new JLabel("8");
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_1.setVisible(false);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_2.setVisible(false);
		
		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_3.setVisible(false);
		
		button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_4.setVisible(false);
		
		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_5.setVisible(false);
		
		button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_6.setVisible(false);
		
		button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_7.setVisible(false);
		
		button_8 = new JButton("");
		button_8.setIcon(new ImageIcon(TestAPI.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		button_8.setVisible(false);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(350, Short.MAX_VALUE)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_5)
					.addGap(159))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(374, Short.MAX_VALUE)
					.addComponent(label_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(135))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(68)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(434, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(239, Short.MAX_VALUE)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(266))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(242)
					.addComponent(label_8)
					.addContainerGap(291, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(224, Short.MAX_VALUE)
					.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(202)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(79))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(119)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2)
					.addContainerGap(390, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(127)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(396, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(277, Short.MAX_VALUE)
					.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(248))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addGap(163)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_2))
							.addGap(117)
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(105))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_7)
									.addGap(11)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label_1)
											.addGap(15)
											.addComponent(label_8)
											.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
											.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
											.addGap(36))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(12)
											.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
											.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label_6)
											.addGap(67))))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(77)
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(15)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5))
									.addGap(56)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_4))
							.addGap(156))))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
	}
}
