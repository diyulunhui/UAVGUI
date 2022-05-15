import java.util.ArrayList;
import java.util.Arrays;

public class demo {	


	
	public static void main(String[] args) {
		GlobalVariance.all = 100;
		GlobalVariance.desNum = 5;
		GlobalVariance.uavNum = 3;
		int packages[] = new int[GlobalVariance.all];
		for (int i = 0; i < packages.length; i++) {
			int random = (int)(Math.random()*GlobalVariance.desNum) + 1;
			packages[i] = random;
		}
		for (int i = 0; i < packages.length; i++) {
			if(packages[i] == 1)
				GlobalVariance.des[0]++;
			if(packages[i] == 2)
				GlobalVariance.des[1]++;
			if(packages[i] == 3)
				GlobalVariance.des[2]++;
			if(packages[i] == 4)
				GlobalVariance.des[3]++;
			if(packages[i] == 5)
				GlobalVariance.des[4]++;
			if(packages[i] == 6)
				GlobalVariance.des[5]++;
			if(packages[i] == 7)
				GlobalVariance.des[6]++;
			if(packages[i] == 8)
				GlobalVariance.des[7]++;
		}
//		for (int i = 0; i < des.length; i++) {
//			System.out.println(des[i]);
//		}
		int dPackages[] = new int [8];
		dPackages[0] = GlobalVariance.des[0];
		for (int i = 1; i < dPackages.length; i++) {
			dPackages[i] = dPackages[i -1] + GlobalVariance.des[i];
		}
//		for (int i = 0; i < dPackages.length; i++) {
//			System.out.println(dPackages[i]);
//		}
		switch (GlobalVariance.desNum) {
		case 1:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			break;
		case 2:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			break;
		case 3:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			System.out.println("目的地3的包裹共:"+GlobalVariance.des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]");
			break;
		case 4:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			System.out.println("目的地3的包裹共:"+GlobalVariance.des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]");
			System.out.println("目的地4的包裹共:"+GlobalVariance.des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]");
			break;
		case 5:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			System.out.println("目的地3的包裹共:"+GlobalVariance.des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]");
			System.out.println("目的地4的包裹共:"+GlobalVariance.des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]");
			System.out.println("目的地5的包裹共:"+GlobalVariance.des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]");
			break;
		case 6:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			System.out.println("目的地3的包裹共:"+GlobalVariance.des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]");
			System.out.println("目的地4的包裹共:"+GlobalVariance.des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]");
			System.out.println("目的地5的包裹共:"+GlobalVariance.des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]");
			System.out.println("目的地6的包裹共:"+GlobalVariance.des[5]+",ID为["+(dPackages[4]+1)+"..."+dPackages[5]+"]");
			
			break;
		case 7:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			System.out.println("目的地3的包裹共:"+GlobalVariance.des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]");
			System.out.println("目的地4的包裹共:"+GlobalVariance.des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]");
			System.out.println("目的地5的包裹共:"+GlobalVariance.des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]");
			System.out.println("目的地6的包裹共:"+GlobalVariance.des[5]+",ID为["+(dPackages[4]+1)+"..."+dPackages[5]+"]");
			System.out.println("目的地7的包裹共:"+GlobalVariance.des[6]+",ID为["+(dPackages[5]+1)+"..."+dPackages[6]+"]");
			break;
		case 8:
			System.out.println("目的地1的包裹共:"+GlobalVariance.des[0]+",ID为[1..."+dPackages[0]+"]");
			System.out.println("目的地2的包裹共:"+GlobalVariance.des[1]+",ID为["+(dPackages[0]+1)+"..."+dPackages[1]+"]");
			System.out.println("目的地3的包裹共:"+GlobalVariance.des[2]+",ID为["+(dPackages[1]+1)+"..."+dPackages[2]+"]");
			System.out.println("目的地4的包裹共:"+GlobalVariance.des[3]+",ID为["+(dPackages[2]+1)+"..."+dPackages[3]+"]");
			System.out.println("目的地5的包裹共:"+GlobalVariance.des[4]+",ID为["+(dPackages[3]+1)+"..."+dPackages[4]+"]");
			System.out.println("目的地6的包裹共:"+GlobalVariance.des[5]+",ID为["+(dPackages[4]+1)+"..."+dPackages[5]+"]");
			System.out.println("目的地7的包裹共:"+GlobalVariance.des[6]+",ID为["+(dPackages[5]+1)+"..."+dPackages[6]+"]");
			System.out.println("目的地8的包裹共:"+GlobalVariance.des[7]+",ID为["+(dPackages[6]+1)+"..."+dPackages[7]+"]");
			break;
		default:
			break;
		}
		for (int i = 2*GlobalVariance.desNum ; i < 15; i++) {
			GlobalVariance.save[i] = 0;
		}
		
		GlobalVariance.save[0] = 1;
		GlobalVariance.save[1] = dPackages[0];
		for (int i = 2; i < 15; i++) {
			if(i%2 == 0) {
				GlobalVariance.save[i] = dPackages[i/2 - 1] + 1;
			}
			else {
				GlobalVariance.save[i] = dPackages[i/2];
			}
		}

		GlobalVariance.Method2();
		GlobalVariance.Method4();
		
		
		
		
		
		
	}
}
