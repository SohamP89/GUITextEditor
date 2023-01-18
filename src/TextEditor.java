import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {
    JPanel pnl = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    JMenu jMenu1 = new JMenu("File");
    JMenu jMenu2 = new JMenu("Edit");
    JMenuItem file1, file2, file3, edit1, edit2;

    JTextArea txtArea1 = new JTextArea();

    //JTextArea jTextArea = new JTextArea("Hello world!");
    public static void main(String[] args) {
        TextEditor gui = new TextEditor();
    }
    public TextEditor() {
        // Sets title and size
        // Tells app to only close when user quits or presses red X button
        super("NeetEditor");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        // Creates app elements below
        file1 = new JMenuItem("New");
        file2 = new JMenuItem("Open");
        file3 = new JMenuItem("Save");

        edit1 = new JMenuItem("Copy");
        edit2 = new JMenuItem("Paste");

        file1.addActionListener(TextEditor.this);
        file2.addActionListener(TextEditor.this);
        file3.addActionListener(TextEditor.this);

        edit1.addActionListener(TextEditor.this);
        edit2.addActionListener(TextEditor.this);

        jMenu1.add(file1);
        jMenu1.add(file2);
        jMenu1.add(file3);

        jMenu2.add(edit1);
        jMenu2.add(edit2);

        menuBar.add(jMenu1);
        menuBar.add(jMenu2);

        // Shows window
        //pnl.add(jTextArea);
        pnl.setLayout(new BorderLayout());

        pnl.add(menuBar, BorderLayout.NORTH);
        pnl.add(txtArea1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == file1 ) {
            System.out.println("Clicked \"New\"");
        }
        if ( e.getSource() == file2 ) {
            System.out.println("Clicked \"Open\"");
        }
        if ( e.getSource() == file3 ) {
            System.out.println("Clicked \"Save\"");
        }
        if ( e.getSource() == edit1 ) {
            System.out.println("Clicked \"Copy\"");
        }
        if ( e.getSource() == edit2 ) {
            System.out.println("Clicked \"Paste\"");
        }
    }
}
