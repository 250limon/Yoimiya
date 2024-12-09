package buttons;

import database.UserDAO;
import frames.LogInJFrame;
import frames.MainWindow;
import panels.panel_login.LogInPanel;
import user.User;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterButton extends Button {
    public RegisterButton(String title)
    {
        super(title);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int id = UserDAO.getInstance().register(LogInPanel.getInstance().getUserName(), LogInPanel.getInstance().getUserPassword());

               //获取用户
                UserDAO.getInstance().setUser(id);
                MainWindow.getInstance().setVisible(true);
                LogInJFrame.getInstance().setVisible(false);
                UserDAO.getInstance().createFriendsTable(User.getInstance().getId());

            }
        });
    }
}
