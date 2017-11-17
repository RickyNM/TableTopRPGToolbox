import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ToolboxUI extends JFrame{
  private JLabel title;
  private JButton itemButton;
  private JButton characterButton;
  private JButton lootButton;
  private JButton spellButton;
  private JButton encounterButton;
  private JButton monsterButton;
  private JButton mapButton;
  private JPanel panelMain;
  private JPanel mainPage;

  public ToolboxUI(){
    super("Tabletop RPG Toolbox");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    title = new JLabel("<html> Welcome to The Tabletop RPG Toolbox <br> Please Choose Your Role Below <br></html>", SwingConstants.CENTER);
    title.setFont(new Font("Serif", Font.BOLD, 28));

    characterButton = new JButton("Characters");
    characterButton.addActionListener(new ButtonListener());
    characterButton.setFont(new Font("Serif", Font.BOLD, 20));

    itemButton = new JButton("Items");
    itemButton.addActionListener(new ButtonListener2());
    itemButton.setFont(new Font("Serif", Font.BOLD, 20));

    spellButton = new JButton("Spells");
    spellButton.addActionListener(new ButtonListener3());
    spellButton.setFont(new Font("Serif", Font.BOLD, 20));

    monsterButton = new JButton("Monsters");
    monsterButton.addActionListener(new ButtonListener4());
    monsterButton.setFont(new Font("Serif", Font.BOLD, 20));

    mapButton = new JButton("Maps");
    mapButton.addActionListener(new ButtonListener5());
    mapButton.setFont(new Font("Serif", Font.BOLD, 20));

    lootButton = new JButton("Loots");
    lootButton.addActionListener(new ButtonListener6());
    lootButton.setFont(new Font("Serif", Font.BOLD, 20));

    encounterButton = new JButton("Encounters");
    encounterButton.addActionListener(new ButtonListener7());
    encounterButton.setFont(new Font("Serif", Font.BOLD, 20));

    JPanel panelMain = new JPanel(new BorderLayout());

    JPanel mainPage = new JPanel(new GridLayout(8,1,1,1));
    mainPage.add(title);
    mainPage.add(characterButton);
    mainPage.add(itemButton);
    mainPage.add(spellButton);
    mainPage.add(monsterButton);
    mainPage.add(mapButton);
    mainPage.add(lootButton);
    mainPage.add(encounterButton);

    panelMain.add(mainPage, BorderLayout.CENTER);

    this.setLayout(new BorderLayout());
    this.add(panelMain, BorderLayout.CENTER);
    this.setSize(1000,800);
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

  public class ButtonListener3 implements ActionListener{
    public void actionPerformed(ActionEvent e3){
    }
  }

  public class ButtonListener4 implements ActionListener{
    public void actionPerformed(ActionEvent e4){
    }
  }

  public class ButtonListener5 implements ActionListener{
    public void actionPerformed(ActionEvent e5){
    }
  }

  public class ButtonListener6 implements ActionListener{
    public void actionPerformed(ActionEvent e6){
    }
  }

  public class ButtonListener7 implements ActionListener{
    public void actionPerformed(ActionEvent e7){
    }
  }

  public static void main(String[] args) {
    ToolboxUI c = new ToolboxUI();
  }
}
