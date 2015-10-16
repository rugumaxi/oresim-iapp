import com.nttdocomo.ui.Component;
import com.nttdocomo.ui.ComponentListener;
import com.nttdocomo.ui.Display;
import com.nttdocomo.ui.Font;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.HTMLLayout;
import com.nttdocomo.ui.Label;
import com.nttdocomo.ui.Panel;
import com.nttdocomo.ui.SoftKeyListener;
import com.nttdocomo.ui.TextBox;

public class OreLog extends Panel implements SoftKeyListener {
	
	/** äÓñ{îwåiêF */
	public static final int BG_COLOR = Graphics.getColorOfRGB(0x11, 0x11, 0x11);
 
	public static final int FG_COLOR = Graphics.getColorOfRGB(0xdd, 0xDD, 0xdd);

	public static final Font S_FONT = Font.getFont(Font.FACE_MONOSPACE | Font.STYLE_PLAIN | Font.SIZE_TINY);
	
	public static final int S_FONT_HEIGHT = S_FONT.getHeight() + 2;

	public static TextBox textBox = null;
	public static Label label = null;
	
	public OreLog() {
		
		HTMLLayout html = new HTMLLayout();
		this.setLayoutManager(html);
		
		textBox = new TextBox("", (getWidth() / S_FONT.stringWidth("*")) - 1, (getHeight() / S_FONT_HEIGHT) - 3, TextBox.DISPLAY_ANY);
		textBox.setFont(S_FONT);
		
		label = new Label("Å´ëIëå„∫Àﬂ∞Ç≈Ç´Ç‹Ç∑");
		label.setFont(S_FONT);
		label.setBackground(BG_COLOR);
		label.setForeground(FG_COLOR);
		
		html.begin(HTMLLayout.CENTER);

		setBackground(BG_COLOR);
		
		add(label);
		add(textBox);

		setSoftKeyListener(this);
		setSoftLabel(SOFT_KEY_1, "ñﬂÇÈ");
		setSoftLabel(SOFT_KEY_2, "");
	}
	
	public void update() {
		StringBuffer tmpBuf = new StringBuffer(OreSim.stm.getLog());
		tmpBuf.append(OreSim.CHARCTERS.getName());
		tmpBuf.append(" / ");
		tmpBuf.append(OreSim.CHARCTERS.getStyleName());

		tmpBuf.append(" Bonus : ");
		tmpBuf.append(OreSim.stm.getTotalBonusPoint());
		tmpBuf.append(" / ");
		tmpBuf.append(OreSim.stm.getTotalLevelUp());
		tmpBuf.append(" Point : ");
		tmpBuf.append(OreSim.stm.getStatusPoint());

		tmpBuf.append("\nLV:");
		tmpBuf.append(OreSim.stm.getLevel());
		tmpBuf.append(" STAB ");
		tmpBuf.append(OreSim.stm.getStatus()[0]);
		tmpBuf.append(" HACK ");
		tmpBuf.append(OreSim.stm.getStatus()[1]);
		tmpBuf.append(" INT ");
		tmpBuf.append(OreSim.stm.getStatus()[2]);
		tmpBuf.append(" DEF ");
		tmpBuf.append(OreSim.stm.getStatus()[3]);
		tmpBuf.append(" MR ");
		tmpBuf.append(OreSim.stm.getStatus()[4]);
		tmpBuf.append(" DEX ");
		tmpBuf.append(OreSim.stm.getStatus()[5]);
		tmpBuf.append(" AGI ");
		tmpBuf.append(OreSim.stm.getStatus()[6]);
		
		textBox.setText(tmpBuf.toString());

	}

	public void softKeyPressed(int softKey) {
	}

	public void softKeyReleased(int softKey) {

		if(softKey == SOFT_KEY_1) {
			OreSim.statusPage.changeScene(0);
			Display.setCurrent(OreSim.statusPage);
			OreSimMainPage.timer.start();
		}
	}
}
