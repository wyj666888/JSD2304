package homework.day03;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<>();
		Random rand = new Random();
		while (c.size()<10){
			c.add(rand.nextInt(101));
		}
		System.out.println(c);
	}
}
