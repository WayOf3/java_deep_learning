
package com.hsp.edu.chapter04;
import java.util.*;
import java.sql.Date;
public class Java10_Object_Import {
    public static void main(String[] args) {

        // TODO 面向对象 - import
        // import 主要用于在使用类前准备好了。
        // import语句只能使用在package后，class前。
        // import关键字可以多次使用，导入多个类
        // 如果同一个包中需要导入大量的类，那么可以使用通配符星号来简化操作。
        // 如果import了不同保重相同名称的类，那么还是需要在使用时增加包名。
        // chapter04.Java10_Object_Import
        String name = "zhangsan";
        String name1 = "zhangsan";

        java.util.Date d = new java.util.Date();
        new ArrayList();

        new Java10_Object_Import();
        new Java10_Object_Import();
        new User10();

    }
}
class User10 {

}
