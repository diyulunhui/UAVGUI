import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	BufferedImage image = null;
	BufferedImage image1 = null;

	
	
	public MyPanel() {
		super();
		try {
			image = ImageIO.read(getClass().getResource("./Map.png"));
//			image = ImageIO.read(getClass().getResource("/Users/bruce/Desktop/UAV.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			image1 = ImageIO.read(getClass().getResource("./UAV.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		// if(GlobalVariance.flag) {
			 if( image != null) {
			 		//g.drawImage(image, 20, 20, null);
				 double a = 0.4*getWidth();
				 double b = 0.6*getWidth();
				 g.drawImage(image, (int) a, 0, (int) b , getHeight(), null);
				 // g.drawImage(img, x, y, width, height, observer)
				 //g.setColor(Color.BLACK);
				 //g.drawRect((int) a, 0, (int) b , getHeight());
				 Graphics2D g2 = (Graphics2D)g;  //g是Graphics对象
				 g2.setStroke(new BasicStroke(3.0f));
				 g2.setColor(Color.BLACK);

				 if(GlobalVariance.blast == false) {
					 for(int i = 0; i < GlobalVariance.uavNum; i++ ) {
						 if(GlobalVariance.erase == true) {
							 if( image1 != null) {
								 g.drawImage(image1, (int)(a + GlobalVariance.end_x[i]), (int)GlobalVariance.end_y[i], 25, 25, null);
							 }
						 }
//							 Line2D line = new Line2D.Double(a +GlobalVariance.start_x, GlobalVariance.start_y, a + GlobalVariance.end_x[i], GlobalVariance.end_y[i]);
//							 g2.draw(line);
					 }
				 }
				 else {
					 for(int i = 0; i < GlobalVariance.last; i++ ) {
						 if(GlobalVariance.erase == true) {
							 if( image1 != null) {
								 g.drawImage(image1, (int)(a + GlobalVariance.end_x[i]), (int)GlobalVariance.end_y[i], 25, 25, null);
							 }
						 }
//							 Line2D line = new Line2D.Double(a +GlobalVariance.start_x, GlobalVariance.start_y, a + GlobalVariance.end_x[i], GlobalVariance.end_y[i]);
//							 g2.draw(line);
					 }
				}

				 
				 
				 
			 }

//		 }
//		 else {
//			 GlobalVariance.flag = !GlobalVariance.flag;
//			 g.setColor(new Color(255,0,0));
//			// g.drawLine(GlobalVariance.start_x, GlobalVariance.start_y, GlobalVariance.end_x, GlobalVariance.end_y);
//			 
//		 }

	}

	@Override
	protected void paintChildren(Graphics g) {
		// TODO Auto-generated method stub
		super.paintChildren(g);
	}

	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.paintBorder(g);
	}

}
