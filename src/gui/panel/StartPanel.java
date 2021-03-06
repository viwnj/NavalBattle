package gui.panel;

import javax.swing.JButton;

import gui.GameFrame;

@SuppressWarnings("serial")
public class StartPanel extends GamePanel {
	
	private JButton start = new JButton("Play");
	
	public StartPanel(GameFrame frame) {
		super(800, 600, frame);
		start.setBounds(350, 290, 100, 25);
		start.addActionListener(e -> start_buttonAction());
		this.add(start);
	}
	
	private void start_buttonAction() {
		frame.battleStarted();
	}
}
