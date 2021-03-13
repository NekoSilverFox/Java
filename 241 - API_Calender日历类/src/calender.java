import java.util.Calendar;
import java.util.Date;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 15:19
 * @Author : NekoSilverfox
 * @FileName: Calender
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class calender {
    public static void main(String[] args) {
        /*
        java.util.Calendar类:日历类
        Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
        Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
        static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
       */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        
        get_method();

        System.out.println("==========================");

        set_method();

        System.out.println("==========================");

        add_method();

        System.out.println("==========================");

        getTime_method();
    }



    /*
        Calendar类的常用成员方法:
            public int get(int field)：返回给定日历字段的值。
            public void set(int field, int value)：将给定的日历字段设置为给定值。
            public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
            public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        成员方法的参数:
            int field:日历类的字段,可以使用Calendar类的静态成员变量获取
                public static final int YEAR = 1;	年
                public static final int MONTH = 2;	月
                public static final int DATE = 5;	月中的某一天
                public static final int DAY_OF_MONTH = 5;月中的某一天
                public static final int HOUR = 10; 		时
                public static final int MINUTE = 12; 	分
                public static final int SECOND = 13;	秒
     */
    private static void get_method() {
      /*
        public int get(int field)：返回给定日历字段的值。
        参数:传递指定的日历字段(YEAR,MONTH...)
        返回值:日历字段代表的具体的值
      */
        //使用getInstance方法获取Calendar对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));  // 西方的月份0-11 东方:1-12
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));  // 和上面一样
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
    }

    /*
    public void set(int field, int value)：将给定的日历字段设置为给定值。
    参数:
        int field:传递指定的日历字段(YEAR,MONTH...)
        int value:给指定字段设置的值
     */
    private static void set_method() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, 3);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));  // 西方的月份0-11 东方:1-12

        // 可以一次性设置多个
        cal.set(8888, 8, 8);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));  // 西方的月份0-11 东方:1-12
        System.out.println(cal.get(Calendar.DATE));
    }


    /*
    public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
    把指定的字段增加/减少指定的值
    参数:
        int field:传递指定的日历字段(YEAR,MONTH...)
        int amount:增加/减少指定的值
            正数:增加
            负数:减少
     */
    private static void add_method() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 2);
        cal.add(Calendar.MONTH, -3);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));  // 西方的月份0-11 东方:1-12
    }


    /*
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        把日历对象,转换为日期对象
     */
    private static void getTime_method() {
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        System.out.println(time);  // Sat Mar 13 15:46:33 MSK 2021
    }
}
