package com.yczn.toolkit;


/**
 * 字符串工具类
 *
 * @author luoyibo
 */
public class StringUtils {

    /**
     * 判断字符串是否是整数
     *
     * @param number
     * @return
     */
    public static boolean isInteger(String number) {
        boolean isNumber = false;
        if (StringUtils.isNotEmpty(number)) {
            isNumber = number.matches("^([1-9]\\d*)|(0)$");
        }
        return isNumber;
    }

    /**
     * 判断字符串不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        boolean isNotEmpty = false;
        if (str != null && !str.trim().equals("") && !str.trim().equalsIgnoreCase("NULL")) {
            isNotEmpty = true;
        }
        return isNotEmpty;
    }

    /**
     * 判断字符串为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return !isNotEmpty(str);
    }

    /**
     * 将数组转成SQL认识的字符串 123,432,2312 id in('123','432','2312')
     *
     * @param ids
     * @return
     */
    public static String fromArrayToStr(String[] ids) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < ids.length; i++) {
            str.append("'" + ids[i] + "',");
        }
        if (ids.length > 0) {
            str.deleteCharAt(str.length() - 1);
        }
        return str.toString();
    }

    /**
     * 去掉指定字符串的最后一位
     *
     * @param string 要处理的字符串
     * @return 处理后的字符串
     */
    public static String trimLast(String string) {
        return string.substring(0, string.length() - 1);
    }

    /**
     * addString:将指定的基础字符串补充指定的字符，以达到指定的长度.
     *
     * @param base 要补充的基础字符串
     * @param add  填充的字符
     * @param len  填充后的总长度,如果填充后的总长度小于基础字符串的长度则不进行处理
     * @param pos  填充的位置，L向左填充 R向右填充
     * @return 填充后的字符串
     * @throws @since JDK 1.8
     * @author luoyibo
     */
    public static String addString(String base, String add, Integer len, String pos) {
        StringBuffer sBuffer = new StringBuffer();
        String reString = base;
        Integer addLen = len - base.length();
        if (addLen > 0) {
            for (int i = 0; i < addLen; i++) {
                sBuffer.append(add);
            }
            if (pos.toUpperCase() == "L") {
                reString = sBuffer.toString() + reString;
            } else {
                reString = reString + sBuffer.toString();
            }
        }
        return reString;
    }



    public static boolean isBlank(String ip) {
        // TODO Auto-generated method stub
        return false;
    }



    /**
     * @param str
     * @return java.lang.String
     * @description 字符串删除 /r/n 或者 /r /n
     * @author yz
     * @date 2018/10/15 17:38
     * @method removeRN
     */
    public static String removeRN(String str) {
        String msg = str.replaceAll("(\\\r\\\n|\\\r|\\\n|\\\n\\\r)", "");
        return msg;
    }
}
