import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 求固定和的算法 {
    public int[]  函数(int[] 被检测数组,int 目标值){
        Map<Integer,Integer> 字典 =new HashMap<>();
        int 数组长度 = 被检测数组.length;
        for(int 循环参数=0;循环参数<数组长度;循环参数++){
            if(字典.containsKey(被检测数组[循环参数])){
                int 索引=字典.get(被检测数组[循环参数]);
                return new int[]{索引,循环参数};
            }else{
                字典.put(目标值-被检测数组[循环参数],循环参数);
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        求固定和的算法 案例 =new 求固定和的算法();
        System.out.println(Arrays.toString(
                案例.函数(new int[]{2,7,11,15},9)
        ));
    }
}
