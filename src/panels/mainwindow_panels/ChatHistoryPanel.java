package panels.mainwindow_panels;

import javax.swing.*;
import java.awt.*;

public class ChatHistoryPanel extends JPanel {
    private static ChatHistoryPanel chatHistoryPanel=new ChatHistoryPanel();
    private ChatHistoryPanel()
    {
        setBackground(Color.pink);


    }

    public static ChatHistoryPanel getInstance()
    {
        return chatHistoryPanel;
    }

}
