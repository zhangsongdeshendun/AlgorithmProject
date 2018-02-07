package com.song;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：在字符串中找出第一个只出现一次的字符。
 * 思路：由于题目与字符出现的次数相关， 我们是不是可以统计每个字符在该字符串中出现的次数？要达到这个目的，我们需要一个数据容器来存放每个字符的出现次数。在这个数据容器中可以根据字符来查找它出现的次数，也就是说这个容器的作用是把一个字符映射成二个数字。在常用的数据容器中， 哈希表正是这个用途。
 * 　　为了解决这个问题，我们可以定义哈希表的键（Key）是字符， 而值(Value ）是该字符出现的次数。同时我们还需要从头开始扫描字符串两次。第一次扫描字符串时，每扫描到一个字符就在哈希表的对应项中把次数加1 。接下来第二次扫描时， 每扫描到一个字符就能从哈希表中得到该字符出现的次数。这样第一个只出现一次的字符就是符合要求的输出。
 * 　　第一次扫描时，在哈希表中更新一个字符出现的次数的时间是O(n) 。如果字符串长度为n， 那么第一次扫描的时间复杂度是O(n)。第二次扫描时，同样0(1)能读出一个字符出现的次数，所以时间复杂度仍然是O(n)。这样算起来，总的时间复杂度是O(n)。
 */

public class FirstNotRepeatingChar {

    public static char firstNotRepeatingChar(String content) {

        char index = '0';
        char[] array = content.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char x : array) {
            if (map.containsKey(x)) {
                int count = map.get(x);
                map.put(x, count + 1);
            } else {
                map.put(x, 1);
            }
        }

        for (char x : array) {
            if (map.get(x) == 1) {
                return x;
            }
        }
        return index;


    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingChar("aabccdbd"));
    }


}
