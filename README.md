# Java

[toc]

# IDEA 快捷键

`Alt + Enter` 选中变量后可迅速更名，或者在报红线代码上自动补全未覆盖的方法

`Alt + Insert` 快速生成成员方法

`数字/集合.fori` 快速生成for循环

`Ctrl + Alt + L` 将代码格式化

`Shift + F6` 快速重命名文件

# 关键字

### extends

- 译为：延伸、推广

- 在继承的时候使用

  ```java
  public class Teacher extends Employee {
      
  }
  ```

### super

- super关键字的用法有三种：
  1. 在子类的成员方法中，访问父类的成员变量。
  2. 在子类的成员方法中，访问父类的成员方法。
  3. 在子类的构造方法中，访问父类的构造方法。

  ```java
  public class Son extends Father {
  
      int num = 20;
  
      public Son() {
          super();
      }
  
      public void methodZi() {
          System.out.println(super.num); // 父类中的num
      }
  
      public void method() {
          super.method(); // 访问父类中的method
          System.out.println("子类方法");
      }
  }
  ```

### abstract

- 译为：抽象

- 用于抽象一个**类**或者**类方法**

- 抽象方法：就是加上 `abstract` 关键字，然后去掉大括号，直接分号结束。
  抽象类：抽象方法所在的类，必须是抽象类才行。在 `class` 之前写上 `abstract` 即可。

  如何使用抽象类和抽象方法：
         1. 不能直接创建new抽象类对象。
         2. 必须用一个子类来继承抽象父类。
         3. 子类必须覆盖重写抽象父类当中所有的抽象方法。
             覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号。
         4. 创建子类对象进行使用。

  ```java
  public abstract class Animal {
  
      public Animal() {
          System.out.println("Animal 的构造函数执行了");
      }
  
      // 这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定。
      public abstract void eat();
  
      // 这是普通的成员方法
  //    public void normalMethod() {
  //
  //    }
  
  }
  ```

### Override

- 译为：重载

- 对于**接口类**或者**抽象类**的方法实现前最好加上 `@Override` 关键字

  ```java
  public class MyInterfaceDefaultA implements MyInterfaceDefault{
      @Override
      public void methodAbs() {
          System.out.println("实现了抽象方法AAA");
      }
  }
  ```

### interface & implements

- `interface` 译为：接口，交互界面

- `implements` 译为：执行履行，在对接口进行实现时使用

- 接口就是多个类的公共规范。
  接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。

  **如何定义一个接口的格式：**

  ```java
  public interface 接口名称 {
      // 接口内容
  }
  ```

  备注：换成了关键字 `interface` 之后，编译生成的字节码文件仍然是：.java --> .class。

  如果是Java 7，那么接口中可以包含的内容有：
      1. 常量
          2. 抽象方法

  如果是Java 8，还可以额外包含有：
      3. 默认方法
      4. 静态方法

  如果是Java 9，还可以额外包含有：
  
    5. 私有方法
  
  接口使用步骤：
      1. **接口不能直接使用，必须有一个“实现类”来“实现”该接口。**
        格式：
  
     ```java
  public class 实现类名称 implements 接口名称 {
      // ...
  }
     ```
  
  ```java
      /*
      在任何版本的Java中，接口都能定义抽象方法。
      格式：
      public abstract 返回值类型 方法名称(参数列表);
  
      注意事项：
        1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
          2. 这两个关键字修饰符，可以选择性地省略。（今天刚学，所以不推荐。）
          3. 方法的三要素，可以随意定义。
      */
  public interface MyInterfaceAbstract {
      // 这是一个抽象方法
      public abstract void methodAbs();
  
      // 这也是
          abstract void methodAbs2();
  
      // 这也是
          void methodAbs3();
  }
  ```
  
        2. **接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。**
         实现：去掉 `abstract` 关键字，加上方法体大括号。
        3. 创建实现类的对象，进行使用。
  
  
  
  注意事项：
  **如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。**
  
  1. 接口的默认方法，可以通过接口实现类对象，直接调用。
  2. 接口的默认方法，也可以被接口实现类进行覆盖重写。

- 小建议：在**实现**接口的类文件后面加上 **`Impl`**

  ---

  【简单地定义及使用】代码示例：

  ```java
  》》》》》 定义的类：
  public interface MyInterfaceAbstract {
      // 这是一个抽象方法
      public abstract void methodAbs();
  
      // 这也是
             abstract void methodAbs2();
  
      // 这也是
                      void methodAbs3();
  }
  
  
  》》》》》 实现的类
  public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
      @Override
      public void methodAbs() {
          System.out.println("NO.1 method");
      }
  
      @Override
      public void methodAbs2() {
          System.out.println("NO.2 method");
  
      }
  
      @Override
      public void methodAbs3() {
          System.out.println("NO.3 method");
      }
  }
  
  
  》》》》》 调用
  public interface Demo140Interface {
      public static void main(String[] args) {
          // 错误写法！不能直接new接口对象使用。
  //        MyInterfaceAbstract inter = new MyInterfaceAbstract();
  
          // 创建实现类的对象使用
          MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
          impl.methodAbs();
          impl.methodAbs2();
      }
  }
  ```

---

【接口中包含**默认**方法】代码示例：

```java
》》》》》 接口定义：
/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称(参数列表) {
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    // 新添加的方法，改成默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}


》》》》》 接口实现：
public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }

    // 注意：这里可以重写接口中的默认方法，也可以不重写
    // 如果没有重写，在调用时就会向上（接口默认）寻找
    @Override
    public void methodDefault() {
        System.out.println("在B中重写了 methodDefault");
    }
}

```

---

---

【接口中包含**静态**方法】代码示例：

```java
》》》》》 接口定义：
/*
从Java 8开始，接口当中允许定义静态方法。
格式：
public static 返回值类型 方法名称(参数列表) {
    方法体
}
提示：就是将abstract或者default换成static即可，带上方法体。
 */

public interface MyInterfaceStatic {
    public static void help() {
        System.out.println("这是一条帮助信息");
    }
}

》》》》》 接口实现：
public class MyInterfaceStaticImpl implements MyInterfaceStatic {
	
}

》》》》》 使用：
        /*
        注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
        正确用法：通过接口名称，直接调用其中的静态方法。
        格式：
        接口名称.静态方法名(参数);
         */
        System.out.println("===========");
        // 错误写法！
//        MyInterfaceStaticImpl s = new MyInterfaceStaticImpl();
//        s.help();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.help();
```



# 变量

- 如果是`float` ，后面要加一个 `F` 。比如：`double num  =3.14F`
- 如果是`long` ，后面要加一个 `L` 。比如：`float num  =314L`
- 以上两个式子中包含有隐式类型转换

## 类型转换：

```
自动数据类型的转换(隐式)
    1. 特点：代码不需要进行特殊处理，自动完成
    2. 规则：数据范围从小到大，但是字节数不一定相关
```

```
对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，
那么javac编译器将会自动隐含地为我们补上一个(byte)(short)(char)。

    1. 如果没有超过左侧的范围，编译器补上强转。
    2. 如果右侧超过了左侧范围，那么直接编译器报错。

    在给变量进行赋值的时候，如果右侧的表达式当中全都是常量，没有任何变量，
    那么编译器javac将会直接将若干个常量表达式计算得到结果。
    short result = 5 + 8; // 等号右边全都是常量，没有任何变量参与运算
    编译之后，得到的.class字节码文件当中相当于【直接就是】：
    short result = 13;
    右侧的常量结果数值，没有超过左侧范围，所以正确。

    这称为“编译器的常量优化”。

    但是注意：一旦表达式当中有变量参与，那么就不能进行这种优化了。
```

# 数组

```
格式：数据类型[] 数组名称 = new 数据类型[数组长度];
```

## 动态初始化

比如：传建一个存放300个 `int` 类型的数组 `int[] arr1 = new int[300];`

## 静态初始化

直接创建一个数组，里面装的全都是 `int` 数字 

- `int[] arr1 = new int[]{1, 2, 3, 4};`

- `int[] arrayA = { 10, 20, 30 };`

- 静态初始化的标准格式，可以拆分成为两个步骤

  ```java
  int[] arr;
  arr = new int[]{1, 2, 3, 4};
  ```

- ```java
  int[] arr2;
  arr2 = new int[5];
  ```

- **不能这么写！！！**

  ```java
  //    int[] arrayD;
  //    arrayD = { 10, 20, 30 };
  ```

  ```java
  //        int[] arr2;
  //        arr2 = new int[2]{1, 2};
  ```



# 接口小结

在Java 9+版本中，接口的内容可以有：

1. 成员变量其实是常量，格式：
[public] [static] [final] 数据类型 常量名称 = 数据值;
注意：
	常量必须进行赋值，而且一旦赋值不能改变。
	常量名称完全大写，用下划线进行分隔。

2. 接口中最重要的就是抽象方法，格式：
[public] [abstract] 返回值类型 方法名称(参数列表);
注意：实现类必须覆盖重写接口所有的抽象方法，除非实现类是抽象类。

3. 从Java 8开始，接口里允许定义默认方法，格式：
[public] default 返回值类型 方法名称(参数列表) { 方法体 }
注意：默认方法也可以被覆盖重写

4. 从Java 8开始，接口里允许定义静态方法，格式：
[public] static 返回值类型 方法名称(参数列表) { 方法体 }
注意：应该通过接口名称进行调用，不能通过实现类对象调用接口静态方法

5. 从Java 9开始，接口里允许定义私有方法，格式：
普通私有方法：private 返回值类型 方法名称(参数列表) { 方法体 }
静态私有方法：private static 返回值类型 方法名称(参数列表) { 方法体 }
注意：private的方法只有接口自己才能调用，不能被实现类或别人使用。

# 四种权限修饰符

Java中有四种权限修饰符：
public  >   protected   >   (default)   >   private

同一个类（我自己）        YES         YES             YES             YES

同一个包（我邻居）        YES         YES             YES             NO

不同包子类（我儿子）       YES         YES             NO              NO

不同包非子类（陌生人）      YES         NO              NO              NO

注意事项：(default)并不是关键字“default”，而是根本不写。
