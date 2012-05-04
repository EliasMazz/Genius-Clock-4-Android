package com.genius;

import java.util.ArrayList;
import java.util.Iterator;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.genius.R.id;

public class GeniusClock4AndroidActivity extends Activity {

	ArrayList<Integer> sequencia = new ArrayList<Integer>();
	Iterator<Integer> iter;
	int coutAux = 1;
	Button btn1, btn2, btn3, btn4;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btn1 = (Button) findViewById(id.btn1);
		btn2 = (Button) findViewById(id.btn2);
		btn3 = (Button) findViewById(id.btn3);
		btn4 = (Button) findViewById(id.btn4);

		geradorDeSequencia();
	}

	public void geradorDeSequencia() {
		
		sequencia.removeAll(sequencia);
		for(int i = 1; i<=coutAux; i++){
			sequencia.add(i);
		}
		coutAux++;
		
		startIA(sequencia);
		iter = sequencia.iterator();
	}

	public void startIA(ArrayList<Integer> seq) {

		for (int i = 0; i < seq.size(); i++) {
			int valor = seq.get(i);
			switch (valor) {
			case 1:
				Log.i("Ia", "Ia btn1 clicdked");
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

	public void Btn1(View view) {

		
			if (iter.next() == 1) {
				Log.i("Ia", "clicou no botao certo");
				if (!iter.hasNext())
					geradorDeSequencia();
			} else
				Log.i("Ia", "clicou no botao errado");
	
	}

	public void Btn2(View view) {
		
			if (iter.next() == 2) {

				Log.i("Ia", "clicou no botao certo");
				if (!iter.hasNext())
					geradorDeSequencia();
			} else
				Log.i("Ia", "clicou no botao errado");
		

	}

	public void Btn3(View view) {
		
			if (iter.next() == 3) {

				Log.i("Ia", "clicou no botao certo");
				if (!iter.hasNext())
					geradorDeSequencia();
			} else
				Log.i("Ia", "clicou no botao errado");
	

	}

	public void Btn4(View view) {
	
			if (iter.next() == 4) {

				Log.i("Ia", "clicou no botao certo");
				if (!iter.hasNext())
					geradorDeSequencia();

			} else
				Log.i("Ia", "clicou no botao errado");
		
	}

}