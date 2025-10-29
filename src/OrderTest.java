public class OrderTest {
    public static void main(String[] args) {
        // Создаём товары
        Product phone = new Product(101, "Смартфон", 25000, "Электроника");
        Product laptop = new Product(102, "Ноутбук", 50000, "Компьютеры");

        // Заказы с одинаковой корзиной
        Order o1 = new Order("Иван", new Product[]{phone, laptop});
        Order o2 = new Order("Иван", new Product[]{phone, laptop});

        // Заказ с другим клиентом
        Order o3 = new Order("Пётр", new Product[]{phone, laptop});

        // Заказ с другой корзиной (другой порядок)
        Order o4 = new Order("Иван", new Product[]{laptop, phone});

        // Заказ с неполной корзиной
        Order o5 = new Order("Иван", new Product[]{phone});

        System.out.println("=== Тестирование Order ===");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);

        System.out.println("\nРезультаты сравнения:");
        System.out.println("o1 == o2: " + o1.equals(o2)); // true
        System.out.println("o1 == o3: " + o1.equals(o3)); // false (клиент)
        System.out.println("o1 == o4: " + o1.equals(o4)); // false (порядок в корзине)
        System.out.println("o1 == o5: " + o1.equals(o5)); // false (корзина)
    }
}
