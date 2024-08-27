package ra.baitapthem;

import java.util.*;

public class Program {
    public static List<Product> products = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===============MENU==================\n" +
                    "1. Thêm mới sản phẩm\n" +
                    "2. Hiểm thị danh sách\n" +
                    "3. Sắp xếp danh sách sản phẩm theo giá tăng dần(sử dụng streamAPI)\n" +
                    "4. Lọc sản phẩm theo khoảng giá . (Nhập vào start = 100, end = 100 ===> in ra danh sách sản phẩm nằm trong khoảng giá đó) (streamAPI, fillter)\n" +
                    "5. Thông kê: in ra giá cao nhât, giá thấp nhất, giá TB\n" +
                    "6. Thoát");
            System.out.println("Mời bạn chọn từ 1 đến 6: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập vào số sản phẩm muốn thêm: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Product p = new Product();
                        p.inputData(sc);
                        products.add(p);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm");
                    for (Product p : products) {
                        p.displayData();
                        System.out.println();
                    }
                    break;
                case 3:
                    products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(Product::displayData);
                    break;
                case 4:
                    System.out.println("Nhập giá trị bắt đầu: ");
                    double startPrice = sc.nextDouble();
                    System.out.println("Nhập giá trị kết thúc: ");
                    double endPrice = sc.nextDouble();

                    products.stream().filter(p -> p.getPrice() >= startPrice && p.getPrice() <= endPrice).forEach(Product::displayData);
                    break;
                case 5:
                    if (products.isEmpty()){
                        System.out.println("Danh sách sản phẩm rỗng.");
                        break;
                    }
                    DoubleSummaryStatistics stats = products.stream().mapToDouble(Product::getPrice).summaryStatistics();
                    System.out.println("Giá cao nhất" + stats.getMax());
                    System.out.println("Giá thấp nhất" + stats.getMin());
                    System.out.println("Giá trung bình" + stats.getAverage());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Mời bạn nhập lại");
            }
        }while (true);
    }
}
