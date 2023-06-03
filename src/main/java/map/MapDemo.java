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
          /*
            V put(K k,V v)
            将一组键值对保存到Map中
            该方法返回值为Value的类型:
            由于Map要求key不允许重复，如果使用已有的key存放键值对时，为替换value操作
            此时方法会将被替换的value返回。否则返回值为null。
         */
        Integer value = map.put("语文",99);//如果key不重复时返回值为null
        System.out.println(value);
        map.put("数学",99);
        map.put("英语",99);
        map.put("物理",99);
        map.put("化学",99);
        map.put("生物",99);
        System.out.println(map);

        value = map.put("英语",77);//已有的key则是替换value
        System.out.println("value"+value);
        System.out.println(map);
        /*
            V get(K k)
            根据给定的key获取对应的value
            如果给定的key在Map中不存在，则返回值为null
         */
        value = map.get("数学");
        System.out.println("数学:"+value);
        value  = map.get("体育");
        System.out.println("体育:"+value);
         /*
            V remove(Object key)
            根据给定的key将Map中对应的键值对删除。返回值为这个key对应的value
         */
        value = map.remove("数学");
        System.out.println("被删除的key对应的value是:"+value);
        System.out.println(map);

//获取Map的元素个数
        int size = map.size();
        System.out.println("size:"+size);
//判断Map是否包含指定的key或value
        boolean ck = map.containsKey("化学");
        boolean cv = map.containsValue(99);
        System.out.println("是否包含key:"+ck);
        System.out.println("是否包含value:"+cv);
        //清空Map
        map.clear();
        System.out.println(map);
    }
}
