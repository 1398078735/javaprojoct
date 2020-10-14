package cn.ruanjian.UserSeriota;

import cn.ruanjian.pojo.User;

import java.io.*;

public class UserSeriota {
    //序列化
    public boolean SavaUserSer(Object obj, String savepath) throws Exception{
        File file = new File(savepath);
        if (file.isFile()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(savepath);

        ObjectOutputStream oos= new ObjectOutputStream(fos);

        oos.writeObject(obj);

        fos.close();
        oos.close();
        return true;

    }
    //反序列化
    public static void ReadObject(String savepath) throws Exception{
        FileInputStream fis = new FileInputStream(savepath);
        //对象输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读取数据
        User object =(User)ois.readObject();

        System.out.println(object);

        ois.close();
        fis.close();
    }
}
