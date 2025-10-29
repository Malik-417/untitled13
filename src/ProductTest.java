public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Смартфон X", 25000, "Электроника");
        Product p2 = new Product(101, "Смартфон Y", 30000, "Электроника");
        Product p3 = new Product(102, "Ноутбук Z", 50000, "Компьютеры");
        Product p4 = new Product(101, "Смартфон A", 20000, "Электроника");

        System.out.println("=== Тестирование Product ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\nРезультаты сравнения:");
        System.out.println("p1 == p2: " + p1.equals(p2)); // true (id и category совпадают)
        System.out.println("p1 == p3: " + p1.equals(p3)); // false (разные id и category)
        System.out.println("p2 == p4: " + p2.equals(p4)); // true (id и category совпадают)
    }
}
