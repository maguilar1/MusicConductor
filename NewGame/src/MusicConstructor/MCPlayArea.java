package MusicConstructor;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Set;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MCPlayArea extends GContainer {

	public MCPlayArea(){
		setSize(800,600);
		this.setBackgroundColor(Color.black);
		
		BufferedImage bg= ImageCache.forClass(musicConstructor.class).get(
				"musicGameStage1.jpg");
				
				
	}

	
		
	}


