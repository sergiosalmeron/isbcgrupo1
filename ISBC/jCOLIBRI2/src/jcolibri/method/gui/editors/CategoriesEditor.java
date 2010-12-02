/**
 * EnumEditor.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-García.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 02/11/2007
 */
package jcolibri.method.gui.editors;


import java.awt.Component;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JComponent;

import practica3.Categories;


/**
 * Parameter Editor for Enum values.
 * 
 * @author Juan A. Recio-Garcia
 * @version 1.0
 * @see jcolibri.method.gui.editors.ParameterEditor
 */
public class CategoriesEditor extends JComboBox implements
		ParameterEditor {
	private static final long serialVersionUID = 1L;

	
	private final String EMPTY = "<empty>";

	/**
	 *  Creates a new instance
	 */
	public CategoriesEditor(Class type)
	{
		super();
	    this.addItem(EMPTY);
	    this.setAllowedValues(null);

	}
	

	/**
	 * Returns an Enum value object
	 */
	public Object getEditorValue() {
		Categories value = new Categories();
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
	    this.addItem("abstract-strategy");
	    this.addItem("action-dexterity");
	    this.addItem("adventure");
	    this.addItem("american-civil-war");
	    this.addItem("american-indian-wars");
	    this.addItem("american-revolutionary-war");
	    this.addItem("american-west");
	    this.addItem("ancient");
	    this.addItem("animals");
	    this.addItem("arabian");
	    this.addItem("bluffing");
	    this.addItem("book");
	    this.addItem("card-game");
	    this.addItem("childrens-game");
	    this.addItem("city building");
	    this.addItem("civil-war");
	    this.addItem("civilization");
	    this.addItem("collectible-components");
	    this.addItem("comic-bookstrip");
	    this.addItem("deduction");
	    this.addItem("dice");
	    this.addItem("economic");
	    this.addItem("educational");
	    this.addItem("electronic");
	    this.addItem("environmental");
//	    this.addItem("expansion for base-game");
	    this.addItem("exploration");
	    this.addItem("fantasy");
	    this.addItem("farming");
	    this.addItem("fighting");
	    this.addItem("game-system");
	    this.addItem("horror");
	    this.addItem("humor");
	    this.addItem("industry-manufacturing");
	    this.addItem("korean-war");
	    this.addItem("mafia");
	    this.addItem("math");
//	    this.addItem("mature/adult");
	    this.addItem("maze");
	    this.addItem("medical");
	    this.addItem("medieval");
	    this.addItem("memory");
	    this.addItem("miniatures");
	    this.addItem("modern-warfare");
	    this.addItem("moviestrradio-theme");
	    this.addItem("murdermystery");
	    this.addItem("music");
	    this.addItem("mythology");
	    this.addItem("napoleonic");
	    this.addItem("nautical");
	    this.addItem("negotiation");
	    this.addItem("novel-based");
	    this.addItem("number");
	    this.addItem("party-game");
	    this.addItem("pirates");
	    this.addItem("political");
	    this.addItem("prehistoric");
	    this.addItem("print-play");
	    this.addItem("puzzle");
	    this.addItem("racing");
	    this.addItem("real-time");
	    this.addItem("religious");
	    this.addItem("renaissance");
	    this.addItem("science-fiction");
	    this.addItem("space-exploration");
	    this.addItem("spiessecret-agents");
	    this.addItem("sports");
	    this.addItem("territory-building");
	    this.addItem("trains");
	    this.addItem("transportation");
	    this.addItem("travel");
	    this.addItem("trivia");
	    this.addItem("video-game-theme");
	    this.addItem("vietnam-war");
	    this.addItem("wargame");
	    this.addItem("word");
	    this.addItem("world-war-i");
	    this.addItem("world-war-ii");
	    this.addItem("zombies");

	}

}