package com.villanuevand.ui.flexible;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity implements FragmentA.Communicator{

	FragmentA fragmentA;
	FragmentB fragmentB;
	FragmentManager manager; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		manager = getSupportFragmentManager();
		fragmentA = (FragmentA) manager.findFragmentById(R.id.fragmentA);
		fragmentA.setCommunicator(this);
	}
	@Override
	public void response(int index) {
		fragmentB = (FragmentB) manager.findFragmentById(R.id.fragmentB);
		//En modo landscape el FragmentB existe y es visible, en modo portrait NO.
		if(fragmentB != null && fragmentB.isVisible()){
			fragmentB.changeData(index);
		}else{
			//Abriendo la actividad SecondActivity y pasando el valor de index
			Intent i = new Intent();
			i.setClass(this, SecondActivity.class);
			i.putExtra("index", index);
			startActivity(i);
		}
	}


	

}
