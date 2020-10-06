import java.util.Scanner;

public class 字符串中重复的字符 {
    public static void main(String[] args) {
        System.out.println("请输入你要查询的字符串:");
        Scanner 接受器=new Scanner(System.in);
        String 接受到的字符串=接受器.nextLine();
//        System.out.println(接受到的字符串);

        String 循环出来的字符 = "";
        String 重复的字符 = "";

        for(int i=0;i<接受到的字符串.length();i++){
            String 当前字符=Character.toString(接受到的字符串.charAt(i));
            if(接受到的字符串.contains(当前字符)){
                if(!重复的字符.contains(当前字符)){
                    重复的字符+=当前字符+",";
                }
            }
            循环出来的字符+=当前字符;
        }
        System.out.println("重复的字符为:");
        System.out.println(重复的字符);
    }
}
