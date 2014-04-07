package com.villanuevand.ui.flexible;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;


public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//Obteniendo el valor de index enviado con putExtra
		Intent i = getIntent();
		int index = i.getIntExtra("index", 0);
		//Obteniendo la referencia del FragmentB
		FragmentB fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragmentB);
		fragmentB.changeData(index);
		
	}



}
