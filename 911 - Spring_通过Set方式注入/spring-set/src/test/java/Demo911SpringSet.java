import com.foxthere.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/3 20:55
 * @Author : NekoSilverfox
 * @FileName: Demo911SpringSet
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo911SpringSet {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student silverfox = (Student) context.getBean("Silverfox");
        System.out.println(silverfox.toString());
        /*
        Student{name='冰糖雪狸',
        address=Address{address='圣彼得堡'},
        books=[《计算机组成原理》, 《高等数学》, 《线性代数》],
        hobbies=[吃饭, 睡觉, 发呆],
        card={学生卡=186943, 身份证=19461986616563163, 银行卡=46565442266},
        games=[糖豆人, SAR, Minecraft], wife='null',
        info={password=gadefawfas, E-Mail=dasfwa@gmail.com, Web=www.foxthere.com}}
         */
    }
}
