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

import practica3.Mechanics;
import practica3.Subdomains;


/**
 * Parameter Editor for Enum values.
 * 
 * @author Juan A. Recio-Garcia
 * @version 1.0
 * @see jcolibri.method.gui.editors.ParameterEditor
 */
public class MechanicsEditor extends JComboBox implements
		ParameterEditor {
	private static final long serialVersionUID = 1L;

	
	private final String EMPTY = "<empty>";

	/**
	 *  Creates a new instance
	 */
	public MechanicsEditor(Class type)
	{
		super();
	    this.addItem(EMPTY);
	    this.setAllowedValues(null);

	}
	

	/**
	 * Returns an Enum value object
	 */
	public Object getEditorValue() {
		Mechanics value = new Mechanics();
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
	    this.addItem("Acting");
	    this.addItem("Action Point Allowance System");
	    this.addItem("Area Control / Area Influence");
	    this.addItem("Area Enclosure");
	    this.addItem("Area Movement");
	    this.addItem("Area-Impulse");
	    this.addItem("Auction/Bidding");
	    this.addItem("Betting/Wagering");
	    this.addItem("Campaign / Battle Card Driven");
	    this.addItem("Card Drafting");
	    this.addItem("Chit-Pull System");
	    this.addItem("Co-operative Play");
	    this.addItem("Commodity Speculation");
	    this.addItem("Crayon Rail System");
	    this.addItem("Dice Rolling");
	    this.addItem("Hand Management");
	    this.addItem("Hex-and-Counter");
	    this.addItem("Line Drawing");
	    this.addItem("Memory");
	    this.addItem("Modular Board");
	    this.addItem("Paper-and-Pencil");
	    this.addItem("Partnerships");
	    this.addItem("Pattern Building");
	    this.addItem("Pattern Recognition");
	    this.addItem("Pick-up and Deliver");
	    this.addItem("Point to Point Movement");
	    this.addItem("Rock-Paper-Scissors");
	    this.addItem("Role Playing");
	    this.addItem("Roll and Move");
	    this.addItem("Route/Network Building");
	    this.addItem("Secret Unit Deployment");
	    this.addItem("Set Collection");
	    this.addItem("Simulation");
	    this.addItem("Simultaneous Action Selection");
	    this.addItem("Singing");
	    this.addItem("Stock Holding");
	    this.addItem("Storytelling");
	    this.addItem("Tile Placement");
	    this.addItem("Trading");
	    this.addItem("Trick-taking");
	    this.addItem("Variable Phase Order");
	    this.addItem("Variable Player Powers");
	    this.addItem("Voting");
	    this.addItem("Worker Placement");

	}

}