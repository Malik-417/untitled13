import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[клиент=" + customer +
                ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order other = (Order) obj;

        // Сравнение клиента
        if (!Objects.equals(this.customer, other.customer)) return false;

        // Сравнение корзины
        if (this.basket == null && other.basket == null) return true;
        if (this.basket == null || other.basket == null) return false;
        if (this.basket.length != other.basket.length) return false;

        for (int i = 0; i < this.basket.length; i++) {
            if (!Objects.equals(this.basket[i], other.basket[i])) {
                return false;
            }
        }
        return true;
    }

    // Геттеры
    public String getCustomer() { return customer; }
    public Product[] getBasket() { return basket; }
}
