package manager;

import frames.MainWindow;
import panels.MainWindowPanel;

import javax.swing.*;

//界面动画效果管理器
public class AnimationManager {
    private static AnimationManager animationManager=new AnimationManager();
    private AnimationManager()
    {


    }
    public static AnimationManager getInstance()
    {
        return animationManager;
    }
    //jframe界面逐渐由完全透明变为完全不透明
   synchronized public void opacityFrom0To100(JFrame jFrame)
    {

        new Thread(()->{
            float opcity=0;
            float opcityV=0.05F;
            while(true)
            {
                opcity+=opcityV;
                if(opcity>1)
                {
                    break;
                }
                if(1-opcity<0.05)
                {
                    opcity=1;
                }


                jFrame.setOpacity(opcity);


                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();



    }
    //jframe界面逐渐由完全不透明变为完全透明
   public void opacityFrom100To0(JFrame jFrame)
    {
        new Thread(()->{
            float opcity=1;
            float opcityV=0.05F;
            while(true)
            {
                opcity-=opcityV;
                if(opcity<0)
                {
                    jFrame.setVisible(false);
                    break;
                }
                jFrame.setOpacity(opcity);

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();




    }
    //panel从一个位置水平向右移动到另一位置
    public void jpanelRightMoveTo(JPanel jPanel,int x,int v)
    {

           new Thread(() -> {

               while (true) {


                   if (jPanel.getX() > x) {
                       break;
                   }

                   jPanel.setBounds(jPanel.getX() + v, jPanel.getY(), jPanel.getWidth(), jPanel.getHeight());
                   MainWindowPanel.getInstance().repaint();
                   try {
                       Thread.sleep(3);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }

               }


           }).start();

    }
    //panel从一个位置水平向左移动到另一位置
    public void jpanelLeftMoveTo(JPanel jPanel,int x,int v)
    {

             new Thread(() -> {

                 while (true) {


                     if (jPanel.getX() < x) {
                         break;
                     }

                     jPanel.setBounds(jPanel.getX() - v, jPanel.getY(), jPanel.getWidth(), jPanel.getHeight());

                     try {
                         Thread.sleep(3);
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }

                 }
             }).start();





    }
    //panel从一个位置竖直向下移动到另一位置
   synchronized public void jpanelDownMoveTo(JPanel jPanel,int y,int v)
    {
        new Thread(()->{


            while(true)
            {

                if(jPanel.getY()>y)
                {
                    break;
                }

                jPanel.setBounds(jPanel.getX(),jPanel.getY()+v,jPanel.getWidth(),jPanel.getHeight());

                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }




        }).start();

    }
    //panel从一个位置竖直向上移动到另一位置
  synchronized   public void jpanelUpMoveTo(JPanel jPanel,int y,int v)
    {
        new Thread(()->{
            while(true)
            {
                if(jPanel.getY()<y)
                {

                    break;

                }

                jPanel.setBounds(jPanel.getX(),jPanel.getY()-v,jPanel.getWidth(),jPanel.getHeight());

                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }




        }).start();


    }




    //panel从一个位置水平向右移动到另一位置
  synchronized   public void jframeRightMoveTo(JFrame jFrame,int x,int v)
    {
        new Thread(()->{


            while(true)
            {

                if(jFrame.getX()>x)
                {
                    break;
                }

                jFrame.setBounds(jFrame.getX()+v,jFrame.getY(),jFrame.getWidth(),jFrame.getHeight());

                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }




        }).start();


    }
    //panel从一个位置水平向左移动到另一位置
  synchronized   public void jframeLeftMoveTo(JFrame jFrame,int x,int v)
    {
        new Thread(()->{


            while(true)
            {

                if(jFrame.getX()<x)
                {
                    break;
                }

                jFrame.setBounds(jFrame.getX()-v,jFrame.getY(),jFrame.getWidth(),jFrame.getHeight());

                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }




        }).start();


    }
    //panel从一个位置竖直向下移动到另一位置
  synchronized   public void jframeDownMoveTo(JFrame jFrame,int y,int v)
    {
        new Thread(()->{


            while(true)
            {

                if(jFrame.getY()>y)
                {
                    break;
                }

                jFrame.setBounds(jFrame.getX(),jFrame.getY()+v,jFrame.getWidth(),jFrame.getHeight());

                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }




        }).start();







    }
    //panel从一个位置竖直向上移动到另一位置
  synchronized   public void jframeUpMoveTo(JFrame jFrame,int y,int v)
    {
        new Thread(()->{


            while(true)
            {

                if(jFrame.getY()<y)
                {
                    break;
                }

                jFrame.setBounds(jFrame.getX(),jFrame.getY()-v,jFrame.getWidth(),jFrame.getHeight());

                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }




        }).start();


    }
    //参数d值为-1和1，分别为宽度变小和宽度变大
  synchronized   public void changeJPanelWinth(int d)
    {


        new Thread(()->{
            JPanel jPanel=CenterPanelManager.getInstance().getCurrentCenterJPanel();
            int v=5;

            if(d==1)
            {

               while(true)
               {
                   if(jPanel.getX()<60)
                   {
                       break;
                   }
                   int width=jPanel.getWidth();
                   width+=v;
                   jPanel.setBounds(1200-width,jPanel.getY(),width,jPanel.getHeight());

                   try {
                       Thread.sleep(3);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }
            if(d==-1)
            {

                while(true)
                {
                    if(jPanel.getX()>370)
                    {
                        break;
                    }
                    int width=jPanel.getWidth();
                    width-=v;
                    jPanel.setBounds(1200-width,jPanel.getY(),width,jPanel.getHeight());

                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


        }).start();



    }


}
