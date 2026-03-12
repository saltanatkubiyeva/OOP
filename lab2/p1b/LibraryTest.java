package p1b;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        List <LibraryItem> library = new ArrayList<>();

        library.add(new Magazine("Vogue", "Conde Nast", 2025,14,"Fashion"));
        library.add(new Magazine("Cosmopolitan", "Hearst Magazines", 2024, 8, "Entertainment"));
        library.add(new Magazine("Elle", "Anna Vin", 2025, 12, "Beauty"));

        System.out.println("=== Library Items ====");
        for(LibraryItem l : library) {
            System.out.println(l);
        }
    }
}
