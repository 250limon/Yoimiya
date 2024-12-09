package buttons;

import database.UserDAO;
import frames.LogInJFrame;
import frames.MainWindow;
import panels.panel_login.LogInPanel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogInButton extends Button {
    public LogInButton(String title)
    {
        super(title);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                boolean b = UserDAO.getInstance().logIn(LogInPanel.getInstance().getUserName(), LogInPanel.getInstance().getUserPassword());
                if(b)
                {
                    UserDAO.getInstance().setUser(Integer.parseInt(LogInPanel.getInstance().getUserName()));
                    LogInJFrame.getInstance().setVisible(false);
                    MainWindow.getInstance().setVisible(true);
                }
                else {

                }

            }
        });
    }
}
