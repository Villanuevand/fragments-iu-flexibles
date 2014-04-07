package com.villanuevand.ui.flexible;

import com.villanuevand.ui.flexible.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment{

	TextView textview;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_b,container,false);
		textview = (TextView) view.findViewById(R.id.textView_descripcion);
		return view;
	}
	
	public void changeData(int index) {
		String[] descripciones = getResources().getStringArray(R.array.descripciones);	
		textview.setText(descripciones[index]);
	}




}
