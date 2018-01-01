package fdv.tools.support.swing;

import javax.swing.JFrame;

public abstract class SimpleWindowBase extends JFrame {

	private static final long serialVersionUID = -2557412158226075539L;

	public SimpleWindowBase() {
		setBounds(50, 50, 400, 300);
		setTitle(getClass().getName());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void run() {
		init();
		setVisible(true);
	}

	public abstract void init();

}
