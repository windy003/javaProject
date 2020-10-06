import java.util.Scanner;

public class 字符串倒置 {
    public static void main(String[] args) {
        Scanner 接收 = new Scanner(System.in);
        System.out.println("请输入你要转换的字符串：");
        String 获得的字符串 = 接收.nextLine();

        String 结果 = 倒置(获得的字符串);

        System.out.println(结果);
    }

    public static String 倒置(String 参数) {
        char[] 字符列表 = new char[参数.length()];
        int 字符索引 = 0;

        for (int 循环变量 = 参数.length() - 1; 循环变量 >= 0; 循环变量--) {
            字符列表[字符索引] = 参数.charAt(循环变量);
            字符索引++;
        }

        String 倒置后的字符串 = "";

        for (int 循环参数 = 0; 循环参数 < 参数.length(); 循环参数++) {
            倒置后的字符串 = 倒置后的字符串 + 字符列表[循环参数];
        }

        return  倒置后的字符串;
    }
}
