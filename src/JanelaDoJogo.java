import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class JanelaDoJogo extends JFrame{
	private final Tabuleiro tabuleiro;//tabuleiro do jogo
	
	public JanelaDoJogo(){
		//configura a janela
		super("Jogo da Memória");
		setLayout(new BorderLayout());
		setSize(500, 500);// resolução da janela
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		tabuleiro = new Tabuleiro();
		add(tabuleiro, BorderLayout.CENTER);
		
		JMenuBar barraMenu = new JMenuBar();//barra de menu
		
		//configura a barra de menu
		JMenu menuOption = new JMenu("Opções");
		JMenuItem reiniciarJogo = new JMenuItem("Reiniciar");
		JMenuItem sair = new JMenuItem("Sair");
		menuOption.add(reiniciarJogo);
		menuOption.add(sair);
		reiniciarJogo.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {						
						tabuleiro.reset();
					}					
				}
		);
		
		sair.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {						
						System.exit(0);
					}					
				}
		);
		JMenu menuAjuda = new JMenu("Ajuda");
		JMenuItem sobre = new JMenuItem("Sobre");
		menuAjuda.add(sobre);
		
		sobre.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {						
						JOptionPane.showMessageDialog(JanelaDoJogo.this,
								"Desenvolvido por Aula"
								+ "\n"
								+ " ");
					}					
				}
		);
		barraMenu.add(menuOption);
		barraMenu.add(menuAjuda);
		setJMenuBar(barraMenu);		
	}
}
