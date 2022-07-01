package jdbc.gotohell.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Positive;

@Getter
@AllArgsConstructor
public class OrderCoffeeDto {

    @Positive
    private long coffeeId;
    @Positive
    private int quantity;
}
