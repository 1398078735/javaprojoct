package cn.ruanjian.test;

import cn.ruanjian.UserSeriota.UserSeriota;
import cn.ruanjian.pojo.User;


public class Main {
        public static void main(String[] ages) throws Exception {
            User user = new User("藤原千花","动漫");
            UserSeriota us = new UserSeriota();
            String path = "C:\\Users\\lenovo\\Desktop\\专业文件\\hanhan.txt";
            //序列化
            us.SavaUserSer(user,path);
            //反序列化
            us.ReadObject(path);

        }


    /*public static void main(String[] args) throws Exception{
        //序列化操作
        /*User dongman = new User("tengyuan","dongman");
        //存入磁盘 i/o流
        /*String file_path = "C:\\Users\\lenovo\\Desktop\\专业文件\\javacunru.txt";
        //文件输出流
        FileOutputStream fos = new FileOutputStream(file_path);
        //对象输出流
        ObjectOutputStream outputStream= new ObjectOutputStream(fos);
        //开始输出
        outputStream.writeObject(dongman);
        //关闭流 涉及连接，或流操作都需要关闭
        outputStream.close();
        fos.close();

        //反序列化

        FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\专业文件\\javacunru.txt");
        //对象输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读取数据
        User obj =(User)ois.readObject();

        System.out.println(obj);

        ois.close();
        fis.close();
    }*/



}
