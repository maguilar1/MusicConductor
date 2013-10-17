package MusicConstructor;
import java.awt.Color;
import java.util.List;
import java.util.Set;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MCPlayArea extends GContainer {

	public MCPlayArea(){
		setSize(800,600);
		this.setBackgroundColor(Color.black);
		/*
		Buffered Image bg= ImageCache.forClass(musicContructor.class).get(
				"musicGameStage1.jpg"));
				GSprite gs = new GSprite(bg);
				Set<E>.classBackgoundSprite(gs);
				*/
	}
}
