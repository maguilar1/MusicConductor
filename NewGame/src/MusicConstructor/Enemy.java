package MusicConstructor;


import java.awt.Image;
import java.awt.Polygon;

import jgame.GSprite;
import jgame.controller.PolygonController;
import jgame.controller.PulsateController;
import jgame.listener.BoundaryRemovalListener;

public abstract class Enemy extends GSprite {
	

	        public Enemy(Image image, int notes){
	                super(image);
	               
	                int[] x = new int[] { 814, 835, 861, 886, 912, 937, 963, 990, 1015, 1040,
	            			1067, 1093, 1119, 1145, 1171, 1197, 1225, 1252, 1278, 1303, 1329,
	            			1355, 1381, 1407, 1435, 1460, 1486, 1511, 1535, 1559, 1566, 1553,
	            			1531, 1506, 1482, 1453, 1427, 1396, 1369, 1341, 1313, 1285, 1259,
	            			1233, 1206, 1181, 1153, 1127, 1100, 1075, 1044, 1016, 989, 964,
	            			939, 914, 888, 862, 836, 811, 788, 765, 741, 716, 691, 665, 641,
	            			618, 593, 565, 540, 515, 489, 462, 435, 407, 380, 355, 329, 304,
	            			278, 253, 228, 202, 176, 151, 126, 100, 75, 55, 60, 81, 105, 131,
	            			158, 187, 212, 237, 262, 289, 315, 341, 366, 395, 418, 427, 429,
	            			448, 474, 501, 527, 554, 579, 606, 624, 633, 658, 684, 710, 736,
	            			764, 789, 809, 835, 857, 867, 877, 887 };
	            	int[] y = new int[] { 616, 631, 633, 635, 636, 637, 637, 637, 638, 639,
	            			639, 640, 642, 642, 642, 642, 642, 642, 642, 643, 648, 651, 651,
	            			653, 653, 656, 661, 663, 671, 681, 707, 729, 741, 746, 754, 757,
	            			760, 760, 760, 760, 760, 760, 762, 765, 769, 771, 772, 774, 775,
	            			777, 777, 777, 777, 774, 770, 764, 757, 751, 748, 740, 729, 715,
	            			705, 697, 690, 684, 672, 662, 654, 646, 640, 637, 637, 637, 637,
	            			637, 638, 637, 637, 638, 641, 645, 648, 649, 652, 656, 659, 666,
	            			669, 685, 710, 725, 735, 740, 745, 748, 751, 754, 758, 760, 760,
	            			763, 769, 769, 779, 803, 829, 846, 846, 845, 843, 841, 840, 839,
	            			857, 881, 884, 890, 891, 893, 892, 887, 903, 906, 920, 945, 968,
	            			991 };
	                Polygon p = new Polygon(x, y, 81);
	                PolygonController pc = new PolygonController(p);

	                pc.goToStart(this);
	                addController(pc);
	                
	                BoundaryRemovalListener bd = new BoundaryRemovalListener();
	                
	                PulsateController pc1 = new PulsateController(0.8, 0.2, 30);
	                pc1.setProperties(PulsateController.SCALE, PulsateController.ALPHA);
	                
	                addListener(bd);
	                addController(pc1);

	        }
	}
