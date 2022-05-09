import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CLIUserInterface {

    final private JFrame window = new JFrame("CLI Interface");

    final private JButton btnCreuse = new JButton("Creuse (C)");
    final private JButton btnPleine = new JButton("Pleine (P)");
    
    final private JPanel jpanelMode = new JPanel();
    final private JPanel jpanelArgs = new JPanel();
    final private JPanel jpanelResult = new JPanel();

    final private JLabel jlabelIndice = new JLabel("Valeur de l'indice (K)");
    final private JLabel jlabelAlpha = new JLabel("Valeur de alpha (A)");
    final private JLabel jlabelEpsilon = new JLabel("Valeur de epsilon (E)");

    final private JTextField jtfIndice = new JTextField();
    final private JTextField jtfAlpha = new JTextField();
    final private JTextField jtfEpsilon = new JTextField();

    final private JButton btnPlusIndice = new JButton("+");
    final private JButton btnPlusAlpha = new JButton("+");
    final private JButton btnPlusEpsilon = new JButton("+");

    final private JTextField jtfResult = new JTextField();


    String result = "";

    CLIUserInterface() {
        // Build interface
        jpanelMode.setLayout(new FlowLayout());
        jpanelMode.add(btnCreuse);
        jpanelMode.add(btnPleine);

        jpanelArgs.setLayout(new GridLayout(3,3));
        jpanelArgs.add(jlabelIndice);
        jpanelArgs.add(jtfIndice);
        jpanelArgs.add(btnPlusIndice);

        jpanelArgs.add(jlabelAlpha);
        jpanelArgs.add(jtfAlpha);
        jpanelArgs.add(btnPlusAlpha);

        jpanelArgs.add(jlabelEpsilon);
        jpanelArgs.add(jtfEpsilon);
        jpanelArgs.add(btnPlusEpsilon);

        jpanelResult.setLayout(new CardLayout());
        jpanelResult.add(jtfResult);


        // add Listeners
        btnCreuse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                result = result + "-C ";;
                updateResult(result);
            }
        });

        btnPleine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                result = result + "-P ";;
                updateResult(result);
            }
        });

        btnPlusIndice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                if (!jtfIndice.getText().equals("")) {
                    result = result + "-K " + jtfIndice.getText() + " ";
                    updateResult(result);
                }
            }
        });
        btnPlusAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                if(!jtfAlpha.getText().equals("")) {
                    result = result + "-A " + jtfAlpha.getText() + " ";
                    updateResult(result);
                }
            }
        });
        btnPlusEpsilon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                if (!jtfEpsilon.getText().equals("")) {
                    result = result + "-E " + jtfEpsilon.getText() + " ";
                    updateResult(result);
                }
            }
        });

        window.add(jpanelMode, BorderLayout.NORTH);
        window.add(jpanelArgs, BorderLayout.CENTER);
        window.add(jpanelResult, BorderLayout.SOUTH);

        window.pack();
        window.setVisible(true);

    }

    public void updateResult(String result) {
      jtfResult.setText(result);
    }
}
