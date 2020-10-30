import java.util.Scanner;

public class 指定字符串倒置 {
    public  String 指定字符串倒置函数(String 要倒置的字符串,int 间隔数){
        char[] 字符串数组=要倒置的字符串.toCharArray();
        for(int 起始数=0;起始数<要倒置的字符串.length();起始数+=2*间隔数){
            int 循环变量一=起始数,循环变量二=Math.min(起始数+间隔数-1,要倒置的字符串.length()-1);
            while (循环变量一<循环变量二){
                char 临时变量=字符串数组[循环变量一];
                字符串数组[循环变量一++]=字符串数组[循环变量二];
                字符串数组[循环变量二--] = 临时变量;
            }
        }
        return  new String(字符串数组);
    }

    public static void main(String[] args) {
        指定字符串倒置  案例 = new 指定字符串倒置();
        String 结果= 案例.指定字符串倒置函数("abcdefg",2);
        System.out.println(结果);
    }
}
