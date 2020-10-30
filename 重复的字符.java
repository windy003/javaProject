import java.util.Scanner;

public class 重复的字符 {
    public static void main(String[] args) {
        System.out.println("请输入你要查询的字符");
        Scanner 接收器= new Scanner(System.in);
        String 接收到的字符=接收器.nextLine();

        String 循环出来的字符="";
        String 重复的字符="";

        for(int 循环参数=0;循环参数<接收到的字符.length();循环参数++){
            String 当前字符=Character.toString(接收到的字符.charAt(循环参数));
            if(循环出来的字符.contains(当前字符)){
                if(!重复的字符.contains(当前字符)){
                    重复的字符+=当前字符+",";
                }
            }
            循环出来的字符+=当前字符;
        }
        System.out.println("重复的字符为： ");
        System.out.println(重复的字符);
    }
}
