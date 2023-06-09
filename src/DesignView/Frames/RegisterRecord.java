package DesignView.Frames;

import javax.swing.*;

import DesignView.Components.Numeric;
import DesignView.RecordHandler.GameRecords;
import DesignView.RecordHandler.RecordItem;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegisterRecord extends JDialog {
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel label1;
	private javax.swing.JLabel label2;
	private javax.swing.JTextField txtField;
	private javax.swing.JTextField txtPlayerName;
	private static String registredName;
	private static int registredScore;

	public String getRegistredName(){
		return registredName;
	}


	/**
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
			java.util.logging.Logger.getLogger(DesignView.Frames.RegisterRecord.class.getName()).log(java.util.logging.Level.SEVERE,
					null,	ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.RegisterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.RegisterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DesignView.Frames.RegisterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegisterRecord().setVisible(true);

			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public RegisterRecord() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				MainMenu.main(null);
			}
		});
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		label1 = new javax.swing.JLabel();
		label2 = new javax.swing.JLabel();
		txtPlayerName = new javax.swing.JTextField();
		txtField = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(0, 0, 128, 80));

		jLabel2.setBackground(new java.awt.Color(204, 204, 204));
		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(204, 204, 204));
		jLabel2.setText("Record your time");

		label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		label1.setForeground(new java.awt.Color(204, 204, 204));
		label1.setText("Player Name:");

		label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		label2.setForeground(new java.awt.Color(204, 204, 204));
		label2.setText("Score:");

		txtPlayerName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPlayerNameActionPerformed(evt);
			}
		});
		{
			txtField.setText(Numeric.toPersianNumberic("0"));
			txtField.setEditable(false);
		}

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
		jButton1.setForeground(new java.awt.Color(0, 0, 0));
		jButton1.setText("Record Keeping");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
		jButton2.setForeground(new java.awt.Color(0, 0, 0));
		jButton2.setText("No,thanks");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\time-record (3).png")); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(56, 56, 56)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(45, 45, 45)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(79, 79, 79)
												.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(34, 34, 34)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(txtPlayerName)
																.addComponent(txtField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addGap(0, 107, Short.MAX_VALUE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(168, 168, 168))
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(43, 43, 43)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(34, 34, 34))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
												.addContainerGap()
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(label1)
										.addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(44, 44, 44)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(label2)
										.addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(23, 23, 23))
		);

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 520, 350));

		jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\Wal (2).jpg")); // NOI18N
		jLabel1.setText("jLabel1");
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 530));

		setSize(new java.awt.Dimension(1036, 543));
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void txtPlayerNameActionPerformed(java.awt.event.ActionEvent evt) {


	}



	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtPlayerName.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter your name", "Warning", JOptionPane.WARNING_MESSAGE);
		} else if (txtPlayerName.getText().contains(",") || txtPlayerName.getText().contains("|")) {
			JOptionPane.showMessageDialog(null, "Please choose a name that contains legal characters", "Warning", JOptionPane.WARNING_MESSAGE);
		} else {
			registredName = txtPlayerName.getText();
			GameRecords.saveRecord(new RecordItem(registredName, registredScore));
			dispose();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

				dispose();
	}

	public RegisterRecord(int score) {
		this();
		registredScore = score;
		txtField.setText(Numeric.toPersianNumberic(String.valueOf(registredScore)));
	}
}
