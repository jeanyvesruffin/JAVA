import java.applet.*;
import java.awt.*;

@SuppressWarnings("deprecation")
public class FirstApplet extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init() {
		add(new Label("Nom :"));
		add(new TextField(12)); 
		add(new Button("OK")); 
	}
	@Override
	public void paint(Graphics g) {
		g.drawRect(200, 200, 150, 100);
	}
}
