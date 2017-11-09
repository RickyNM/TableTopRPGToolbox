import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ToolboxUI extends JFrame{
  private JLabel title;
  private JButton playerButton;
  private JButton dmButton;
  private JPanel panelMain;
  private JPanel mainPage;

  public ToolboxUI(){
    super("Tabletop RPG Toolbox");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    title = new JLabel("<html> Welcome to The Tabletop RPG Toolbox <br> Please Choose Your Role Below <br></html>", SwingConstants.CENTER);
    title.setFont(new Font("Serif", Font.BOLD, 28));

    dmButton = new JButton("Dungeon Master");
    dmButton.addActionListener(new ButtonListener());
    dmButton.setFont(new Font("Serif", Font.BOLD, 20));

    playerButton = new JButton("Player");
    playerButton.addActionListener(new ButtonListener2());
    playerButton.setFont(new Font("Serif", Font.BOLD, 20));

    JPanel panelMain = new JPanel(new BorderLayout());

    JPanel mainPage = new JPanel(new GridLayout(3,1,1,1));
    mainPage.add(title, BorderLayout.CENTER);
    mainPage.add(dmButton, BorderLayout.CENTER);
    mainPage.add(playerButton, BorderLayout.CENTER);

    panelMain.add(mainPage, BorderLayout.CENTER);

    this.setLayout(new BorderLayout());
    this.add(panelMain, BorderLayout.CENTER);
    this.setSize(600,475);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
    }
  }

  public class ButtonListener2 implements ActionListener{
    public void actionPerformed(ActionEvent e2){
    }
  }

  public static void main(String[] args) {
    ToolboxUI c = new ToolboxUI();
  }
}
