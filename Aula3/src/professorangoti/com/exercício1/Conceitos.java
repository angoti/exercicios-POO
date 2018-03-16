/*
 * Pacote
 * 		Peso
 * Enviado
 * 		de uma localidade - origem
 * 		a outra localidade - destino
 * Localidade
 * 		Facilidades de transporte
 * 			Ferrovi�rias
 * 			Aeroportos
 * 			Auto-estradas
 * 		Localidades Vizinhas
 * Rota de transporte
 * 		Comprimento (Dist�ncia entre as localidades)
 * 		Localidades
 * 		Controle
 * Meio de transporte
 * 			Trens
 * 				Carga m�xima de peso
 * 			Avi�es
 * 				Carga m�xima de peso
 * 			Caminh�es
 * 				Carga m�xima de peso		
 * Transporte de pacotes
 * 		Rota
 * 		Posi��o (Localidade)
 */




package professorangoti.com.exerc�cio1;

import java.util.List;

class Pacote {
	double peso;
}

class Envio {
	Localidade origem;
	Localidade destino;
	List<TrechoDeTransporte> rota;
	TrechoDeTransporte  trechoAtual;
}
class Localidade {
	String nome;
	String facilidadesDeTransporte; //Ferrovi�rias, Aeroportos, Auto-estradas
	List<Localidade> localidadesVizinhas;
}
class TrechoDeTransporte {
	double comprimento;
	MeioDeTransporte meioDeTransporte;
	Localidade origem;
	Localidade destino;
}
class MeioDeTransporte {
	double cargaMaximaDePeso;
	String tipo; //Trem, caminh�o ou avi�o
}

