package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Limitador;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;

public class Janela {

	private JFrame frame;
	private JTextField digitaNome;
	private JTextField digitaDataNascimento;
	private JTextField digitaEmail;
	private JTextField digitaCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
		
		digitaNome.setDocument(new Limitador(40, Limitador.TipoEntrada.NOME));
		digitaDataNascimento.setDocument(new Limitador(10, Limitador.TipoEntrada.DATANASCIMENTO));
		digitaEmail.setDocument(new Limitador(40, Limitador.TipoEntrada.EMAIL));
		digitaCpf.setDocument(new Limitador(11, Limitador.TipoEntrada.CPF));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel indicaNome = new JLabel("Nome");
		indicaNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaNome.setBounds(10, 11, 160, 41);
		frame.getContentPane().add(indicaNome);
		
		digitaNome = new JTextField();
		digitaNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaNome.setBounds(10, 63, 259, 41);
		frame.getContentPane().add(digitaNome);
		digitaNome.setColumns(10);
		
		JLabel indicaDataNascimento = new JLabel("Data De Nascimento");
		indicaDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaDataNascimento.setBounds(10, 115, 276, 41);
		frame.getContentPane().add(indicaDataNascimento);
		
		digitaDataNascimento = new JTextField();
		digitaDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaDataNascimento.setColumns(10);
		digitaDataNascimento.setBounds(10, 167, 208, 41);
		frame.getContentPane().add(digitaDataNascimento);
		
		JLabel indicaEmail = new JLabel("E-mail");
		indicaEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaEmail.setBounds(10, 219, 160, 41);
		frame.getContentPane().add(indicaEmail);
		
		digitaEmail = new JTextField();
		digitaEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaEmail.setColumns(10);
		digitaEmail.setBounds(10, 271, 259, 41);
		frame.getContentPane().add(digitaEmail);
		
		JLabel indicaCpf = new JLabel("CPF");
		indicaCpf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaCpf.setBounds(10, 323, 160, 41);
		frame.getContentPane().add(indicaCpf);
		
		digitaCpf = new JTextField();
		digitaCpf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaCpf.setColumns(10);
		digitaCpf.setBounds(10, 375, 242, 41);
		frame.getContentPane().add(digitaCpf);
		
		JButton btValidar = new JButton("Validar");
		btValidar.setBounds(109, 440, 109, 40);
		frame.getContentPane().add(btValidar);
	}
}
