package com.genius;
/**
 * 
 * O jogo basicamente funciona assim:
 * É criado uma sequencia aleatoria incremental começando em 1 na qual é repetida para o usuario
 * O usuario deve seguir a sequencia sem errar, cada acerto a sequencia é incrementada em 1
 * Caso o usuário erre é criado uma outra sequencia aleatoria.
 * @author Elias e Wellington
 */
import java.util.ArrayList;
import java.util.Iterator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.genius.R.id;

public class GeniusClock4AndroidActivity extends Activity {
	/**
	 * sequencia na qual sera armazenada os numeros aleatorios
	 */
	private ArrayList<Integer> sequencia = new ArrayList<Integer>();
	/**
	 * iterator na qual vai iterar sobre a sequencia para que consiga acessar os elementos do arraylist
	 */
	private Iterator<Integer> iter;
	/**
	 * Um contador auxiliar para poder criar uma sequencia incremental
	 * 
	 */
	private int countAux = 1;
	/**
	 * Os 4 botões para que o usuario siga a sequencia
	 */
	private Button btn1, btn2, btn3, btn4;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btn1 = (Button) findViewById(id.btn1);
		btn2 = (Button) findViewById(id.btn2);
		btn3 = (Button) findViewById(id.btn3);
		btn4 = (Button) findViewById(id.btn4);
		
		IniciaJogo();
	}

	/**
	 * Reseta a sequencia e contadorAuxiliar
	 */
	public void resetaSequencia() {
		sequencia.removeAll(sequencia);
		countAux = 0;
	}

	/**
	 * Adiciona incrementalmente numeros aleatorios na sequencia
	 */
	public void geradorDeSequencia() {
		sequencia.add(gerarNumAleatorio(1, 5));
		countAux++;
		startIA(sequencia);
		iter = sequencia.iterator();
	}

	/**
	 * 
	 * @param inicio de que numero deseja iniciar a sequencia (o primeiro numero entra)
	 * @param fim de que numero deseja iniciar a sequencia (o ultimo numero não entra)
	 * @return o numero aleatorio gerado
	 */
	public int gerarNumAleatorio(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}

	/**
	 * Inicia o jogo ou reseta o mesmo
	 */
	public void IniciaJogo() {
		Log.i("Start", "Inicio De jogo");
		resetaSequencia();
		geradorDeSequencia();
	}

	/**
	 * 
	 * @param seq recebe a sequencia aleatoria para ser repetida pelo computador.
	 */
	public void startIA(ArrayList<Integer> seq) {

		for (int i = 0; i < seq.size(); i++) {
			int valor = seq.get(i);
			switch (valor) {
			case 1:
				Log.i("Ia", "Ia btn1 clicked");
				break;
			case 2:
				Log.i("Ia", "Ia btn2 clicked");
				break;
			case 3:
				Log.i("Ia", "Ia btn3 clicked");
				break;
			case 4:
				Log.i("Ia", "Ia btn4 clicked");
				break;
			}

		}

	}

	/**
	 * 
	 * parte na qual o usuario ira repetir a sequencia caso erre será iniciado uma nova caso acerte continua a seguir a sequencia
	 */
	public void Btn1(View view) {

		if (iter.next() == 1) {
			Log.i("Ia", "clicou no botao certo");
			if (!iter.hasNext())
				geradorDeSequencia();
		} else {
			Log.i("Ia", "clicou no botao errado");
			IniciaJogo();
		}

	}

	public void Btn2(View view) {

		if (iter.next() == 2) {

			Log.i("Ia", "clicou no botao certo");
			if (!iter.hasNext())
				geradorDeSequencia();
		} else {
			Log.i("Ia", "clicou no botao errado");
			IniciaJogo();
		}

	}

	public void Btn3(View view) {

		if (iter.next() == 3) {

			Log.i("Ia", "clicou no botao certo");
			if (!iter.hasNext())
				geradorDeSequencia();
		} else {
			Log.i("Ia", "clicou no botao errado");
			IniciaJogo();
		}

	}

	public void Btn4(View view) {

		if (iter.next() == 4) {

			Log.i("Ia", "clicou no botao cert");
			if (!iter.hasNext())
				geradorDeSequencia();

		} else {
			Log.i("Ia", "clicou no botao errado");
			IniciaJogo();
		}
	}

}