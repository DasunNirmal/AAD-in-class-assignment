package lk.ijse.aop;

import org.springframework.stereotype.Component;

@Component("food")
public class FoodLover {

    public void initialFav() {
        System.out.println("Mahesh's first preferred food items : ");
    }

    public void changedFav() {
        System.out.println("Mahesh's second preferred food items : ");
    }
}
