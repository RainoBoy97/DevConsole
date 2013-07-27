package me.rainoshockzz.devconsole;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Window() {
		javax.swing.JScrollPane ScrollPane = new javax.swing.JScrollPane();
		javax.swing.JTextPane Display = new javax.swing.JTextPane();
		javax.swing.GroupLayout Layout = new javax.swing.GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(Layout);
        Layout.setHorizontalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        Layout.setVerticalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        ScrollPane.setViewportView(Display);
        Display.setEditable(false);
	    this.setTitle(DevConsole.NAME);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setSize(800, 600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
	}

}
