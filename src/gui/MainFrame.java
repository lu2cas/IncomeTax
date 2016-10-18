package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setResizable(false);
		setTitle("C\u00E1lculo de imposto de renda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 494, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("Arquivo");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Sair");
		mnFile.add(mntmExit);
		
		JMenu mnCalculate = new JMenu("Calcular imposto de renda");
		menuBar.add(mnCalculate);
		
		JMenuItem mntmSimplifiedTaxReturn = new JMenuItem("Declara\u00E7\u00E3o simplificada");
		mnCalculate.add(mntmSimplifiedTaxReturn);
		
		JMenuItem mntmCompleteTaxReturn = new JMenuItem("Declara\u00E7\u00E3o completa");
		mnCalculate.add(mntmCompleteTaxReturn);
	}
}
