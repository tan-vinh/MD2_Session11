package ra.baitapthem;

import java.util.Scanner;

public class Product implements IProduct {
    Scanner sc = new Scanner(System.in);

    private int id;
    private String name;
    private double price;
    private boolean status;

    public Product() {
    }

    public Product(int id, String name, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhap ma san pham");
        this.id = scanner.nextInt();
        System.out.println("Nhap ten san pham");
        this.name = scanner.next();
        System.out.println("Nhap gia san pham");
        this.price = scanner.nextDouble();
        System.out.println("Nhap trang thai san pham");
        this.status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Ma san pham" + this.id);
        System.out.println("Ten san pham" + this.name);
        System.out.println("Gia san pham" + this.price);
        System.out.println("Trang thai san pham" + (this.status ? "Con hang" : "Het hang"));
    }
}
