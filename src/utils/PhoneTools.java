package utils;

import manager.ChatMessageManager;
import user.Friend;
import user.User;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;

//用于与好友进行交流的类
public class PhoneTools {
    private static PhoneTools phoneTools=new PhoneTools();
    private PrintWriter writer;
    private BufferedReader reader;
    private PhoneTools()
    {

    }
    public static PhoneTools getInstance()
    {
        return phoneTools;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public void setWriter(PrintWriter writer) {
        this.writer = writer;
    }
    //向某位好友发送信息
    public void sendMessage(Friend friend,String content)
    {

        String message="@"+friend.getId()+" "+User.getInstance().getId()+" "+content;

        writer.println(message);


    }
    //向所有好友发送上线信息
    public void sendMessage(Friend friend)
    {
        String message=friend.getId()+" live";

        writer.println(message);
    }

    public void receiveMessage()
    {

            new Thread(()->{

                String message="";

                try{
                    while ((message = reader.readLine()) != null)//一行一行读取信息
                    {
                        //接收到某一位朋友发送来的信息
                        int spaceIndex = message.indexOf(' ');
                        if (spaceIndex != -1) {
                            String friendId = message.substring(0, spaceIndex);//获取接受者的用户名
                            String content = message.substring(spaceIndex + 1);
                            if(content.equals("live"))
                            {
                                User.getInstance().friendLive(Integer.parseInt(friendId));
                            }
                            else {
                                int id=Integer.parseInt(friendId);
                                //将收到的信息添加到
                                ChatMessageManager.getInstance().addMessageById(id,content);
                            }


                        }

                    }
                }catch (Exception e)
                {
                    e.printStackTrace();
                }


            }).start();

        }




}
