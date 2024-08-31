package lk.ijse.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Mahesh {

    @After("execution(public void initialFav())")
    public void FishBun() {
        System.out.println("Fish Bun");
    }

    @After("execution(public void changedFav())")
    public void ChickenRoll() {
        System.out.println("Chicken Roll");
    }

    @After("execution(public void changedFav())")
    public void FishPastry() {
        System.out.println("Fish Pastry");
    }

    @After("execution(public void changedFav())")
    public void ChickenBun() {
        System.out.println("Chicken Bun");
    }
}
