import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow
  extends JFrame
{
  private String string;
  
  public MainWindow()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.openFileChooser = new JFileChooser();
    this.saveFileChooser = new JFileChooser();
    this.effectDialog = new JDialog();
    this.effectNameLabel = new JLabel();
    this.jButton1 = new JButton();
    this.jLabel55 = new JLabel();
    this.jSlider3 = new JSlider();
    this.jLabel56 = new JLabel();
    this.jButton2 = new JButton();
    this.openScreenDialog = new JDialog();
    this.closeOpenScreen = new JButton();
    this.jLabel54 = new JLabel();
    this.openOpenScreenButton = new JButton();
    this.newOpenScreenButton = new JButton();
    this.ToolsTabbedPane = new JTabbedPane();
    this.jPanel1 = new JPanel();
    this.jPanel8 = new JPanel();
    this.jPanel7 = new JPanel();
    this.recordButton = new JButton();
    this.jLabel7 = new JLabel();
    this.jLabel8 = new JLabel();
    this.newRecordingTextField = new JTextField();
    this.jTextField2 = new JTextField();
    this.jLabel4 = new JLabel();
    this.jPanel9 = new JPanel();
    this.jPanel10 = new JPanel();
    this.rewindButton1 = new JButton();
    this.toStartButton1 = new JButton();
    this.jSlider2 = new JSlider();
    this.toEndButton1 = new JButton();
    this.playButton1 = new JButton();
    this.fastForwardButton1 = new JButton();
    this.jLabel5 = new JLabel();
    this.jLabel6 = new JLabel();
    this.jPanel11 = new JPanel();
    this.jLabel10 = new JLabel();
    this.playButton4 = new JButton();
    this.jLabel9 = new JLabel();
    this.jTextField3 = new JTextField();
    this.jTextField4 = new JTextField();
    this.playButton5 = new JButton();
    this.jLabel11 = new JLabel();
    this.playButton3 = new JButton();
    this.jSeparator43 = new JSeparator();
    this.jSeparator44 = new JSeparator();
    this.jPanel3 = new JPanel();
    this.jPanel12 = new JPanel();
    this.rewindButton2 = new JButton();
    this.rewindButton6 = new JButton();
    this.jLabel3 = new JLabel();
    this.jLabel1 = new JLabel();
    this.rewindButton3 = new JButton();
    this.rewindButton4 = new JButton();
    this.rewindButton5 = new JButton();
    this.jLabel13 = new JLabel();
    this.jLabel15 = new JLabel();
    this.jLabel12 = new JLabel();
    this.jLabel14 = new JLabel();
    this.jSeparator45 = new JSeparator();
    this.jPanel13 = new JPanel();
    this.rewindButton7 = new JButton();
    this.jLabel16 = new JLabel();
    this.jLabel17 = new JLabel();
    this.rewindButton9 = new JButton();
    this.jLabel20 = new JLabel();
    this.jSeparator46 = new JSeparator();
    this.jPanel14 = new JPanel();
    this.rewindButton8 = new JButton();
    this.jLabel18 = new JLabel();
    this.jLabel19 = new JLabel();
    this.rewindButton11 = new JButton();
    this.rewindButton12 = new JButton();
    this.jLabel23 = new JLabel();
    this.jLabel24 = new JLabel();
    this.jPanel15 = new JPanel();
    this.rewindButton10 = new JButton();
    this.jLabel21 = new JLabel();
    this.jLabel22 = new JLabel();
    this.rewindButton14 = new JButton();
    this.rewindButton15 = new JButton();
    this.rewindButton16 = new JButton();
    this.jLabel25 = new JLabel();
    this.jLabel27 = new JLabel();
    this.jLabel28 = new JLabel();
    this.jSeparator47 = new JSeparator();
    this.jPanel2 = new JPanel();
    this.jPanel19 = new JPanel();
    this.jLabel40 = new JLabel();
    this.jLabel41 = new JLabel();
    this.lightingButton = new JButton();
    this.snowflakeButton = new JButton();
    this.scubaButton = new JButton();
    this.rewindButton31 = new JButton();
    this.jLabel42 = new JLabel();
    this.jLabel43 = new JLabel();
    this.jLabel44 = new JLabel();
    this.jPanel20 = new JPanel();
    this.jLabel45 = new JLabel();
    this.jLabel46 = new JLabel();
    this.flameButton = new JButton();
    this.bombButton = new JButton();
    this.drinkButton = new JButton();
    this.noteButton = new JButton();
    this.jLabel47 = new JLabel();
    this.jLabel48 = new JLabel();
    this.jLabel49 = new JLabel();
    this.jPanel21 = new JPanel();
    this.jLabel50 = new JLabel();
    this.jLabel51 = new JLabel();
    this.start2Button = new JButton();
    this.chartButton = new JButton();
    this.star1Button = new JButton();
    this.jLabel52 = new JLabel();
    this.jLabel53 = new JLabel();
    this.jSeparator52 = new JSeparator();
    this.jSeparator53 = new JSeparator();
    this.jPanel4 = new JPanel();
    this.jPanel16 = new JPanel();
    this.jLabel39 = new JLabel();
    this.jLabel31 = new JLabel();
    this.rewindButton20 = new JButton();
    this.rewindButton21 = new JButton();
    this.rewindButton22 = new JButton();
    this.rewindButton19 = new JButton();
    this.jLabel26 = new JLabel();
    this.jLabel30 = new JLabel();
    this.jLabel29 = new JLabel();
    this.jPanel17 = new JPanel();
    this.rewindButton24 = new JButton();
    this.jLabel32 = new JLabel();
    this.rewindButton25 = new JButton();
    this.rewindButton23 = new JButton();
    this.jLabel38 = new JLabel();
    this.jLabel33 = new JLabel();
    this.jLabel34 = new JLabel();
    this.jPanel18 = new JPanel();
    this.jLabel37 = new JLabel();
    this.jLabel35 = new JLabel();
    this.rewindButton26 = new JButton();
    this.rewindButton27 = new JButton();
    this.jLabel36 = new JLabel();
    this.jSeparator50 = new JSeparator();
    this.jSeparator51 = new JSeparator();
    this.TrackPanel = new JPanel();
    this.TrackInfoPanel = new JPanel();
    this.SongNameLabel = new JLabel();
    this.songDurationLabel = new JLabel();
    this.jSlider1 = new JSlider();
    this.SongNameLabel2 = new JLabel();
    this.LockTrackButton = new JButton();
    this.jSeparator48 = new JSeparator();
    this.jSeparator49 = new JSeparator();
    this.muteTrackButton = new JButton();
    this.closeTrackButton = new JButton();
    this.jLabel2 = new JLabel();
    this.jMenuBar1 = new JMenuBar();
    this.jMenu1 = new JMenu();
    this.jMenuItem1 = new JMenuItem();
    this.jMenuItem2 = new JMenuItem();
    this.jMenu11 = new JMenu();
    this.jMenuItem3 = new JMenuItem();
    this.jSeparator1 = new JPopupMenu.Separator();
    this.jMenuItem4 = new JMenuItem();
    this.jMenuItem5 = new JMenuItem();
    this.jMenuItem6 = new JMenuItem();
    this.jMenuItem7 = new JMenuItem();
    this.jMenuItem8 = new JMenuItem();
    this.jSeparator2 = new JPopupMenu.Separator();
    this.jMenuItem9 = new JMenuItem();
    this.jSeparator3 = new JPopupMenu.Separator();
    this.jMenu12 = new JMenu();
    this.jMenuItem96 = new JMenuItem();
    this.jMenuItem97 = new JMenuItem();
    this.jMenuItem98 = new JMenuItem();
    this.jMenuItem99 = new JMenuItem();
    this.jSeparator4 = new JPopupMenu.Separator();
    this.jMenuItem10 = new JMenuItem();
    this.jMenuItem11 = new JMenuItem();
    this.jMenuItem12 = new JMenuItem();
    this.jMenuItem13 = new JMenuItem();
    this.jMenuItem14 = new JMenuItem();
    this.jSeparator5 = new JPopupMenu.Separator();
    this.jMenuItem15 = new JMenuItem();
    this.jMenuItem16 = new JMenuItem();
    this.jSeparator6 = new JPopupMenu.Separator();
    this.jMenuItem17 = new JMenuItem();
    this.jMenuItem18 = new JMenuItem();
    this.jMenu2 = new JMenu();
    this.jMenuItem19 = new JMenuItem();
    this.jMenuItem20 = new JMenuItem();
    this.jSeparator7 = new JPopupMenu.Separator();
    this.jMenuItem21 = new JMenuItem();
    this.jMenuItem22 = new JMenuItem();
    this.jMenuItem23 = new JMenuItem();
    this.jMenuItem24 = new JMenuItem();
    this.jMenuItem25 = new JMenuItem();
    this.jSeparator8 = new JPopupMenu.Separator();
    this.jMenu13 = new JMenu();
    this.jMenuItem127 = new JMenuItem();
    this.jMenuItem128 = new JMenuItem();
    this.jSeparator40 = new JPopupMenu.Separator();
    this.jMenuItem129 = new JMenuItem();
    this.jMenuItem130 = new JMenuItem();
    this.jMenuItem26 = new JMenuItem();
    this.jSeparator9 = new JPopupMenu.Separator();
    this.jMenu14 = new JMenu();
    this.jMenuItem123 = new JMenuItem();
    this.jMenuItem124 = new JMenuItem();
    this.jSeparator39 = new JPopupMenu.Separator();
    this.jMenuItem125 = new JMenuItem();
    this.jMenuItem126 = new JMenuItem();
    this.jSeparator10 = new JPopupMenu.Separator();
    this.jMenu15 = new JMenu();
    this.jMenuItem114 = new JMenuItem();
    this.jMenuItem115 = new JMenuItem();
    this.jSeparator36 = new JPopupMenu.Separator();
    this.jMenuItem116 = new JMenuItem();
    this.jMenuItem117 = new JMenuItem();
    this.jSeparator37 = new JPopupMenu.Separator();
    this.jMenuItem118 = new JMenuItem();
    this.jMenuItem119 = new JMenuItem();
    this.jSeparator38 = new JPopupMenu.Separator();
    this.jMenuItem120 = new JMenuItem();
    this.jMenuItem121 = new JMenuItem();
    this.jMenuItem122 = new JMenuItem();
    this.jMenu16 = new JMenu();
    this.jMenuItem106 = new JMenuItem();
    this.jMenuItem107 = new JMenuItem();
    this.jMenuItem108 = new JMenuItem();
    this.jMenuItem109 = new JMenuItem();
    this.jMenuItem110 = new JMenuItem();
    this.jMenuItem111 = new JMenuItem();
    this.jSeparator35 = new JPopupMenu.Separator();
    this.jMenuItem112 = new JMenuItem();
    this.jMenuItem113 = new JMenuItem();
    this.jMenuItem27 = new JMenuItem();
    this.jMenu17 = new JMenu();
    this.jMenuItem102 = new JMenuItem();
    this.jMenuItem103 = new JMenuItem();
    this.jMenuItem104 = new JMenuItem();
    this.jMenuItem105 = new JMenuItem();
    this.jSeparator11 = new JPopupMenu.Separator();
    this.jMenuItem28 = new JMenuItem();
    this.jMenuItem29 = new JMenuItem();
    this.jSeparator12 = new JPopupMenu.Separator();
    this.jMenu18 = new JMenu();
    this.jMenuItem100 = new JMenuItem();
    this.jMenuItem101 = new JMenuItem();
    this.jSeparator13 = new JPopupMenu.Separator();
    this.jMenuItem30 = new JMenuItem();
    this.jMenu3 = new JMenu();
    this.jMenuItem31 = new JMenuItem();
    this.jMenuItem32 = new JMenuItem();
    this.jMenuItem33 = new JMenuItem();
    this.jMenuItem34 = new JMenuItem();
    this.jSeparator14 = new JPopupMenu.Separator();
    this.jMenuItem35 = new JMenuItem();
    this.jMenuItem36 = new JMenuItem();
    this.jSeparator15 = new JPopupMenu.Separator();
    this.jMenuItem37 = new JMenuItem();
    this.jMenuItem38 = new JMenuItem();
    this.jSeparator16 = new JPopupMenu.Separator();
    this.jMenuItem39 = new JMenuItem();
    this.jMenuItem40 = new JMenuItem();
    this.jSeparator17 = new JPopupMenu.Separator();
    this.jMenuItem41 = new JMenuItem();
    this.jSeparator18 = new JPopupMenu.Separator();
    this.jMenuItem42 = new JMenuItem();
    this.jMenuItem43 = new JMenuItem();
    this.jMenuItem44 = new JMenuItem();
    this.jSeparator19 = new JPopupMenu.Separator();
    this.jMenu19 = new JMenu();
    this.jCheckBoxMenuItem5 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem6 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem7 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem8 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem9 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem10 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem11 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem12 = new JCheckBoxMenuItem();
    this.jSeparator41 = new JPopupMenu.Separator();
    this.jMenuItem131 = new JMenuItem();
    this.jMenu4 = new JMenu();
    this.jMenuItem85 = new JMenuItem();
    this.jMenuItem86 = new JMenuItem();
    this.jMenuItem87 = new JMenuItem();
    this.jMenuItem88 = new JMenuItem();
    this.jMenuItem89 = new JMenuItem();
    this.jMenuItem90 = new JMenuItem();
    this.jSeparator33 = new JPopupMenu.Separator();
    this.jMenuItem91 = new JMenuItem();
    this.jMenuItem92 = new JMenuItem();
    this.jMenuItem93 = new JMenuItem();
    this.jSeparator34 = new JPopupMenu.Separator();
    this.jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem3 = new JCheckBoxMenuItem();
    this.jCheckBoxMenuItem4 = new JCheckBoxMenuItem();
    this.jMenuItem94 = new JMenuItem();
    this.jMenuItem95 = new JMenuItem();
    this.jMenu5 = new JMenu();
    this.jMenu20 = new JMenu();
    this.jMenuItem132 = new JMenuItem();
    this.jMenuItem133 = new JMenuItem();
    this.jMenuItem134 = new JMenuItem();
    this.jMenuItem135 = new JMenuItem();
    this.jSeparator20 = new JPopupMenu.Separator();
    this.jMenuItem45 = new JMenuItem();
    this.jMenuItem46 = new JMenuItem();
    this.jMenuItem47 = new JMenuItem();
    this.jMenuItem48 = new JMenuItem();
    this.jSeparator21 = new JPopupMenu.Separator();
    this.jMenuItem49 = new JMenuItem();
    this.jSeparator22 = new JPopupMenu.Separator();
    this.jMenuItem50 = new JMenuItem();
    this.jMenuItem51 = new JMenuItem();
    this.jSeparator23 = new JPopupMenu.Separator();
    this.jMenu21 = new JMenu();
    this.jMenuItem136 = new JMenuItem();
    this.jMenuItem137 = new JMenuItem();
    this.jSeparator42 = new JPopupMenu.Separator();
    this.jMenuItem138 = new JMenuItem();
    this.jMenuItem139 = new JMenuItem();
    this.jMenuItem140 = new JMenuItem();
    this.jMenuItem141 = new JMenuItem();
    this.jMenuItem142 = new JMenuItem();
    this.jMenu22 = new JMenu();
    this.jMenuItem150 = new JMenuItem();
    this.jMenuItem151 = new JMenuItem();
    this.jMenuItem152 = new JMenuItem();
    this.jMenuItem153 = new JMenuItem();
    this.jMenuItem154 = new JMenuItem();
    this.jSeparator24 = new JPopupMenu.Separator();
    this.jMenuItem52 = new JMenuItem();
    this.jSeparator25 = new JPopupMenu.Separator();
    this.jMenuItem53 = new JMenuItem();
    this.jMenuItem54 = new JMenuItem();
    this.jMenuItem55 = new JMenuItem();
    this.jSeparator26 = new JPopupMenu.Separator();
    this.jMenu23 = new JMenu();
    this.jMenuItem143 = new JMenuItem();
    this.jMenuItem144 = new JMenuItem();
    this.jMenu6 = new JMenu();
    this.jMenuItem56 = new JMenuItem();
    this.jMenuItem57 = new JMenuItem();
    this.jMenuItem58 = new JMenuItem();
    this.jMenuItem59 = new JMenuItem();
    this.jMenuItem60 = new JMenuItem();
    this.jMenu7 = new JMenu();
    this.jMenuItem61 = new JMenuItem();
    this.jSeparator27 = new JPopupMenu.Separator();
    this.AmplifyMenuItem = new JMenuItem();
    this.AutoDuckMenuItem = new JMenuItem();
    this.BassMenuItem = new JMenuItem();
    this.pitchMenuItem = new JMenuItem();
    this.tempoMenuItem = new JMenuItem();
    this.removalMenuItem = new JMenuItem();
    this.compressorMenuItem = new JMenuItem();
    this.echoMenuItem = new JMenuItem();
    this.equalMenuItem = new JMenuItem();
    this.fadeInMenuItem = new JMenuItem();
    this.fadeOutMenuItem = new JMenuItem();
    this.levelerMenuItem = new JMenuItem();
    this.repairMenuItem = new JMenuItem();
    this.jMenuItem147 = new JMenuItem();
    this.reverbMenuItem = new JMenuItem();
    this.wahMenuItem = new JMenuItem();
    this.winterMenuItem = new JMenuItem();
    this.lightningMenuItem = new JMenuItem();
    this.jMenu8 = new JMenu();
    this.jMenuItem73 = new JMenuItem();
    this.jMenuItem74 = new JMenuItem();
    this.jMenuItem75 = new JMenuItem();
    this.jMenu9 = new JMenu();
    this.jMenuItem76 = new JMenuItem();
    this.jMenuItem77 = new JMenuItem();
    this.jSeparator28 = new JPopupMenu.Separator();
    this.jMenuItem78 = new JMenuItem();
    this.jSeparator29 = new JPopupMenu.Separator();
    this.jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
    this.jMenu10 = new JMenu();
    this.jMenuItem79 = new JMenuItem();
    this.jSeparator30 = new JPopupMenu.Separator();
    this.jMenuItem80 = new JMenuItem();
    this.jMenuItem81 = new JMenuItem();
    this.jSeparator31 = new JPopupMenu.Separator();
    this.jMenuItem82 = new JMenuItem();
    this.jSeparator32 = new JPopupMenu.Separator();
    this.jMenuItem83 = new JMenuItem();
    this.jMenuItem84 = new JMenuItem();
    
    this.saveFileChooser.setDialogType(1);
    this.saveFileChooser.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.saveFileChooserActionPerformed(evt);
      }
    });
    this.effectDialog.setMinimumSize(new Dimension(600, 550));
    this.effectDialog.setPreferredSize(new Dimension(600, 550));
    this.effectDialog.setResizable(false);
    
    this.effectNameLabel.setText("Effect Name");
    
    this.jButton1.setText("Close");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jButton1ActionPerformed(evt);
      }
    });
    this.jLabel55.setHorizontalAlignment(0);
    this.jLabel55.setText("Value");
    
    this.jLabel56.setIcon(new ImageIcon(getClass().getResource("/Assets/Other/Graph.png")));
    this.jLabel56.setText("Effect Name");
    
    this.jButton2.setText("Okay");
    this.jButton2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jButton2ActionPerformed(evt);
      }
    });
    GroupLayout effectDialogLayout = new GroupLayout(this.effectDialog.getContentPane());
    this.effectDialog.getContentPane().setLayout(effectDialogLayout);
    effectDialogLayout.setHorizontalGroup(effectDialogLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(effectDialogLayout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addGroup(effectDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(effectDialogLayout.createSequentialGroup()
      .addGap(6, 6, 6)
      .addComponent(this.jLabel56, -2, 549, -2))
      .addGroup(effectDialogLayout.createSequentialGroup()
      .addGroup(effectDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel55, -1, -1, 32767)
      .addComponent(this.jButton1, -2, 61, -2))
      .addGroup(effectDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(effectDialogLayout.createSequentialGroup()
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jSlider3, -2, 427, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jButton2, -2, 61, -2))
      .addGroup(effectDialogLayout.createSequentialGroup()
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.effectNameLabel)
      .addGap(0, 0, 32767)))))
      .addContainerGap()));
    
    effectDialogLayout.setVerticalGroup(effectDialogLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(effectDialogLayout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addGroup(effectDialogLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.effectNameLabel)
      .addComponent(this.jButton1))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel56, -2, 455, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(effectDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(effectDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jSlider3, -1, -1, 32767)
      .addComponent(this.jLabel55, -2, 29, -2))
      .addComponent(this.jButton2))));
    
    this.openScreenDialog.setMinimumSize(new Dimension(280, 190));
    this.openScreenDialog.setResizable(false);
    
    this.closeOpenScreen.setText("Close");
    this.closeOpenScreen.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.closeOpenScreenActionPerformed(evt);
      }
    });
    this.jLabel54.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel54.setText("Audacity");
    
    this.openOpenScreenButton.setText("Open");
    this.openOpenScreenButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.openOpenScreenButtonActionPerformed(evt);
      }
    });
    this.newOpenScreenButton.setText("New");
    this.newOpenScreenButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.newOpenScreenButtonActionPerformed(evt);
      }
    });
    GroupLayout openScreenDialogLayout = new GroupLayout(this.openScreenDialog.getContentPane());
    this.openScreenDialog.getContentPane().setLayout(openScreenDialogLayout);
    openScreenDialogLayout.setHorizontalGroup(openScreenDialogLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(openScreenDialogLayout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addComponent(this.closeOpenScreen, -2, 61, -2)
      .addGap(18, 18, 18)
      .addComponent(this.jLabel54)
      .addContainerGap(-1, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, openScreenDialogLayout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addComponent(this.newOpenScreenButton, -2, 99, -2)
      .addGap(50, 50, 50)
      .addComponent(this.openOpenScreenButton, -2, 99, -2)
      .addGap(10, 10, 10)));
    
    openScreenDialogLayout.setVerticalGroup(openScreenDialogLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, openScreenDialogLayout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addGroup(openScreenDialogLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.closeOpenScreen)
      .addComponent(this.jLabel54))
      .addGap(18, 18, 18)
      .addGroup(openScreenDialogLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.openOpenScreenButton, -2, 88, -2)
      .addComponent(this.newOpenScreenButton, -2, 88, -2))
      .addContainerGap(-1, 32767)));
    
    setDefaultCloseOperation(3);
    setBackground(new Color(155, 155, 155));
    setForeground(Color.pink);
    addWindowListener(new WindowAdapter()
    {
      public void windowOpened(WindowEvent evt)
      {
        MainWindow.this.formWindowOpened(evt);
      }
    });
    this.ToolsTabbedPane.setBackground(new Color(155, 155, 155));
    
    this.jPanel1.setBackground(new Color(155, 155, 155));
    
    this.jPanel8.setBackground(new Color(155, 155, 155));
    
    this.jPanel7.setBackground(new Color(155, 155, 155));
    
    this.recordButton.setBackground(new Color(255, 255, 255));
    this.recordButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-170-record.png")));
    this.recordButton.setBorderPainted(false);
    this.recordButton.setContentAreaFilled(false);
    this.recordButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.recordButtonActionPerformed(evt);
      }
    });
    this.jLabel7.setFont(new Font("Lucida Grande", 0, 18));
    this.jLabel7.setText("Source");
    
    this.jLabel8.setFont(new Font("Lucida Grande", 0, 18));
    this.jLabel8.setText("Title");
    
    this.newRecordingTextField.setText("NewRecording.wav");
    
    this.jTextField2.setText("Internal Microphone");
    this.jTextField2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jTextField2ActionPerformed(evt);
      }
    });
    GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
    this.jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(jPanel7Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
      .addGap(15, 15, 15)
      .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jLabel7)
      .addComponent(this.jLabel8))
      .addGap(18, 18, 18)
      .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jTextField2, -2, 141, -2)
      .addComponent(this.newRecordingTextField))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.recordButton, -2, 51, -2)
      .addContainerGap()));
    
    jPanel7Layout.setVerticalGroup(jPanel7Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
      .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel7Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.recordButton, -2, 58, -2))
      .addGroup(GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
      .addGap(28, 28, 28)
      .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel7)
      .addComponent(this.jTextField2, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel8)
      .addComponent(this.newRecordingTextField, -2, -1, -2))))
      .addContainerGap(-1, 32767)));
    
    this.jLabel4.setBackground(new Color(100, 100, 100));
    this.jLabel4.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel4.setText("Record");
    
    GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
    this.jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(jPanel8Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jPanel7, -2, -1, -2)
      .addContainerGap(-1, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel4)
      .addContainerGap(-1, 32767)));
    
    jPanel8Layout.setVerticalGroup(jPanel8Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel4)
      .addGap(4, 4, 4)
      .addComponent(this.jPanel7, -2, -1, -2)
      .addContainerGap(18, 32767)));
    
    this.jPanel9.setBackground(new Color(155, 155, 155));
    
    this.jPanel10.setBackground(new Color(155, 155, 155));
    
    this.rewindButton1.setBackground(new Color(255, 255, 255));
    this.rewindButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-173-rewind.png")));
    this.rewindButton1.setBorder(null);
    this.rewindButton1.setBorderPainted(false);
    this.rewindButton1.setContentAreaFilled(false);
    
    this.toStartButton1.setBackground(new Color(255, 255, 255));
    this.toStartButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-172-fast-backward.png")));
    this.toStartButton1.setBorder(null);
    this.toStartButton1.setBorderPainted(false);
    this.toStartButton1.setContentAreaFilled(false);
    this.toStartButton1.setMaximumSize(new Dimension(32, 30));
    
    this.toEndButton1.setBackground(new Color(255, 255, 255));
    this.toEndButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-178-fast-forward.png")));
    this.toEndButton1.setBorder(null);
    this.toEndButton1.setBorderPainted(false);
    this.toEndButton1.setContentAreaFilled(false);
    
    this.playButton1.setBackground(new Color(255, 255, 255));
    this.playButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-174-play.png")));
    this.playButton1.setBorder(null);
    this.playButton1.setBorderPainted(false);
    this.playButton1.setContentAreaFilled(false);
    this.playButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.playButton1ActionPerformed(evt);
      }
    });
    this.fastForwardButton1.setBackground(new Color(255, 255, 255));
    this.fastForwardButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-177-forward.png")));
    this.fastForwardButton1.setBorder(null);
    this.fastForwardButton1.setBorderPainted(false);
    this.fastForwardButton1.setContentAreaFilled(false);
    
    this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-185-volume-up.png")));
    
    GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
    this.jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(jPanel10Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel10Layout.createSequentialGroup()
      .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel10Layout.createSequentialGroup()
      .addGap(46, 46, 46)
      .addComponent(this.toStartButton1, -2, 41, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.rewindButton1, -2, 41, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.playButton1, -2, 41, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.fastForwardButton1, -2, 41, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.toEndButton1, -2, 41, -2))
      .addGroup(jPanel10Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel5)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jSlider2, -2, 281, -2)))
      .addGap(6, 6, 6)));
    
    jPanel10Layout.setVerticalGroup(jPanel10Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel10Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
      .addComponent(this.toStartButton1, -2, 43, -2)
      .addComponent(this.rewindButton1, -2, 43, -2)
      .addComponent(this.playButton1, -2, 43, -2)
      .addComponent(this.fastForwardButton1, -2, 43, -2)
      .addComponent(this.toEndButton1, -2, 43, -2))
      .addGap(18, 18, 18)
      .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jSlider2, -2, -1, -2)
      .addComponent(this.jLabel5))
      .addContainerGap(-1, 32767)));
    
    this.jLabel6.setBackground(new Color(100, 100, 100));
    this.jLabel6.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel6.setText("Controls");
    
    GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
    this.jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(jPanel9Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel9Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jPanel10, -2, -1, -2)
      .addContainerGap())
      .addGroup(jPanel9Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel6)
      .addContainerGap(-1, 32767)));
    
    jPanel9Layout.setVerticalGroup(jPanel9Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel9Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel6)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jPanel10, -2, -1, -2)
      .addContainerGap()));
    
    this.jPanel11.setBackground(new Color(155, 155, 155));
    
    this.jLabel10.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel10.setText("Loop");
    
    this.playButton4.setBackground(new Color(255, 255, 255));
    this.playButton4.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-243-map-marker.png")));
    this.playButton4.setBorderPainted(false);
    this.playButton4.setContentAreaFilled(false);
    this.playButton4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.playButton4ActionPerformed(evt);
      }
    });
    this.jLabel9.setFont(new Font("Lucida Grande", 0, 18));
    this.jLabel9.setText("Start");
    
    this.jTextField3.setText("00:00:00.0");
    this.jTextField3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jTextField3ActionPerformed(evt);
      }
    });
    this.jTextField4.setText("00:00:00.0");
    this.jTextField4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jTextField4ActionPerformed(evt);
      }
    });
    this.playButton5.setBackground(new Color(255, 255, 255));
    this.playButton5.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-243-map-marker.png")));
    this.playButton5.setBorderPainted(false);
    this.playButton5.setContentAreaFilled(false);
    this.playButton5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.playButton5ActionPerformed(evt);
      }
    });
    this.jLabel11.setFont(new Font("Lucida Grande", 0, 18));
    this.jLabel11.setText("End");
    
    this.playButton3.setBackground(new Color(255, 255, 255));
    this.playButton3.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-174-play.png")));
    this.playButton3.setBorder(null);
    this.playButton3.setBorderPainted(false);
    this.playButton3.setContentAreaFilled(false);
    this.playButton3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.playButton3ActionPerformed(evt);
      }
    });
    GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
    this.jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(jPanel11Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel10)
      .addContainerGap(-1, 32767))
      .addGroup(jPanel11Layout.createSequentialGroup()
      .addGap(28, 28, 28)
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel11Layout.createSequentialGroup()
      .addComponent(this.playButton4, -2, 30, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel9))
      .addGroup(jPanel11Layout.createSequentialGroup()
      .addComponent(this.playButton5, -2, 30, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel11)))
      .addGap(18, 18, 18)
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jTextField4, -2, 141, -2)
      .addComponent(this.jTextField3, -2, 141, -2))
      .addGap(18, 18, 18)
      .addComponent(this.playButton3, -2, 41, -2)
      .addContainerGap(-1, 32767)));
    
    jPanel11Layout.setVerticalGroup(jPanel11Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel11Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel10)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, 32767)
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel9)
      .addComponent(this.jTextField3, -2, -1, -2))
      .addComponent(this.playButton4, -2, 30, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel11)
      .addComponent(this.jTextField4, -2, -1, -2))
      .addComponent(this.playButton5, -2, 30, -2))
      .addGap(26, 26, 26))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
      .addComponent(this.playButton3, -2, 43, -2)
      .addGap(36, 36, 36)))));
    
    this.jSeparator43.setOrientation(1);
    
    this.jSeparator44.setOrientation(1);
    
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addComponent(this.jPanel8, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jSeparator43, -2, -1, -2)
      .addGap(0, 0, 32767)
      .addComponent(this.jPanel9, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jSeparator44, -2, -1, -2)
      .addGap(18, 18, 32767)
      .addComponent(this.jPanel11, -2, -1, -2)
      .addGap(10, 10, 10)));
    
    jPanel1Layout.setVerticalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jPanel9, -2, -1, -2)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jPanel8, -2, -1, -2)
      .addComponent(this.jSeparator43, GroupLayout.Alignment.LEADING, -2, 145, -2))
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jPanel11, -2, -1, -2)
      .addComponent(this.jSeparator44, -2, 148, -2)))
      .addContainerGap(-1, 32767)));
    
    this.ToolsTabbedPane.addTab("Playback", this.jPanel1);
    
    this.jPanel3.setBackground(new Color(155, 155, 155));
    
    this.jPanel12.setBackground(new Color(155, 155, 155));
    
    this.rewindButton2.setBackground(new Color(255, 255, 255));
    this.rewindButton2.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-85-heat.png")));
    this.rewindButton2.setBorderPainted(false);
    this.rewindButton2.setContentAreaFilled(false);
    
    this.rewindButton6.setBackground(new Color(255, 255, 255));
    this.rewindButton6.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-94-crop.png")));
    this.rewindButton6.setBorderPainted(false);
    this.rewindButton6.setContentAreaFilled(false);
    
    this.jLabel3.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel3.setText("Tools");
    
    this.jLabel1.setHorizontalAlignment(0);
    this.jLabel1.setText("Split");
    
    this.rewindButton3.setBackground(new Color(255, 255, 255));
    this.rewindButton3.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-85-heat.png")));
    this.rewindButton3.setBorderPainted(false);
    this.rewindButton3.setContentAreaFilled(false);
    
    this.rewindButton4.setBackground(new Color(255, 255, 255));
    this.rewindButton4.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-85-heat.png")));
    this.rewindButton4.setBorderPainted(false);
    this.rewindButton4.setContentAreaFilled(false);
    
    this.rewindButton5.setBackground(new Color(255, 255, 255));
    this.rewindButton5.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-366-restart.png")));
    this.rewindButton5.setBorderPainted(false);
    this.rewindButton5.setContentAreaFilled(false);
    
    this.jLabel13.setHorizontalAlignment(0);
    this.jLabel13.setText("Speedup");
    
    this.jLabel15.setHorizontalAlignment(0);
    this.jLabel15.setText("Crop");
    
    this.jLabel12.setHorizontalAlignment(0);
    this.jLabel12.setText("Merge");
    
    this.jLabel14.setHorizontalAlignment(0);
    this.jLabel14.setText("Reverse");
    
    GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
    this.jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(jPanel12Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton2, -1, -1, 32767)
      .addComponent(this.jLabel1, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton3, -1, -1, 32767)
      .addComponent(this.jLabel12, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel3)
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.rewindButton4)
      .addComponent(this.jLabel14))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.rewindButton5)
      .addComponent(this.jLabel13))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton6, -1, -1, 32767)
      .addComponent(this.jLabel15, -2, 45, -2))))
      .addContainerGap()));
    
    jPanel12Layout.setVerticalGroup(jPanel12Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel3)
      .addGap(18, 18, 18)
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addComponent(this.rewindButton6, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel15))
      .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addComponent(this.rewindButton2, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel1))
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addComponent(this.rewindButton3, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel12))
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addComponent(this.rewindButton4, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel14))
      .addGroup(jPanel12Layout.createSequentialGroup()
      .addComponent(this.rewindButton5, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel13))))
      .addContainerGap()));
    
    this.jSeparator45.setOrientation(1);
    
    this.jPanel13.setBackground(new Color(155, 155, 155));
    
    this.rewindButton7.setBackground(new Color(255, 255, 255));
    this.rewindButton7.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-436-undo.png")));
    this.rewindButton7.setBorderPainted(false);
    this.rewindButton7.setContentAreaFilled(false);
    
    this.jLabel16.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel16.setText("Undo/Redo");
    
    this.jLabel17.setHorizontalAlignment(0);
    this.jLabel17.setText("Undo");
    
    this.rewindButton9.setBackground(new Color(255, 255, 255));
    this.rewindButton9.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-435-redo.png")));
    this.rewindButton9.setBorderPainted(false);
    this.rewindButton9.setContentAreaFilled(false);
    
    this.jLabel20.setHorizontalAlignment(0);
    this.jLabel20.setText("Redo");
    
    GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
    this.jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(jPanel13Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel13Layout.createSequentialGroup()
      .addGap(27, 27, 27)
      .addComponent(this.jLabel16)
      .addContainerGap(-1, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton7, -1, -1, 32767)
      .addComponent(this.jLabel17, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton9, -1, -1, 32767)
      .addComponent(this.jLabel20, -2, 45, -2))
      .addContainerGap(-1, 32767)));
    
    jPanel13Layout.setVerticalGroup(jPanel13Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel13Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel16)
      .addGap(18, 18, 18)
      .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel13Layout.createSequentialGroup()
      .addComponent(this.rewindButton7, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel17))
      .addGroup(jPanel13Layout.createSequentialGroup()
      .addComponent(this.rewindButton9, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel20)))
      .addContainerGap()));
    
    this.jSeparator46.setOrientation(1);
    
    this.jPanel14.setBackground(new Color(155, 155, 155));
    
    this.rewindButton8.setBackground(new Color(255, 255, 255));
    this.rewindButton8.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-444-floppy-disk.png")));
    this.rewindButton8.setBorderPainted(false);
    this.rewindButton8.setContentAreaFilled(false);
    
    this.jLabel18.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel18.setText("Quick File");
    
    this.jLabel19.setHorizontalAlignment(0);
    this.jLabel19.setText("Save");
    
    this.rewindButton11.setBackground(new Color(255, 255, 255));
    this.rewindButton11.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-447-floppy-save.png")));
    this.rewindButton11.setBorderPainted(false);
    this.rewindButton11.setContentAreaFilled(false);
    
    this.rewindButton12.setBackground(new Color(255, 255, 255));
    this.rewindButton12.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-448-floppy-open.png")));
    this.rewindButton12.setBorderPainted(false);
    this.rewindButton12.setContentAreaFilled(false);
    
    this.jLabel23.setHorizontalAlignment(0);
    this.jLabel23.setText("Save As");
    
    this.jLabel24.setHorizontalAlignment(0);
    this.jLabel24.setText("Open");
    
    GroupLayout jPanel14Layout = new GroupLayout(this.jPanel14);
    this.jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(jPanel14Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton8, -1, -1, 32767)
      .addComponent(this.jLabel19, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.rewindButton11)
      .addComponent(this.jLabel23))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.rewindButton12)
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addGap(6, 6, 6)
      .addComponent(this.jLabel24))))
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addGap(23, 23, 23)
      .addComponent(this.jLabel18)))
      .addContainerGap(-1, 32767)));
    
    jPanel14Layout.setVerticalGroup(jPanel14Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel18)
      .addGap(18, 18, 18)
      .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addComponent(this.rewindButton8, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel19))
      .addGroup(jPanel14Layout.createSequentialGroup()
      .addComponent(this.rewindButton11, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel23)
      .addComponent(this.jLabel24)))
      .addComponent(this.rewindButton12, -2, 43, -2))
      .addContainerGap()));
    
    this.jPanel15.setBackground(new Color(155, 155, 155));
    
    this.rewindButton10.setBackground(new Color(255, 255, 255));
    this.rewindButton10.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-289-scissors.png")));
    this.rewindButton10.setBorderPainted(false);
    this.rewindButton10.setContentAreaFilled(false);
    
    this.jLabel21.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel21.setText("Clipboard");
    
    this.jLabel22.setHorizontalAlignment(0);
    this.jLabel22.setText("Cut");
    
    this.rewindButton14.setBackground(new Color(255, 255, 255));
    this.rewindButton14.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-512-copy.png")));
    this.rewindButton14.setBorderPainted(false);
    this.rewindButton14.setContentAreaFilled(false);
    
    this.rewindButton15.setBackground(new Color(255, 255, 255));
    this.rewindButton15.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-513-paste.png")));
    this.rewindButton15.setBorderPainted(false);
    this.rewindButton15.setContentAreaFilled(false);
    
    this.rewindButton16.setBackground(new Color(255, 255, 255));
    this.rewindButton16.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-511-duplicate.png")));
    this.rewindButton16.setBorderPainted(false);
    this.rewindButton16.setContentAreaFilled(false);
    
    this.jLabel25.setHorizontalAlignment(0);
    this.jLabel25.setText("Duplicate");
    
    this.jLabel27.setHorizontalAlignment(0);
    this.jLabel27.setText("Copy");
    
    this.jLabel28.setHorizontalAlignment(0);
    this.jLabel28.setText("Paste");
    
    GroupLayout jPanel15Layout = new GroupLayout(this.jPanel15);
    this.jPanel15.setLayout(jPanel15Layout);
    jPanel15Layout.setHorizontalGroup(jPanel15Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton10, -1, -1, 32767)
      .addComponent(this.jLabel22, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel21)
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton14, -1, -1, 32767)
      .addComponent(this.jLabel27, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.rewindButton15)
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addGap(6, 6, 6)
      .addComponent(this.jLabel28)))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel25, -1, -1, 32767)
      .addComponent(this.rewindButton16, -1, -1, 32767))))
      .addContainerGap(-1, 32767)));
    
    jPanel15Layout.setVerticalGroup(jPanel15Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel21)
      .addGap(18, 18, 18)
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addComponent(this.rewindButton10, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel22))
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addComponent(this.rewindButton14, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel27))
      .addComponent(this.rewindButton15, -2, 43, -2)
      .addGroup(jPanel15Layout.createSequentialGroup()
      .addComponent(this.rewindButton16, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel25)
      .addComponent(this.jLabel28, -2, 16, -2))))
      .addContainerGap()));
    
    this.jSeparator47.setOrientation(1);
    
    GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
    this.jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(jPanel3Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addGap(14, 14, 14)
      .addComponent(this.jPanel12, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jSeparator45, -2, -1, -2)
      .addGap(18, 18, 32767)
      .addComponent(this.jPanel13, -2, -1, -2)
      .addGap(18, 18, 32767)
      .addComponent(this.jSeparator46, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jPanel14, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jSeparator47, -2, -1, -2)
      .addGap(18, 18, 18)
      .addComponent(this.jPanel15, -2, -1, -2)
      .addGap(17, 17, 17)));
    
    jPanel3Layout.setVerticalGroup(jPanel3Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jPanel14, GroupLayout.Alignment.TRAILING, -2, -1, -2)
      .addComponent(this.jPanel12, -2, -1, -2)
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
      .addComponent(this.jSeparator46)
      .addComponent(this.jSeparator45)
      .addComponent(this.jSeparator47)
      .addComponent(this.jPanel15, GroupLayout.Alignment.LEADING, -2, -1, -2))
      .addComponent(this.jPanel13, -2, -1, -2))
      .addContainerGap(-1, 32767)));
    
    this.ToolsTabbedPane.addTab("Quick Edit", this.jPanel3);
    
    this.jPanel2.setBackground(new Color(155, 155, 155));
    
    this.jPanel19.setBackground(new Color(155, 155, 155));
    
    this.jLabel40.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel40.setText("Effects");
    
    this.jLabel41.setHorizontalAlignment(0);
    this.jLabel41.setText("Equalisation");
    
    this.lightingButton.setBackground(new Color(255, 255, 255));
    this.lightingButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-206-electricity.png")));
    this.lightingButton.setBorderPainted(false);
    this.lightingButton.setContentAreaFilled(false);
    this.lightingButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.lightingButtonActionPerformed(evt);
      }
    });
    this.snowflakeButton.setBackground(new Color(255, 255, 255));
    this.snowflakeButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-22-snowflake.png")));
    this.snowflakeButton.setBorderPainted(false);
    this.snowflakeButton.setContentAreaFilled(false);
    this.snowflakeButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.snowflakeButtonActionPerformed(evt);
      }
    });
    this.scubaButton.setBackground(new Color(255, 255, 255));
    this.scubaButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-252-scuba-diving.png")));
    this.scubaButton.setBorderPainted(false);
    this.scubaButton.setContentAreaFilled(false);
    this.scubaButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.scubaButtonActionPerformed(evt);
      }
    });
    this.rewindButton31.setBackground(new Color(255, 255, 255));
    this.rewindButton31.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-10-magic.png")));
    this.rewindButton31.setBorderPainted(false);
    this.rewindButton31.setContentAreaFilled(false);
    this.rewindButton31.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton31ActionPerformed(evt);
      }
    });
    this.jLabel42.setHorizontalAlignment(0);
    this.jLabel42.setText("Magic Repair");
    
    this.jLabel43.setHorizontalAlignment(0);
    this.jLabel43.setText("Winterize");
    
    this.jLabel44.setHorizontalAlignment(0);
    this.jLabel44.setText("Lightning Fork");
    
    GroupLayout jPanel19Layout = new GroupLayout(this.jPanel19);
    this.jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(jPanel19Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jLabel40)
      .addContainerGap(-1, 32767))
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel42, -1, 91, 32767)
      .addComponent(this.rewindButton31, -1, -1, 32767))
      .addGap(50, 50, 50)
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.lightingButton, -1, -1, 32767)
      .addComponent(this.jLabel44, -1, -1, 32767))
      .addGap(50, 50, 50)
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.snowflakeButton, -2, 58, -2)
      .addComponent(this.jLabel43))
      .addGap(50, 50, 50)
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel41, -1, -1, 32767)
      .addComponent(this.scubaButton, -1, -1, 32767))
      .addGap(0, 11, 32767)))));
    
    jPanel19Layout.setVerticalGroup(jPanel19Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel40)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addComponent(this.scubaButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel41))
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addComponent(this.rewindButton31, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel42))
      .addGroup(jPanel19Layout.createSequentialGroup()
      .addComponent(this.lightingButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel44)
      .addComponent(this.jLabel43)))
      .addComponent(this.snowflakeButton, -2, 43, -2))
      .addContainerGap()));
    
    this.jPanel20.setBackground(new Color(155, 155, 155));
    
    this.jLabel45.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel45.setText("Filters");
    
    this.jLabel46.setHorizontalAlignment(0);
    this.jLabel46.setText("Paulstretch");
    
    this.flameButton.setBackground(new Color(255, 255, 255));
    this.flameButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-23-fire.png")));
    this.flameButton.setBorderPainted(false);
    this.flameButton.setContentAreaFilled(false);
    this.flameButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.flameButtonActionPerformed(evt);
      }
    });
    this.bombButton.setBackground(new Color(255, 255, 255));
    this.bombButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-290-bomb.png")));
    this.bombButton.setBorderPainted(false);
    this.bombButton.setContentAreaFilled(false);
    this.bombButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.bombButtonActionPerformed(evt);
      }
    });
    this.drinkButton.setBackground(new Color(255, 255, 255));
    this.drinkButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-292-celebration.png")));
    this.drinkButton.setBorderPainted(false);
    this.drinkButton.setContentAreaFilled(false);
    this.drinkButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.drinkButtonActionPerformed(evt);
      }
    });
    this.noteButton.setBackground(new Color(255, 255, 255));
    this.noteButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-19-music-alt.png")));
    this.noteButton.setBorderPainted(false);
    this.noteButton.setContentAreaFilled(false);
    this.noteButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.noteButtonActionPerformed(evt);
      }
    });
    this.jLabel47.setHorizontalAlignment(0);
    this.jLabel47.setText("Noise Removal");
    
    this.jLabel48.setHorizontalAlignment(0);
    this.jLabel48.setText("Phaser");
    
    this.jLabel49.setHorizontalAlignment(0);
    this.jLabel49.setText("Fusion");
    
    GroupLayout jPanel20Layout = new GroupLayout(this.jPanel20);
    this.jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(jPanel20Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jLabel45)
      .addContainerGap(-1, 32767))
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel47, -1, -1, 32767)
      .addComponent(this.noteButton, -1, -1, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767)
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.flameButton, -1, -1, 32767)
      .addComponent(this.jLabel49, -1, -1, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767)
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel48, -1, -1, 32767)
      .addComponent(this.bombButton, -2, 0, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767)
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel46, -1, -1, 32767)
      .addComponent(this.drinkButton, -1, -1, 32767))
      .addGap(0, 0, 32767)))));
    
    jPanel20Layout.setVerticalGroup(jPanel20Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel45)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, 32767)
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addComponent(this.drinkButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel46))
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addComponent(this.noteButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel47))
      .addGroup(jPanel20Layout.createSequentialGroup()
      .addComponent(this.flameButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel49)
      .addComponent(this.jLabel48)))
      .addComponent(this.bombButton, -2, 43, -2))
      .addContainerGap()));
    
    this.jPanel21.setBackground(new Color(155, 155, 155));
    
    this.jLabel50.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel50.setText("Levels");
    
    this.jLabel51.setHorizontalAlignment(0);
    this.jLabel51.setText("Levels");
    
    this.start2Button.setBackground(new Color(255, 255, 255));
    this.start2Button.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-50-star.png")));
    this.start2Button.setBorderPainted(false);
    this.start2Button.setContentAreaFilled(false);
    this.start2Button.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.start2ButtonActionPerformed(evt);
      }
    });
    this.chartButton.setBackground(new Color(255, 255, 255));
    this.chartButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-42-charts.png")));
    this.chartButton.setBorderPainted(false);
    this.chartButton.setContentAreaFilled(false);
    this.chartButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.chartButtonActionPerformed(evt);
      }
    });
    this.star1Button.setBackground(new Color(255, 255, 255));
    this.star1Button.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-49-star-empty.png")));
    this.star1Button.setBorderPainted(false);
    this.star1Button.setContentAreaFilled(false);
    this.star1Button.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.star1ButtonActionPerformed(evt);
      }
    });
    this.jLabel52.setHorizontalAlignment(0);
    this.jLabel52.setText("Treble");
    
    this.jLabel53.setHorizontalAlignment(0);
    this.jLabel53.setText("Bass");
    
    GroupLayout jPanel21Layout = new GroupLayout(this.jPanel21);
    this.jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(jPanel21Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel21Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel21Layout.createSequentialGroup()
      .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.star1Button, -1, -1, 32767)
      .addComponent(this.jLabel52, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767)
      .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel53, -2, 39, -2)
      .addComponent(this.start2Button, -2, 39, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767)
      .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.chartButton)
      .addComponent(this.jLabel51, -2, 40, -2))
      .addContainerGap())
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jLabel50)
      .addContainerGap(-1, 32767)))));
    
    jPanel21Layout.setVerticalGroup(jPanel21Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel21Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel50)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, 32767)
      .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel21Layout.createSequentialGroup()
      .addComponent(this.chartButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel51))
      .addGroup(jPanel21Layout.createSequentialGroup()
      .addComponent(this.star1Button, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel52))
      .addGroup(jPanel21Layout.createSequentialGroup()
      .addGap(49, 49, 49)
      .addComponent(this.jLabel53))
      .addComponent(this.start2Button, -2, 43, -2))
      .addContainerGap()));
    
    this.jSeparator52.setOrientation(1);
    
    this.jSeparator53.setOrientation(1);
    
    GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
    this.jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(jPanel2Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addComponent(this.jPanel19, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 247, 32767)
      .addComponent(this.jSeparator52, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 265, 32767)
      .addComponent(this.jPanel20, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 266, 32767)
      .addComponent(this.jSeparator53, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 307, 32767)
      .addComponent(this.jPanel21, -2, -1, -2)
      .addGap(10, 10, 10)));
    
    jPanel2Layout.setVerticalGroup(jPanel2Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jPanel21, -2, -1, -2))
      .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
      .addGap(24, 24, 24)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jPanel20, -2, -1, -2)
      .addComponent(this.jPanel19, -2, -1, -2))))
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addGap(24, 24, 24)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jSeparator52, -2, 145, -2)
      .addComponent(this.jSeparator53, -2, 145, -2))))
      .addContainerGap(14, 32767)));
    
    this.ToolsTabbedPane.addTab("Filters and Effects", this.jPanel2);
    
    this.jPanel4.setBackground(new Color(155, 155, 155));
    
    this.jPanel16.setBackground(new Color(155, 155, 155));
    
    this.jLabel39.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel39.setText("Disk");
    
    this.jLabel31.setHorizontalAlignment(0);
    this.jLabel31.setText("New");
    
    this.rewindButton20.setBackground(new Color(255, 255, 255));
    this.rewindButton20.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-447-floppy-save.png")));
    this.rewindButton20.setBorderPainted(false);
    this.rewindButton20.setContentAreaFilled(false);
    this.rewindButton20.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton20ActionPerformed(evt);
      }
    });
    this.rewindButton21.setBackground(new Color(255, 255, 255));
    this.rewindButton21.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-448-floppy-open.png")));
    this.rewindButton21.setBorderPainted(false);
    this.rewindButton21.setContentAreaFilled(false);
    this.rewindButton21.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton21ActionPerformed(evt);
      }
    });
    this.rewindButton22.setBackground(new Color(255, 255, 255));
    this.rewindButton22.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-433-plus.png")));
    this.rewindButton22.setBorderPainted(false);
    this.rewindButton22.setContentAreaFilled(false);
    this.rewindButton22.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton22ActionPerformed(evt);
      }
    });
    this.rewindButton19.setBackground(new Color(255, 255, 255));
    this.rewindButton19.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-444-floppy-disk.png")));
    this.rewindButton19.setBorderPainted(false);
    this.rewindButton19.setContentAreaFilled(false);
    this.rewindButton19.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton19ActionPerformed(evt);
      }
    });
    this.jLabel26.setHorizontalAlignment(0);
    this.jLabel26.setText("Save");
    
    this.jLabel30.setHorizontalAlignment(0);
    this.jLabel30.setText("Open");
    
    this.jLabel29.setHorizontalAlignment(0);
    this.jLabel29.setText("Save As");
    
    GroupLayout jPanel16Layout = new GroupLayout(this.jPanel16);
    this.jPanel16.setLayout(jPanel16Layout);
    jPanel16Layout.setHorizontalGroup(jPanel16Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel16Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel16Layout.createSequentialGroup()
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton19, -1, -1, 32767)
      .addComponent(this.jLabel26, -2, 45, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, 32767)
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.rewindButton20, -1, -1, 32767)
      .addComponent(this.jLabel29, -1, -1, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, 32767)
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel30, -2, 39, -2)
      .addComponent(this.rewindButton21, -2, 39, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 95, 32767)
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel31, -2, 33, -2)
      .addComponent(this.rewindButton22, -2, 36, -2)))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jLabel39)
      .addGap(0, 0, 32767)))
      .addContainerGap()));
    
    jPanel16Layout.linkSize(0, new Component[] { this.jLabel29, this.rewindButton20 });
    
    jPanel16Layout.linkSize(0, new Component[] { this.jLabel30, this.rewindButton21 });
    
    jPanel16Layout.linkSize(0, new Component[] { this.jLabel31, this.rewindButton22 });
    
    jPanel16Layout.setVerticalGroup(jPanel16Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel16Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel39)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel16Layout.createSequentialGroup()
      .addComponent(this.rewindButton22, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel31))
      .addGroup(jPanel16Layout.createSequentialGroup()
      .addComponent(this.rewindButton19, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel26))
      .addGroup(jPanel16Layout.createSequentialGroup()
      .addComponent(this.rewindButton20, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel29)
      .addComponent(this.jLabel30)))
      .addComponent(this.rewindButton21, -2, 43, -2))
      .addContainerGap()));
    
    this.jPanel17.setBackground(new Color(155, 155, 155));
    
    this.rewindButton24.setBackground(new Color(255, 255, 255));
    this.rewindButton24.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-416-disk-open.png")));
    this.rewindButton24.setBorderPainted(false);
    this.rewindButton24.setContentAreaFilled(false);
    this.rewindButton24.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton24ActionPerformed(evt);
      }
    });
    this.jLabel32.setHorizontalAlignment(0);
    this.jLabel32.setText("Import");
    
    this.rewindButton25.setBackground(new Color(255, 255, 255));
    this.rewindButton25.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-31-pencil.png")));
    this.rewindButton25.setBorderPainted(false);
    this.rewindButton25.setContentAreaFilled(false);
    this.rewindButton25.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton25ActionPerformed(evt);
      }
    });
    this.rewindButton23.setBackground(new Color(255, 255, 255));
    this.rewindButton23.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-415-disk-save.png")));
    this.rewindButton23.setBorderPainted(false);
    this.rewindButton23.setContentAreaFilled(false);
    this.rewindButton23.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton23ActionPerformed(evt);
      }
    });
    this.jLabel38.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel38.setHorizontalAlignment(0);
    this.jLabel38.setText("Edit");
    
    this.jLabel33.setHorizontalAlignment(0);
    this.jLabel33.setText("Export");
    
    this.jLabel34.setHorizontalAlignment(0);
    this.jLabel34.setText("Rename");
    
    GroupLayout jPanel17Layout = new GroupLayout(this.jPanel17);
    this.jPanel17.setLayout(jPanel17Layout);
    jPanel17Layout.setHorizontalGroup(jPanel17Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jLabel32)
      .addComponent(this.rewindButton23, -2, 46, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 112, 32767)
      .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel33, -1, 136, 32767)
      .addComponent(this.rewindButton24, -1, -1, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 114, 32767)
      .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jLabel34, -1, -1, 32767)
      .addComponent(this.rewindButton25, -1, -1, 32767)))
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(this.jLabel38, -2, 138, -2)
      .addGap(0, 0, 32767)))
      .addContainerGap()));
    
    jPanel17Layout.linkSize(0, new Component[] { this.jLabel32, this.rewindButton23 });
    
    jPanel17Layout.linkSize(0, new Component[] { this.jLabel34, this.rewindButton25 });
    
    jPanel17Layout.setVerticalGroup(jPanel17Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel38)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addComponent(this.rewindButton25, -2, 43, -2)
      .addGap(22, 22, 22))
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addComponent(this.rewindButton24, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel33)
      .addComponent(this.jLabel34)))
      .addGroup(jPanel17Layout.createSequentialGroup()
      .addComponent(this.rewindButton23, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel32)))
      .addContainerGap()));
    
    this.jPanel18.setBackground(new Color(155, 155, 155));
    
    this.jLabel37.setFont(new Font("Lucida Grande", 0, 24));
    this.jLabel37.setText("Cloud");
    
    this.jLabel35.setHorizontalAlignment(0);
    this.jLabel35.setText("Download");
    
    this.rewindButton26.setBackground(new Color(255, 255, 255));
    this.rewindButton26.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-365-cloud-download.png")));
    this.rewindButton26.setBorderPainted(false);
    this.rewindButton26.setContentAreaFilled(false);
    this.rewindButton26.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton26ActionPerformed(evt);
      }
    });
    this.rewindButton27.setBackground(new Color(255, 255, 255));
    this.rewindButton27.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-364-cloud-upload.png")));
    this.rewindButton27.setBorderPainted(false);
    this.rewindButton27.setContentAreaFilled(false);
    this.rewindButton27.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.rewindButton27ActionPerformed(evt);
      }
    });
    this.jLabel36.setHorizontalAlignment(0);
    this.jLabel36.setText("Upload");
    
    GroupLayout jPanel18Layout = new GroupLayout(this.jPanel18);
    this.jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(jPanel18Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel18Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel35, -1, 173, 32767)
      .addComponent(this.rewindButton26, -1, -1, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 173, 32767)
      .addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jLabel36)
      .addComponent(this.rewindButton27, -2, 50, -2))
      .addContainerGap())
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel37)
      .addContainerGap(-1, 32767)));
    
    jPanel18Layout.linkSize(0, new Component[] { this.jLabel36, this.rewindButton27 });
    
    jPanel18Layout.setVerticalGroup(jPanel18Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel18Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel37)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel18Layout.createSequentialGroup()
      .addComponent(this.rewindButton27, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel36))
      .addGroup(jPanel18Layout.createSequentialGroup()
      .addComponent(this.rewindButton26, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jLabel35)))
      .addContainerGap()));
    
    this.jSeparator50.setOrientation(1);
    
    this.jSeparator51.setOrientation(1);
    
    GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
    this.jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(jPanel4Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
      .addGap(0, 146, 32767)
      .addComponent(this.jPanel16, -1, -1, 32767)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 149, 32767)
      .addComponent(this.jSeparator50, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 148, 32767)
      .addComponent(this.jPanel17, -1, -1, 32767)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 147, 32767)
      .addComponent(this.jSeparator51, -2, -1, -2)
      .addGap(18, 152, 32767)
      .addComponent(this.jPanel18, -1, -1, 32767)
      .addGap(0, 151, 32767)));
    
    jPanel4Layout.setVerticalGroup(jPanel4Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jPanel18, -2, -1, -2)
      .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jPanel16, -2, -1, -2)
      .addComponent(this.jPanel17, -2, -1, -2)))
      .addGap(35, 35, 35))
      .addGroup(jPanel4Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jSeparator51, -2, 145, -2)
      .addComponent(this.jSeparator50, -2, 145, -2))
      .addContainerGap(32, 32767)));
    
    this.ToolsTabbedPane.addTab("File", this.jPanel4);
    
    this.TrackPanel.setBackground(new Color(102, 204, 255));
    this.TrackPanel.setVisible(false);
    
    this.TrackInfoPanel.setBackground(new Color(55, 55, 55));
    
    this.SongNameLabel.setFont(new Font("Lucida Grande", 0, 18));
    this.SongNameLabel.setForeground(new Color(155, 155, 155));
    this.SongNameLabel.setText("Song Name");
    
    this.songDurationLabel.setFont(new Font("Lucida Grande", 0, 12));
    this.songDurationLabel.setForeground(new Color(155, 155, 155));
    this.songDurationLabel.setText("3:14.15");
    
    this.jSlider1.setBackground(new Color(155, 155, 155));
    
    this.SongNameLabel2.setFont(new Font("Lucida Grande", 0, 18));
    this.SongNameLabel2.setForeground(new Color(155, 155, 155));
    this.SongNameLabel2.setHorizontalAlignment(0);
    this.SongNameLabel2.setText("Volume");
    
    this.LockTrackButton.setBackground(new Color(255, 255, 255));
    this.LockTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-204-lock.png")));
    this.LockTrackButton.setBorderPainted(false);
    this.LockTrackButton.setContentAreaFilled(false);
    this.LockTrackButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.LockTrackButtonActionPerformed(evt);
      }
    });
    this.muteTrackButton.setBackground(new Color(255, 255, 255));
    this.muteTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-183-mute.png")));
    this.muteTrackButton.setBorderPainted(false);
    this.muteTrackButton.setContentAreaFilled(false);
    this.muteTrackButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.muteTrackButtonActionPerformed(evt);
      }
    });
    this.closeTrackButton.setBackground(new Color(255, 255, 255));
    this.closeTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-17-bin.png")));
    this.closeTrackButton.setBorderPainted(false);
    this.closeTrackButton.setContentAreaFilled(false);
    this.closeTrackButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.closeTrackButtonActionPerformed(evt);
      }
    });
    GroupLayout TrackInfoPanelLayout = new GroupLayout(this.TrackInfoPanel);
    this.TrackInfoPanel.setLayout(TrackInfoPanelLayout);
    TrackInfoPanelLayout.setHorizontalGroup(TrackInfoPanelLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addGap(15, 15, 15)
      .addGroup(TrackInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addComponent(this.SongNameLabel, -1, 129, 32767)
      .addContainerGap(36, 32767))
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addComponent(this.songDurationLabel, -1, -1, 32767)
      .addContainerGap(-1, 32767))))
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addGroup(TrackInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jSlider1, -2, 0, 32767)
      .addComponent(this.SongNameLabel2, -1, 131, 32767))
      .addGap(0, 0, 32767))
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addContainerGap()
      .addGroup(TrackInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jSeparator48)
      .addComponent(this.jSeparator49))
      .addContainerGap())
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addGroup(TrackInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.LockTrackButton, -2, 41, -2)
      .addComponent(this.muteTrackButton, -2, 41, -2))
      .addContainerGap(-1, 32767))
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.closeTrackButton, -2, 29, -2)
      .addContainerGap(-1, 32767)));
    
    TrackInfoPanelLayout.setVerticalGroup(TrackInfoPanelLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(TrackInfoPanelLayout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.closeTrackButton, -2, 30, -2)
      .addGap(42, 42, 42)
      .addComponent(this.SongNameLabel)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.songDurationLabel)
      .addGap(26, 26, 26)
      .addComponent(this.jSeparator48, -2, -1, -2)
      .addGap(40, 40, 40)
      .addComponent(this.SongNameLabel2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jSlider1, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.muteTrackButton, -2, 43, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, 32767)
      .addComponent(this.jSeparator49, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, 32767)
      .addComponent(this.LockTrackButton, -2, 43, -2)
      .addGap(49, 49, 49)));
    
    this.jLabel2.setText("Wave form goes here...");
    
    GroupLayout TrackPanelLayout = new GroupLayout(this.TrackPanel);
    this.TrackPanel.setLayout(TrackPanelLayout);
    TrackPanelLayout.setHorizontalGroup(TrackPanelLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(TrackPanelLayout.createSequentialGroup()
      .addComponent(this.TrackInfoPanel, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jLabel2)
      .addContainerGap(-1, 32767)));
    
    TrackPanelLayout.setVerticalGroup(TrackPanelLayout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.TrackInfoPanel, -1, -1, 32767)
      .addGroup(TrackPanelLayout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addComponent(this.jLabel2)
      .addContainerGap(-1, 32767)));
    
    this.jMenuBar1.setBackground(new Color(135, 135, 135));
    
    this.jMenu1.setText("File");
    this.jMenu1.addComponentListener(new ComponentAdapter()
    {
      public void componentHidden(ComponentEvent evt)
      {
        MainWindow.this.jMenu1ComponentHidden(evt);
      }
    });
    this.jMenuItem1.setText("New");
    this.jMenuItem1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem1ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem1);
    
    this.jMenuItem2.setText("Open");
    this.jMenuItem2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem2ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem2);
    
    this.jMenu11.setText("Open Recent");
    
    this.jMenuItem3.setText("ExampleFile1");
    this.jMenu11.add(this.jMenuItem3);
    
    this.jMenu1.add(this.jMenu11);
    this.jMenu1.add(this.jSeparator1);
    
    this.jMenuItem4.setText("Close");
    this.jMenuItem4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem4ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem4);
    
    this.jMenuItem5.setText("Save Project");
    this.jMenuItem5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem5ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem5);
    
    this.jMenuItem6.setText("Save Project As...");
    this.jMenuItem6.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem6ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem6);
    
    this.jMenuItem7.setText("Save Compressed Project As...");
    this.jMenu1.add(this.jMenuItem7);
    
    this.jMenuItem8.setText("Check Dependencies...");
    this.jMenu1.add(this.jMenuItem8);
    this.jMenu1.add(this.jSeparator2);
    
    this.jMenuItem9.setText("Edit Metadata...");
    this.jMenu1.add(this.jMenuItem9);
    this.jMenu1.add(this.jSeparator3);
    
    this.jMenu12.setText("Import");
    
    this.jMenuItem96.setText("Audio...");
    this.jMenu12.add(this.jMenuItem96);
    
    this.jMenuItem97.setText("Labels...");
    this.jMenu12.add(this.jMenuItem97);
    
    this.jMenuItem98.setText("MIDI...");
    this.jMenu12.add(this.jMenuItem98);
    
    this.jMenuItem99.setText("Raw Data...");
    this.jMenu12.add(this.jMenuItem99);
    
    this.jMenu1.add(this.jMenu12);
    this.jMenu1.add(this.jSeparator4);
    
    this.jMenuItem10.setText("Export Audio...");
    this.jMenuItem10.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem10ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem10);
    
    this.jMenuItem11.setText("Export Selected Audio...");
    this.jMenu1.add(this.jMenuItem11);
    
    this.jMenuItem12.setText("Export Labels...");
    this.jMenu1.add(this.jMenuItem12);
    
    this.jMenuItem13.setText("Export Multiple...");
    this.jMenu1.add(this.jMenuItem13);
    
    this.jMenuItem14.setText("Export MIDI...");
    this.jMenu1.add(this.jMenuItem14);
    this.jMenu1.add(this.jSeparator5);
    
    this.jMenuItem15.setText("Apply Chain...");
    this.jMenu1.add(this.jMenuItem15);
    
    this.jMenuItem16.setText("Edit Chains...");
    this.jMenuItem16.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem16ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem16);
    this.jMenu1.add(this.jSeparator6);
    
    this.jMenuItem17.setText("Page Setup...");
    this.jMenuItem17.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem17ActionPerformed(evt);
      }
    });
    this.jMenu1.add(this.jMenuItem17);
    
    this.jMenuItem18.setText("Print...");
    this.jMenu1.add(this.jMenuItem18);
    
    this.jMenuBar1.add(this.jMenu1);
    
    this.jMenu2.setText("Edit");
    
    this.jMenuItem19.setText("Undo");
    this.jMenu2.add(this.jMenuItem19);
    
    this.jMenuItem20.setText("Redo");
    this.jMenu2.add(this.jMenuItem20);
    this.jMenu2.add(this.jSeparator7);
    
    this.jMenuItem21.setText("Cut");
    this.jMenu2.add(this.jMenuItem21);
    
    this.jMenuItem22.setText("Delete");
    this.jMenu2.add(this.jMenuItem22);
    
    this.jMenuItem23.setText("Copy");
    this.jMenu2.add(this.jMenuItem23);
    
    this.jMenuItem24.setText("Paste");
    this.jMenu2.add(this.jMenuItem24);
    
    this.jMenuItem25.setText("Duplicate");
    this.jMenu2.add(this.jMenuItem25);
    this.jMenu2.add(this.jSeparator8);
    
    this.jMenu13.setText("Remove Special");
    
    this.jMenuItem127.setText("Split Cut");
    this.jMenu13.add(this.jMenuItem127);
    
    this.jMenuItem128.setText("Split Delete");
    this.jMenu13.add(this.jMenuItem128);
    this.jMenu13.add(this.jSeparator40);
    
    this.jMenuItem129.setText("Silence Audio");
    this.jMenu13.add(this.jMenuItem129);
    
    this.jMenuItem130.setText("Trim Audio");
    this.jMenu13.add(this.jMenuItem130);
    
    this.jMenu2.add(this.jMenu13);
    
    this.jMenuItem26.setText("Paste Text to New Label");
    this.jMenu2.add(this.jMenuItem26);
    this.jMenu2.add(this.jSeparator9);
    
    this.jMenu14.setText("Clip Boundaries");
    
    this.jMenuItem123.setText("Split");
    this.jMenu14.add(this.jMenuItem123);
    
    this.jMenuItem124.setText("Split New");
    this.jMenu14.add(this.jMenuItem124);
    this.jMenu14.add(this.jSeparator39);
    
    this.jMenuItem125.setText("Join");
    this.jMenu14.add(this.jMenuItem125);
    
    this.jMenuItem126.setText("Detach at Silences");
    this.jMenu14.add(this.jMenuItem126);
    
    this.jMenu2.add(this.jMenu14);
    this.jMenu2.add(this.jSeparator10);
    
    this.jMenu15.setText("Labeled Audio");
    
    this.jMenuItem114.setText("Cut");
    this.jMenu15.add(this.jMenuItem114);
    
    this.jMenuItem115.setText("Delete");
    this.jMenu15.add(this.jMenuItem115);
    this.jMenu15.add(this.jSeparator36);
    
    this.jMenuItem116.setText("Split Cut");
    this.jMenu15.add(this.jMenuItem116);
    
    this.jMenuItem117.setText("Split Delete");
    this.jMenu15.add(this.jMenuItem117);
    this.jMenu15.add(this.jSeparator37);
    
    this.jMenuItem118.setText("Silence Audio");
    this.jMenu15.add(this.jMenuItem118);
    
    this.jMenuItem119.setText("Copy");
    this.jMenu15.add(this.jMenuItem119);
    this.jMenu15.add(this.jSeparator38);
    
    this.jMenuItem120.setText("Split");
    this.jMenu15.add(this.jMenuItem120);
    
    this.jMenuItem121.setText("Join");
    this.jMenu15.add(this.jMenuItem121);
    
    this.jMenuItem122.setText("Detach at Silences");
    this.jMenu15.add(this.jMenuItem122);
    
    this.jMenu2.add(this.jMenu15);
    
    this.jMenu16.setText("Select");
    
    this.jMenuItem106.setText("All");
    this.jMenu16.add(this.jMenuItem106);
    
    this.jMenuItem107.setText("None");
    this.jMenuItem107.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem107ActionPerformed(evt);
      }
    });
    this.jMenu16.add(this.jMenuItem107);
    
    this.jMenuItem108.setText("Left At Playback Position");
    this.jMenu16.add(this.jMenuItem108);
    
    this.jMenuItem109.setText("Right At Playback Position");
    this.jMenu16.add(this.jMenuItem109);
    
    this.jMenuItem110.setText("Track Start to Cursor");
    this.jMenu16.add(this.jMenuItem110);
    
    this.jMenuItem111.setText("Cursor to Track End");
    this.jMenu16.add(this.jMenuItem111);
    this.jMenu16.add(this.jSeparator35);
    
    this.jMenuItem112.setText("In All Tracks");
    this.jMenu16.add(this.jMenuItem112);
    
    this.jMenuItem113.setText("In All Sync-Locked Tracks");
    this.jMenu16.add(this.jMenuItem113);
    
    this.jMenu2.add(this.jMenu16);
    
    this.jMenuItem27.setText("Find Zero Crossings");
    this.jMenu2.add(this.jMenuItem27);
    
    this.jMenu17.setText("Move Cursor");
    
    this.jMenuItem102.setText("To Selection Start");
    this.jMenu17.add(this.jMenuItem102);
    
    this.jMenuItem103.setText("To Selection End");
    this.jMenu17.add(this.jMenuItem103);
    
    this.jMenuItem104.setText("To Track Start");
    this.jMenuItem104.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem104ActionPerformed(evt);
      }
    });
    this.jMenu17.add(this.jMenuItem104);
    
    this.jMenuItem105.setText("To Track End");
    this.jMenu17.add(this.jMenuItem105);
    
    this.jMenu2.add(this.jMenu17);
    this.jMenu2.add(this.jSeparator11);
    
    this.jMenuItem28.setText("Region Save");
    this.jMenu2.add(this.jMenuItem28);
    
    this.jMenuItem29.setText("Region Restore");
    this.jMenu2.add(this.jMenuItem29);
    this.jMenu2.add(this.jSeparator12);
    
    this.jMenu18.setText("Play Region");
    
    this.jMenuItem100.setText("Lock");
    this.jMenu18.add(this.jMenuItem100);
    
    this.jMenuItem101.setText("Unlock");
    this.jMenu18.add(this.jMenuItem101);
    
    this.jMenu2.add(this.jMenu18);
    this.jMenu2.add(this.jSeparator13);
    
    this.jMenuItem30.setText("Start Dictation...");
    this.jMenu2.add(this.jMenuItem30);
    
    this.jMenuBar1.add(this.jMenu2);
    
    this.jMenu3.setText("View");
    
    this.jMenuItem31.setText("Zoom In");
    this.jMenu3.add(this.jMenuItem31);
    
    this.jMenuItem32.setText("Zoom Normal");
    this.jMenu3.add(this.jMenuItem32);
    
    this.jMenuItem33.setText("Zoom Out");
    this.jMenu3.add(this.jMenuItem33);
    
    this.jMenuItem34.setText("Zoom to Selection");
    this.jMenu3.add(this.jMenuItem34);
    this.jMenu3.add(this.jSeparator14);
    
    this.jMenuItem35.setText("Fit in Window");
    this.jMenuItem35.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem35ActionPerformed(evt);
      }
    });
    this.jMenu3.add(this.jMenuItem35);
    
    this.jMenuItem36.setText("Fit Vertically");
    this.jMenuItem36.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem36ActionPerformed(evt);
      }
    });
    this.jMenu3.add(this.jMenuItem36);
    this.jMenu3.add(this.jSeparator15);
    
    this.jMenuItem37.setText("Go to Selection Start");
    this.jMenuItem37.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem37ActionPerformed(evt);
      }
    });
    this.jMenu3.add(this.jMenuItem37);
    
    this.jMenuItem38.setText("Go to Selection End");
    this.jMenu3.add(this.jMenuItem38);
    this.jMenu3.add(this.jSeparator16);
    
    this.jMenuItem39.setText("Collapse All Tracks");
    this.jMenuItem39.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem39ActionPerformed(evt);
      }
    });
    this.jMenu3.add(this.jMenuItem39);
    
    this.jMenuItem40.setText("Expand All Tracks");
    this.jMenu3.add(this.jMenuItem40);
    this.jMenu3.add(this.jSeparator17);
    
    this.jMenuItem41.setText("Show Clipping");
    this.jMenuItem41.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem41ActionPerformed(evt);
      }
    });
    this.jMenu3.add(this.jMenuItem41);
    this.jMenu3.add(this.jSeparator18);
    
    this.jMenuItem42.setText("History...");
    this.jMenuItem42.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem42ActionPerformed(evt);
      }
    });
    this.jMenu3.add(this.jMenuItem42);
    
    this.jMenuItem43.setText("Karaoke...");
    this.jMenu3.add(this.jMenuItem43);
    
    this.jMenuItem44.setText("Mixer Board...");
    this.jMenu3.add(this.jMenuItem44);
    this.jMenu3.add(this.jSeparator19);
    
    this.jMenu19.setText("Toolbars");
    
    this.jCheckBoxMenuItem5.setSelected(true);
    this.jCheckBoxMenuItem5.setText("Device Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem5);
    
    this.jCheckBoxMenuItem6.setSelected(true);
    this.jCheckBoxMenuItem6.setText("Edit Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem6);
    
    this.jCheckBoxMenuItem7.setSelected(true);
    this.jCheckBoxMenuItem7.setText("Meter Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem7);
    
    this.jCheckBoxMenuItem8.setSelected(true);
    this.jCheckBoxMenuItem8.setText("Mixer Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem8);
    
    this.jCheckBoxMenuItem9.setSelected(true);
    this.jCheckBoxMenuItem9.setText("Selection Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem9);
    
    this.jCheckBoxMenuItem10.setSelected(true);
    this.jCheckBoxMenuItem10.setText("Tools Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem10);
    
    this.jCheckBoxMenuItem11.setSelected(true);
    this.jCheckBoxMenuItem11.setText("Transcription Toolbar");
    this.jCheckBoxMenuItem11.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jCheckBoxMenuItem11ActionPerformed(evt);
      }
    });
    this.jMenu19.add(this.jCheckBoxMenuItem11);
    
    this.jCheckBoxMenuItem12.setSelected(true);
    this.jCheckBoxMenuItem12.setText("Transport Toolbar");
    this.jMenu19.add(this.jCheckBoxMenuItem12);
    this.jMenu19.add(this.jSeparator41);
    
    this.jMenuItem131.setText("Reset Toolbars");
    this.jMenu19.add(this.jMenuItem131);
    
    this.jMenu3.add(this.jMenu19);
    
    this.jMenuBar1.add(this.jMenu3);
    
    this.jMenu4.setText("Transport");
    
    this.jMenuItem85.setText("Play/Stop");
    this.jMenu4.add(this.jMenuItem85);
    
    this.jMenuItem86.setText("Play/Strop and Set Cursor");
    this.jMenu4.add(this.jMenuItem86);
    
    this.jMenuItem87.setText("Loop Play");
    this.jMenu4.add(this.jMenuItem87);
    
    this.jMenuItem88.setText("Pause");
    this.jMenu4.add(this.jMenuItem88);
    
    this.jMenuItem89.setText("Skip to Start");
    this.jMenu4.add(this.jMenuItem89);
    
    this.jMenuItem90.setText("Skip to End");
    this.jMenu4.add(this.jMenuItem90);
    this.jMenu4.add(this.jSeparator33);
    
    this.jMenuItem91.setText("Record");
    this.jMenu4.add(this.jMenuItem91);
    
    this.jMenuItem92.setText("Timer Record...");
    this.jMenu4.add(this.jMenuItem92);
    
    this.jMenuItem93.setText("Append Record");
    this.jMenu4.add(this.jMenuItem93);
    this.jMenu4.add(this.jSeparator34);
    
    this.jCheckBoxMenuItem2.setSelected(true);
    this.jCheckBoxMenuItem2.setText("Overdub (On/Off)");
    this.jMenu4.add(this.jCheckBoxMenuItem2);
    
    this.jCheckBoxMenuItem3.setSelected(true);
    this.jCheckBoxMenuItem3.setText("Software Playthrough (On/Off)");
    this.jMenu4.add(this.jCheckBoxMenuItem3);
    
    this.jCheckBoxMenuItem4.setSelected(true);
    this.jCheckBoxMenuItem4.setText("Sound Activated Recording (On/Off)");
    this.jMenu4.add(this.jCheckBoxMenuItem4);
    
    this.jMenuItem94.setText("Sounf Activation Level...");
    this.jMenuItem94.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem94ActionPerformed(evt);
      }
    });
    this.jMenu4.add(this.jMenuItem94);
    
    this.jMenuItem95.setText("Rescan Audio Devices");
    this.jMenuItem95.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem95ActionPerformed(evt);
      }
    });
    this.jMenu4.add(this.jMenuItem95);
    
    this.jMenuBar1.add(this.jMenu4);
    
    this.jMenu5.setText("Tracks");
    
    this.jMenu20.setText("Add New");
    
    this.jMenuItem132.setText("Audio Track");
    this.jMenu20.add(this.jMenuItem132);
    
    this.jMenuItem133.setText("Stereo Track");
    this.jMenu20.add(this.jMenuItem133);
    
    this.jMenuItem134.setText("Label Track");
    this.jMenu20.add(this.jMenuItem134);
    
    this.jMenuItem135.setText("Time Track");
    this.jMenu20.add(this.jMenuItem135);
    
    this.jMenu5.add(this.jMenu20);
    this.jMenu5.add(this.jSeparator20);
    
    this.jMenuItem45.setText("Stereo Track to Mono");
    this.jMenu5.add(this.jMenuItem45);
    
    this.jMenuItem46.setText("Mix and Render");
    this.jMenu5.add(this.jMenuItem46);
    
    this.jMenuItem47.setText("Mix and Render to New Track");
    this.jMenu5.add(this.jMenuItem47);
    
    this.jMenuItem48.setText("Resample...");
    this.jMenu5.add(this.jMenuItem48);
    this.jMenu5.add(this.jSeparator21);
    
    this.jMenuItem49.setText("Remove Tracks");
    this.jMenu5.add(this.jMenuItem49);
    this.jMenu5.add(this.jSeparator22);
    
    this.jMenuItem50.setText("Mute All Tracks");
    this.jMenu5.add(this.jMenuItem50);
    
    this.jMenuItem51.setText("Unmute All Tracks");
    this.jMenu5.add(this.jMenuItem51);
    this.jMenu5.add(this.jSeparator23);
    
    this.jMenu21.setText("Align Tracks");
    
    this.jMenuItem136.setText("Align End to End");
    this.jMenu21.add(this.jMenuItem136);
    
    this.jMenuItem137.setText("Align Together");
    this.jMenu21.add(this.jMenuItem137);
    this.jMenu21.add(this.jSeparator42);
    
    this.jMenuItem138.setText("Start to Zero");
    this.jMenuItem138.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem138ActionPerformed(evt);
      }
    });
    this.jMenu21.add(this.jMenuItem138);
    
    this.jMenuItem139.setText("Start to Cursor/Selection Start");
    this.jMenu21.add(this.jMenuItem139);
    
    this.jMenuItem140.setText("Start to Selection End");
    this.jMenu21.add(this.jMenuItem140);
    
    this.jMenuItem141.setText("End to Cursor/Selection Start");
    this.jMenu21.add(this.jMenuItem141);
    
    this.jMenuItem142.setText("End to Selection End");
    this.jMenu21.add(this.jMenuItem142);
    
    this.jMenu5.add(this.jMenu21);
    
    this.jMenu22.setText("Move Selection when Aligning");
    
    this.jMenuItem150.setText("Start to Zero");
    this.jMenuItem150.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem150ActionPerformed(evt);
      }
    });
    this.jMenu22.add(this.jMenuItem150);
    
    this.jMenuItem151.setText("End to Selection End");
    this.jMenu22.add(this.jMenuItem151);
    
    this.jMenuItem152.setText("End to Cursor/Selection Start");
    this.jMenu22.add(this.jMenuItem152);
    
    this.jMenuItem153.setText("Start to Selection End");
    this.jMenu22.add(this.jMenuItem153);
    
    this.jMenuItem154.setText("Start to Cursor/Selection Start");
    this.jMenu22.add(this.jMenuItem154);
    
    this.jMenu5.add(this.jMenu22);
    this.jMenu5.add(this.jSeparator24);
    
    this.jMenuItem52.setText("Sync-Lock Tracks");
    this.jMenu5.add(this.jMenuItem52);
    this.jMenu5.add(this.jSeparator25);
    
    this.jMenuItem53.setText("Add Label at Selection");
    this.jMenu5.add(this.jMenuItem53);
    
    this.jMenuItem54.setText("Add Label at Playback Position");
    this.jMenu5.add(this.jMenuItem54);
    
    this.jMenuItem55.setText("Edit Labels...");
    this.jMenu5.add(this.jMenuItem55);
    this.jMenu5.add(this.jSeparator26);
    
    this.jMenu23.setText("Sort Tracks");
    
    this.jMenuItem143.setText("by Start Time");
    this.jMenu23.add(this.jMenuItem143);
    
    this.jMenuItem144.setText("by Name");
    this.jMenuItem144.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem144ActionPerformed(evt);
      }
    });
    this.jMenu23.add(this.jMenuItem144);
    
    this.jMenu5.add(this.jMenu23);
    
    this.jMenuBar1.add(this.jMenu5);
    
    this.jMenu6.setText("Generate");
    
    this.jMenuItem56.setText("Chirp...");
    this.jMenu6.add(this.jMenuItem56);
    
    this.jMenuItem57.setText("DTMF Tones...");
    this.jMenu6.add(this.jMenuItem57);
    
    this.jMenuItem58.setText("Noise...");
    this.jMenu6.add(this.jMenuItem58);
    
    this.jMenuItem59.setText("Silence...");
    this.jMenu6.add(this.jMenuItem59);
    
    this.jMenuItem60.setText("Tones...");
    this.jMenu6.add(this.jMenuItem60);
    
    this.jMenuBar1.add(this.jMenu6);
    
    this.jMenu7.setText("Effects");
    
    this.jMenuItem61.setText("Repeat Last Effect");
    this.jMenu7.add(this.jMenuItem61);
    this.jMenu7.add(this.jSeparator27);
    
    this.AmplifyMenuItem.setText("Amplify...");
    this.AmplifyMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.AmplifyMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.AmplifyMenuItem);
    
    this.AutoDuckMenuItem.setText("Auto Duck...");
    this.AutoDuckMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.AutoDuckMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.AutoDuckMenuItem);
    
    this.BassMenuItem.setText("Bass and Treble...");
    this.BassMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.BassMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.BassMenuItem);
    
    this.pitchMenuItem.setText("Change Pitch...");
    this.pitchMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.pitchMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.pitchMenuItem);
    
    this.tempoMenuItem.setText("Change Speed...");
    this.tempoMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.tempoMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.tempoMenuItem);
    
    this.removalMenuItem.setText("Change Tempo...");
    this.removalMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.removalMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.removalMenuItem);
    
    this.compressorMenuItem.setText("Click Removal...");
    this.compressorMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.compressorMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.compressorMenuItem);
    
    this.echoMenuItem.setText("Compressor...");
    this.jMenu7.add(this.echoMenuItem);
    
    this.equalMenuItem.setText("Echo...");
    this.jMenu7.add(this.equalMenuItem);
    
    this.fadeInMenuItem.setText("Equalization...");
    this.fadeInMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.fadeInMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.fadeInMenuItem);
    
    this.fadeOutMenuItem.setText("Fade In...");
    this.fadeOutMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.fadeOutMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.fadeOutMenuItem);
    
    this.levelerMenuItem.setText("Fade Out...");
    this.levelerMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.levelerMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.levelerMenuItem);
    
    this.repairMenuItem.setText("Leveler");
    this.repairMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.repairMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.repairMenuItem);
    
    this.jMenuItem147.setText("Repair");
    this.jMenuItem147.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem147ActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.jMenuItem147);
    
    this.reverbMenuItem.setText("Reverb");
    this.reverbMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.reverbMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.reverbMenuItem);
    
    this.wahMenuItem.setText("Wahwah");
    this.wahMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.wahMenuItemActionPerformed(evt);
      }
    });
    this.jMenu7.add(this.wahMenuItem);
    
    this.winterMenuItem.setText("Winterize");
    this.jMenu7.add(this.winterMenuItem);
    
    this.lightningMenuItem.setText("Lightning Fork");
    this.jMenu7.add(this.lightningMenuItem);
    
    this.jMenuBar1.add(this.jMenu7);
    
    this.jMenu8.setText("Analyze");
    
    this.jMenuItem73.setText("Contrast...");
    this.jMenu8.add(this.jMenuItem73);
    
    this.jMenuItem74.setText("Plot Spectrum...");
    this.jMenu8.add(this.jMenuItem74);
    
    this.jMenuItem75.setText("Find Clipping...");
    this.jMenuItem75.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem75ActionPerformed(evt);
      }
    });
    this.jMenu8.add(this.jMenuItem75);
    
    this.jMenuBar1.add(this.jMenu8);
    
    this.jMenu9.setText("Window");
    
    this.jMenuItem76.setText("Minimize");
    this.jMenu9.add(this.jMenuItem76);
    
    this.jMenuItem77.setText("Zoom");
    this.jMenu9.add(this.jMenuItem77);
    this.jMenu9.add(this.jSeparator28);
    
    this.jMenuItem78.setText("Bring All To Front");
    this.jMenu9.add(this.jMenuItem78);
    this.jMenu9.add(this.jSeparator29);
    
    this.jCheckBoxMenuItem1.setSelected(true);
    this.jCheckBoxMenuItem1.setText("Audacity");
    this.jMenu9.add(this.jCheckBoxMenuItem1);
    
    this.jMenuBar1.add(this.jMenu9);
    
    this.jMenu10.setText("Help");
    
    this.jMenuItem79.setText("Search");
    this.jMenu10.add(this.jMenuItem79);
    this.jMenu10.add(this.jSeparator30);
    
    this.jMenuItem80.setText("Quick Help");
    this.jMenu10.add(this.jMenuItem80);
    
    this.jMenuItem81.setText("Manual");
    this.jMenu10.add(this.jMenuItem81);
    this.jMenu10.add(this.jSeparator31);
    
    this.jMenuItem82.setText("Screenshot Tools...");
    this.jMenuItem82.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem82ActionPerformed(evt);
      }
    });
    this.jMenu10.add(this.jMenuItem82);
    this.jMenu10.add(this.jSeparator32);
    
    this.jMenuItem83.setText("Audio Device Info...");
    this.jMenuItem83.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem83ActionPerformed(evt);
      }
    });
    this.jMenu10.add(this.jMenuItem83);
    
    this.jMenuItem84.setText("Show Log...");
    this.jMenuItem84.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        MainWindow.this.jMenuItem84ActionPerformed(evt);
      }
    });
    this.jMenu10.add(this.jMenuItem84);
    
    this.jMenuBar1.add(this.jMenu10);
    
    setJMenuBar(this.jMenuBar1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.ToolsTabbedPane)
      .addComponent(this.TrackPanel, -1, -1, 32767));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.ToolsTabbedPane, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.TrackPanel, -2, -1, -2)
      .addContainerGap(395, 32767)));
    
    pack();
  }
  
  public String getString()
  {
    return this.string;
  }
  
  public void setString(String string)
  {
    this.string = string;
  }
  
  private void jMenuItem1ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem4ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem5ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem6ActionPerformed(ActionEvent evt)
  {
    this.saveFileChooser.showSaveDialog(this);
  }
  
  private void jMenuItem10ActionPerformed(ActionEvent evt) {}
  
  private void jMenu1ComponentHidden(ComponentEvent evt) {}
  
  private void jMenuItem16ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem17ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem35ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem36ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem37ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem39ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem41ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem42ActionPerformed(ActionEvent evt) {}
  
  private void AmplifyMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
  }
  
  private void pitchMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
  }
  
  private void tempoMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
  }
  
  private void removalMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Noise Removal");
  }
  
  private void compressorMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Compressor");
  }
  
  private void fadeInMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Fade In");
  }
  
  private void fadeOutMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Fade Out");
  }
  
  private boolean isPlaying = false;
  private boolean isRecording = false;
  
  private void jMenuItem75ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem82ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem84ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem83ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem94ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem95ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem104ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem107ActionPerformed(ActionEvent evt) {}
  
  private void jCheckBoxMenuItem11ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem138ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem144ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem150ActionPerformed(ActionEvent evt) {}
  
  private void jMenuItem2ActionPerformed(ActionEvent evt)
  {
    this.openFileChooser.showOpenDialog(this);
    File file = this.openFileChooser.getSelectedFile();
    if (file != null)
    {
      String filename = file.toString();
      String[] parts = filename.split("/");
      
      String name = parts[(parts.length - 1)];
      
      this.SongNameLabel.setText(name);
      this.TrackPanel.setVisible(true);
    }
  }
  
  private boolean unlockTrack = false;
  
  private void LockTrackButtonActionPerformed(ActionEvent evt)
  {
    if (this.unlockTrack) {
      this.LockTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-204-lock.png")));
    } else {
      this.LockTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-205-unlock.png")));
    }
    this.unlockTrack = (!this.unlockTrack);
  }
  
  private boolean muteTrack = false;
  
  private void muteTrackButtonActionPerformed(ActionEvent evt)
  {
    if (this.muteTrack) {
      this.muteTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-183-mute.png")));
    } else {
      this.muteTrackButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-185-volume-up.png")));
    }
    this.muteTrack = (!this.muteTrack);
  }
  
  private void closeTrackButtonActionPerformed(ActionEvent evt)
  {
    this.TrackPanel.setVisible(false);
  }
  
  private void saveFileChooserActionPerformed(ActionEvent evt) {}
  
  private void levelerMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Leveler");
  }
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(false);
  }
  
  private void jButton2ActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(false);
  }
  
  private void AutoDuckMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Auto Duck");
  }
  
  private void BassMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Bass");
  }
  
  private void wahMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Wah Wah");
  }
  
  private void repairMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Repair");
  }
  
  private void jMenuItem147ActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
  }
  
  private void reverbMenuItemActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Reverb");
  }
  
  private void rewindButton27ActionPerformed(ActionEvent evt) {}
  
  private void rewindButton26ActionPerformed(ActionEvent evt) {}
  
  private void rewindButton23ActionPerformed(ActionEvent evt) {}
  
  private void rewindButton25ActionPerformed(ActionEvent evt) {}
  
  private void rewindButton24ActionPerformed(ActionEvent evt) {}
  
  private void rewindButton19ActionPerformed(ActionEvent evt)
  {
    this.saveFileChooser.showSaveDialog(this);
  }
  
  private void rewindButton22ActionPerformed(ActionEvent evt) {}
  
  private void rewindButton21ActionPerformed(ActionEvent evt)
  {
    jMenuItem2ActionPerformed(evt);
  }
  
  private void rewindButton20ActionPerformed(ActionEvent evt)
  {
    this.saveFileChooser.showSaveDialog(this);
  }
  
  private void star1ButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Treble");
  }
  
  private void chartButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Levels");
  }
  
  private void start2ButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Bass");
  }
  
  private void noteButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Noise Removal");
  }
  
  private void drinkButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Paulstretch");
  }
  
  private void bombButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Phaser");
  }
  
  private void flameButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Fusion");
  }
  
  private void rewindButton31ActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
  }
  
  private void scubaButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Equalisation");
  }
  
  private void snowflakeButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Winterise");
  }
  
  private void lightingButtonActionPerformed(ActionEvent evt)
  {
    this.effectDialog.setVisible(true);
    this.effectNameLabel.setText("Lightning Fork");
  }
  
  private void playButton3ActionPerformed(ActionEvent evt) {}
  
  private void playButton5ActionPerformed(ActionEvent evt) {}
  
  private void jTextField4ActionPerformed(ActionEvent evt) {}
  
  private void jTextField3ActionPerformed(ActionEvent evt) {}
  
  private void playButton4ActionPerformed(ActionEvent evt) {}
  
  private void playButton1ActionPerformed(ActionEvent evt)
  {
    if (this.isPlaying) {
      this.playButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-174-play.png")));
    } else {
      this.playButton1.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-175-pause.png")));
    }
    this.isPlaying = (!this.isPlaying);
  }
  
  private void jTextField2ActionPerformed(ActionEvent evt) {}
  
  private void recordButtonActionPerformed(ActionEvent evt)
  {
    final Timer timer = new Timer();
    if (this.isRecording)
    {
      this.recordButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-170-record.png")));
    }
    else
    {
      this.recordButton.setIcon(new ImageIcon(getClass().getResource("/Assets/ Icons/glyphicons-176-stop.png")));
      this.TrackPanel.setVisible(true);
      this.SongNameLabel.setText(this.newRecordingTextField.getText());
      setRecordTime(0);
      
      timer.scheduleAtFixedRate(new TimerTask()
      {
        public void run()
        {
          MainWindow.this.incrementRecordTime();
          if (!MainWindow.this.isRecording) {
            timer.cancel();
          }
        }
      }, 10L, 10L);
    }
    this.isRecording = (!this.isRecording);
  }
  
  private int recordTime = 0;
  private JMenuItem AmplifyMenuItem;
  private JMenuItem AutoDuckMenuItem;
  private JMenuItem BassMenuItem;
  private JButton LockTrackButton;
  private JLabel SongNameLabel;
  private JLabel SongNameLabel2;
  private JTabbedPane ToolsTabbedPane;
  private JPanel TrackInfoPanel;
  private JPanel TrackPanel;
  private JButton bombButton;
  private JButton chartButton;
  private JButton closeOpenScreen;
  private JButton closeTrackButton;
  private JMenuItem compressorMenuItem;
  private JButton drinkButton;
  private JMenuItem echoMenuItem;
  private JDialog effectDialog;
  private JLabel effectNameLabel;
  private JMenuItem equalMenuItem;
  private JMenuItem fadeInMenuItem;
  private JMenuItem fadeOutMenuItem;
  private JButton fastForwardButton1;
  private JButton flameButton;
  private JButton jButton1;
  private JButton jButton2;
  private JCheckBoxMenuItem jCheckBoxMenuItem1;
  private JCheckBoxMenuItem jCheckBoxMenuItem10;
  private JCheckBoxMenuItem jCheckBoxMenuItem11;
  private JCheckBoxMenuItem jCheckBoxMenuItem12;
  private JCheckBoxMenuItem jCheckBoxMenuItem2;
  private JCheckBoxMenuItem jCheckBoxMenuItem3;
  private JCheckBoxMenuItem jCheckBoxMenuItem4;
  private JCheckBoxMenuItem jCheckBoxMenuItem5;
  private JCheckBoxMenuItem jCheckBoxMenuItem6;
  private JCheckBoxMenuItem jCheckBoxMenuItem7;
  private JCheckBoxMenuItem jCheckBoxMenuItem8;
  private JCheckBoxMenuItem jCheckBoxMenuItem9;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel11;
  private JLabel jLabel12;
  private JLabel jLabel13;
  private JLabel jLabel14;
  private JLabel jLabel15;
  private JLabel jLabel16;
  private JLabel jLabel17;
  private JLabel jLabel18;
  private JLabel jLabel19;
  private JLabel jLabel2;
  private JLabel jLabel20;
  private JLabel jLabel21;
  private JLabel jLabel22;
  private JLabel jLabel23;
  private JLabel jLabel24;
  private JLabel jLabel25;
  private JLabel jLabel26;
  private JLabel jLabel27;
  private JLabel jLabel28;
  private JLabel jLabel29;
  private JLabel jLabel3;
  private JLabel jLabel30;
  private JLabel jLabel31;
  private JLabel jLabel32;
  private JLabel jLabel33;
  private JLabel jLabel34;
  private JLabel jLabel35;
  private JLabel jLabel36;
  private JLabel jLabel37;
  private JLabel jLabel38;
  private JLabel jLabel39;
  private JLabel jLabel4;
  private JLabel jLabel40;
  private JLabel jLabel41;
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  private JLabel jLabel45;
  private JLabel jLabel46;
  private JLabel jLabel47;
  private JLabel jLabel48;
  private JLabel jLabel49;
  private JLabel jLabel5;
  private JLabel jLabel50;
  private JLabel jLabel51;
  private JLabel jLabel52;
  private JLabel jLabel53;
  private JLabel jLabel54;
  private JLabel jLabel55;
  private JLabel jLabel56;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JMenu jMenu1;
  private JMenu jMenu10;
  private JMenu jMenu11;
  private JMenu jMenu12;
  private JMenu jMenu13;
  private JMenu jMenu14;
  private JMenu jMenu15;
  private JMenu jMenu16;
  private JMenu jMenu17;
  private JMenu jMenu18;
  private JMenu jMenu19;
  private JMenu jMenu2;
  private JMenu jMenu20;
  private JMenu jMenu21;
  private JMenu jMenu22;
  private JMenu jMenu23;
  private JMenu jMenu3;
  private JMenu jMenu4;
  private JMenu jMenu5;
  private JMenu jMenu6;
  private JMenu jMenu7;
  private JMenu jMenu8;
  private JMenu jMenu9;
  private JMenuBar jMenuBar1;
  private JMenuItem jMenuItem1;
  private JMenuItem jMenuItem10;
  private JMenuItem jMenuItem100;
  private JMenuItem jMenuItem101;
  private JMenuItem jMenuItem102;
  private JMenuItem jMenuItem103;
  private JMenuItem jMenuItem104;
  private JMenuItem jMenuItem105;
  private JMenuItem jMenuItem106;
  private JMenuItem jMenuItem107;
  private JMenuItem jMenuItem108;
  private JMenuItem jMenuItem109;
  private JMenuItem jMenuItem11;
  private JMenuItem jMenuItem110;
  private JMenuItem jMenuItem111;
  private JMenuItem jMenuItem112;
  private JMenuItem jMenuItem113;
  private JMenuItem jMenuItem114;
  private JMenuItem jMenuItem115;
  private JMenuItem jMenuItem116;
  private JMenuItem jMenuItem117;
  private JMenuItem jMenuItem118;
  private JMenuItem jMenuItem119;
  private JMenuItem jMenuItem12;
  private JMenuItem jMenuItem120;
  private JMenuItem jMenuItem121;
  private JMenuItem jMenuItem122;
  private JMenuItem jMenuItem123;
  private JMenuItem jMenuItem124;
  private JMenuItem jMenuItem125;
  private JMenuItem jMenuItem126;
  private JMenuItem jMenuItem127;
  private JMenuItem jMenuItem128;
  private JMenuItem jMenuItem129;
  private JMenuItem jMenuItem13;
  private JMenuItem jMenuItem130;
  private JMenuItem jMenuItem131;
  private JMenuItem jMenuItem132;
  private JMenuItem jMenuItem133;
  private JMenuItem jMenuItem134;
  private JMenuItem jMenuItem135;
  private JMenuItem jMenuItem136;
  private JMenuItem jMenuItem137;
  private JMenuItem jMenuItem138;
  private JMenuItem jMenuItem139;
  private JMenuItem jMenuItem14;
  private JMenuItem jMenuItem140;
  private JMenuItem jMenuItem141;
  private JMenuItem jMenuItem142;
  private JMenuItem jMenuItem143;
  private JMenuItem jMenuItem144;
  private JMenuItem jMenuItem147;
  private JMenuItem jMenuItem15;
  private JMenuItem jMenuItem150;
  private JMenuItem jMenuItem151;
  private JMenuItem jMenuItem152;
  private JMenuItem jMenuItem153;
  private JMenuItem jMenuItem154;
  private JMenuItem jMenuItem16;
  private JMenuItem jMenuItem17;
  private JMenuItem jMenuItem18;
  private JMenuItem jMenuItem19;
  private JMenuItem jMenuItem2;
  private JMenuItem jMenuItem20;
  private JMenuItem jMenuItem21;
  private JMenuItem jMenuItem22;
  private JMenuItem jMenuItem23;
  private JMenuItem jMenuItem24;
  private JMenuItem jMenuItem25;
  private JMenuItem jMenuItem26;
  private JMenuItem jMenuItem27;
  private JMenuItem jMenuItem28;
  private JMenuItem jMenuItem29;
  private JMenuItem jMenuItem3;
  private JMenuItem jMenuItem30;
  private JMenuItem jMenuItem31;
  private JMenuItem jMenuItem32;
  private JMenuItem jMenuItem33;
  private JMenuItem jMenuItem34;
  private JMenuItem jMenuItem35;
  private JMenuItem jMenuItem36;
  private JMenuItem jMenuItem37;
  private JMenuItem jMenuItem38;
  private JMenuItem jMenuItem39;
  private JMenuItem jMenuItem4;
  private JMenuItem jMenuItem40;
  private JMenuItem jMenuItem41;
  private JMenuItem jMenuItem42;
  private JMenuItem jMenuItem43;
  private JMenuItem jMenuItem44;
  private JMenuItem jMenuItem45;
  private JMenuItem jMenuItem46;
  private JMenuItem jMenuItem47;
  private JMenuItem jMenuItem48;
  private JMenuItem jMenuItem49;
  private JMenuItem jMenuItem5;
  private JMenuItem jMenuItem50;
  private JMenuItem jMenuItem51;
  private JMenuItem jMenuItem52;
  private JMenuItem jMenuItem53;
  private JMenuItem jMenuItem54;
  private JMenuItem jMenuItem55;
  private JMenuItem jMenuItem56;
  private JMenuItem jMenuItem57;
  private JMenuItem jMenuItem58;
  private JMenuItem jMenuItem59;
  private JMenuItem jMenuItem6;
  private JMenuItem jMenuItem60;
  private JMenuItem jMenuItem61;
  private JMenuItem jMenuItem7;
  private JMenuItem jMenuItem73;
  private JMenuItem jMenuItem74;
  private JMenuItem jMenuItem75;
  private JMenuItem jMenuItem76;
  private JMenuItem jMenuItem77;
  private JMenuItem jMenuItem78;
  private JMenuItem jMenuItem79;
  private JMenuItem jMenuItem8;
  private JMenuItem jMenuItem80;
  private JMenuItem jMenuItem81;
  private JMenuItem jMenuItem82;
  private JMenuItem jMenuItem83;
  private JMenuItem jMenuItem84;
  private JMenuItem jMenuItem85;
  private JMenuItem jMenuItem86;
  private JMenuItem jMenuItem87;
  private JMenuItem jMenuItem88;
  private JMenuItem jMenuItem89;
  private JMenuItem jMenuItem9;
  private JMenuItem jMenuItem90;
  private JMenuItem jMenuItem91;
  private JMenuItem jMenuItem92;
  private JMenuItem jMenuItem93;
  private JMenuItem jMenuItem94;
  private JMenuItem jMenuItem95;
  private JMenuItem jMenuItem96;
  private JMenuItem jMenuItem97;
  private JMenuItem jMenuItem98;
  private JMenuItem jMenuItem99;
  private JPanel jPanel1;
  private JPanel jPanel10;
  private JPanel jPanel11;
  private JPanel jPanel12;
  private JPanel jPanel13;
  private JPanel jPanel14;
  private JPanel jPanel15;
  private JPanel jPanel16;
  private JPanel jPanel17;
  private JPanel jPanel18;
  private JPanel jPanel19;
  private JPanel jPanel2;
  private JPanel jPanel20;
  private JPanel jPanel21;
  private JPanel jPanel3;
  private JPanel jPanel4;
  private JPanel jPanel7;
  private JPanel jPanel8;
  private JPanel jPanel9;
  private JPopupMenu.Separator jSeparator1;
  private JPopupMenu.Separator jSeparator10;
  private JPopupMenu.Separator jSeparator11;
  private JPopupMenu.Separator jSeparator12;
  private JPopupMenu.Separator jSeparator13;
  private JPopupMenu.Separator jSeparator14;
  private JPopupMenu.Separator jSeparator15;
  private JPopupMenu.Separator jSeparator16;
  private JPopupMenu.Separator jSeparator17;
  private JPopupMenu.Separator jSeparator18;
  private JPopupMenu.Separator jSeparator19;
  private JPopupMenu.Separator jSeparator2;
  private JPopupMenu.Separator jSeparator20;
  private JPopupMenu.Separator jSeparator21;
  private JPopupMenu.Separator jSeparator22;
  private JPopupMenu.Separator jSeparator23;
  private JPopupMenu.Separator jSeparator24;
  private JPopupMenu.Separator jSeparator25;
  private JPopupMenu.Separator jSeparator26;
  private JPopupMenu.Separator jSeparator27;
  private JPopupMenu.Separator jSeparator28;
  private JPopupMenu.Separator jSeparator29;
  private JPopupMenu.Separator jSeparator3;
  private JPopupMenu.Separator jSeparator30;
  private JPopupMenu.Separator jSeparator31;
  private JPopupMenu.Separator jSeparator32;
  private JPopupMenu.Separator jSeparator33;
  private JPopupMenu.Separator jSeparator34;
  private JPopupMenu.Separator jSeparator35;
  private JPopupMenu.Separator jSeparator36;
  private JPopupMenu.Separator jSeparator37;
  private JPopupMenu.Separator jSeparator38;
  private JPopupMenu.Separator jSeparator39;
  private JPopupMenu.Separator jSeparator4;
  private JPopupMenu.Separator jSeparator40;
  private JPopupMenu.Separator jSeparator41;
  private JPopupMenu.Separator jSeparator42;
  private JSeparator jSeparator43;
  private JSeparator jSeparator44;
  private JSeparator jSeparator45;
  private JSeparator jSeparator46;
  private JSeparator jSeparator47;
  private JSeparator jSeparator48;
  private JSeparator jSeparator49;
  private JPopupMenu.Separator jSeparator5;
  private JSeparator jSeparator50;
  private JSeparator jSeparator51;
  private JSeparator jSeparator52;
  private JSeparator jSeparator53;
  private JPopupMenu.Separator jSeparator6;
  private JPopupMenu.Separator jSeparator7;
  private JPopupMenu.Separator jSeparator8;
  private JPopupMenu.Separator jSeparator9;
  private JSlider jSlider1;
  private JSlider jSlider2;
  private JSlider jSlider3;
  private JTextField jTextField2;
  private JTextField jTextField3;
  private JTextField jTextField4;
  private JMenuItem levelerMenuItem;
  private JButton lightingButton;
  private JMenuItem lightningMenuItem;
  private JButton muteTrackButton;
  private JButton newOpenScreenButton;
  private JTextField newRecordingTextField;
  private JButton noteButton;
  private JFileChooser openFileChooser;
  private JButton openOpenScreenButton;
  private JDialog openScreenDialog;
  private JMenuItem pitchMenuItem;
  private JButton playButton1;
  private JButton playButton3;
  private JButton playButton4;
  private JButton playButton5;
  private JButton recordButton;
  private JMenuItem removalMenuItem;
  private JMenuItem repairMenuItem;
  private JMenuItem reverbMenuItem;
  private JButton rewindButton1;
  private JButton rewindButton10;
  private JButton rewindButton11;
  private JButton rewindButton12;
  private JButton rewindButton14;
  private JButton rewindButton15;
  private JButton rewindButton16;
  private JButton rewindButton19;
  private JButton rewindButton2;
  private JButton rewindButton20;
  private JButton rewindButton21;
  private JButton rewindButton22;
  private JButton rewindButton23;
  private JButton rewindButton24;
  private JButton rewindButton25;
  private JButton rewindButton26;
  private JButton rewindButton27;
  private JButton rewindButton3;
  private JButton rewindButton31;
  private JButton rewindButton4;
  private JButton rewindButton5;
  private JButton rewindButton6;
  private JButton rewindButton7;
  private JButton rewindButton8;
  private JButton rewindButton9;
  private JFileChooser saveFileChooser;
  private JButton scubaButton;
  private JButton snowflakeButton;
  private JLabel songDurationLabel;
  private JButton star1Button;
  private JButton start2Button;
  private JMenuItem tempoMenuItem;
  private JButton toEndButton1;
  private JButton toStartButton1;
  private JMenuItem wahMenuItem;
  private JMenuItem winterMenuItem;
  
  private void setRecordTime(int time)
  {
    this.recordTime = time;
    this.songDurationLabel.setText(convertToTimeString(time));
  }
  
  private void incrementRecordTime()
  {
    this.recordTime += 1;
    
    this.songDurationLabel.setText(convertToTimeString(this.recordTime));
  }
  
  private String convertToTimeString(int time)
  {
    int miliseconds = time % 100;
    int seconds = time / 100 % 60;
    int minutes = time / 6000;
    return "00:" + minutes + ":" + seconds + "." + miliseconds;
  }
  
  private void closeOpenScreenActionPerformed(ActionEvent evt)
  {
    this.openScreenDialog.setVisible(false);
  }
  
  private void openOpenScreenButtonActionPerformed(ActionEvent evt)
  {
    this.openScreenDialog.setVisible(false);
    jMenuItem2ActionPerformed(evt);
  }
  
  private void newOpenScreenButtonActionPerformed(ActionEvent evt)
  {
    this.openScreenDialog.setVisible(false);
  }
  
  private void formWindowOpened(WindowEvent evt)
  {
    this.openScreenDialog.setVisible(true);
  }
  
  public static void main(String[] args)
  {
    try
    {
      for (UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        JFrame mainWindow = new MainWindow();
        mainWindow.getContentPane().setBackground(new Color(155, 155, 155));
        mainWindow.setVisible(true);
      }
    });
  }
}
