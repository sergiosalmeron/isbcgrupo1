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
	    this.addItem("acting");
	    this.addItem("action-point-allowance-system");
	    this.addItem("area-control-area-influence");
	    this.addItem("area-enclosure");
	    this.addItem("area-movement");
	    this.addItem("area-impulse");
	    this.addItem("auctionbidding");
	    this.addItem("bettingwagering");
	    this.addItem("campaignbattle-card-driven");
	    this.addItem("card-drafting");
	    this.addItem("chit-pull-system");
	    this.addItem("co-operative-play");
	    this.addItem("commodity-speculation");
	    this.addItem("crayon-rail-system");
	    this.addItem("dice-rolling");
	    this.addItem("hand-management");
	    this.addItem("hex-and-counter");
	    this.addItem("line-drawing");
	    this.addItem("memory");
	    this.addItem("modular-board");
	    this.addItem("paper-and-pencil");
	    this.addItem("partnerships");
	    this.addItem("pattern building");
	    this.addItem("pattern-recognition");
	    this.addItem("pick-up-and-deliver");
	    this.addItem("point-to-point-movement");
	    this.addItem("rock-paper-scissors");
	    this.addItem("role-playing");
	    this.addItem("roll-and-move");
	    this.addItem("routenetwork-building");
	    this.addItem("secret-unit-deployment");
	    this.addItem("set-collection");
	    this.addItem("simulation");
	    this.addItem("simultaneous-action-selection");
	    this.addItem("singing");
	    this.addItem("stock-holding");
	    this.addItem("storytelling");
	    this.addItem("tile-placement");
	    this.addItem("trading");
	    this.addItem("trick-taking");
	    this.addItem("variable-phase-order");
	    this.addItem("variable-player-powers");
	    this.addItem("voting");
	    this.addItem("worker-placement");

	}

}