package view;

public class View {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Nhap chuoi");
        System.out.println("2. Dem so luong ky tu");
        System.out.println("3. Dem so luong chu cai theo ky tu");
        System.out.println("4. Thoát");
    }

    public void displayInputPrompt() {
        System.out.print("Nhap chuoi: ");
    }

    public void displayCharacterCount(int count) {
        System.out.println("So luong ky tu trong chuoi: " + count);
    }

    public void displayLetterCount(char letter, int count) {
        System.out.println("So luong ky tu '" + letter + "': " + count);
    }
}

