import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SI2026Lab2Test {

    @Test
    public void searchBookEveryStatementTest() {
        Library lib = new Library();
        lib.addBook(new Book("A", "Author", "G"));

        // 1. exception
        assertThrows(IllegalArgumentException.class, () ->
                lib.searchBookByTitle(""));

        // 2. нема резултат
        assertNull(lib.searchBookByTitle("X"));

        // 3. има резултат
        assertNotNull(lib.searchBookByTitle("A"));

        // 4. книга borrow-ната
        lib.borrowBook("A", "Author");
        assertNull(lib.searchBookByTitle("A"));
    }

    @Test
    public void borrowBookEveryBranchTest() {
        Library lib = new Library();
        lib.addBook(new Book("A", "Author", "G"));

        // 1. празен input
        assertThrows(IllegalArgumentException.class, () ->
                lib.borrowBook("", "Author"));

        // 2. success
        lib.borrowBook("A", "Author");

        // 3. already borrowed
        assertThrows(RuntimeException.class, () ->
                lib.borrowBook("A", "Author"));

        // 4. not found
        assertThrows(RuntimeException.class, () ->
                lib.borrowBook("X", "Y"));
    }

    @Test
    public void borrowBookMultipleConditionTest() {
        Library lib = new Library();

        // T || T
        assertThrows(IllegalArgumentException.class, () ->
                lib.borrowBook("", ""));

        // T || F
        assertThrows(IllegalArgumentException.class, () ->
                lib.borrowBook("", "A"));

        // F || T
        assertThrows(IllegalArgumentException.class, () ->
                lib.borrowBook("A", ""));

        // F || F
        lib.addBook(new Book("A", "B", "G"));
        assertDoesNotThrow(() ->
                lib.borrowBook("A", "B"));
    }



}