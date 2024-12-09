package panels.maincontent_panel;

import javax.swing.*;
import java.awt.*;

public class SharedRoomPanel extends JPanel {
    private static  SharedRoomPanel sharedRoomPanel=new SharedRoomPanel();
    private SharedRoomPanel()
    {
        setBackground(Color.magenta);


    }
    public static SharedRoomPanel getInstance()
    {

        return sharedRoomPanel;

    }

}
