package edu.iu.habahram.pizzashop;

import edu.iu.habahram.pizzashop.model.NewYorkPizzaFactory;
import edu.iu.habahram.pizzashop.model.NewYorkPizzaIngredientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PizzaShopApplicationTests {

    @Test
    void createPizza() {
        NewYorkPizzaFactory newYorkPizzaFactory = new NewYorkPizzaFactory();
        newYorkPizzaFactory.createPizza("cheese").toString();
    }
	@Test
	void contextLoads() {
	}

}
