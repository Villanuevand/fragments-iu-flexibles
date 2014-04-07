package com.villanuevand.ui.flexible;

import com.villanuevand.ui.flexible.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentA extends Fragment implements OnItemClickListener {

	ListView listView;
	Communicator communicator;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_a, container, false);
		listView =(ListView) view.findViewById(R.id.listView);
		ArrayAdapter adaptador =  ArrayAdapter.createFromResource(getActivity(), R.array.capitulos, android.R.layout.simple_list_item_1);
		listView.setAdapter(adaptador);
		listView.setOnItemClickListener(this);		
		return view;
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		communicator.response(position);		
	}
	
	/**Obtiene referencia a la interface Communicator
	 * @param communicator
	 */
	public void setCommunicator(Communicator communicator){
		this.communicator = communicator;
	}


	/**
	 * @author Villanuevand
	 * Interface que implemente metodos de comunicacion entre fragments.
	 */
	public interface Communicator
	{
		/**
		 * Establece el número indice de el item seleccionado en el listView del Fragment A
		 * @param index
		 */
		public void response(int index);
	}

}
