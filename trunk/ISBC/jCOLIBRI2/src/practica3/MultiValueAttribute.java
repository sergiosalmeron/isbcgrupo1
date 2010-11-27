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
		String d ="";
		for (int i=0 ; i<content.length() ; i++){			
			if ((content.charAt(i)!=';')){
				if ((content.charAt(i)!='[') && (content.charAt(i)!=']')){
					d=d+content.charAt(i);
				}
			}	
			else {
				data.add(d);
				d="";
			}			
		}
		data.add(d);
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}

}
