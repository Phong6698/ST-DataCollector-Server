package ch.st.datacollector.view;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.Font;

/**
 * Created by Phong6698 on 19.05.2016.
 *
 * @author Phong6698
 */
public class ServerView extends JFrame{
	
	public ServerView() {
		setTitle("ST Data Collector Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		getContentPane().add( new JSwitchBox( "on", "off" ));

		setBounds(100, 100, 712, 570);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		getContentPane().add(headerPanel, BorderLayout.NORTH);
		
		JLabel titleLabel = new JLabel("Summoner Tracker - Data Collector Server");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		headerPanel.add(titleLabel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.7);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel mainPanel = new JPanel();
		splitPane.setLeftComponent(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel infoPanel = new JPanel();
		mainPanel.add(infoPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		JScrollPane logPanel = new JScrollPane();
		splitPane.setRightComponent(logPanel);
		
		JPanel footerPanel = new JPanel();
		getContentPane().add(footerPanel, BorderLayout.SOUTH);
		
		JLabel appInfoLabel = new JLabel("Application Infos");
		footerPanel.add(appInfoLabel);
		setVisible(true);
	}

}
