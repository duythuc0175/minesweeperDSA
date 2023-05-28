package DesignView.SaveGame;

import java.awt.*;
import java.io.Serializable;

public class SavingElement implements Serializable {

	private static final long serialVersionUID = -3937903731382734914L;
	private cellStyle style;
	private String text;

	public SavingElement() {

	}

	public void setName(String name) {
	}

	public String getName() {
		return null;
	}

	public void setBackgroundColor(Color background) {
	}

	public enum cellStyle{
		UNSELECTED_UNMARKED, UNSELECTED_MARKED, SELECTED 
	}
	
	public SavingElement(cellStyle style, String text) {
		this.style = style;
		this.text = text;
	}
	
	public cellStyle getStyle(){
		return style;
	}
	public String getText(){
		return text;
	}

	
}
