import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener{

    private JFrame jF;
    private JPanel MainPanel;
    private JButton play, stop, stepBack, stepForward, changeNums;

    public Window(){
        jF = new JFrame();

        MainPanel = (JPanel)jF.getContentPane();

        MainPanel.setLayout(new BorderLayout());

        MainPanel.add(buildNPanel(), BorderLayout.NORTH);
        MainPanel.add(buildCPanel(), BorderLayout.CENTER);
        MainPanel.add(buildSPanel(), BorderLayout.SOUTH);

        jF.setSize(1000, 600);

        jF.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jF.setLocationRelativeTo(null);

        jF.setVisible(true);
    }

    public Component buildNPanel(){

        JPanel jNP = new JPanel();

        jNP.setLayout(new FlowLayout());

        jNP.add(new JButton("<"));
        jNP.add(new JLabel("Bubble Sort"));
        jNP.add(new JButton(">"));

        jNP.setVisible(true);

        return jNP;
    }

    public Component buildCPanel(){

        JPanel jCP = new JPanel();

        //Graph, array and/or Nodes


        jCP.setVisible(true);

        return jCP;
    }

    public Component buildSPanel(){

        JPanel jSP = new JPanel();

        jSP.setLayout(new FlowLayout());

        play = new JButton("Play (auto)");
        play.addActionListener(this);
        jSP.add(play);

        stop = new JButton("Stop");
        stop.addActionListener(this);
        jSP.add(stop);

        stepBack = new JButton("Step Back");
        stepBack.addActionListener(this);
        jSP.add(stepBack);

        stepForward = new JButton("Step Forward");
        stepForward.addActionListener(this);
        jSP.add(stepForward);

        changeNums = new JButton("Change #s");
        changeNums.addActionListener(this);
        jSP.add(changeNums);

        jSP.setVisible(true);

        return jSP;
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        if (s == "Play (auto)"){
            JOptionPane.showMessageDialog(null, "elo play");
        }

        else if (s == "Stop"){
            JOptionPane.showMessageDialog(null, "elo stop");
        }

        else if (s == "Step Back"){
            JOptionPane.showMessageDialog(null, "elo back");
        }
        else if (s == "Step Forward"){
            JOptionPane.showMessageDialog(null, "elo forward");
        }

        else if (s == "Change #s"){
            JOptionPane.showMessageDialog(null, "elo change #s");
        }
    }
}
