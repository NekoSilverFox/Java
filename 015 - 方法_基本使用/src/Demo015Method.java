// 015 - 方法_基本使用

/*
定义一个方法的格式：
    public static void 方法名称() {
        方法体
    }

方法名称的命名规则和变量一样，使用小驼峰。
方法体：也就是大括号当中可以包含任意条语句。

注意事项：
    1. 方法定义的先后顺序无所谓。
    2. 方法的定义不能产生嵌套包含关系。
    3. 方法定义好了之后，不会执行的。如果要想执行，一定要进行方法的【调用】。

如何调用方法，格式：

方法名称();
*/

public class Demo015Method {
    public static void main(String[] args) {
        student();

        System.out.println("=================");

        teacher();
    }

    public static void student() {
        System.out.println("姓名");
        System.out.println("学号");
        System.out.println("年龄");
        System.out.println("性别");
    }

    public static void teacher() {
        System.out.println("姓名");
        System.out.println("工号");
        System.out.println("科目");
    }

}
