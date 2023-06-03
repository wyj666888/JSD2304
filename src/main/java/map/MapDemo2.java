package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",94);
        map.put("物理",96);
        map.put("化学",89);
        map.put("生物",96);
        System.out.println(map);
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println("key:"+key);
        }
        /*
        遍历每一组键值对
        Set entrySet()
        将当前Map中每一组键值对以一个Entry实例形式表示,再将它们以
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> e : entrySet ){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }
        /*
        遍历所有的value
        Collection values()
        该方法会将Map中所有的value以一个集合的形式返回
         */
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println("value:"+value);
        }

        map.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
