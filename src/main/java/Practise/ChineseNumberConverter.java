package Practise;

import java.util.Scanner;

public class ChineseNumberConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个数字：");
            String input = scanner.nextLine();
            scanner.close();

            // 将输入的数字转换为中文
            String output = numberToChinese(input);

            // 输出转换后的中文
            System.out.println("转换结果为：" + output);
        }

        // 将数字转换为中文
        public static String numberToChinese(String number) {
            String[] digits = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
            String[] units = {"", "十", "百", "千", "万", "亿"};
            String[] decimals = {"角", "分"};

            // 判断输入的数字是否为小数
            boolean isDecimal = false;
            if (number.contains(".")) {
                isDecimal = true;
            }

            // 将数字拆分为整数部分和小数部分
            String[] parts = number.split("\\.");

            StringBuilder sb = new StringBuilder();
            // 处理整数部分
            char[] chars = parts[0].toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int digit = Character.getNumericValue(chars[i]);
                int unit = chars.length - i - 1;
                if (digit != 0) {
                    sb.append(digits[digit]);
                    sb.append(units[unit % 4]);
                }
                // 每四位加一个万或亿
                if (unit % 4 == 0 && unit > 0) {
                    sb.append(units[unit + 1]);
                    if (unit % 8 == 0) {
                        sb.append(units[unit + 5]);
                    }
                }
            }
            // 添加“元”字
            sb.append("元");

            if (isDecimal) {
                // 处理小数部分
                char[] decimalChars = parts[1].toCharArray();
                for (int i = 0; i < decimalChars.length; i++) {
                    int digit = Character.getNumericValue(decimalChars[i]);
                    sb.append(digits[digit]);
                    sb.append(decimals[i]);
                }
            }

            // 去除末尾的零和单位
            String result = sb.toString();
            result = result.replaceAll("零[十百千]*", "零"); // 去除连续的零
            result = result.replaceAll("零+", "零"); // 去除多余的零
            result = result.replaceAll("亿万", "亿"); // 处理亿和万相连的情况
            result = result.replaceAll("元$", ""); // 去除末尾的“元”字
            result = result.replaceAll("零$", ""); // 去除末尾的零
            return result;
        }
    }

