package DesignView.Frames;

import java.awt.BorderLayout;

import DesignView.Components.ImagePanel;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import DesignView.Handlers.*;
import DesignView.RecordHandler.GameRecords;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import java.io.File;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;
import java.awt.ComponentOrientation;


public class MainMenu extends JFrame {

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JLabel lblBtn_Endgame;
	private javax.swing.JLabel lblBtn_Loadgame;
	private javax.swing.JLabel lblBtn_Scoreboard;
	private javax.swing.JLabel lblBtn_Startgame;
	private javax.swing.JSpinner minerHSeter;
	public javax.swing.JSpinner minerPerSeter;
	private javax.swing.JSpinner minerWSeter;

	public int getMinerWSeterValue(){
		return Integer.parseInt(minerWSeter.getValue().toString());
	}
	public int getMinerHSeterValue(){
		return Integer.parseInt(minerHSeter.getValue().toString());
	}
	public int getMinerPerSeterValue(){
		return Integer.parseInt(minerPerSeter.getValue().toString());
	}

	/*
	 * This method lunches after creating form
	 */
	public void mainMenuFinalInitalize(){
		GameRecords.loadRecords();
	}

	/*
	 * Launch the application.
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.MainMenu.class.getName()).log(java.util.logging.Level.SEVERE
					, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();

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
	public MainMenu() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		minerHSeter = new javax.swing.JSpinner();
		minerWSeter = new javax.swing.JSpinner();
		minerPerSeter = new javax.swing.JSpinner();
		lblBtn_Startgame = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		lblBtn_Loadgame = new javax.swing.JLabel();
		lblBtn_Scoreboard = new javax.swing.JLabel();
		lblBtn_Endgame = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/DesignView/Images/Explosion-48.png")));
		setTitle("Minesweeper");
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(480,  400));
		setLocationRelativeTo(null);

		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel2.setBackground(new java.awt.Color(243, 248, 255));

		jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 0));
		jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\thucc\\Downloads\\MineSweeper\\src\\DesignView\\Images\\Bomb With Timer-32.png")); // NOI18N
		jLabel1.setText("Minesweeper Game");
		jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
								.addContainerGap(148, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(142, 142, 142))
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
								.addContainerGap(17, Short.MAX_VALUE)
								.addComponent(jLabel1)
								.addGap(21, 21, 21))
		);

		jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 70));

		jPanel3.setBackground(new java.awt.Color(222, 236, 255));

		jLabel2.setFont(new java.awt.Font("FZShuTi", 0, 15)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 0, 0));
		jLabel2.setText("Length (maximum 25)");

		jLabel3.setFont(new java.awt.Font("FZShuTi", 0, 15)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(0, 0, 0));
		jLabel3.setText("Width (maximum 25)");

		jLabel4.setFont(new java.awt.Font("FZShuTi", 0, 15)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(0, 0, 0));
		jLabel4.setText("Mines(%)");

		minerHSeter.setModel(new javax.swing.SpinnerNumberModel(10, 5, 35, 1));

		minerWSeter.setModel(new javax.swing.SpinnerNumberModel(10, 5, 25, 1));

		minerPerSeter.setModel(new javax.swing.SpinnerNumberModel(20, 5, 80, 1));

		lblBtn_Startgame.setBackground(new java.awt.Color(174, 225, 225));
		lblBtn_Startgame.setName("startBtn");
		lblBtn_Startgame.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
		lblBtn_Startgame.setForeground(new java.awt.Color(0, 0, 0));
		lblBtn_Startgame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblBtn_Startgame.setIcon(new javax.swing.ImageIcon("C:\\Users\\thucc\\Downloads\\MineSweeper\\src\\DesignView\\Images\\Explosion-32.png")); // NOI18N
		lblBtn_Startgame.setText("Start");
		lblBtn_Startgame.setToolTipText("");
		lblBtn_Startgame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
		lblBtn_Startgame.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		lblBtn_Startgame.setIconTextGap(10);
		lblBtn_Startgame.setPreferredSize(new java.awt.Dimension(125, 40));
		lblBtn_Startgame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblBtn_Startgame.addMouseListener(new LabelButtons(this).createMouseListener());

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addGap(122, 122, 122)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(minerHSeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(lblBtn_Startgame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addGap(58, 58, 58)))
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(minerWSeter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(minerPerSeter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(130, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblBtn_Startgame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2)
										.addComponent(minerHSeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(10, 10, 10)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(minerWSeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(minerPerSeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4))
								.addContainerGap(26, Short.MAX_VALUE))
		);

		jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 540, 160));

		jPanel4.setBackground(new java.awt.Color(198, 207, 255));

		jLabel5.setFont(new java.awt.Font("STXihei", 2, 12)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(0, 0, 0));
		jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\IdeaProjects\\ProjectDSA\\src\\DesignView\\Images\\Error-16.png")); // NOI18N
		jLabel5.setText("<html><body style='text-align:center;'><div>After changing the values of the above settings</div><div>Press the Enter key</div></body></html>");
		jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		jLabel5.setIconTextGap(20);

		jLabel6.setFont(new java.awt.Font("STXihei", 2, 12)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 0, 0));
		jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\IdeaProjects\\ProjectDSA\\src\\DesignView\\Images\\Flag-16.png")); // NOI18N
		jLabel6.setText("<html><body style='text-align:enter;'> Enter characters and punctuation marks on game board cells, use the <b>Red Flag</b> keyboard layout. </body></html>");
		jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		jLabel6.setIconTextGap(15);

		lblBtn_Loadgame.setBackground(new java.awt.Color(174, 225, 225));
		lblBtn_Loadgame.setName("loadBtn");
		lblBtn_Loadgame.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
		lblBtn_Loadgame.setForeground(new java.awt.Color(0, 0, 0));
		lblBtn_Loadgame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblBtn_Loadgame.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\IdeaProjects\\ProjectDSA\\src\\DesignView\\Images\\Explosion-load32.png")); // NOI18N
		lblBtn_Loadgame.setText("Load the last played game");
		lblBtn_Loadgame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
		lblBtn_Loadgame.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		lblBtn_Loadgame.setIconTextGap(10);
		lblBtn_Loadgame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblBtn_Loadgame.addMouseListener(new LabelButtons(this).createMouseListener());
		File saveFile = new File("save.ser");
		if (saveFile.exists()) lblBtn_Loadgame.setEnabled(true);
		else lblBtn_Loadgame.setEnabled(false);

		lblBtn_Scoreboard.setBackground(new java.awt.Color(174, 225, 225));
		lblBtn_Scoreboard.setName("recordsBtn");
		lblBtn_Scoreboard.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
		lblBtn_Scoreboard.setForeground(new java.awt.Color(0, 0, 0));
		lblBtn_Scoreboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblBtn_Scoreboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\thucc\\Downloads\\MineSweeper\\src\\DesignView\\Images\\Ratings-32.png")); // NOI18N
		lblBtn_Scoreboard.setText("Points");
		lblBtn_Scoreboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
		lblBtn_Scoreboard.setFocusable(false);
		lblBtn_Scoreboard.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		lblBtn_Scoreboard.setIconTextGap(10);
		lblBtn_Scoreboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblBtn_Scoreboard.addMouseListener(new LabelButtons(this).createMouseListener());


		lblBtn_Endgame.setBackground(new java.awt.Color(174, 225, 225));
		lblBtn_Endgame.setName("exitBtn");
		lblBtn_Endgame.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
		lblBtn_Endgame.setForeground(new java.awt.Color(0, 0, 0));
		lblBtn_Endgame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblBtn_Endgame.setIcon(new javax.swing.ImageIcon("C:\\Users\\thucc\\Downloads\\MineSweeper\\src\\DesignView\\Images\\Exit Sign-32.png")); // NOI18N
		lblBtn_Endgame.setText("Exit");
		lblBtn_Endgame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
		lblBtn_Endgame.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		lblBtn_Endgame.setIconTextGap(10);
		lblBtn_Endgame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblBtn_Endgame.addMouseListener(new LabelButtons(this).createMouseListener());

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addGap(126, 126, 126)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblBtn_Endgame, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBtn_Scoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addComponent(jLabel5)
												.addComponent(lblBtn_Loadgame, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(102, Short.MAX_VALUE))
		);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(lblBtn_Loadgame, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(lblBtn_Scoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12)
								.addComponent(lblBtn_Endgame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
		);

		jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 540, 260));

		jPanel6.setBackground(new java.awt.Color(232, 211, 255));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 540, Short.MAX_VALUE)
		);
		jPanel6Layout.setVerticalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 10, Short.MAX_VALUE)
		);

		jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, 540, 10));

		jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\thucc\\Downloads\\MineSweeper\\src\\DesignView\\Images\\Wal (2).jpg")); // NOI18N
		jLabel8.setText("jLabel8");
		jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		pack();
		// </editor-fold>
		mainMenuFinalInitalize();
	}

}