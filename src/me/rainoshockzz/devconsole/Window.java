package me.rainoshockzz.devconsole;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public Window() {
		super(DevConsole.NAME);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TextArea console = new TextArea();
		console.setEditable(false);
		console.setBounds(10, 10, 600, 552);
		contentPane.add(console);

		Button aboutBtn = new Button("About");
		aboutBtn.setBounds(741, 540, 43, 22);
		aboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "DevConsole is an external developer console for Minecraft 1.6.0 and higher." + "\n" + "With more features than the normal developer console built into the new Minecraft launcher." + "\n\n" + "Coded by RainoBoy97 and XX_iiShockzz_XX", "DevConsole", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(aboutBtn);

		javax.swing.JScrollPane ScrollPane = new javax.swing.JScrollPane();
		javax.swing.JTextPane Display = new javax.swing.JTextPane();
		javax.swing.GroupLayout Layout = new javax.swing.GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(Layout);
		Layout.setHorizontalGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(Layout.createSequentialGroup().addContainerGap().addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE).addContainerGap()));
		Layout.setVerticalGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(Layout.createSequentialGroup().addContainerGap().addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE).addContainerGap()));
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
