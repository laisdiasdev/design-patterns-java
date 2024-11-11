package state;

/*
 Estamos trabalhando em uma empresa que vende taxímetros para o
mundo todo. Temos que implementar a lógica para calcular o valor das
corridas de acordo com a bandeira selecionada no aparelho. O taxímetro
pode ser configurado com diversas bandeiras.
 */
public interface Bandeira {
	double calculaValorDaCorrida(double tempo, double distancia);
}
