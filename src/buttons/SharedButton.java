package buttons;

import manager.CenterPanelManager;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//分享按钮
public class SharedButton extends Button {

    public SharedButton()
    {
        setBackground(Color.BLUE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CenterPanelManager.getInstance().transToPanel("shared_room_panel");
            }
        });

    }

}
