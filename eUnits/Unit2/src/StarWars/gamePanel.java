package StarWars;

//Torbert, e-mail: smtorbert@fcps.edu
//version 6.17.2003
//Billington, version 7.25.2007

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class gamePanel extends JPanel{

	//homepage
	private ImageIcon title;
	private int shiptype = 1;
	private int enter = 0;
	private ImageIcon ship1;
	private ImageIcon ship2;
	private ImageIcon ship3;
	private ImageIcon ship4;
	
	private static final Color BACKGROUND = new Color(204, 204, 204);
	private background background;
	private BufferedImage myImage;
	private Graphics2D myBuffer;
	private Timer T;
	private Timer[] t = new Timer[5];
	private int xPos = (int) (Math.random() * (300 - 200 + 1)) + 200;// 隨機產生在x=200~300間
	private int xxPos = (int) (Math.random() * (300 - 200 + 1)) + 200;// 隨機產生在x=200~300間
	private int yPos = 40, yPos2 = 180;
	private int shipx = 200;// ship display
	private int shipy = 600;
	private int stage = 0;
	// stage 1 stuff
	private int enemy1_1_life = 1, enemy1_2_life = 1, enemy1_3_life = 1;
	private enemy[] enemy1 = new enemy[3];
	private enemybullets[] eb1 = new enemybullets[3];
	// stage 2 stuff
	private int enemy2_1_life = 1, enemy2_2_life = 1, enemy2_3_life = 1;
	private enemy[] enemy2 = new enemy[3];
	private enemybullets[] eb2 = new enemybullets[3];
	// stage 3 stuff
	private int enemy3_1_life = 1, enemy3_2_life = 1, enemy3_3_life = 1, enemy3_4_life = 1;
	private enemy[] enemy3 = new enemy[4];
	private enemybullets[] eb3 = new enemybullets[4];
	// stage 4 stuff
	private int enemy4_1_life = 1, enemy4_2_life = 1, enemy4_3_life = 1;
	private int enemy4_4_life = 1, enemy4_5_life = 1, enemy4_6_life = 1;
	private enemy[] enemy4 = new enemy[6];
	private enemybullets[] eb4 = new enemybullets[6];
	// boss stuff
	private int xboss = 200;
	private int yboss = 20;
	private Boss boss;
	private int boss_life = 10;
	private enemybullets[] bossb = new enemybullets[12];

	private int dis = 0;
	private int life = 3;// ship life
	private int counts = 0;// hit enemy
	private int bullettime = 0; // enemy bullet time
	private spaceshipbullets sb;
	private spaceShip ship;
	private gameover gameover;
	private victory victory;
	
	private Timer returnTimer;
	private int reset = 0;
	
	public gamePanel() {
		title = new ImageIcon(gamePanel.class.getResource("starWarTitle.png"));
		ship1 = new ImageIcon(gamePanel.class.getResource("R0.png"));
		ship2 = new ImageIcon(gamePanel.class.getResource("R1.png"));
		ship3 = new ImageIcon(gamePanel.class.getResource("R2.png"));
		ship4 = new ImageIcon(gamePanel.class.getResource("R3.png"));
		
        //homepage
		myImage = new BufferedImage(500, 700, BufferedImage.TYPE_INT_RGB);
		myBuffer = (Graphics2D) myImage.getGraphics();
		myBuffer.setColor(Color.black);
		myBuffer.fillRect(0, 0, 500, 700);
		myBuffer.drawImage(title.getImage(),-300,-120,1100,450,null);
		
		addKeyListener(new Key());
		setFocusable(true);
		
		returnTimer = new Timer(1, new returnListener());
		T = new Timer(20, new Listener());
		T.start();
		
		myImage = new BufferedImage(500, 700, BufferedImage.TYPE_INT_RGB);
		myBuffer = (Graphics2D) myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, 500, 700);
		background = new background(0, 0, 500, 700);
		// stage 1 enemy
		dis = 0;
		for (int i = 0; i <= 2; i++) {
			enemy1[i] = new enemy(xPos + dis, yPos, 50, 50);
			eb1[i] = new enemybullets(xPos + dis, yPos+90, 20, 20);
			dis = dis + 50;
		}
		// stage 2 enemy
		dis = 0;
		for (int i = 0; i <= 2; i++) {
			enemy2[i] = new enemy(xPos + dis, yPos, 50, 50);
			eb2[i] = new enemybullets(xPos + dis, yPos +90, 20, 20);
			dis = dis + 75;
		}
		// stage 3 enemy
		dis = 0;
		for (int i = 0; i <= 3; i++) {
			enemy3[i] = new enemy(xPos + dis, yPos, 50, 50);
			eb3[i] = new enemybullets(xPos + dis, yPos +90, 20, 20);
			dis = dis + 50;
		}
		// stage 4 enemy
		dis = 0;
		for (int i = 0; i <= 2; i++) {
			enemy4[i] = new enemy(xPos + dis, yPos, 50, 50);
			enemy4[i + 3] = new enemy(xxPos + dis - 10, yPos2, 50, 50);
			eb4[i] = new enemybullets(xPos + dis, yPos +90, 20, 20);
			eb4[i + 3] = new enemybullets(xxPos + dis - 10, yPos2 +90, 20, 20);
			dis = dis + 75;
		}
		// stage boss
		dis = 0;
		boss = new Boss(xboss, yboss, 100, 100);
		for (int i = 0; i <= 5; i++) {
			bossb[i] = new enemybullets(xboss + dis, yboss + 100, 20, 20);
			bossb[i + 6] = new enemybullets(xboss - dis, yboss + 100, 20, 20);
			dis = dis + 30;
		}

		// spaceship
		sb = new spaceshipbullets(shipx, 560, 50, 50);
		ship = new spaceShip(shipx, shipy, 50, 50, shiptype);
		// gameover
		gameover = new gameover(0, 0, 500, 700);
		// victiory
		victory = new victory(0, 0, 500, 700);

		
		// stage 1
//
//		t[0] = new Timer(25, new Listener0());
//		t[0].start();

	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	public class Key extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_1) {
				shiptype = 1;
			}
			if (e.getKeyCode() == KeyEvent.VK_2) {
				shiptype = 2;
			}
			if (e.getKeyCode() == KeyEvent.VK_3) {
				shiptype = 3;
			}
			if (e.getKeyCode() == KeyEvent.VK_4) {
				shiptype= 4;
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				enter = 1;
			}
			if (e.getKeyCode() == KeyEvent.VK_W) {
				ship.forward();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				ship.backward();
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				ship.moveLeft();
			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				ship.moveRight();
			}
			
			if(e.getKeyCode() == KeyEvent.VK_R) {
				reset = 1;
			}
		}
	}
	//homepage
	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			myBuffer.setColor(Color.black);
			myBuffer.fillRect(0, 0, 500, 700);
			myBuffer.drawImage(title.getImage(),-300,-120,1100,450,null);
			
			myBuffer.setColor(Color.white);
			myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
			myBuffer.drawString("Tap w,a,s,d to control your ship ", 128, 220);
			myBuffer.drawString("Tap 1,2,3,4 to choose your ship ", 130, 600);
			myBuffer.drawString("Tap Enter to start ", 180, 650);
			
			if(shiptype == 1) {
				myBuffer.drawImage(ship1.getImage(),100,250,300,300,null);
			}
			else if(shiptype == 2) {
				myBuffer.drawImage(ship2.getImage(),100,250,300,300,null);
			}
			else if(shiptype == 3) {
				myBuffer.drawImage(ship3.getImage(),100,250,300,300,null);
			}
			else if(shiptype == 4) {
				myBuffer.drawImage(ship4.getImage(),100,250,300,300,null);
			}
			if(enter == 1) {
				myBuffer.setColor(Color.black);
				myBuffer.fillRect(0, 0, 500, 700);
				T.stop();
				
				// spaceship
				sb = new spaceshipbullets(shipx, 560, 50, 50);
				ship = new spaceShip(shipx, shipy, 50, 50, shiptype);
				
				counts = 3;
				bullettime = 0;
				t[1] = new Timer(20, new Listener1());
				t[1].start();
			}
			
			
			repaint();
		}
	}

	// stage 1
	private class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, 500, 700);
			background.draw(myBuffer);

			// enemy move
			// enemy1
			if (enemy1_1_life == 1) {
				enemy1[0].move(500);
				enemygotshoot(enemy1[0], 1, sb, stage + 1);
				enemy1[0].draw(myBuffer);
			}
			xPos = enemy1[0].getX() - 10;
			if (enemy1_1_life == 1 && bullettime > 10) {
				eb1[0].move(xPos, yPos, 700);
				eb1[0].draw(myBuffer);
			} else if (enemy1_1_life == 0 && eb1[0].getY() == 130 && bullettime > 10) {
				eb1[0].setY(700);
			} else if (eb1[0].getY() < 680 && bullettime > 10) {
				eb1[0].move(xPos, yPos,700);
				eb1[0].draw(myBuffer);
			}
			// enemy2
			if (enemy1_2_life == 1) {
				enemy1[1].move(500);
				enemygotshoot(enemy1[1], 2, sb, stage + 1);
				enemy1[1].draw(myBuffer);
			}
			xPos = enemy1[1].getX() - 10;
			if (enemy1_2_life == 1 && bullettime > 50) {
				eb1[1].move(xPos, yPos, 700);
				eb1[1].draw(myBuffer);
			} else if (enemy1_2_life == 0 && eb1[1].getY() == 130 && bullettime > 50) {
				eb1[1].setY(700);
			} else if (eb1[1].getY() < 680 && bullettime > 50) {
				eb1[1].move(xPos, yPos, 700);
				eb1[1].draw(myBuffer);
			}
			// enemy3
			if (enemy1_3_life == 1) {
				enemy1[2].move(500);
				enemygotshoot(enemy1[2], 3, sb, stage + 1);
				enemy1[2].draw(myBuffer);
			}
			xPos = enemy1[2].getX() - 10;
			if (enemy1_3_life == 1 && bullettime > 30) {
				eb1[2].move(xPos, yPos,700);
				eb1[2].draw(myBuffer);
			} else if (enemy1_3_life == 0 && eb1[2].getY() == 130 && bullettime > 30) {
				eb1[2].setY(700);
			} else if (eb1[2].getY() < 680 && bullettime > 30) {
				eb1[2].move(xPos, yPos, 700);
				eb1[2].draw(myBuffer);
			}
			// space move
			if (counts == 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				counts = 3;// next stage enemy
				bullettime = 0;// enemy bullettime to 0;
				t[1].stop();
				// go to stage 2
				t[2] = new Timer(18, new Listener2());
				t[2].start();
			} else if (life > 0) {
				bullettime++; // enemy bullet time
				spacegotshoot(ship, eb1[0], 1);
				spacegotshoot(ship, eb1[1], 1);
				spacegotshoot(ship, eb1[2], 1);
				ship.draw(myBuffer);
				shipx = ship.getX() + 10;
				shipy = ship.getY() - 10;
				sb.move(shipx, shipy, 0);
				sb.draw(myBuffer);

				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Stage: " + stage + 1, 30, 30);
				myBuffer.setColor(Color.green);
				myBuffer.drawString("Life: " + life, 30, 660);
			}

			// gameover
			else if (life <= 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				gameover.draw(myBuffer);
				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Your Stage: " + stage + 1, 180, 500);
				myBuffer.drawString("<Press R to Return>",160 ,570);
				returnTimer.start();
				t[1].stop();
			}

			repaint();
		}
	}

	// stage 2
	private class Listener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, 500, 700);
			background.draw(myBuffer);

			// enemy move
			// enemy1
			if (enemy2_1_life == 1) {
				enemy2[0].move(500);
				enemygotshoot(enemy2[0], 1, sb, stage + 2);
				enemy2[0].draw(myBuffer);
			}
			xPos = enemy2[0].getX() - 10;
			if (enemy2_1_life == 1 && bullettime > 45) {
				eb2[0].move(xPos, yPos, 700);
				eb2[0].draw(myBuffer);
			} else if (enemy2_1_life == 0 && eb2[0].getY() == 130 && bullettime > 45) {
				eb2[0].setY(700);
			} else if (eb2[0].getY() < 680 && bullettime > 45) {
				eb2[0].move(xPos, yPos,700);
				eb2[0].draw(myBuffer);
			}
			// enemy2
			if (enemy2_2_life == 1) {
				enemy1[1].move(500);
				enemygotshoot(enemy1[1], 2, sb, stage + 2);
				enemy1[1].draw(myBuffer);
			}
			xPos = enemy2[1].getX() - 10;
			if (enemy2_2_life == 1 && bullettime > 70) {
				eb2[1].move(xPos, yPos,700);
				eb2[1].draw(myBuffer);
			} else if (enemy2_2_life == 0 && eb2[1].getY() == 130 && bullettime > 70) {
				eb2[1].setY(700);
			} else if (eb2[1].getY() < 680 && bullettime > 70) {
				eb2[1].move(xPos, yPos,700);
				eb2[1].draw(myBuffer);
			}
			// enemy3
			if (enemy2_3_life == 1) {
				enemy2[2].move(500);
				enemygotshoot(enemy2[2], 3, sb, stage + 2);
				enemy2[2].draw(myBuffer);
			}
			xPos = enemy2[2].getX() - 10;
			if (enemy2_3_life == 1 && bullettime > 100) {
				eb2[2].move(xPos, yPos,700);
				eb2[2].draw(myBuffer);
			} else if (enemy2_3_life == 0 && eb2[2].getY() == 130 && bullettime > 100) {
				eb2[2].setY(700);
			} else if (eb2[2].getY() < 680 && bullettime > 100) {
				eb2[2].move(xPos, yPos,700);
				eb2[2].draw(myBuffer);
			}
			// space move
			if (counts == 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				counts = 4;// next stage enemy
				bullettime = 0;
				t[2].stop();
				// go to stage 3
				t[3] = new Timer(20, new Listener3());
				t[3].start();
			} else if (life > 0) {
				bullettime++;
				spacegotshoot(ship, eb2[0], 1);
				spacegotshoot(ship, eb2[1], 1);
				spacegotshoot(ship, eb2[2], 1);
				ship.draw(myBuffer);
				shipx = ship.getX() + 10;
				shipy = ship.getY() - 10;
				sb.move(shipx, shipy, 0);
				sb.draw(myBuffer);

				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Stage: " + stage + 2, 30, 30);
				myBuffer.setColor(Color.green);
				myBuffer.drawString("Life: " + life, 30, 660);
			}

			// gameover
			else if (life <= 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				gameover.draw(myBuffer);
				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Your Stage: " + stage + 2, 180, 500);
				myBuffer.drawString("<Press R to Return>",160 ,570);
				returnTimer.start();
				t[2].stop();
			}

			repaint();
		}
	}

	// stage 3
	private class Listener3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, 500, 700);
			background.draw(myBuffer);

			// enemy move
			// enemy1
			if (enemy3_1_life == 1) {
				enemy3[0].move(500);
				enemygotshoot(enemy3[0], 1, sb, stage + 3);
				enemy3[0].draw(myBuffer);
			}
			xPos = enemy3[0].getX() - 10;
			if (enemy3_1_life == 1 && bullettime > 10) {
				eb3[0].move(xPos, yPos,700);
				eb3[0].draw(myBuffer);
			} else if (enemy3_1_life == 0 && eb3[0].getY() == 130 && bullettime > 10) {
				eb3[0].setY(700);
			} else if (eb3[0].getY() < 680 && bullettime > 10) {
				eb3[0].move(xPos, yPos,700);
				eb3[0].draw(myBuffer);
			}
			// enemy2
			if (enemy3_2_life == 1) {
				enemy3[1].move(500);
				enemygotshoot(enemy3[1], 2, sb, stage + 3);
				enemy3[1].draw(myBuffer);
			}
			xPos = enemy3[1].getX() - 10;
			if (enemy3_2_life == 1 && bullettime > 20) {
				eb3[1].move(xPos, yPos,700);
				eb3[1].draw(myBuffer);
			} else if (enemy3_2_life == 0 && eb3[1].getY() == 130 && bullettime > 20) {
				eb3[1].setY(700);
			} else if (eb3[1].getY() < 680 && bullettime > 20) {
				eb3[1].move(xPos, yPos, 700);
				eb3[1].draw(myBuffer);
			}
			// enemy3
			if (enemy3_3_life == 1) {
				enemy3[2].move(500);
				enemygotshoot(enemy3[2], 3, sb, stage + 3);
				enemy3[2].draw(myBuffer);
			}
			xPos = enemy3[2].getX() - 10;
			if (enemy3_3_life == 1 && bullettime > 15) {
				eb3[2].move(xPos, yPos, 700);
				eb3[2].draw(myBuffer);
			} else if (enemy3_3_life == 0 && eb3[2].getY() == 130 && bullettime > 15) {
				eb3[2].setY(700);
			} else if (eb3[2].getY() < 680 && bullettime > 15) {
				eb3[2].move(xPos, yPos, 700);
				eb3[2].draw(myBuffer);
			}
			// enemy4
			if (enemy3_4_life == 1) {
				enemy3[3].move(500);
				enemygotshoot(enemy3[3], 4, sb, stage + 3);
				enemy3[3].draw(myBuffer);
			}
			xPos = enemy3[3].getX() - 10;
			if (enemy3_4_life == 1 && bullettime > 25) {
				eb3[3].move(xPos, yPos, 700);
				eb3[3].draw(myBuffer);
			} else if (enemy3_4_life == 0 && eb3[3].getY() == 130 && bullettime > 25) {
				eb3[3].setY(700);
			} else if (eb3[3].getY() < 680 && bullettime > 25) {
				eb3[3].move(xPos, yPos, 700);
				eb3[3].draw(myBuffer);
			}
			// space move
			if (counts == 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				counts = 6;
				bullettime = 0;
				t[3].stop();
				// go to stage 3
				t[4] = new Timer(15, new Listener4());
				t[4].start();
			} else if (life > 0) {
				bullettime++;
				spacegotshoot(ship, eb3[0], 1);
				spacegotshoot(ship, eb3[1], 1);
				spacegotshoot(ship, eb3[2], 1);
				spacegotshoot(ship, eb3[3], 1);
				ship.draw(myBuffer);
				shipx = ship.getX() + 10;
				shipy = ship.getY() - 10;
				sb.move(shipx, shipy, 0);
				sb.draw(myBuffer);

				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Stage: " + stage + 3, 30, 30);
				myBuffer.setColor(Color.green);
				myBuffer.drawString("Life: " + life, 30, 660);
			}

			// gameover
			else if (life <= 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				gameover.draw(myBuffer);
				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Your Stage: " + stage + 3, 180, 500);
				myBuffer.drawString("<Press R to Return>",160 ,570);
				returnTimer.start();
				t[3].stop();
			}

			repaint();
		}
	}

	// stage 4
	private class Listener4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, 500, 700);
			background.draw(myBuffer);

			// enemy move
			// enemy1
			if (enemy4_1_life == 1) {
				enemy4[0].move(500);
				enemygotshoot(enemy4[0], 1, sb, stage + 4);
				enemy4[0].draw(myBuffer);
			}

			xPos = enemy4[0].getX() - 10;
			if (enemy4_1_life == 1 && bullettime > 10) {
				eb4[0].move(xPos, yPos,700);
				eb4[0].draw(myBuffer);
			} else if (enemy4_1_life == 0 && eb4[0].getY() == 130 && bullettime > 10) {
				eb4[0].setY(700);
			} else if (eb4[0].getY() < 680 && bullettime > 10) {
				eb4[0].move(xPos, yPos, 700);
				eb4[0].draw(myBuffer);
			}
			// enemy2
			if (enemy4_2_life == 1) {
				enemy4[1].move(500);
				enemygotshoot(enemy4[1], 2, sb, stage + 4);
				enemy4[1].draw(myBuffer);
			}
			xPos = enemy4[1].getX() - 10;
			if (enemy4_2_life == 1 && bullettime > 20) {
				eb4[1].move(xPos, yPos,700);
				eb4[1].draw(myBuffer);
			} else if (enemy4_2_life == 0 && eb4[1].getY() == 130 && bullettime > 20) {
				eb4[1].setY(700);
			} else if (eb4[1].getY() < 680 && bullettime > 20) {
				eb4[1].move(xPos, yPos, 700);
				eb4[1].draw(myBuffer);
			}
			// enemy3
			if (enemy4_3_life == 1) {
				enemy4[2].move(500);
				enemygotshoot(enemy4[2], 3, sb, stage + 4);
				enemy4[2].draw(myBuffer);
			}
			xPos = enemy4[2].getX() - 10;
			if (enemy4_3_life == 1 && bullettime > 15) {
				eb4[2].move(xPos, yPos, 700);
				eb4[2].draw(myBuffer);
			} else if (enemy4_3_life == 0 && eb4[2].getY() == 130 && bullettime > 15) {
				eb4[2].setY(700);
			} else if (eb4[2].getY() < 680 && bullettime > 15) {
				eb4[2].move(xPos, yPos, 700);
				eb4[2].draw(myBuffer);
			}
			// enemy4
			if (enemy4_4_life == 1) {
				enemy4[3].move(500);
				enemygotshoot(enemy4[3], 4, sb, stage + 4);
				enemy4[3].draw(myBuffer);
			}
			xxPos = enemy4[3].getX() - 10;
			if (enemy4_4_life == 1 && bullettime > 15) {
				eb4[3].move(xxPos, yPos2, 700);
				eb4[3].draw(myBuffer);
			} else if (enemy4_4_life == 0 && eb4[3].getY() == 270 && bullettime > 15) {
				eb4[3].setY(700);
			} else if (eb4[3].getY() < 680 && bullettime > 15) {
				eb4[3].move(xxPos, yPos2, 700);
				eb4[3].draw(myBuffer);
			}
			// enemy5
			if (enemy4_5_life == 1) {
				enemy4[4].move(500);
				enemygotshoot(enemy4[4], 5, sb, stage + 4);
				enemy4[4].draw(myBuffer);
			}
			xxPos = enemy4[4].getX() - 10;
			if (enemy4_5_life == 1 && bullettime > 10) {
				eb4[4].move(xxPos, yPos2, 700);
				eb4[4].draw(myBuffer);
			} else if (enemy4_5_life == 0 && eb4[4].getY() == 270 && bullettime > 10) {
				eb4[4].setY(700);
			} else if (eb4[4].getY() < 680 && bullettime > 10) {
				eb4[4].move(xxPos, yPos2, 700);
				eb4[4].draw(myBuffer);
			}
			// enemy6
			if (enemy4_6_life == 1) {
				enemy4[5].move(500);
				enemygotshoot(enemy4[5], 6, sb, stage + 4);
				enemy4[5].draw(myBuffer);
			}
			xxPos = enemy4[5].getX() - 10;
			if (enemy4_6_life == 1 && bullettime > 20) {
				eb4[5].move(xxPos, yPos2, 700);
				eb4[5].draw(myBuffer);
			} else if (enemy4_6_life == 0 && eb4[5].getY() == 270 && bullettime > 20) {
				eb4[5].setY(700);
			} else if (eb4[5].getY() < 680 && bullettime > 20) {
				eb4[5].move(xxPos, yPos2, 700);
				eb4[5].draw(myBuffer);
			}
			// space move
			if (counts == 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);

				bullettime = 0;
				t[4].stop();
				// go to stage 3
			    t[0] = new Timer(20, new Listener0());
				t[0].start();
			} else if (life > 0) {
				bullettime++;
				spacegotshoot(ship, eb4[0], 1);
				spacegotshoot(ship, eb4[1], 1);
				spacegotshoot(ship, eb4[2], 1);
				spacegotshoot(ship, eb4[3], 2);
				spacegotshoot(ship, eb4[4], 2);
				spacegotshoot(ship, eb4[5], 2);
				ship.draw(myBuffer);
				shipx = ship.getX() + 10;
				shipy = ship.getY() - 10;
				sb.move(shipx, shipy, 0);
				sb.draw(myBuffer);

				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Stage: " + stage + 4, 30, 30);
				myBuffer.setColor(Color.green);
				myBuffer.drawString("Life: " + life, 30, 660);
			}

			// gameover
			else if (life <= 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				gameover.draw(myBuffer);
				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Your Stage: " + stage + 4, 180, 500);
				myBuffer.drawString("<Press R to Return>",160 ,570);
				returnTimer.start();
				t[4].stop();
			}

			repaint();
		}
	}

	// stage boss
	private class Listener0 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, 500, 700);
			background.draw(myBuffer);

			// enemy move
			// enemy1
			if (boss_life > 0) {
				boss.move(500, 500);
				bossgotshoot(boss, sb);
				boss.draw(myBuffer);
			}
			xboss = boss.getX();
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 7) {
				bossb[0].move(xboss, yboss, 700);
				bossb[0].draw(myBuffer);
			}
			xboss = boss.getX() + 10;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 16) {
				bossb[1].move(xboss, yboss, 700);
				bossb[1].draw(myBuffer);
			}
			xboss = boss.getX() + 20;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 13) {
				bossb[2].move(xboss, yboss, 700);
				bossb[2].draw(myBuffer);
			}
			xboss = boss.getX() + 30;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 50) {
				bossb[3].move(xboss, yboss, 700);
				bossb[3].draw(myBuffer);
			}
			xboss = boss.getX() + 40;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 28) {
				bossb[4].move(xboss, yboss, 700);
				bossb[4].draw(myBuffer);
			}
			xboss = boss.getX() + 50;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 37) {
				bossb[5].move(xboss, yboss, 700);
				bossb[5].draw(myBuffer);
			}
			xboss = boss.getX() -10;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 20) {
				bossb[6].move(xboss, yboss, 700);
				bossb[6].draw(myBuffer);
			}
			xboss = boss.getX() - 20;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 18) {
				bossb[7].move(xboss, yboss, 700);
				bossb[7].draw(myBuffer);
			}
			xboss = boss.getX() - 30;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 60) {
				bossb[8].move(xboss, yboss, 700);
				bossb[8].draw(myBuffer);
			}
			xboss = boss.getX() - 40;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 11) {
				bossb[9].move(xboss, yboss, 700);
				bossb[9].draw(myBuffer);
			}
			xboss = boss.getX() - 50;
			yboss = boss.getY();
			if (boss_life > 0 && bullettime > 44) {
				bossb[10].move(xboss, yboss, 700);
				bossb[10].draw(myBuffer);
			}
			// space move
			if (boss_life == 0) {
				myBuffer.setColor(Color.black);
				myBuffer.fillRect(0, 0, 500, 700);
				victory.draw(myBuffer);
				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));

				t[0].stop();
			} else if (life > 0) {
				bullettime++;
				for (int n = 0; n < 12; n++) {
					spacegotshoot(ship, bossb[n], 0);
				}
				bosshitship(boss,ship);
				ship.draw(myBuffer);
				shipx = ship.getX() + 10;
				shipy = ship.getY() - 10;
				sb.move(shipx, shipy, 0);
				sb.draw(myBuffer);

				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Stage: Boss", 30, 30);
				myBuffer.drawString("Bosslife: " + boss_life, 30, 50);
				myBuffer.setColor(Color.green);
				myBuffer.drawString("Life: " + life, 30, 660);
			}

			// gameover
			else if (life <= 0) {
				myBuffer.setColor(BACKGROUND);
				myBuffer.fillRect(0, 0, 500, 700);
				gameover.draw(myBuffer);
				myBuffer.setColor(Color.white);
				myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
				myBuffer.drawString("Your Stage: boss", 180, 500);
				myBuffer.drawString("<Press R to Return>",160 ,570);
				returnTimer.start();
				t[0].stop();
			}

			repaint();
		}
	}
	
	private class returnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(reset == 1) {
				enter = 0;
				life = 3;
				shipx = 200;
				shipy = 600;
				enemy1_1_life = 1; enemy1_2_life = 1; enemy1_3_life = 1;
				enemy2_1_life = 1; enemy2_2_life = 1; enemy2_3_life = 1;
				enemy3_1_life = 1; enemy3_2_life = 1; enemy3_3_life = 1;
				enemy4_1_life = 1; enemy4_2_life = 1; enemy4_3_life = 1; enemy4_4_life = 1;
				enemy4_4_life = 1; enemy4_5_life = 1; enemy4_6_life = 1;
				T.start();
				returnTimer.stop();
				reset = 0;
			}
		}
		
	}

	// hit enemy
	private void enemygotshoot(enemy e, int j, spaceshipbullets b, int whstage) {
		double d = distance(e.getX(), e.getY(), b.getX(), b.getY());
		if (d <= e.getX() / 13 + b.getX() / 13) {
			if (j == 1) {
				if (whstage == 1) {
					enemy1_1_life = 0;
				} else if (whstage == 2) {
					enemy2_1_life = 0;
				} else if (whstage == 3) {
					enemy3_1_life = 0;
				} else if (whstage == 4) {
					enemy4_1_life = 0;
				}
				counts = counts - 1;
				b.setY(shipy);
				b.setX(shipx);
			}
			if (j == 2) {
				if (whstage == 1) {
					enemy1_2_life = 0;
				} else if (whstage == 2) {
					enemy2_2_life = 0;
				} else if (whstage == 3) {
					enemy3_2_life = 0;
				} else if (whstage == 4) {
					enemy4_2_life = 0;
				}
				counts = counts - 1;
				b.setY(shipy);
				b.setX(shipx);
			}
			if (j == 3) {
				if (whstage == 1) {
					enemy1_3_life = 0;
				} else if (whstage == 2) {
					enemy2_3_life = 0;
				} else if (whstage == 3) {
					enemy3_3_life = 0;
				} else if (whstage == 4) {
					enemy4_3_life = 0;
				}
				counts = counts - 1;
				b.setY(shipy);
				b.setX(shipx);
			}
			if (j == 4) {
				if (whstage == 3) {
					enemy3_4_life = 0;
				} else if (whstage == 4) {
					enemy4_4_life = 0;
				}
				counts = counts - 1;
				b.setY(shipy);
				b.setX(shipx);
			}
			if (j == 5) {
				if (whstage == 4) {
					enemy4_5_life = 0;
				}
				counts = counts - 1;
				b.setY(shipy);
				b.setX(shipx);
			}
			if (j == 6) {
				if (whstage == 4) {
					enemy4_6_life = 0;
				}
				counts = counts - 1;
				b.setY(shipy);
				b.setX(shipx);
			}
		}
	}

	private void bossgotshoot(Boss B, spaceshipbullets b) {
//		double d = distance(B.getX(), B.getY(), b.getX(), b.getY());
//		if (d <= B.getX() / 8 + b.getX() / 8) {
//			boss_life = boss_life - 1;
//			b.setY(580);
//			b.setX(shipx);
//		}
		if (B.getX() - b.getX() < 80 && b.getX() - B.getX() < 80 && b.getY() - B.getY() > 0 && b.getY() - B.getY() < 80) {
			boss_life = boss_life - 1;
			b.setY(shipy);
			b.setX(shipx);
		}
	}
	//boss hit ship
	private void bosshitship(Boss B, spaceShip s) {
		if (B.getX() - s.getX() < 80 && s.getX() - B.getX() < 80 && s.getY() - B.getY() > 0 && s.getY() - B.getY() < 80) {
			life = 0;
		}
	}

	// ship be hit
	private void spacegotshoot(spaceShip s, enemybullets b, int k) {// k是第幾排打到
		double d = distance(s.getX(), s.getY(), b.getX(), b.getY());
		if (d <= (s.getX() / 13 + b.getX() / 13)) {
			if (k == 1) {
				life = life - 1;
				b.setY(130);
				b.setX(xPos);
			}
			if (k == 2) {
				life = life - 1;
				b.setY(270);
				b.setX(xxPos);
			}
			if (k == 0) {// boss
				life = life - 1;
				b.setY(yboss + 100);
				b.setX(xboss);
			}
		}
	}

	private double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
}