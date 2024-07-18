package sample.unit.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import sample.unit.beverages.Beverage;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Order {

    private final LocalDateTime localDateTime;
    private final List<Beverage> beverages;

}
