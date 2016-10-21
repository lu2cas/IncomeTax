package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Main extends JFrame {

	private JPanel contentPane;

	private SimplifiedTaxReturnPanel panelSimpifiedTaxReturn;
	private CompleteTaxReturnPanel panelCompleteTaxReturn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setResizable(false);
		setTitle("C\u00E1lculo de imposto de renda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Menu principal
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 494, 21);
		contentPane.add(menuBar);

		JMenu mnFile = new JMenu("Arquivo");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Sair");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);

		JMenu mnTaxReturns = new JMenu("Declara\u00E7\u00F5es");
		menuBar.add(mnTaxReturns);

		JMenuItem mntmSimplifiedTaxReturn = new JMenuItem("Declara\u00E7\u00E3o simplificada");
		mnTaxReturns.add(mntmSimplifiedTaxReturn);
		mntmSimplifiedTaxReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmSimplifiedTaxReturn_actionPerformed(e);
			}
		});

		JMenuItem mntmCompleteTaxReturn = new JMenuItem("Declara\u00E7\u00E3o completa");
		mntmCompleteTaxReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmCompleteTaxReturn_actionPerformed(e);
			}
		});
		mnTaxReturns.add(mntmCompleteTaxReturn);

		// Declaração de imposto de renda simplficada
		panelSimpifiedTaxReturn = new SimplifiedTaxReturnPanel();
		panelSimpifiedTaxReturn.makeForm();

		// Declaração de imposto de renda completa
		panelCompleteTaxReturn = new CompleteTaxReturnPanel();
		panelCompleteTaxReturn.makeForm();
	}

	protected void do_mntmSimplifiedTaxReturn_actionPerformed(ActionEvent e) {
		changePanel(panelSimpifiedTaxReturn);
	}

	protected void do_mntmCompleteTaxReturn_actionPerformed(ActionEvent e) {
		changePanel(panelCompleteTaxReturn);
	}

	private void changePanel(JPanel panel) {
		if (contentPane.getComponents().length > 1) {
			contentPane.remove(contentPane.getComponent(1));
		}
		contentPane.add(panel);
		contentPane.revalidate();
		contentPane.repaint();
	}
}
