package MusicConstructor;

import java.util.ArrayList;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.TimerListener;

public class GameView extends GContainer {

	public GameView() {

		super(new GSprite(ImageCache.forClass(musicConstructor.class).get(
				"musicGameStage1.jpg")));

		setSize(640, 480);
		final TimerListener music = new TimerListener(30 * 2) {

			public void invoke(jgame.GObject target, jgame.Context context) {
				Enemy1 MusicNotes = new Enemy1();
				ArrayList<Enemy1> list = new ArrayList<Enemy1>();
				list.add(MusicNotes);
				addAt(MusicNotes, 1000, 1000);

			}

		};
		/*
		 * TimerListener constructor = new TimerListener(30*1) {
		 * 
		 * @Override public void invoke(jgame.GObject target, jgame.Context
		 * context) { Enemy2 piano = new Enemy2(); ArrayList<Enemy2> list = new
		 * ArrayList<Enemy2>(); list.add(piano); addAt(piano, 1000, 1000); }
		 */

		addListener(music);

		// addListener(constructor);
	}

}
