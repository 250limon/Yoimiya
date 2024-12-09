package panels.maincontent_panel;

import user.Friend;

import javax.swing.*;
import java.awt.*;

public class ChatFriendPanel extends JPanel {
    private Friend friend;//当前正在聊天的好友

    private static ChatFriendPanel contentShowPanel=new ChatFriendPanel();
    private ChatFriendPanel()
    {
       setBackground(Color.GRAY);


    }
    public static ChatFriendPanel getInstance()
    {

        return contentShowPanel;

    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }
}
