package GenericityDemo;

import org.apache.commons.lang3.StringUtils;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty("   "));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank("   "));
    }
}
