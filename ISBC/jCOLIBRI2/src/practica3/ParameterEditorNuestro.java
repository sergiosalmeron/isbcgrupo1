package practica3;

/**
 * CreateProfile.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-García.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 02/11/2007
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import practica3.Categories;
import practica3.CategoriesEditor;
import practica3.Mechanics;
import practica3.Subdomains;
import practica3.SubdomainsEditor;

import jcolibri.datatypes.Instance;
import jcolibri.datatypes.Text;
import jcolibri.method.gui.editors.*;

/**
 * Factory to obtain the ParameterEditor of a data type.
 * 
 * @author Juan A. Recio-Garcia
 * @version 1.0
 *
 */
public class ParameterEditorNuestro {

    private static HashMap<Class, Class> table = new HashMap<Class, Class>();

    //Code to register editors.
    //TODO search in classpath.
    static{
	ParameterEditorNuestro.registerEditor(Boolean.class, BooleanEditor.class);
	ParameterEditorNuestro.registerEditor(Date.class, DateEditor.class);
	ParameterEditorNuestro.registerEditor(Double.class, DoubleEditor.class);
	ParameterEditorNuestro.registerEditor(Enum.class, EnumEditor.class);
	ParameterEditorNuestro.registerEditor(File.class, FileEditor.class);
	ParameterEditorNuestro.registerEditor(Instance.class, InstanceEditor.class);
	ParameterEditorNuestro.registerEditor(String.class, StringEditor.class);
	ParameterEditorNuestro.registerEditor(Text.class, TextEditor.class);
	ParameterEditorNuestro.registerEditor(Integer.class, IntegerEditor.class);
	ParameterEditorNuestro.registerEditor(Categories.class, CategoriesEditor.class);
	ParameterEditorNuestro.registerEditor(Subdomains.class, SubdomainsEditor.class);
	ParameterEditorNuestro.registerEditor(Mechanics.class, MechanicsEditor.class);
    }
    
    /**
     * Creates the editor and configures it with its data-type name
     */
    public static ParameterEditor getEditor(Class<?> type) {
	try
	{
	    
	    Class editor = table.get(type);
	    if(editor != null){
		   if(editor.equals(CategoriesEditor.class))
				return new CategoriesEditor(type); 
		   if(editor.equals(SubdomainsEditor.class))
				return new SubdomainsEditor(type); 	
		   if(editor.equals(MechanicsEditor.class))
				return new MechanicsEditor(type); 	
		return (ParameterEditor)table.get(type).newInstance();
	    }
	    for(Class<?> c : table.keySet())
		if(c.isAssignableFrom(type))
		    editor = table.get(c);
	    
	    if(editor.equals(EnumEditor.class))
		return new EnumEditor(type);

	    if(editor != null)
		return (ParameterEditor)editor.newInstance();
	    
	    
	    throw new Exception("No editor found for type: "+type.getName());
	    
	} catch (Exception e)
	{
	    org.apache.commons.logging.LogFactory.getLog(ParameterEditorNuestro.class).error(e); 
	} 
	return null;
    }
    
    /**
     * Creates the editor and configures it with its data-type name
     */
    public static ParameterEditor getEditor(Class<?> type, Collection<Object> allowedValues) 
    {
	ParameterEditor pe = getEditor(type);
	if(pe==null)
	    return null;
	pe.setAllowedValues(allowedValues);
	return pe;
    }

    /**
     * Registers and editor
     * @param type that the editor manages
     * @param editor of the type
     */
    public static void registerEditor(Class type, Class editor) {
	table.put(type, editor);
    }

    /**
     * Unregisters the editor of a type.
     * @param type of the editor to remove
     */
    public static void unregisterEditor(Class type) {
	table.remove(type);
    }

    /**
     * Clears all the registered editors
     */
    public static void clear() {
	table.clear();
    }
}
