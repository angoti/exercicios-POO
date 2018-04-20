package strategy.estacionamento;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Sistema extends JFrame {

	private JPanel contentPane;
	private JTextField qtdeHoras;
	private JTextField valorEstacionamento;

	private double valorPorHora = 6.0;
	private double valorHorasIniciais = 10.0;
	private double valorPorHoraAdicional = 4.0;
	private double valorDiaria = 40;
	private int horasIniciais = 4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Sistema() {
		setTitle("Estacionamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblQuantidadeDeHoras = new JLabel("Quantidade de horas: ");
		contentPane.add(lblQuantidadeDeHoras);

		qtdeHoras = new JTextField();
		contentPane.add(qtdeHoras);
		qtdeHoras.setColumns(10);

		JButton btnNewButton = new JButton("Hora simples");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculoHoraSimples();
			}
		});
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Hora composta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculoHoraComposta();
			}
		});
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Di\u00E1ria");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculoDiaria();
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnHoraX = new JButton("Hora X");
		btnHoraX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculoX();
			}
		});
		contentPane.add(btnHoraX);

		valorEstacionamento = new JTextField();
		contentPane.add(valorEstacionamento);
		valorEstacionamento.setColumns(10);
	}

	private void calculoHoraSimples() {
		int horas = Integer.parseInt(qtdeHoras.getText());
		TarifaEstacionamento tarifa = new TarifaEstacionamento(horas, new CalculoHora(valorPorHora));
		valorEstacionamento.setText(String.valueOf(tarifa.valor()));
	}

	private void calculoHoraComposta() {
		int horas = Integer.parseInt(qtdeHoras.getText());
		TarifaEstacionamento tarifa = new TarifaEstacionamento(horas,
				new CalculoHoraValorAdicional(valorHorasIniciais, horasIniciais, valorPorHoraAdicional));
		valorEstacionamento.setText(String.valueOf(tarifa.valor()));
	}

	private void calculoDiaria() {
		int horas = Integer.parseInt(qtdeHoras.getText());
		TarifaEstacionamento tarifa = new TarifaEstacionamento(horas, new CalculoDiaria(valorDiaria));
		valorEstacionamento.setText(String.valueOf(tarifa.valor()));
	}
	
	private void calculoX() {
		int horas = Integer.parseInt(qtdeHoras.getText());
		TarifaEstacionamento tarifa = new TarifaEstacionamento(horas, new CalculoX());
		valorEstacionamento.setText(String.valueOf(tarifa.valor()));
	}

}
