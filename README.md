# Java

[toc]

# IDEA 快捷键

`Alt + Enter` 选中变量后可迅速更名，或者在报红线代码上自动补全未覆盖的方法

`Alt + Insert` 快速生成成员方法

`数字/集合.fori` 快速生成for循环

`Ctrl + Alt + L` 将代码格式化

`Shift + F6` 快速重命名文件

`Ctrl + Alt + Ins` 增加新文件

`Ctrl + Alt + /` 块注释

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

### private

- 译为：私有的

- **实例：接口中的私有方法定义：**

  ```java
  /*
  问题描述：
  我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题。
  但是这个共有方法不应该让实现类使用，应该是私有化的。
  
  解决方案：
  从Java 9开始，接口当中允许定义私有方法。
      1. 普通私有方法，解决多个默认方法之间重复代码问题
          格式：
          private 返回值类型 方法名称(参数列表) {
              方法体
          }
  
      2. 静态私有方法，解决多个静态方法之间重复代码问题
          格式：
          private static 返回值类型 方法名称(参数列表) {
              方法体
  }
   */
  public interface MyInterfacePrivate {
      public default void methodDefaultA() {
          System.out.println("默认方法A");
          methodDefaultCommand();
      }
  
      public default void methodDefaultB() {
          System.out.println("默认方法B");
          methodDefaultCommand();
      }
  
      private void methodDefaultCommand() {
          System.out.println("AAA");
          System.out.println("BBB");
          System.out.println("CCC");
      }
  }
  ```

### final

- final关键字代表最终、不可改变的。

  常见四种用法：
         1. 可以用来修饰一个类
         2. 可以用来修饰一个方法
         3. 还可以用来修饰一个局部变量
         4. 还可以用来修饰一个成员变量

- 【重点】
  对于基本类型来说，不可变说的是变量当中的数据不可改变
  对于引用类型来说，不可变说的是变量当中的地址值不可改变

- 使用：用于**描述常量**

- 格式：**`public static final 数据类型 常量名称 = 数值;`**

- 使用示例：

  ```java
  // 143 - OOP_接口中的常量
  
  /*
  接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
  从效果上看，这其实就是接口的【常量】。
  
  格式：
      public static final 数据类型 常量名称 = 数据值;
  备注：
      一旦使用final关键字进行修饰，说明不可改变。
  
  注意事项：
      1. 接口当中的常量，可以省略public static final，注意：不写也照样是这样。
      2. 接口当中的常量，必须进行赋值；不能不赋值。
      3. 接口中常量的名称，使用完全大写的字母，用下划线进行分隔。（推荐命名规则）
      4. 使用的时候直接通过接口名称点出来
   */
  
  public interface Demo143InterfaceConst {
      // 这其实就是一个常量，一旦赋值，不可以修改
      public static final int NUM_OF_INTERFACE = 10;
  }
  ```

### instanceof

- 译为：运算符

- 使用：判断一个变量的类型

- ```java
  // 160 - OOP_多态_使用instanceof进行类型判断
  
  /*
  如何才能知道一个父类引用的对象，本来是什么子类？
  格式：
  对象 instanceof 类名称
  这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
   */
  public class Demo160Instanceof {
      public static void main(String[] args) {
          Animal animal = new Dog();
          animal.eat(); // eat fish
  
          // 如果希望掉用子类特有方法，需要向下转型
          // 判断一下父类引用animal本来是不是Dog
          if (animal instanceof Dog) {
              Dog dog = (Dog)animal;
              dog.method();
          } else if (animal instanceof Cat) {
              Cat cat = (Cat)animal;
              cat.method();
          }
  
          giveMePet(new Dog());
  
      }
  
      public static void giveMePet(Animal animal) {
          if (animal instanceof Dog) {
              Dog dog = (Dog)animal;
              dog.method();
          } else if (animal instanceof Cat) {
              Cat cat = (Cat)animal;
              cat.method();
          }
      }
  }
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

6. **接口中不能有静态代码块！**

  ```java
      // 接口中不能有静态代码块！
  //    static {
  //
  //    }
  ```

7. **接口中不能有构造方法！**

   ```java
       // 接口中不能有构造方法、
   //    public MyInterface() {
   //
   //    }
   ```

8. 其他：

   ```java
   使用接口的时候，需要注意：
   
       1. 接口是没有静态代码块或者构造方法的。
       2. 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
       格式：
           public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
               // 覆盖重写所有抽象方法
           }
       3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
       4. 如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
       5. 如果实现类锁实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
       6. 一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类当中的方法。
       	public class Zi extends Fu implements MyInterfaceC{
   		} // 145 - OOP_接口中的注意事项
   ```

9. **可以通过一个类对多个接口进行实现：**

   ```java
   public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB{
       @Override
       public void method() {
           System.out.println("覆盖重写了AB接口都有的抽象方法");
       }
   
       @Override
       public void methodA() {
           System.out.println("Rewrite A");
       }
   
       @Override
       public void methodB() {
           System.out.println("Rewrite A");
       }
   
       @Override
       public void methodSameDefaultAB() {
           System.out.println("对AB相同的默认方法进行了重写");
       }
   }
   ```

## 接口当中的多继承

```java
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    // 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】。
    @Override
    public default void methodDefault() {

    }
}
```

# 多态

代码当中体现多态性，其实就是一句话：**父类引用指向子类对象**

格式：
	**父类名称 对象名 = new 子类名称();**
或者：
	**接口名称 对象名 = new 实现类名称();**

在多态的代码当中，成员【方法】的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。
口诀：编译看左边，运行看右边。

访问成员变量的两种方式：
成员变量不能覆盖重写【重点】
1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。

对比一下：【重点】
**成员变量：编译看左边，运行还看左边。**
**成员方法：编译看左边，运行看右边。**



# 四种权限修饰符

Java中有四种权限修饰符：
	public  >   protected   >   (default)   >   private

| 同一个类（我自己）     | YES  | YES  | YES  | YES  |
| ---------------------- | ---- | ---- | ---- | ---- |
| 同一个包（我邻居）     | YES  | YES  | YES  | NO   |
| 不同包子类（我儿子）   | YES  | YES  | NO   | NO   |
| 不同包非子类（陌生人） | YES  | NO   | NO   | NO   |

注意事项：(default) 并不是关键字 `default`，而是根本不写。

- ```
  定义一个类的时候，权限修饰符规则：
      1. 外部类：public / (default)
      2. 成员内部类：public / protected / (default) / private
      3. 局部内部类：什么都不能写
  ```



# 内部类

## 局部内部类

```java
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。

备注：从Java 8+开始，只要局部变量事实不变，那么final关键字可以省略。

原因：
    1. new出来的对象在堆内存当中。
    2. 局部变量是跟着方法走的，在栈内存当中。
    3. 方法运行结束之后，立刻出栈，局部变量就会立刻消失。
    4. 但是new出来的对象会在堆当中持续存在，直到垃圾回收消失。
 */

public class MyOuter {

    public void methodOuter() {
        final int num = 10; // 所在方法的局部变量
        // num = 20;
        class Inner {
            public void methodInner () {
                System.out.println(num);
            }
        }

    }

}
```

## 匿名内部类

如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：

```java
接口名称 对象名 = new 接口名称() {
    // 覆盖重写所有抽象方法
};
```

对格式“new 接口名称() {...}”进行解析：
       1. new代表创建对象的动作
       2. 接口名称就是匿名内部类需要实现哪个接口
       3. {...}这才是匿名内部类的内容

另外还要注意几点问题：
    1. 匿名内部类，在【创建对象】的时候，只能使用唯一一次。
        如果希望多次创建对象，而且类的内容一样的话，那么就需要使用单独定义的实现类了。
       2. 如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
       3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
                  强调：匿名内部类和匿名对象不是一回事！！！
       4. 匿名对象，在【调用方法】的时候，只能调用唯一一次。

# day01【Object类、常用API】

## 主要内容

* Object类
* Date类
* DateFormat类
* Calendar类
* System类
* StringBuilder类
* 包装类

## 教学目标

-[ ] 能够说出Object类的特点
-[ ] 能够重写Object类的toString方法
-[ ] 能够重写Object类的equals方法
-[ ] 能够使用日期类输出当前日期
-[ ] 能够使用将日期格式化为字符串的方法
-[ ] 能够使用将字符串转换成日期的方法
-[ ] 能够使用System类的数组复制方法
-[ ] 能够使用System类获取当前毫秒时刻值
-[ ] 能够说出使用StringBuilder类可以解决的问题
-[ ] 能够使用StringBuilder进行字符串拼接操作
-[ ] 能够说出8种基本类型对应的包装类名称
-[ ] 能够说出自动装箱、自动拆箱的概念
-[ ] 能够将字符串转换为对应的基本类型
-[ ] 能够将基本类型转换为对应的字符串

# 第一章 Object类

## 1.1 概述

`java.lang.Object`类是Java语言中的根类，即所有类的父类。它中描述的所有方法子类都可以使用。在对象实例化的时候，最终找的父类就是Object。

如果一个类没有特别指定父类，	那么默认则继承自Object类。例如：

```java
public class MyClass /*extends Object*/ {
  	// ...
}
```

根据JDK源代码及Object类的API文档，Object类当中包含的方法有11个。今天我们主要学习其中的2个：

* `public String toString()`：返回该对象的字符串表示。
* `public boolean equals(Object obj)`：指示其他某个对象是否与此对象“相等”。

## 1.2 toString方法

### 方法摘要

* `public String toString()`：返回该对象的字符串表示。

toString方法返回该对象的字符串表示，其实该字符串内容就是对象的类型+@+内存地址值。

由于toString方法返回的结果是内存地址，而在开发中，经常需要按照对象的属性得到相应的字符串表现形式，因此也需要重写它。

### 覆盖重写

如果不希望使用toString方法的默认行为，则可以对它进行覆盖重写。例如自定义的Person类：

```java
public class Person {  
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    // 省略构造器与Getter Setter
}
```

在IntelliJ IDEA中，可以点击`Code`菜单中的`Generate...`，也可以使用快捷键`alt+insert`，点击`toString()`选项。选择需要包含的成员变量并确定。如下图所示：

![toString方法的自动重写](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/toString方法的自动重写.bmp)

> 小贴士： 在我们直接使用输出语句输出对象名的时候,其实通过该对象调用了其toString()方法。

## 1.3 equals方法

### 方法摘要

* `public boolean equals(Object obj)`：指示其他某个对象是否与此对象“相等”。

调用成员方法equals并指定参数为另一个对象，则可以判断这两个对象是否是相同的。这里的“相同”有默认和自定义两种方式。

### 默认地址比较

如果没有覆盖重写equals方法，那么Object类中默认进行`==`运算符的对象地址比较，只要不是同一个对象，结果必然为false。

### 对象内容比较

如果希望进行对象的内容比较，即所有或指定的部分成员变量相同就判定两个对象相同，则可以覆盖重写equals方法。例如：

```java
import java.util.Objects;

public class Person {	
	private String name;
	private int age;
	
    @Override
    public boolean equals(Object o) {
        // 如果对象地址一样，则认为相同
        if (this == o)
            return true;
        // 如果参数为空，或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass())
            return false;
        // 转换为当前类型
        Person person = (Person) o;
        // 要求基本类型相等，并且将引用类型交给java.util.Objects类的equals静态方法取用结果
        return age == person.age && Objects.equals(name, person.name);
    }
}
```

这段代码充分考虑了对象为空、类型一致等问题，但方法内容并不唯一。大多数IDE都可以自动生成equals方法的代码内容。在IntelliJ IDEA中，可以使用`Code`菜单中的`Generate…`选项，也可以使用快捷键`alt+insert`，并选择`equals() and hashCode()`进行自动代码生成。如下图所示：

![](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/equals方法1.png)

![](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/equals方法2.png)

![](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/equals方法3.png)

> tips：Object类当中的hashCode等其他方法，今后学习。

## 1.4 Objects类

在刚才IDEA自动重写equals代码中，使用到了`java.util.Objects`类，那么这个类是什么呢？

在**JDK7**添加了一个Objects工具类，它提供了一些方法来操作对象，它由一些静态的实用方法组成，这些方法是null-save（空指针安全的）或null-tolerant（容忍空指针的），用于计算对象的hashcode、返回对象的字符串表示形式、比较两个对象。

在比较两个对象的时候，Object的equals方法容易抛出空指针异常，而Objects类中的equals方法就优化了这个问题。方法如下：

* `public static boolean equals(Object a, Object b)`:判断两个对象是否相等。

我们可以查看一下源码，学习一下：

~~~java
public static boolean equals(Object a, Object b) {  
    return (a == b) || (a != null && a.equals(b));  
}
~~~

# 第二章 日期时间类

## 2.1 Date类

### 概述

` java.util.Date`类 表示特定的瞬间，精确到毫秒。

继续查阅Date类的描述，发现Date拥有多个构造函数，只是部分已经过时，但是其中有未过时的构造函数可以把毫秒值转成日期对象。

- `public Date()`：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
- `public Date(long date)`：分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数。

> tips: 由于我们处于东八区，所以我们的基准时间为1970年1月1日8时0分0秒。

简单来说：使用无参构造，可以自动设置当前系统时间的毫秒时刻；指定long类型的构造参数，可以自定义毫秒时刻。例如：

```java
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        // 创建日期对象，把当前的时间
        System.out.println(new Date()); // Tue Jan 16 14:37:35 CST 2018
        // 创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(0L)); // Thu Jan 01 08:00:00 CST 1970
    }
}
```

> tips:在使用println方法时，会自动调用Date类中的toString方法。Date类对Object类中的toString方法进行了覆盖重写，所以结果为指定格式的字符串。

### 常用方法

Date类中的多数方法已经过时，常用的方法有：

* `public long getTime()` 把日期对象转换成对应的时间毫秒值。

## 2.2 DateFormat类

`java.text.DateFormat` 是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换,也就是可以在Date对象与String对象之间进行来回转换。

* **格式化**：按照指定的格式，从Date对象转换为String对象。
* **解析**：按照指定的格式，从String对象转换为Date对象。

### 构造方法

由于DateFormat为抽象类，不能直接使用，所以需要常用的子类`java.text.SimpleDateFormat`。这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：

* `public SimpleDateFormat(String pattern)`：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。

参数pattern是一个字符串，代表日期时间的自定义格式。

### 格式规则

常用的格式规则为：

| 标识字母（区分大小写） | 含义 |
| ---------------------- | ---- |
| y                      | 年   |
| M                      | 月   |
| d                      | 日   |
| H                      | 时   |
| m                      | 分   |
| s                      | 秒   |

> 备注：更详细的格式规则，可以参考SimpleDateFormat类的API文档0。

创建SimpleDateFormat对象的代码如：

```java
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Demo02SimpleDateFormat {
    public static void main(String[] args) {
        // 对应的日期格式如：2018-01-16 15:06:38
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }    
}
```

### 常用方法

DateFormat类的常用方法有：

- `public String format(Date date)`：将Date对象格式化为字符串。
- `public Date parse(String source)`：将字符串解析为Date对象。

#### format方法

使用format方法的代码为：

```java
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 把Date对象转换成String
*/
public class Demo03DateFormatMethod {
    public static void main(String[] args) {
        Date date = new Date();
        // 创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        System.out.println(str); // 2008年1月23日
    }
}
```

#### parse方法

使用parse方法的代码为：

```java
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 把String转换成Date对象
*/
public class Demo04DateFormatMethod {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = "2018年12月11日";
        Date date = df.parse(str);
        System.out.println(date); // Tue Dec 11 00:00:00 CST 2018
    }
}
```

## 2.3 练习

请使用日期时间相关的API，计算出一个人已经出生了多少天。

**思路：**

1.获取当前时间对应的毫秒值

2.获取自己出生日期对应的毫秒值

3.两个时间相减（当前时间– 出生日期）

**代码实现：**

```java
public static void function() throws Exception {
	System.out.println("请输入出生日期 格式 YYYY-MM-dd");
	// 获取出生日期,键盘输入
	String birthdayString = new Scanner(System.in).next();
	// 将字符串日期,转成Date对象
	// 创建SimpleDateFormat对象,写日期模式
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	// 调用方法parse,字符串转成日期对象
	Date birthdayDate = sdf.parse(birthdayString);	
	// 获取今天的日期对象
	Date todayDate = new Date();	
	// 将两个日期转成毫秒值,Date类的方法getTime
	long birthdaySecond = birthdayDate.getTime();
	long todaySecond = todayDate.getTime();
	long secone = todaySecond-birthdaySecond;	
	if (secone < 0){
		System.out.println("还没出生呢");
	} else {
		System.out.println(secone/1000/60/60/24);
	}
}
```

## 2.4 Calendar类

###  概念

日历我们都见过

![](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/日历.jpg)

`java.util.Calendar`是日历类，在Date后出现，替换掉了许多Date的方法。该类将所有可能用到的时间信息封装为静态成员变量，方便获取。日历类就是方便获取各个时间属性的。

### 获取方式

Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象，如下：

Calendar静态方法

* `public static Calendar getInstance()`：使用默认时区和语言环境获得一个日历

例如：

```java
import java.util.Calendar;

public class Demo06CalendarInit {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
    }    
}
```

### 常用方法

根据Calendar类的API文档，常用方法有：

- `public int get(int field)`：返回给定日历字段的值。
- `public void set(int field, int value)`：将给定的日历字段设置为给定值。
- `public abstract void add(int field, int amount)`：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
- `public Date getTime()`：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。

Calendar类中提供很多成员常量，代表给定的日历字段：

| 字段值       | 含义                                  |
| ------------ | ------------------------------------- |
| YEAR         | 年                                    |
| MONTH        | 月（从0开始，可以+1使用）             |
| DAY_OF_MONTH | 月中的天（几号）                      |
| HOUR         | 时（12小时制）                        |
| HOUR_OF_DAY  | 时（24小时制）                        |
| MINUTE       | 分                                    |
| SECOND       | 秒                                    |
| DAY_OF_WEEK  | 周中的天（周几，周日为1，可以-1使用） |

#### get/set方法

get方法用来获取指定字段的值，set方法用来设置指定字段的值，代码使用演示：

```java
import java.util.Calendar;

public class CalendarUtil {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cal = Calendar.getInstance();
        // 设置年 
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日");
    }    
}
```

```java
import java.util.Calendar;

public class Demo07CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2020年1月17日
    }
}
```

#### add方法

add方法可以对指定日历字段的值进行加减操作，如果第二个参数为正数则加上偏移量，如果为负数则减去偏移量。代码如：

```java
import java.util.Calendar;

public class Demo08CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2018年1月17日
        // 使用add方法
        cal.add(Calendar.DAY_OF_MONTH, 2); // 加2天
        cal.add(Calendar.YEAR, -3); // 减3年
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2015年1月18日; 
    }
}
```

#### getTime方法

Calendar中的getTime方法并不是获取毫秒时刻，而是拿到对应的Date对象。

```java
import java.util.Calendar;
import java.util.Date;

public class Demo09CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date); // Tue Jan 16 16:03:09 CST 2018
    }
}
```

> 小贴士：
>
> ​     西方星期的开始为周日，中国为周一。
>
> ​     在Calendar类中，月份的表示是以0-11代表1-12月。
>
> ​     日期是有大小关系的，时间靠后，时间越大。

# 第三章 System类

`java.lang.System`类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：

- `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。
- `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。

## 3.1 currentTimeMillis方法

实际上，currentTimeMillis方法就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值

```java
import java.util.Date;

public class SystemDemo {
    public static void main(String[] args) {
       	//获取当前时间毫秒值
        System.out.println(System.currentTimeMillis()); // 1516090531144
    }
}
```

### 练习

验证for循环打印数字1-9999所需要使用的时间（毫秒）

~~~java
public class SystemTest1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒：" + (end - start));
    }
}
~~~

## 3.2 arraycopy方法

* `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。

数组的拷贝动作是系统级的，性能很高。System.arraycopy方法具有5个参数，含义分别为：

| 参数序号 | 参数名称 | 参数类型 | 参数含义             |
| -------- | -------- | -------- | -------------------- |
| 1        | src      | Object   | 源数组               |
| 2        | srcPos   | int      | 源数组索引起始位置   |
| 3        | dest     | Object   | 目标数组             |
| 4        | destPos  | int      | 目标数组索引起始位置 |
| 5        | length   | int      | 复制元素个数         |

### 练习

将src数组中前3个元素，复制到dest数组的前3个位置上复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]

```java
import java.util.Arrays;

public class Demo11SystemArrayCopy {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src, 0, dest, 0, 3);
        /*代码运行后：两个数组中的元素发生了变化
         src数组元素[1,2,3,4,5]
         dest数组元素[1,2,3,9,10]
        */
    }
}
```

# 第四章 StringBuilder类

## 4.1 字符串拼接问题

由于String类的对象内容不可改变，所以每当进行字符串拼接时，总是会在内存中创建一个新的对象。例如：

~~~java
public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s += "World";
        System.out.println(s);
    }
}
~~~

在API中对String类有这样的描述：字符串是常量，它们的值在创建后不能被更改。

根据这句话分析我们的代码，其实总共产生了三个字符串，即`"Hello"`、`"World"`和`"HelloWorld"`。引用变量s首先指向`Hello`对象，最终指向拼接出来的新字符串对象，即`HelloWord` 。

![](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/String拼接问题.bmp)

由此可知，如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。为了解决这一问题，可以使用`java.lang.StringBuilder`类。

## 4.2 StringBuilder概述

查阅`java.lang.StringBuilder`的API，StringBuilder又称为可变字符序列，它是一个类似于 String 的字符串缓冲区，通过某些方法调用可以改变该序列的长度和内容。

原来StringBuilder是个字符串的缓冲区，即它是一个容器，容器中可以装很多字符串。并且能够对其中的字符串进行各种操作。

它的内部拥有一个数组用来存放字符串内容，进行字符串拼接时，直接在数组中加入新内容。StringBuilder会自动维护数组的扩容。原理如下图所示：(默认16字符空间，超过自动扩充)

![06-StringBuilder的原理](C:/Users/mi/Desktop/JAVA/00-B站配套资料分享20190623/Java-黑马idea版/JavaSE-配套资料/02-Java语言进阶/day01_Object类、常用API/img/06-StringBuilder的原理.png)

## 4.3 构造方法

根据StringBuilder的API文档，常用构造方法有2个：

- `public StringBuilder()`：构造一个空的StringBuilder容器。
- `public StringBuilder(String str)`：构造一个StringBuilder容器，并将字符串添加进去。

```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); // (空白)
        // 使用带参构造
        StringBuilder sb2 = new StringBuilder("itcast");
        System.out.println(sb2); // itcast
    }
}
```

## 4.4 常用方法

StringBuilder常用的方法有2个：

- `public StringBuilder append(...)`：添加任意类型数据的字符串形式，并返回当前对象自身。
- `public String toString()`：将当前StringBuilder对象转换为String对象。

### append方法

append方法具有多种重载形式，可以接收任意类型的参数。任何数据作为参数都会将对应的字符串内容添加到StringBuilder中。例如：

```java
public class Demo02StringBuilder {
	public static void main(String[] args) {
		//创建对象
		StringBuilder builder = new StringBuilder();
		//public StringBuilder append(任意类型)
		StringBuilder builder2 = builder.append("hello");
		//对比一下
		System.out.println("builder:"+builder);
		System.out.println("builder2:"+builder2);
		System.out.println(builder == builder2); //true
	    // 可以添加 任何类型
		builder.append("hello");
		builder.append("world");
		builder.append(true);
		builder.append(100);
		// 在我们开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
        // 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
		//链式编程
		builder.append("hello").append("world").append(true).append(100);
		System.out.println("builder:"+builder);
	}
}
```

> 备注：StringBuilder已经覆盖重写了Object当中的toString方法。

### toString方法

通过toString方法，StringBuilder对象将会转换为不可变的String对象。如：

```java
public class Demo16StringBuilder {
    public static void main(String[] args) {
        // 链式创建
        StringBuilder sb = new StringBuilder("Hello").append("World").append("Java");
        // 调用方法
        String str = sb.toString();
        System.out.println(str); // HelloWorldJava
    }
}
```

# 第五章 包装类

## 5.1 概述

Java提供了两个类型系统，基本类型与引用类型，使用基本类型在于效率，然而很多情况，会创建对象使用，因为对象可以做更多的功能，如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类，如下：

| 基本类型 | 对应的包装类（位于java.lang包中） |
| -------- | --------------------------------- |
| byte     | Byte                              |
| short    | Short                             |
| int      | **Integer**                       |
| long     | Long                              |
| float    | Float                             |
| double   | Double                            |
| char     | **Character**                     |
| boolean  | Boolean                           |

## 5.2 装箱与拆箱

基本类型与对应的包装类对象之间，来回转换的过程称为”装箱“与”拆箱“：

* **装箱**：从基本类型转换为对应的包装类对象。

* **拆箱**：从包装类对象转换为对应的基本类型。

用Integer与 int为例：（看懂代码即可）

基本数值---->包装对象

~~~java
Integer i = new Integer(4);//使用构造函数函数
Integer iii = Integer.valueOf(4);//使用包装类中的valueOf方法
~~~

包装对象---->基本数值

~~~java
int num = i.intValue();
~~~

## 5.3自动装箱与自动拆箱

由于我们经常要做基本类型与包装类之间的转换，从Java 5（JDK 1.5）开始，基本类型与包装类的装箱、拆箱动作可以自动完成。例如：

```java
Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
i = i + 5;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
//加法运算完成后，再次装箱，把基本数值转成对象。
```

## 5.3 基本类型与字符串之间的转换

### 基本类型转换为String

   基本类型转换String总共有三种方式，查看课后资料可以得知，这里只讲最简单的一种方式： 

~~~
基本类型直接与””相连接即可；如：34+""
~~~

String转换成对应的基本类型 

除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：

- `public static byte parseByte(String s)`：将字符串参数转换为对应的byte基本类型。
- `public static short parseShort(String s)`：将字符串参数转换为对应的short基本类型。
- `public static int parseInt(String s)`：将字符串参数转换为对应的int基本类型。
- `public static long parseLong(String s)`：将字符串参数转换为对应的long基本类型。
- `public static float parseFloat(String s)`：将字符串参数转换为对应的float基本类型。
- `public static double parseDouble(String s)`：将字符串参数转换为对应的double基本类型。
- `public static boolean parseBoolean(String s)`：将字符串参数转换为对应的boolean基本类型。

代码使用（仅以Integer类的静态方法parseXxx为例）如：

```java
public class Demo18WrapperParse {
    public static void main(String[] args) {
        int num = Integer.parseInt("100");
    }
}
```

> 注意:如果字符串参数的内容无法正确转换为对应的基本类型，则会抛出`java.lang.NumberFormatException`异常。

