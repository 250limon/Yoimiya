package manager;

import panels.MainWindowPanel;
import panels.maincontent_panel.ChatFriendPanel;
import panels.maincontent_panel.MyFriendPanel;
import panels.maincontent_panel.SharedRoomPanel;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class CenterPanelManager {
    private static CenterPanelManager centerPanelManager=new CenterPanelManager();
    private Map<String, JPanel>centerPanelMap=new HashMap<>();
    private JPanel currentCenterJPanel;
    private CenterPanelManager()
    {
        centerPanelMap.put("chat_panel", ChatFriendPanel.getInstance());
        centerPanelMap.put("shared_room_panel", SharedRoomPanel.getInstance());
        centerPanelMap.put("my_friend_panel", MyFriendPanel.getInstance());

        currentCenterJPanel=centerPanelMap.get("chat_panel");

    }

    public static CenterPanelManager getInstance()
    {
        return centerPanelManager;
    }
    public void addCenterPanel(String name,JPanel jPanel)
    {
        centerPanelMap.put(name,jPanel);
    }
    public JPanel getCurrentCenterJPanel()
    {
        return currentCenterJPanel;
    }
    public void  transToPanel(String name)
    {
           int x=currentCenterJPanel.getX();
           int y=currentCenterJPanel.getY();
           int width=currentCenterJPanel.getWidth();
           int height=currentCenterJPanel.getHeight();
        //删除原来的jpanel
        MainWindowPanel.getInstance().remove(currentCenterJPanel);
        currentCenterJPanel=centerPanelMap.get(name);

        MainWindowPanel.getInstance().add(currentCenterJPanel);
        currentCenterJPanel.setBounds(x,y,width,height);
        MainWindowPanel.getInstance().revalidate();
        MainWindowPanel.getInstance().repaint();





    }


}
