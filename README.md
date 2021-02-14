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
       2. 匿名对象，在【调用方法】的时候，只能调用唯一一次。
           如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
       3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
           强调：匿名内部类和匿名对象不是一回事！！！