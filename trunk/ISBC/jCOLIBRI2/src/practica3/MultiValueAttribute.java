package practica3;

import java.util.ArrayList;

import jcolibri.connector.TypeAdaptor;

public class MultiValueAttribute implements TypeAdaptor {



	ArrayList<String> data;
	
	public MultiValueAttribute() {
		data = new ArrayList<String>();
	}	
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void fromString(String content) throws Exception {

		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}

}
