package DesignView.Components;

import java.net.URL;
import javax.swing.ImageIcon;

public class IconProvider {

	public enum GameIconSet{
		BombIcon16, BombIcon32, BombIcon48, Mine16,Mine24, Mine32, Mine24Gray, Flag16, Flag20, Flower, Score32
	}
	
	public static ImageIcon getIconResource(GameIconSet x){
		switch(x){

			default:
					return null;
		}
	}
	

}
