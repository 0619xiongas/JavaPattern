

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener {

    private static InterFrame internalFrame;
    Container contentPane = this.getContentPane();

    public MyFrame(){
        super("主窗体");
        contentPane.setLayout(new BorderLayout());
        JButton button = new JButton("创建一个子窗体");
        button.addActionListener(this);
        contentPane.add(button, BorderLayout.SOUTH);
        this.setSize(new Dimension(300, 300));
        this.setVisible(true);
        double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.setLocation((int) (width - this.getWidth()) / 2, (int) (height - this.getHeight()) / 2);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        internalFrame = InterFrame.getJInternalFrame1("子窗体"
                , true, true, true, true);
        internalFrame.setSize(new Dimension(200, 200));
        internalFrame.setVisible(true);
        JDesktopPane desktopPane = new JDesktopPane();
        contentPane.add(desktopPane);
        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            System.out.println("Exception while selecting");
        }
    }
}