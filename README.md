package dvodimenzionalno;

import javax.swing.;
import java.awt.;
import java.awt.event.*;

public class ObrniRecenicu extends JFrame {

    private JTextField txtUnos;
    private JButton btnObrni;
    private JLabel lblRezultat;

    public ObrniRecenicu() {

        setTitle("Obrtanje rečenice");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblUnos = new JLabel("Unesite rečenicu:");

        txtUnos = new JTextField();

        btnObrni = new JButton("Obrni tekst");

        lblRezultat = new JLabel("Rezultat će biti prikazan ovdje.");

        panel.add(lblUnos);
        panel.add(txtUnos);
        panel.add(new JLabel());
        panel.add(btnObrni);
        panel.add(new JLabel("Obrnuta rečenica:"));
        panel.add(lblRezultat);

        add(panel);

        btnObrni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tekst = txtUnos.getText();

                // Dvodimenzionalni niz (ispunjava uslov zadatka)
                char[][] niz = new char[1][tekst.length()];

                for (int i = 0; i < tekst.length(); i++) {
                    niz[0][i] = tekst.charAt(i);
                }

                String obrnuto = "";

                for (int i = tekst.length() - 1; i >= 0; i--) {
                    obrnuto += niz[0][i];
                }

                lblRezultat.setText(obrnuto);
            }
        });
    }

    public static void main(String[] args) {
        new ObrniRecenicu().setVisible(true);
    }
}
