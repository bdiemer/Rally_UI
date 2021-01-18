import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class RallyMain2 {

	private JFrame frmRcRallyBavaria;
	private JTextField nameRally;
	private JTextField fahrerId;
	private JTextField fahrerVorname;
	private JTextField fahrerName;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RallyMain2 window = new RallyMain2();
					window.frmRcRallyBavaria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RallyMain2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRcRallyBavaria = new JFrame();
		frmRcRallyBavaria.setTitle("RC Rally Bavaria");
		frmRcRallyBavaria.setBounds(100, 100, 714, 487);
		frmRcRallyBavaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmRcRallyBavaria.setJMenuBar(menuBar);
		
		JMenu neueRallyMenue = new JMenu("Rally");
		menuBar.add(neueRallyMenue);
		
		JMenuItem neueRallyItem = new JMenuItem("Neue Rally");
		neueRallyMenue.add(neueRallyItem);
		
		JMenuItem ladenRally = new JMenuItem("Laden Rally");
		neueRallyMenue.add(ladenRally);
		
		JMenuItem resetRawsperry = new JMenuItem("Reset Rawsperry");
		neueRallyMenue.add(resetRawsperry);
		
		JMenuItem wertepruefungMenue = new JMenuItem("Werteprüfung");
		neueRallyMenue.add(wertepruefungMenue);
		
		JMenu fahrerMenue = new JMenu("Fahrer");
		menuBar.add(fahrerMenue);
		
		JMenuItem FahrerRegister = new JMenuItem("Registrieren Fahrer");
		fahrerMenue.add(FahrerRegister);
		
		JMenuItem reihenfolgeFahrerMenue = new JMenuItem("Reihenfolge Fahrer");
		fahrerMenue.add(reihenfolgeFahrerMenue);
		frmRcRallyBavaria.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmRcRallyBavaria.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel rallyTab = new JPanel();
		tabbedPane.addTab("Rally", null, rallyTab, null);
		tabbedPane.setBackgroundAt(0, new Color(135, 206, 235));
		GridBagLayout gbl_rallyTab = new GridBagLayout();
		gbl_rallyTab.columnWidths = new int[] {240, 130, 0};
		gbl_rallyTab.rowHeights = new int[]{26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_rallyTab.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_rallyTab.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		rallyTab.setLayout(gbl_rallyTab);
		
		JLabel rallyIdLabel = new JLabel("Id der Rally");
		rallyIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_rallyIdLabel = new GridBagConstraints();
		gbc_rallyIdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_rallyIdLabel.gridx = 0;
		gbc_rallyIdLabel.gridy = 0;
		rallyTab.add(rallyIdLabel, gbc_rallyIdLabel);
		
		JTextField idRally = new JTextField();
		rallyIdLabel.setLabelFor(idRally);
		GridBagConstraints gbc_idRally = new GridBagConstraints();
		gbc_idRally.insets = new Insets(0, 0, 5, 0);
		gbc_idRally.anchor = GridBagConstraints.NORTHWEST;
		gbc_idRally.gridx = 1;
		gbc_idRally.gridy = 0;
		rallyTab.add(idRally, gbc_idRally);
		idRally.setColumns(10);
		
		JLabel rallyNameLabel = new JLabel("Name der Rally");
		rallyNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_rallyNameLabel = new GridBagConstraints();
		gbc_rallyNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_rallyNameLabel.gridx = 0;
		gbc_rallyNameLabel.gridy = 1;
		rallyTab.add(rallyNameLabel, gbc_rallyNameLabel);
		
		nameRally = new JTextField();
		rallyNameLabel.setLabelFor(nameRally);
		GridBagConstraints gbc_nameRally = new GridBagConstraints();
		gbc_nameRally.insets = new Insets(0, 0, 5, 0);
		gbc_nameRally.anchor = GridBagConstraints.NORTHWEST;
		gbc_nameRally.gridx = 1;
		gbc_nameRally.gridy = 1;
		rallyTab.add(nameRally, gbc_nameRally);
		nameRally.setColumns(30);
		
		JLabel DatumRally = new JLabel("Datum");
		GridBagConstraints gbc_DatumRally = new GridBagConstraints();
		gbc_DatumRally.insets = new Insets(0, 0, 5, 5);
		gbc_DatumRally.gridx = 0;
		gbc_DatumRally.gridy = 2;
		rallyTab.add(DatumRally, gbc_DatumRally);
		
		JFormattedTextField datumRally = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextField.anchor = GridBagConstraints.WEST;
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 2;
		rallyTab.add(datumRally, gbc_formattedTextField);
		datumRally.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(100, 149, 237));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 2;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 8;
		rallyTab.add(separator, gbc_separator);
		
		JButton btnSaveRally = new JButton("Save");
		GridBagConstraints gbc_btnSaveRally = new GridBagConstraints();
		gbc_btnSaveRally.insets = new Insets(0, 0, 0, 5);
		gbc_btnSaveRally.gridx = 0;
		gbc_btnSaveRally.gridy = 9;
		rallyTab.add(btnSaveRally, gbc_btnSaveRally);
		
		JPanel fahrerTab = new JPanel();
		tabbedPane.addTab("Fahrer", null, fahrerTab, null);
		GridBagLayout gbl_fahrerTab = new GridBagLayout();
		gbl_fahrerTab.columnWidths = new int[] {240, 0, 130, 0};
		gbl_fahrerTab.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_fahrerTab.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_fahrerTab.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fahrerTab.setLayout(gbl_fahrerTab);
		
		JLabel idFahrerLabel = new JLabel("Fahrer Id");
		GridBagConstraints gbc_idFahrerLabel = new GridBagConstraints();
		gbc_idFahrerLabel.insets = new Insets(0, 0, 5, 5);
		gbc_idFahrerLabel.gridx = 0;
		gbc_idFahrerLabel.gridy = 0;
		fahrerTab.add(idFahrerLabel, gbc_idFahrerLabel);
		
		fahrerId = new JTextField();
		GridBagConstraints gbc_fahrerId = new GridBagConstraints();
		gbc_fahrerId.insets = new Insets(0, 0, 5, 0);
		gbc_fahrerId.anchor = GridBagConstraints.WEST;
		gbc_fahrerId.gridx = 1;
		gbc_fahrerId.gridy = 0;
		fahrerTab.add(fahrerId, gbc_fahrerId);
		fahrerId.setColumns(10);
		
		JLabel faherVornameLabel = new JLabel("Vorname Fahrer");
		GridBagConstraints gbc_faherVornameLabel = new GridBagConstraints();
		gbc_faherVornameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_faherVornameLabel.gridx = 0;
		gbc_faherVornameLabel.gridy = 1;
		fahrerTab.add(faherVornameLabel, gbc_faherVornameLabel);
		
		fahrerVorname = new JTextField();
		GridBagConstraints gbc_fahrerVorname = new GridBagConstraints();
		gbc_fahrerVorname.insets = new Insets(0, 0, 5, 0);
		gbc_fahrerVorname.anchor = GridBagConstraints.WEST;
		gbc_fahrerVorname.gridx = 1;
		gbc_fahrerVorname.gridy = 1;
		fahrerTab.add(fahrerVorname, gbc_fahrerVorname);
		fahrerVorname.setColumns(20);
		
		JLabel fahrerNameLabel = new JLabel("Name Fahrer");
		GridBagConstraints gbc_fahrerNameLabel = new GridBagConstraints();
		gbc_fahrerNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_fahrerNameLabel.gridx = 0;
		gbc_fahrerNameLabel.gridy = 2;
		fahrerTab.add(fahrerNameLabel, gbc_fahrerNameLabel);
		
		fahrerName = new JTextField();
		GridBagConstraints gbc_fahrerName = new GridBagConstraints();
		gbc_fahrerName.anchor = GridBagConstraints.WEST;
		gbc_fahrerName.insets = new Insets(0, 0, 5, 0);
		gbc_fahrerName.gridx = 1;
		gbc_fahrerName.gridy = 2;
		fahrerTab.add(fahrerName, gbc_fahrerName);
		fahrerName.setColumns(20);
		
		JLabel fahrerKlasse = new JLabel("Rennklasse");
		GridBagConstraints gbc_fahrerKlasse = new GridBagConstraints();
		gbc_fahrerKlasse.insets = new Insets(0, 0, 5, 5);
		gbc_fahrerKlasse.gridx = 0;
		gbc_fahrerKlasse.gridy = 3;
		fahrerTab.add(fahrerKlasse, gbc_fahrerKlasse);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		fahrerTab.add(textField_1, gbc_textField_1);
		textField_1.setColumns(8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(135, 206, 235));
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 2;
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 9;
		fahrerTab.add(separator_1, gbc_separator_1);
		
		JButton btnFahrerSave = new JButton("Save");
		GridBagConstraints gbc_btnFahrerSave = new GridBagConstraints();
		gbc_btnFahrerSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnFahrerSave.gridx = 0;
		gbc_btnFahrerSave.gridy = 10;
		fahrerTab.add(btnFahrerSave, gbc_btnFahrerSave);
		
		JButton btnFahrerDelete = new JButton("Delete");
		GridBagConstraints gbc_btnFahrerDelete = new GridBagConstraints();
		gbc_btnFahrerDelete.gridx = 1;
		gbc_btnFahrerDelete.gridy = 10;
		fahrerTab.add(btnFahrerDelete, gbc_btnFahrerDelete);
		tabbedPane.setBackgroundAt(1, new Color(135, 206, 235));
		
		JPanel werteTab = new JPanel();
		tabbedPane.addTab("Werteprüfung", null, werteTab, null);
		
		JTabbedPane werteTab2 = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel werte2Rasp = new JPanel();
		werteTab2.addTab("Rasperry Zuordnung", null, werte2Rasp, null);
		GridBagLayout gbl_werte2Rasp = new GridBagLayout();
		gbl_werte2Rasp.columnWidths = new int[]{0};
		gbl_werte2Rasp.rowHeights = new int[]{0};
		gbl_werte2Rasp.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_werte2Rasp.rowWeights = new double[]{Double.MIN_VALUE};
		werte2Rasp.setLayout(gbl_werte2Rasp);
		GroupLayout gl_werteTab = new GroupLayout(werteTab);
		gl_werteTab.setHorizontalGroup(
			gl_werteTab.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_werteTab.createSequentialGroup()
					.addGap(15)
					.addComponent(werteTab2, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_werteTab.setVerticalGroup(
			gl_werteTab.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_werteTab.createSequentialGroup()
					.addGap(5)
					.addComponent(werteTab2, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel werteFahrerStart = new JPanel();
		werteTab2.addTab("Reihenfoge Start", null, werteFahrerStart, null);
		
		JPanel werteFahrerZiel = new JPanel();
		werteTab2.addTab("Reihenfolge Ziel", null, werteFahrerZiel, null);
		werteTab.setLayout(gl_werteTab);
		tabbedPane.setBackgroundAt(1, new Color(135, 206, 235));
		
		JPanel ergebnisseTab = new JPanel();
		tabbedPane.addTab("Ergebnisse", null, ergebnisseTab, null);
	}
}
