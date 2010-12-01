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
	    this.addItem("abstract strategy");
	    this.addItem("action/dexterity");
	    this.addItem("adventure");
	    this.addItem("american civil war");
	    this.addItem("American Indian Wars");
	    this.addItem("American Revolutionary War");
	    this.addItem("American West");
	    this.addItem("Ancient");
	    this.addItem("Animals");
	    this.addItem("Arabian");
	    this.addItem("Bluffing");
	    this.addItem("Book");
	    this.addItem("Card Game");
	    this.addItem("Children's Game");
	    this.addItem("City Building");
	    this.addItem("Civil War");
	    this.addItem("Civilization");
	    this.addItem("Collectible Components");
	    this.addItem("Comic Book/Strip");
	    this.addItem("Deduction");
	    this.addItem("Dice");
	    this.addItem("economic");
	    this.addItem("Educational");
	    this.addItem("Electronic");
	    this.addItem("Environmental");
	    this.addItem("Expansion for Base-game");
	    this.addItem("Exploration");
	    this.addItem("Fantasy");
	    this.addItem("Farming");
	    this.addItem("Fighting");
	    this.addItem("Game System");
	    this.addItem("Horror");
	    this.addItem("Humor");
	    this.addItem("Industry/Manufacturing");
	    this.addItem("Korean War");
	    this.addItem("Mafia");
	    this.addItem("Math");
	    this.addItem("Mature/Adult");
	    this.addItem("Maze");
	    this.addItem("Medical");
	    this.addItem("Medieval");
	    this.addItem("Memory");
	    this.addItem("Miniatures");
	    this.addItem("Modern Warfare");
	    this.addItem("Movies/TV/Radio theme");
	    this.addItem("Murder/Mystery");
	    this.addItem("Music");
	    this.addItem("Mythology");
	    this.addItem("Napoleonic");
	    this.addItem("Nautical");
	    this.addItem("Negotiation");
	    this.addItem("Novel-based");
	    this.addItem("Number");
	    this.addItem("Party Game");
	    this.addItem("Pirates");
	    this.addItem("Political");
	    this.addItem("Prehistoric");
	    this.addItem("Print & Play");
	    this.addItem("Puzzle");
	    this.addItem("Racing");
	    this.addItem("Real-time");
	    this.addItem("Religious");
	    this.addItem("Renaissance");
	    this.addItem("Science Fiction");
	    this.addItem("Space Exploration");
	    this.addItem("Spies/Secret Agents");
	    this.addItem("Sports");
	    this.addItem("Territory Building");
	    this.addItem("Trains");
	    this.addItem("Transportation");
	    this.addItem("Travel");
	    this.addItem("Trivia");
	    this.addItem("Video Game Theme");
	    this.addItem("Vietnam War");
	    this.addItem("Wargame");
	    this.addItem("Word");
	    this.addItem("World War I");
	    this.addItem("World War II");
	    this.addItem("Zombies");

	}

}