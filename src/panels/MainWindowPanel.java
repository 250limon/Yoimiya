package panels;

import buttons.ChatHistoryShowButton;
import buttons.FriendButton;
import buttons.SettingButton;
import buttons.SharedButton;
import manager.CenterPanelManager;
import panels.mainwindow_panels.ChatHistoryPanel;
import panels.mainwindow_panels.ToolsPanel;
import panels.mainwindow_panels.UserDetailedInfo;
import panels.mainwindow_panels.UserEasyInfo;

import javax.swing.*;
import java.awt.*;

public class MainWindowPanel extends JPanel {
   private static MainWindowPanel mainWindowPanel=new MainWindowPanel();
    private MainWindowPanel()
    {
        setLayout(null);
        setBackground(Color.CYAN);

        addPanel();
        addButton();
    }
    public static MainWindowPanel getInstance()
    {
        return mainWindowPanel;
    }


    public void addPanel()
    {
        add(UserDetailedInfo.getInstance());
        UserDetailedInfo.getInstance().setBounds(0,0,300,500);
        UserEasyInfo userEasyInfo=new UserEasyInfo(100,100,100,100);
        add(userEasyInfo);
        userEasyInfo.setBounds(100,0,300,60);

        ToolsPanel toolsPanel=ToolsPanel.getInstance();
        add(toolsPanel);
        toolsPanel.setBounds(0,160,50,640);


        ChatHistoryPanel chatHistoryPanel=ChatHistoryPanel.getInstance();

        add(chatHistoryPanel);
        chatHistoryPanel.setBounds(-300,100,300,700);


        add(CenterPanelManager.getInstance().getCurrentCenterJPanel());
        CenterPanelManager.getInstance().getCurrentCenterJPanel().setBounds(60,100,1140,700);


    }
    public void addButton()
    {
        SettingButton settingButton=new SettingButton();
        add(settingButton);
        settingButton.setBounds(1100,0,50,50);

        ChatHistoryShowButton chatHistoryShowButton=new ChatHistoryShowButton();
        add(chatHistoryShowButton);
        chatHistoryShowButton.setBounds(0,100,50,50);

        SharedButton sharedButton=new SharedButton();
        add(sharedButton);
        sharedButton.setBounds(500,20,200,40);


        FriendButton friendButton=new FriendButton();
        add(friendButton);
        friendButton.setBounds(780,20,200,40);

    }
}
