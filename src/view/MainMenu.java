package view;

import java.util.Scanner;

public class MainMenu extends Menu {
    private Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Nhập chuỗi");
        System.out.println("2. Đếm số lượng ký tự");
        System.out.println("3. Đếm số lượng chữ cái theo ký tự");
        System.out.println("4. Thoát");
    }

    @Override
    public int getUserChoice() {
        System.out.print("Chọn tùy chọn: ");
        return scanner.nextInt();
    }
}
