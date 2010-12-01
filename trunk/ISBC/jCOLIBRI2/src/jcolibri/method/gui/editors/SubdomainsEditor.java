/**
 * EnumEditor.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-García.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 02/11/2007
 */
package jcolibri.method.gui.editors;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JComponent;

import practica3.Categories;
import practica3.Subdomains;


/**
 * Parameter Editor for Enum values.
 * 
 * @author Juan A. Recio-Garcia
 * @version 1.0
 * @see jcolibri.method.gui.editors.ParameterEditor
 */
public class SubdomainsEditor extends JComboBox implements
		ParameterEditor {
	private static final long serialVersionUID = 1L;

	
	private final String EMPTY = "<empty>";

	/**
	 *  Creates a new instance
	 */
	public SubdomainsEditor(Class type)
	{
		super();
	    this.addItem(EMPTY);
	    this.setAllowedValues(null);

	}
	

	/**
	 * Returns an Enum value object
	 */
	public Object getEditorValue() {
		Subdomains value = new Subdomains();
		value.add((String) this.getSelectedItem());
		if (value.equals(EMPTY))
			return null;
		return value;
	}

	/**
	 * Returns the JComponent
	 */
	public JComponent getJComponent() {
		return this;
	}

	/**
	 * Receives a Boolean value
	 */
	public void setEditorValue(Object value) {
	    if(value==null)
		this.setSelectedItem(EMPTY);
	    else
		this.setSelectedItem(value);
	}


	/**
	 * Receives a list of Enum values
	 */
	@SuppressWarnings("unchecked")
	public void setAllowedValues(Collection<Object> allowedValues)
	{
	    this.removeAllItems();
	    this.addItem("Abstract Games");
	    this.addItem("Children's Games");
	    this.addItem("Customizable Games");
	    this.addItem("Family Games");
	    this.addItem("Party Games");
	    this.addItem("Strategy Games");
	    this.addItem("Thematic Games");
	    this.addItem("Wargames");

	}

}