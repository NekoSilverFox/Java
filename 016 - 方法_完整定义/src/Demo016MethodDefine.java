/*
方法其实就是若干语句的功能集合。

方法好比是一个工厂。
蒙牛工厂     原料：奶牛、饲料、水
            产出物：奶制品
钢铁工厂     原料：铁矿石、煤炭
            产出物：钢铁建材

参数（原料）：就是进入方法的数据。
返回值（产出物）：就是从方法中出来的数据。

定义方法的完整格式：
修饰符 返回值类型 方法名称(参数类型 参数名称, ...) {
    方法体
    return 返回值;
}

修饰符：现阶段的固定写法，public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称
PS：参数如果有多个，使用逗号进行分隔
方法体：方法需要做的事情，若干行代码
return：两个作用，第一停止当前方法，第二将后面的返回值还给调用处
返回值：也就是方法执行后最终产生的数据结果

注意：return后面的“返回值”，必须和方法名称前面的“返回值类型”，保持对应。

定义一个两个int数字相加的方法。三要素：
返回值类型：int
方法名称：sum
参数列表：int a, int b

方法的三种调用格式。
    1. 单独调用：方法名称(参数);
    2. 打印调用：System.out.println(方法名称(参数));
    3. 赋值调用：数据类型 变量名称 = 方法名称(参数);

注意：此前学习的方法，返回值类型固定写为void，这种方法只能够单独调用，不能进行打印调用或者赋值调用。
*/

/*
三要素：
返回值类型：boolean
方法名称：isSame
参数列表：int a, int b
 */

/*
使用方法的时候，注意事项：
    1. 方法应该定义在类当中，但是不能在方法当中再定义方法。不能嵌套。
    2. 方法定义的前后顺序无所谓。
    3. 方法定义之后不会执行，如果希望执行，一定要调用：单独调用、打印调用、赋值调用。
    4. 如果方法有返回值，那么必须写上“return 返回值;”，不能没有。
    5. return后面的返回值数据，必须和方法的返回值类型，对应起来。
    6. 对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。
    7. 对于void方法当中最后一行的return可以省略不写。
    8. 一个方法当中可以有多个return语句，但是必须保证同时只有一个会被执行到，两个return不能连写。
 */

public class Demo016MethodDefine {
    public static void main(String[] args) {
        //System.out.println(isSame(10, 20));
        //System.out.println(isSame(10, 10));

        System.out.println("Sum: " + sum1To100());

        printCount(5);
    }

    /*
    题目要求：
    定义一个方法，用来判断两个数字是否相同。
     */
    public static boolean isSame(int l, int r) {
        return l == r;
    }

    /*
    题目要求：
    定义一个方法，用来求出1-100之间所有数字的和值。
     */
    public static long sum1To100() {
        long sum = 0;
        for (int i = 1; i <= 100; ++i) {
            sum += i;
        }
        return sum;
    }

    /*
    题目要求：
    定义一个方法，用来打印指定次数的HelloWorld。
     */
    public static void printCount(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Hello World" + i);
        }
    }
}
