package ch.st.datacollector.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import static javax.swing.JFrame.*;

/**
 * Created by Phong6698 on 19.05.2016.
 *
 * @author Phong6698
 */
public class ServerView extends JFrame{

	private static final long serialVersionUID = 1L;

	public ServerView() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setTitle("ST - DC Server");
//		getContentPane().add( new JSwitchBox( "on", "off" ));

		setBounds(100, 100, 951, 669);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		getContentPane().add(headerPanel, BorderLayout.NORTH);
		
		JLabel titleLabel = new JLabel("Summoner Tracker - Data Collector Server");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		headerPanel.add(titleLabel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel mainPanel = new JPanel();
		splitPane.setLeftComponent(mainPanel);
		mainPanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel serverPanel = new JPanel();
		mainPanel.add(serverPanel);
		serverPanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel serverInfoPanel = new JPanel();
		serverPanel.add(serverInfoPanel);
		GridBagLayout gbl_serverInfoPanel = new GridBagLayout();
		gbl_serverInfoPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_serverInfoPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_serverInfoPanel.columnWeights = new double[]{1.0, 0.0, 3.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_serverInfoPanel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		serverInfoPanel.setLayout(gbl_serverInfoPanel);
		
		JLabel serverStatusLabel = new JLabel("Online / Offline");
		serverStatusLabel.setIcon(new ImageIcon(loadImage("/icons/onlineIcon.png", 20, 20)));
		GridBagConstraints gbc_serverStatusLabel = new GridBagConstraints();
		gbc_serverStatusLabel.insets = new Insets(0, 0, 5, 5);
		gbc_serverStatusLabel.gridx = 1;
		gbc_serverStatusLabel.gridy = 1;
		serverInfoPanel.add(serverStatusLabel, gbc_serverStatusLabel);
		
		JButton settingsButton = new JButton("Settings");
		settingsButton.setIcon(new ImageIcon(loadImage("/icons/settingsIcon.png", 20, 20)));
		GridBagConstraints gbc_settingsButton = new GridBagConstraints();
		gbc_settingsButton.insets = new Insets(0, 0, 5, 5);
		gbc_settingsButton.gridx = 3;
		gbc_settingsButton.gridy = 1;
		serverInfoPanel.add(settingsButton, gbc_settingsButton);
		
		JButton infosButton = new JButton("Infos");
		infosButton.setIcon(new ImageIcon(loadImage("/icons/infosIcon.png", 20, 20)));
		GridBagConstraints gbc_infosButton = new GridBagConstraints();
		gbc_infosButton.insets = new Insets(0, 0, 5, 5);
		gbc_infosButton.gridx = 4;
		gbc_infosButton.gridy = 1;
		serverInfoPanel.add(infosButton, gbc_infosButton);
		
		JPanel serverButtonPanel = new JPanel();
		serverPanel.add(serverButtonPanel);
		GridBagLayout gbl_serverButtonPanel = new GridBagLayout();
		gbl_serverButtonPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_serverButtonPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_serverButtonPanel.columnWeights = new double[]{2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, Double.MIN_VALUE};
		gbl_serverButtonPanel.rowWeights = new double[]{3.0, 1.0, 3.0, Double.MIN_VALUE};
		serverButtonPanel.setLayout(gbl_serverButtonPanel);
		
		JButton btnNewButton = new JButton("Start");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		serverButtonPanel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Shutdown");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 1;
		serverButtonPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Restart");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 5;
		gbc_btnNewButton_2.gridy = 1;
		serverButtonPanel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JPanel updatePanel = new JPanel();
		mainPanel.add(updatePanel);
		updatePanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel updateInfoPanel = new JPanel();
		updatePanel.add(updateInfoPanel);
		updateInfoPanel.setLayout(new CardLayout(0, 0));
		
		JPanel updateStatus1Panel = new JPanel();
		updateInfoPanel.add(updateStatus1Panel, "updatingStatus1");
		GridBagLayout gbl_updateStatus1Panel = new GridBagLayout();
		gbl_updateStatus1Panel.columnWidths = new int[]{0, 0, 0, 5, 0};
		gbl_updateStatus1Panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_updateStatus1Panel.columnWeights = new double[]{3.0, 0.0, 1.0, 12.0, Double.MIN_VALUE};
		gbl_updateStatus1Panel.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		updateStatus1Panel.setLayout(gbl_updateStatus1Panel);
		
		JLabel lastUpdateLabel = new JLabel("Last update:");
		GridBagConstraints gbc_lastUpdateLabel = new GridBagConstraints();
		gbc_lastUpdateLabel.anchor = GridBagConstraints.WEST;
		gbc_lastUpdateLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lastUpdateLabel.gridx = 1;
		gbc_lastUpdateLabel.gridy = 1;
		updateStatus1Panel.add(lastUpdateLabel, gbc_lastUpdateLabel);
		
		JLabel lblNewLabel = new JLabel("Date and time");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		updateStatus1Panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel nextUpdateLabel = new JLabel("Next update in:");
		GridBagConstraints gbc_nextUpdateLabel = new GridBagConstraints();
		gbc_nextUpdateLabel.anchor = GridBagConstraints.WEST;
		gbc_nextUpdateLabel.insets = new Insets(0, 0, 5, 5);
		gbc_nextUpdateLabel.gridx = 1;
		gbc_nextUpdateLabel.gridy = 3;
		updateStatus1Panel.add(nextUpdateLabel, gbc_nextUpdateLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Time");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		updateStatus1Panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel updateStatus2Panel = new JPanel();
		updateInfoPanel.add(updateStatus2Panel, "updatingStatus2");
		GridBagLayout gbl_updateStatus2Panel = new GridBagLayout();
		gbl_updateStatus2Panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_updateStatus2Panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_updateStatus2Panel.columnWeights = new double[]{1.0, 0.0, 4.0, 1.0, Double.MIN_VALUE};
		gbl_updateStatus2Panel.rowWeights = new double[]{3.0, 1.0, 3.0, Double.MIN_VALUE};
		updateStatus2Panel.setLayout(gbl_updateStatus2Panel);
		
		JLabel updatingLabel = new JLabel("Updating:");
		GridBagConstraints gbc_updatingLabel = new GridBagConstraints();
		gbc_updatingLabel.fill = GridBagConstraints.VERTICAL;
		gbc_updatingLabel.anchor = GridBagConstraints.WEST;
		gbc_updatingLabel.insets = new Insets(0, 0, 5, 5);
		gbc_updatingLabel.gridx = 1;
		gbc_updatingLabel.gridy = 1;
		updateStatus2Panel.add(updatingLabel, gbc_updatingLabel);
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.BOTH;
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.gridx = 2;
		gbc_progressBar.gridy = 1;
		updateStatus2Panel.add(progressBar, gbc_progressBar);
		
		JPanel updateButtonPanel = new JPanel();
		updatePanel.add(updateButtonPanel);
		GridBagLayout gbl_updateButtonPanel = new GridBagLayout();
		gbl_updateButtonPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_updateButtonPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_updateButtonPanel.columnWeights = new double[]{3.0, 0.0, 14.0, Double.MIN_VALUE};
		gbl_updateButtonPanel.rowWeights = new double[]{3.0, 1.0, 3.0, Double.MIN_VALUE};
		updateButtonPanel.setLayout(gbl_updateButtonPanel);
		
		JButton updateButton = new JButton("Update manuelly");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 1;
		updateButtonPanel.add(updateButton, gbc_btnNewButton_3);
		
		JScrollPane logPanel = new JScrollPane();
		splitPane.setRightComponent(logPanel);
		
		JPanel footerPanel = new JPanel();
		getContentPane().add(footerPanel, BorderLayout.SOUTH);
		
		JLabel appInfoLabel = new JLabel("Application Infos");
		footerPanel.add(appInfoLabel);
		setVisible(true);
		
//		CardLayout cl = (CardLayout)(updateInfoPanel.getLayout());
//	    cl.show(updateInfoPanel, "updatingStatus2");
		
	}
	
	private Image loadImage(String path, int width, int height){
		Image img = null;
		try {
			img = ImageIO.read(ServerView.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
        if (img != null) {
            img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        }

        return img;
	}

}
