package cn.ruanjian.test;

//异常处理机制
public class error {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println("请规范你的输入码");
        }finally {
            System.out.println("最后执行");
        }
        System.out.println("正常结束");
    }
}
