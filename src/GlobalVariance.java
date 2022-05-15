import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextArea;

public class GlobalVariance {	
	static MyPanel contentPane;
	static JTextArea textArea;
	public static int all;
	public static int desNum;
	public static int uavNum;
	public static int des[] = new int[8];
	public static int save[] = new int[16];
	public static int[] packagesNum1;
	public static int[] packagesNum2;
	public static int[] packagesNum3;
	public static int[] packagesNum4;
	public static int[] packagesNum5;
	public static int[] packagesNum6;
	public static int[] packagesNum7;
	public static int[] packagesNum8;
	public static ArrayList<Integer> packagesNum01 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum02 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum03 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum04 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum05 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum06 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum07 = new ArrayList<>();
	public static ArrayList<Integer> packagesNum08 = new ArrayList<>();
	public static ArrayList<String> bundleNum1 = new ArrayList<>();
	public static ArrayList<String> bundleNum2 = new ArrayList<>();
	public static ArrayList<String> bundleNum3 = new ArrayList<>();
	public static ArrayList<String> bundleNum4 = new ArrayList<>();
	public static ArrayList<String> bundleNum5 = new ArrayList<>();
	public static ArrayList<String> bundleNum6 = new ArrayList<>();
	public static ArrayList<String> bundleNum7 = new ArrayList<>();
	public static ArrayList<String> bundleNum8 = new ArrayList<>();
	public static ArrayList<String> bundleNumAll = new ArrayList<>();
	public static int min = 3;
	public static int max = 6;//随机打包
	public static int uav = 0;//轮盘赌
	public static double start_x;
	public static double start_y;
	public static double[] end_x = new double[10];
	public static double[] end_y = new double[10];
	public static boolean flag = false;
	public static int index = 0;
	public static int divsion = 10;
	public static int scale = 1;
	public static int times = 0;
	public static boolean erase = false;//初始的时候不显示无人机图片
	public static int count = 0;
//	public static boolean zuihou = false;
	public static int last;//最后一趟包裹数
	public static boolean blast = false;//最后一趟包裹判断
	
//	public static int t = 0;
	
	//显示目的地包裹
	public static void Method1() {
		int packages[] = new int[all];

		for (int i = 0; i < packages.length; i++) {
			int random = (int)(Math.random()*desNum) + 1;
			packages[i] = random;
		}
		for (int i = 0; i < des.length; i++) {
			des[i] = 0;
		}
		for (int i = 0; i < packages.length; i++) {
			if(packages[i] == 1)
				des[0]++;
			if(packages[i] == 2)
				des[1]++;
			if(packages[i] == 3)
				des[2]++;
			if(packages[i] == 4)
				des[3]++;
			if(packages[i] == 5)
				des[4]++;
			if(packages[i] == 6)
				des[5]++;
			if(packages[i] == 7)
				des[6]++;
			if(packages[i] == 8)
				des[7]++;
		}
		int dPackages[] = new int [8];
		dPackages[0] = des[0];
		for (int i = 1; i < dPackages.length; i++) {
			dPackages[i] = dPackages[i -1] + des[i];
		}
		switch (desNum) {
		case 1:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			break;
		case 2:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			break;
		case 3:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			textArea.append("目的地3的包裹共:"+des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]"+"\r\n");
			break;
		case 4:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			textArea.append("目的地3的包裹共:"+des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]"+"\r\n");
			textArea.append("目的地4的包裹共:"+des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]"+"\r\n");
			break;
		case 5:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			textArea.append("目的地3的包裹共:"+des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]"+"\r\n");
			textArea.append("目的地4的包裹共:"+des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]"+"\r\n");
			textArea.append("目的地5的包裹共:"+des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]"+"\r\n");
			break;
		case 6:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			textArea.append("目的地3的包裹共:"+des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]"+"\r\n");
			textArea.append("目的地4的包裹共:"+des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]"+"\r\n");
			textArea.append("目的地5的包裹共:"+des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]"+"\r\n");
			textArea.append("目的地6的包裹共:"+des[5]+",ID为["+(dPackages[4]+1)+"..."+dPackages[5]+"]"+"\r\n");
			
			break;
		case 7:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			textArea.append("目的地3的包裹共:"+des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]"+"\r\n");
			textArea.append("目的地4的包裹共:"+des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]"+"\r\n");
			textArea.append("目的地5的包裹共:"+des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]"+"\r\n");
			textArea.append("目的地6的包裹共:"+des[5]+",ID为["+(dPackages[4]+1)+"..."+dPackages[5]+"]"+"\r\n");
			textArea.append("目的地7的包裹共:"+des[6]+",ID为["+(dPackages[5]+1)+"..."+dPackages[6]+"]"+"\r\n");
			break;
		case 8:
			textArea.setText("目的地1的包裹共:"+des[0]+",ID为[1..."+dPackages[0]+"]"+"\r\n");
			textArea.append("目的地2的包裹共:"+des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]"+"\r\n");
			textArea.append("目的地3的包裹共:"+des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]"+"\r\n");
			textArea.append("目的地4的包裹共:"+des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]"+"\r\n");
			textArea.append("目的地5的包裹共:"+des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]"+"\r\n");
			textArea.append("目的地6的包裹共:"+des[5]+",ID为["+(dPackages[4]+1)+"..."+dPackages[5]+"]"+"\r\n");
			textArea.append("目的地7的包裹共:"+des[6]+",ID为["+(dPackages[5]+1)+"..."+dPackages[6]+"]"+"\r\n");
			textArea.append("目的地8的包裹共:"+des[7]+",ID为["+(dPackages[6]+1)+"..."+dPackages[7]+"]"+"\r\n");
			break;
		default:
			break;
		}
		
		for (int i = 2*desNum ; i < 15; i++) {
			save[i] = 0;
		}
		
		save[0] = 1;
		save[1] = dPackages[0];
		for (int i = 2; i <= 15; i++) {
			if(i%2 == 0) {
				save[i] = dPackages[i/2 - 1] + 1;
			}
			else {
				save[i] = dPackages[i/2];
			}
		}
		
	}
	
	//生成目的地包裹的打包集合
	public static void Method2() {
		packagesNum1 = new int[des[0]];
		packagesNum2 = new int[des[1]];
		packagesNum3 = new int[des[2]];
		packagesNum4 = new int[des[3]];
		packagesNum5 = new int[des[4]];
		packagesNum6 = new int[des[5]];
		packagesNum7 = new int[des[6]];
		packagesNum8 = new int[des[7]];
		switch (desNum) {
		case 1:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			shuffle(packagesNum1);
			
			Generator(packagesNum1, packagesNum01);
			
	        Pack(packagesNum01,bundleNum1);
			break;
		case 2:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			shuffle(packagesNum1);
			shuffle(packagesNum2);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			
	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
			break;
		case 3:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			for (int i = 0; i < packagesNum3.length; i++) {
				packagesNum3[i] = i + save[4];
			}
			shuffle(packagesNum1);
			shuffle(packagesNum2);
			shuffle(packagesNum3);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			Generator(packagesNum3, packagesNum03);
			
	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
	        Pack(packagesNum03,bundleNum3);
			break;
		case 4:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			for (int i = 0; i < packagesNum3.length; i++) {
				packagesNum3[i] = i + save[4];
			}
			for (int i = 0; i < packagesNum4.length; i++) {
				packagesNum4[i] = i + save[6];
			}
			shuffle(packagesNum1);
			shuffle(packagesNum2);
			shuffle(packagesNum3);
			shuffle(packagesNum4);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			Generator(packagesNum3, packagesNum03);
			Generator(packagesNum4, packagesNum04);
			
	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
	        Pack(packagesNum03,bundleNum3);
	        Pack(packagesNum04,bundleNum4);
			break;
		case 5:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			for (int i = 0; i < packagesNum3.length; i++) {
				packagesNum3[i] = i + save[4];
			}
			for (int i = 0; i < packagesNum4.length; i++) {
				packagesNum4[i] = i + save[6];
			}
			for (int i = 0; i < packagesNum5.length; i++) {
				packagesNum5[i] = i + save[8];
			}
			//System.out.println(Arrays.toString(packagesNum1));
	        shuffle(packagesNum1);
	        shuffle(packagesNum2);
			shuffle(packagesNum3);
			shuffle(packagesNum4);
			shuffle(packagesNum5);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			Generator(packagesNum3, packagesNum03);
			Generator(packagesNum4, packagesNum04);
			Generator(packagesNum5, packagesNum05);
//	        packagesNum01 = new ArrayList<>();
//	        for (int i = 0; i < packagesNum1.length; i++) {
//				packagesNum01.add(packagesNum1[i]);
//			}
	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
	        Pack(packagesNum03,bundleNum3);
	        Pack(packagesNum04,bundleNum4);
	        Pack(packagesNum05,bundleNum5);
//	        for(int m = 0; m < 5 ; m++) {
//	        	for(int n = 0; n < 5 ; n++) {
//	    	        System.out.println(bundleNum1[m][n]);
//	        	}
//	        }
//	        for(int m = 0; m < 8 ; m++) {
//
//	    	        System.out.println(Arrays.toString(bundleNum1[m]));
//
//	        }
	        
			break;
		case 6:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			for (int i = 0; i < packagesNum3.length; i++) {
				packagesNum3[i] = i + save[4];
			}
			for (int i = 0; i < packagesNum4.length; i++) {
				packagesNum4[i] = i + save[6];
			}
			for (int i = 0; i < packagesNum5.length; i++) {
				packagesNum5[i] = i + save[8];
			}
			for (int i = 0; i < packagesNum6.length; i++) {
				packagesNum6[i] = i + save[10];
			}
			shuffle(packagesNum1);
			shuffle(packagesNum2);
			shuffle(packagesNum3);
			shuffle(packagesNum4);
			shuffle(packagesNum5);
			shuffle(packagesNum6);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			Generator(packagesNum3, packagesNum03);
			Generator(packagesNum4, packagesNum04);
			Generator(packagesNum5, packagesNum05);
			Generator(packagesNum6, packagesNum06);

	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
	        Pack(packagesNum03,bundleNum3);
	        Pack(packagesNum04,bundleNum4);
	        Pack(packagesNum05,bundleNum5);
	        Pack(packagesNum06,bundleNum6);
			break;
		case 7:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			for (int i = 0; i < packagesNum3.length; i++) {
				packagesNum3[i] = i + save[4];
			}
			for (int i = 0; i < packagesNum4.length; i++) {
				packagesNum4[i] = i + save[6];
			}
			for (int i = 0; i < packagesNum5.length; i++) {
				packagesNum5[i] = i + save[8];
			}
			for (int i = 0; i < packagesNum6.length; i++) {
				packagesNum6[i] = i + save[10];
			}
			for (int i = 0; i < packagesNum7.length; i++) {
				packagesNum7[i] = i + save[12];
			}
			shuffle(packagesNum1);
			shuffle(packagesNum2);
			shuffle(packagesNum3);
			shuffle(packagesNum4);
			shuffle(packagesNum5);
			shuffle(packagesNum6);
			shuffle(packagesNum7);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			Generator(packagesNum3, packagesNum03);
			Generator(packagesNum4, packagesNum04);
			Generator(packagesNum5, packagesNum05);
			Generator(packagesNum6, packagesNum06);
			Generator(packagesNum7, packagesNum07);

	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
	        Pack(packagesNum03,bundleNum3);
	        Pack(packagesNum04,bundleNum4);
	        Pack(packagesNum05,bundleNum5);
	        Pack(packagesNum06,bundleNum6);
	        Pack(packagesNum07,bundleNum7);
			break;
		case 8:
			for (int i = 0; i < packagesNum1.length; i++) {
				packagesNum1[i] = i + 1;
			}
			for (int i = 0; i < packagesNum2.length; i++) {
				packagesNum2[i] = i + save[2];
			}
			for (int i = 0; i < packagesNum3.length; i++) {
				packagesNum3[i] = i + save[4];
			}
			for (int i = 0; i < packagesNum4.length; i++) {
				packagesNum4[i] = i + save[6];
			}
			for (int i = 0; i < packagesNum5.length; i++) {
				packagesNum5[i] = i + save[8];
			}
			for (int i = 0; i < packagesNum6.length; i++) {
				packagesNum6[i] = i + save[10];
			}
			for (int i = 0; i < packagesNum7.length; i++) {
				packagesNum7[i] = i + save[12];
			}
			for (int i = 0; i < packagesNum8.length; i++) {
				packagesNum8[i] = i + save[14];
			}
			shuffle(packagesNum1);
			shuffle(packagesNum2);
			shuffle(packagesNum3);
			shuffle(packagesNum4);
			shuffle(packagesNum5);
			shuffle(packagesNum6);
			shuffle(packagesNum7);
			shuffle(packagesNum8);
			
			Generator(packagesNum1, packagesNum01);
			Generator(packagesNum2, packagesNum02);
			Generator(packagesNum3, packagesNum03);
			Generator(packagesNum4, packagesNum04);
			Generator(packagesNum5, packagesNum05);
			Generator(packagesNum6, packagesNum06);
			Generator(packagesNum7, packagesNum07);
			Generator(packagesNum8, packagesNum08);

	        Pack(packagesNum01,bundleNum1);
	        Pack(packagesNum02,bundleNum2);
	        Pack(packagesNum03,bundleNum3);
	        Pack(packagesNum04,bundleNum4);
	        Pack(packagesNum05,bundleNum5);
	        Pack(packagesNum06,bundleNum6);
	        Pack(packagesNum07,bundleNum7);
	        Pack(packagesNum08,bundleNum8);
			break;
		default:
			break;
		}
		
	}

	//显示对应目的地的打包结果
	public static void Method3() {
		switch (desNum) {
		case 1:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			break;
		case 2:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			break;
		case 3:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			textArea.append("目的地3:"+bundleNum3+"\r\n");
			break;
		case 4:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			textArea.append("目的地3:"+bundleNum3+"\r\n");
			textArea.append("目的地4:"+bundleNum4+"\r\n");
			break;
		case 5:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			textArea.append("目的地3:"+bundleNum3+"\r\n");
			textArea.append("目的地4:"+bundleNum4+"\r\n");
			textArea.append("目的地5:"+bundleNum5+"\r\n");
			break;
		case 6:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			textArea.append("目的地3:"+bundleNum3+"\r\n");
			textArea.append("目的地4:"+bundleNum4+"\r\n");
			textArea.append("目的地5:"+bundleNum5+"\r\n");
			textArea.append("目的地6:"+bundleNum6+"\r\n");
			break;
		case 7:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			textArea.append("目的地3:"+bundleNum3+"\r\n");
			textArea.append("目的地4:"+bundleNum4+"\r\n");
			textArea.append("目的地5:"+bundleNum5+"\r\n");
			textArea.append("目的地6:"+bundleNum6+"\r\n");
			textArea.append("目的地7:"+bundleNum7+"\r\n");
			break;
		case 8:
			textArea.append("目的地1:"+bundleNum1+"\r\n");
			textArea.append("目的地2:"+bundleNum2+"\r\n");
			textArea.append("目的地3:"+bundleNum3+"\r\n");
			textArea.append("目的地4:"+bundleNum4+"\r\n");
			textArea.append("目的地5:"+bundleNum5+"\r\n");
			textArea.append("目的地6:"+bundleNum6+"\r\n");
			textArea.append("目的地7:"+bundleNum7+"\r\n");
			textArea.append("目的地8:"+bundleNum8+"\r\n");
			break;

		default:
			break;
		}
	}
	
	//判断大包裹目的地
	public static int Judge(String string) {
		int aim = 0;
		String str = string;
		str = str.substring(1);
		//System.out.println(str);
		int first;
		int ab = str.indexOf(',');
		if (ab == -1) {
			int hou = str.indexOf(']');
			String strc = str.substring(0, hou);
			first = Integer.valueOf(strc).intValue();
		}
		else {
			//String[] strC = str.split(",");
			int hou = str.indexOf(',');
			String strc = str.substring(0, hou);
			first = Integer.valueOf(strc).intValue();
		}
		if (first >= save[0] && first <= save[1]) {
			aim = 1;
		}
		if (first >= save[2] && first <= save[3]) {
			aim = 2;
		}
		if (first >= save[4] && first <= save[5]) {
			aim = 3;
		}
		if (first >= save[6] && first <= save[7]) {
			aim = 4;
		}
		if (first >= save[8] && first <= save[9]) {
			aim = 5;
		}
		if (first >= save[10] && first <= save[11]) {
			aim = 6;
		}
		if (first >= save[12] && first <= save[13]) {
			aim = 7;
		}
		if (first >= save[14] && first <= save[15]) {
			aim = 8;
		}
		return aim;
	}
	
	//轮盘赌分配
	public static void Method4() {
		while(bundleNum1.size() != 0 || bundleNum2.size() != 0 || bundleNum3.size() != 0 || bundleNum4.size() != 0 || bundleNum5.size() != 0 || bundleNum6.size() != 0 || bundleNum7.size() != 0 || bundleNum8.size() != 0) {
			if (bundleNum1.size() != 0) {
				//System.out.println(bundleNum1);
				//System.out.println(Judge(bundleNum1.get(0)));
				bundleNumAll.add(bundleNum1.get(0));
				bundleNum1.remove(0);
			}
			if (bundleNum2.size() != 0) {
				bundleNumAll.add(bundleNum2.get(0));
				bundleNum2.remove(0);
			}
			if (bundleNum3.size() != 0) {
				bundleNumAll.add(bundleNum3.get(0));
				bundleNum3.remove(0);
			}
			if (bundleNum4.size() != 0) {
				bundleNumAll.add(bundleNum4.get(0));
				bundleNum4.remove(0);
			}
			if (bundleNum5.size() != 0) {
				bundleNumAll.add(bundleNum5.get(0));
				bundleNum5.remove(0);
			}
			if (bundleNum6.size() != 0) {
				bundleNumAll.add(bundleNum6.get(0));
				bundleNum6.remove(0);
			}
			if (bundleNum7.size() != 0) {
				bundleNumAll.add(bundleNum7.get(0));
				bundleNum7.remove(0);
			}
			if (bundleNum8.size() != 0) {
				bundleNumAll.add(bundleNum8.get(0));
				bundleNum8.remove(0);
			}
		}	
	}
	
	
	public static void Show() {
		uav = 0;
		while(bundleNumAll.size() != 0) {
			//System.out.println("目的地为:"+Judge(bundleNumAll.get(0)));
			//System.out.println("无人机"+(uav+1)+"运送目的地"+Judge(bundleNumAll.get(0))+"的包裹"+bundleNumAll.get(0));
//			contentPane.validate();
//			contentPane.repaint();
			textArea.append("无人机"+(uav+1)+"运送目的地"+Judge(bundleNumAll.get(0))+"的包裹"+bundleNumAll.get(0)+"\r\n");
			uav++;
			uav = uav%uavNum;
			bundleNumAll.remove(0);
			//System.out.println("移除后:"+bundleNumAll);
		}
	}
	
	//将目的地对应的包裹数组转化为arrayList
	public static void Generator(int[] array, ArrayList<Integer> arrayList) {
	    for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
	}

	//进行包裹打包
	public static void Pack(ArrayList<Integer> list, ArrayList<String> list1) {

			while(list.size() > 0) {
	        	int s=(int)min+(int)(Math.random()*(max-min));
	        	//System.out.println("打包数："+s);
	        	if (s > list.size()) {
	        		String temString = new String("[");
	        		int tem = list.size();
	        		for (int i = 0; i < tem; i++) {
	        			if (i != tem-1) {
	        				temString = temString + list.get(0)+ ", ";
						}
						else {
							temString = temString + list.get(0)+ "]";
						}
						list.remove(0);
					}
	        		list1.add(temString);
		        	//System.out.println(temString);
				}
	        	else {
	        		String temString = new String("[");
	        		for (int i = 0; i < s; i++) {
	        			if (i != s-1) {
	        				temString = temString + list.get(0)+ ", ";
						}
						else {
							temString = temString + list.get(0)+ "]";
						}
						list.remove(0);
					}
	        		list1.add(temString);
		        	//System.out.println(temString);
				}
	        	//System.out.println(list1);
	        }
	}
	
    //两个函数共同完成乱序操作
	
	//乱序
	private static Random rand = new Random();
    public static <T> void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static <T> void shuffle(int[] a) {
        int length = a.length;
        for ( int i = length; i > 0; i-- ){
            int randInd = rand.nextInt(i);
            swap(a, randInd, i - 1);
        }
    }
}
