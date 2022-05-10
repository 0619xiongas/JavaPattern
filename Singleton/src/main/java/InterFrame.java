

import javax.swing.JInternalFrame;

public class InterFrame extends JInternalFrame{

    private static InterFrame JIF1 = null;
    private InterFrame(String name, boolean b1, boolean b2, boolean b3, boolean b4){
        super(name, b1, b2, b3, b4);
    }

    public static InterFrame getJInternalFrame1(String name, boolean b1, boolean b2, boolean b3, boolean b4){
        if(JIF1 == null)
            JIF1 = new InterFrame(name, b1, b2, b3, b4);
        return JIF1;
    }
}