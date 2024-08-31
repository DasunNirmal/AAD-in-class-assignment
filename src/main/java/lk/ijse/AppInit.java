package lk.ijse;

import lk.ijse.aop.FoodLover;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        FoodLover foodLover = (FoodLover) ctx.getBean("food");
        foodLover.initialFav();
        foodLover.changedFav();

        ctx.registerShutdownHook();
    }
}
