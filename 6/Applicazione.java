package it.domi;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;




public class Applicazione extends JFrame{
	private static final long serialVersionUID = 1L;
	
	

	public Applicazione() {
		super("Anagramma");
		
		GridBagLayoutAnagramma gridBagLayoutAnagramma = new GridBagLayoutAnagramma();
		
		add(gridBagLayoutAnagramma);
	
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	
	public class GridBagLayoutAnagramma extends JPanel{
		private static final long serialVersionUID = 1L;
		
		private JLabel parola,parola2;
		private JPanel panel;
		private JTextField textField,textField2;
		private JButton parolaButton;
		
		
		
		public GridBagLayoutAnagramma() {
			this.build();
		}
		
		private void build() {
			panel = new JPanel(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			JTextArea localConsole = new JTextArea(5, 20);
			localConsole.append("Anagrammi:\n");
			localConsole.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(localConsole,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			add(panel);
			
			this.parola = new JLabel("Parola:");
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.insets = new Insets(5, 0, 0, 10);
			gbc.anchor = GridBagConstraints.LINE_END;
			panel.add(this.parola, gbc);
				
			
			this.textField = new JTextField(15);
			gbc.gridx = 1;
			gbc.gridy = 0;
			gbc.anchor = GridBagConstraints.LINE_START;
			panel.add(this.textField, gbc);

				
			parolaButton = new JButton("Invia");
			gbc.gridx = 2;
			gbc.gridy = 0;
			gbc.anchor = GridBagConstraints.LINE_START;
			panel.add(this.parolaButton, gbc);
			parolaButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						String parolaInserita = textField.getText().toLowerCase();
						String anagramma = textField2.getText().toLowerCase();
						if(parolaInserita.isEmpty() || anagramma.isEmpty()) {
							JOptionPane.showMessageDialog(Applicazione.this ,"Non hai compilato i campi","Warning", JOptionPane.ERROR_MESSAGE);
						}else if(parolaInserita.length() == anagramma.length() && sameChars(parolaInserita, anagramma)){
								  
								localConsole.append("["+anagramma+"]\n");
						}else {
							JOptionPane.showMessageDialog(Applicazione.this ,"Non è un anagramma","Warning", JOptionPane.ERROR_MESSAGE);

						}
								
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
						
					
				}
			});
			 
			this.parola2 = new JLabel("Possibile Anagramma:");
			gbc.gridx = 0;
			gbc.gridy = 1;
			gbc.insets = new Insets(5, 0, 0, 10);
			gbc.anchor = GridBagConstraints.LINE_END;
			panel.add(this.parola2, gbc);
				
			
			this.textField2 = new JTextField(15);
			gbc.gridx = 1;
			gbc.gridy = 1;
			gbc.anchor = GridBagConstraints.LINE_START;
			panel.add(this.textField2, gbc);

			
			
					
			gbc.fill = GridBagConstraints.CENTER;
			gbc.gridx = 0;
			gbc.gridy = 1;
			gbc.gridwidth = 3; 
			add(scrollPane, gbc);
			
			
			
			
		}
		
		public boolean sameChars(String firstStr, String secondStr) {
			  char[] first = firstStr.toCharArray();
			  char[] second = secondStr.toCharArray();
			  Arrays.sort(first);
			  Arrays.sort(second);
			  return Arrays.equals(first, second);
			}
		
	}
	
	
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Applicazione();
			}
		});
	}

}
