package MusicConstructor;
import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;

public class musicConstructor  extends Game {

	
	public void main(String [] args){
		
          
		musicConstructor Game = new musicConstructor();
            Game.startGame("musicContructor");
    }

    public musicConstructor(){
            ImageCache.create(musicConstructor.class, "/MCesources");

            GRootContainer root = new GRootContainer(Color.BLACK);
            setRootContainer(root);

            GameView gameView = new GameView();
            root.addView(View.GAME, gameView);

            GameOverAView gameOverView = new GameOverAView();
            root.addView(View.GAME_OVER, gameOverView);
    }

    public enum View {
            GAME, GAME_OVER;
    }

	}


