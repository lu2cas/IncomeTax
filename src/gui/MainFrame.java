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
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	private JPanel panelSimpifiedTaxReturn;
	private JPanel panelCompleteTaxReturn;

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
		panelSimpifiedTaxReturn = new JPanel();
		panelSimpifiedTaxReturn.setBounds(0, 0, 494, 372);
		panelSimpifiedTaxReturn.setLayout(null);

		JLabel lblFoo = new JLabel();
		lblFoo.setBounds(227, 172, 46, 14);
		lblFoo.setText("FUBAR");
		panelSimpifiedTaxReturn.add(lblFoo);
//contentPane.add(panelSimpifiedTaxReturn);
		// Declaração de imposto de renda completa
		panelCompleteTaxReturn = new JPanel();
		panelCompleteTaxReturn.setBounds(0, 0, 494, 372);
		panelCompleteTaxReturn.setLayout(null);

		JLabel lblBar = new JLabel();
		lblBar.setBounds(227, 172, 46, 14);
		lblBar.setText("SNAFU");
		panelCompleteTaxReturn.add(lblBar);
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
