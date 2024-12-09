package panels.maincontent_panel;

import javax.swing.*;
import java.awt.*;

public class MyFriendPanel extends JPanel {
    private static MyFriendPanel myFriendPanel=new MyFriendPanel();
    private MyFriendPanel()
    {
        setBackground(Color.YELLOW);



    }
    public static MyFriendPanel getInstance()
    {
        return myFriendPanel;
    }
}
