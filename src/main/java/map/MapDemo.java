package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 *
 * Map是java集合框架的一员
 * Map体现的结构是一个多行两列的表格,左列称为key,右列称为value
 * Map总是以key-value对的形式保存数据
 * Map总是根据key获取对应的value
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",99);
        map.put("英语",99);
        map.put("物理",99);
        map.put("化学",99);
        map.put("生物",99);
        System.out.println(map);
    }
}
