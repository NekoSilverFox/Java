import com.foxthere.JavaConfig;
import com.foxthere.MyCalculation;
import com.foxthere.MyCalculationImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 18:50
 * @Author : NekoSilverfox
 * @FileName: Main
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        // 写接口
        MyCalculation calculation = context.getBean(MyCalculation.class);

        calculation.add(1,2);

        calculation.sub(4, 1);
    }
}
