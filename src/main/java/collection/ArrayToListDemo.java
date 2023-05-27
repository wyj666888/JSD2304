package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));
        List<String> list = Arrays.asList(array);
        System.out.println("List:"+list);

        list.set(2,"six");
        System.out.println("list:"+list);
        System.out.println("array:"+Arrays.toString(array));

//        list.add("seven");//编译错误,数组是定长的,试图改变长度的操作都是不支持的,会抛出不支持操作异常

        List<String> list2 = new ArrayList<>(list);

        list2.add("seven");
        System.out.println("list2"+list2);



    }
}
