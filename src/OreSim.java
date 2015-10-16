

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.microedition.io.Connector;

import com.nttdocomo.io.BufferedReader;
import com.nttdocomo.ui.Display;
import com.nttdocomo.ui.IApplication;

public class OreSim extends IApplication {

	public static final String VERSION = "0.22";

    /** ステータスシミュレータ */
    public static Status stm = new Status();

    public static boolean allocToChangePoint = false;

    public static OreSimMainPage statusPage = null;
    //public static StatusEdit statusForm = null;
    public static OreLog logForm = null;

	public static final String RS_LABEL = "oresim_label";
	public static int[] RS_LABEL_ID = new int[]{
		-1, -1, -1
	};

	public static TWCharacters CHARCTERS = new TWCharacters();

	public static final String RS_DATA = "oresim_data";
	public static int[] RS_DATA_ID = new int[]{
		-1, -1, -1
	};


	private void changeCharacter(int index) {

		if ( CHARCTERS.charIndex == index ) {
            return;
        }

		CHARCTERS.charIndex = index;
		CHARCTERS.init();
        stm._character = CHARCTERS;
        stm.init();
	}


	public void start() {

		DataInputStream is = null;
		int[] childArray = null;


		try {

			is = Connector.openDataInputStream("resource:///maxxien.dat");

			int a = is.read();
			int b = is.read();
			int c = 0;

			for(int i = 0; i < a; i++) {

				//System.out.println("\n---- " + i);

				for(int l = 0; l < b; l ++) {

					c = is.read();
					childArray = new int[c];

					//System.out.println("\n-- " + l);

					for(int m = 0; m < c; m++ ) {
						childArray[m] = is.read();

					}

					CHARCTERS._maxXien[i][l] = childArray;

					/* *
					for(int m = 0; m < c; m++ ) {
						if(m == 0) {
							System.out.println("");

						} else {
							System.out.print(", ");

						}
						System.out.print(CHARCTERS._maxXien[i][l][m]);
					}
					/* */

				}
			}

		} catch(IOException ioe) {
			ioe.printStackTrace();

		} finally {

			try {

				if(is != null) {
					is.close();
				}

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		statusPage = new OreSimMainPage();
		//statusForm = new StatusEdit();
		logForm = new OreLog();

		changeCharacter(0);
		statusPage.changeScene(3);
		statusPage.changeScene(10);


		Display.setCurrent(statusPage);
	}


	public void resume() {
		OreSimMainPage.timer.start();
	}

}
