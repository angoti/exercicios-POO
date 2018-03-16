/*
 * Pacote
 * 		Peso
 * Enviado
 * 		de uma localidade - origem
 * 		a outra localidade - destino
 * Localidade
 * 		Facilidades de transporte
 * 			Ferroviárias
 * 			Aeroportos
 * 			Auto-estradas
 * 		Localidades Vizinhas
 * Rota de transporte
 * 		Comprimento (Distância entre as localidades)
 * 		Localidades
 * 		Controle
 * Meio de transporte
 * 			Trens
 * 				Carga máxima de peso
 * 			Aviões
 * 				Carga máxima de peso
 * 			Caminhões
 * 				Carga máxima de peso		
 * Transporte de pacotes
 * 		Rota
 * 		Posição (Localidade)
 */




package professorangoti.com.exercício1;

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
	String facilidadesDeTransporte; //Ferroviárias, Aeroportos, Auto-estradas
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
	String tipo; //Trem, caminhão ou avião
}

