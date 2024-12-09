package frames;

import panels.panel_login.LogInPanel;

import javax.swing.*;

public class LogInJFrame extends JFrame {
    private static LogInJFrame logInJFrame=new LogInJFrame();
    private LogInJFrame()
    {

        getContentPane().add(LogInPanel.getInstance());
        setBounds(650,200,600,600);
        LogInPanel.getInstance().setBounds(0,0,500,500);
        setVisible(true);


    }
    public static LogInJFrame getInstance()
    {

        return logInJFrame;

    }


}
