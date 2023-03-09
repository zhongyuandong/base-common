package com.zyd.base.main;

import com.zyd.base.utils.StringCompressUtils;

public class Test {

    public static void main(String[] args) {
        String str = "sfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdfsfsdafdsadfasdf";
        System.out.println("压缩前：" + str);
        String compress = StringCompressUtils.compress(str);
        System.out.println("压缩后：" + compress);
    }

}
