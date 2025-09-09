package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;



public class TelaTimeThread extends JDialog{
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de componentes */
	
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField(); 
	
	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Stop");
	
	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	
	
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField(); 
	
	
	public TelaTimeThread() {  /* Executa o que tiver dentro no momento da abertura ou execução */
		
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(320, 260)); /* Dimensões (Width, Height) */
		
		
		setLocationRelativeTo(null);
		setResizable(false);
		/* Primeira parte concluída */
		
		
		
		/* Controlador de posicionamento de componentes */
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		
		//********************************************************
		
		
		gridBagConstraints.gridwidth = 1;
		
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
		
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  /* Executa o clique no botão */
				
				
			if (fila == null) {
				fila = new ImplementacaoFilaThread();
				fila.start();
			}
			
			for (int qtd = 0; qtd < 100; qtd++) {   /* Simulando 100 envios em massa */
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setNome(mostraTempo2.getText() + " - " + qtd);
			
			
				fila.add(filaThread);
				}
			
			}
		});
		
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila = null;
					
			}
		});
		
		
		
		fila.start();	
		add(jPanel, BorderLayout.WEST);
		
		/* Sempre será o último comando */
		setVisible(true); /* Torna a tela visível para o usuário*/
	}
	
	
	
	
	
	
	
	
	

}
