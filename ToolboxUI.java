import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ToolboxUI extends JFrame{
  private JLabel title;
  private JButton playerButton;
  private JButton dmButton;
  private JButton goBack;
  private JPanel panelMain;
  private JPanel card1;
  private JPanel card2;
  private CardLayout cards;

  public ToolboxUI(){
    super("ToolboxUI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    title = new JLabel("<html> Welcome to The D&D Toolbox <br> Please Choose Your Role Below <br></html>", SwingConstants.CENTER);

    dmButton = new JButton("Dungeon Master");
    dmButton.setActionCommand("Dungeon Master");
    dmButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent event)
      {
        cards.next(panelMain);
      }
    });

    playerButton = new JButton("Player");
    playerButton.addActionListener(new ButtonListener2());

    goBack = new JButton("Go Back");
    goBack.addActionListener(new ButtonListener3());

    cards = new CardLayout();
    JPanel panelMain = new JPanel();
    panelMain.setLayout(cards);
    cards.show(panelMain, "Main Page");


    JPanel card1 = new JPanel();
    card1.add(title);
    card1.add(dmButton);
    card1.add(playerButton);

    JPanel card2 = new JPanel();
    card2.add(goBack);

    panelMain.add(card1, "Main Page");
    panelMain.add(card2, "DM Page");

    this.setLayout(new BorderLayout());
    this.add(panelMain, BorderLayout.CENTER);
    this.setSize(600,475);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  //public class ButtonListener implements ActionListener{
    //public void actionPerformed(ActionEvent event){
      //  cards.next(panelMain);
    //  }
//  }

  public class ButtonListener2 implements ActionListener{
    public void actionPerformed(ActionEvent e2){
    }
  }

  public class ButtonListener3 implements ActionListener{
    public void actionPerformed(ActionEvent e3){
    }
  }

  public static void main(String[] args) {
    ToolboxUI c = new ToolboxUI();
  }
}
