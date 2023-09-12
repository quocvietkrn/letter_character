package controller;

 import java.util.Scanner;

import model.Model;
import view.MainMenu;
import view.View;
import view.Menu;

public class Controller {
    private Model model;
    private Menu menu;
    private View view;
    private Scanner scanner;

    public Controller() {
        model = new Model();
        menu = new MainMenu();  // Sử dụng menu cụ thể là MainMenu
        view = new View();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice;
        do {
            view.displayMenu();
            System.out.print("Chọn tùy chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    view.displayInputPrompt(); // nhap chuoi
                    String inputString = scanner.nextLine();
                    model.setInputString(inputString);
                    break;
                case 2:
                    int charCount = model.countCharacters();
                    view.displayCharacterCount(charCount);
                    break;
                case 3:
                    System.out.print("Nhập ký tự cần đếm: ");
                    char letter = scanner.nextLine().charAt(0);
                    int letterCount = model.countLetters(letter);
                    view.displayLetterCount(letter, letterCount);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ.");
            }
        } while (choice != 4);
    }
    
}
