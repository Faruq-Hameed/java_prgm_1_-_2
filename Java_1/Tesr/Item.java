package Tesr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private String name;
    private LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    /**Object name getter */
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return this.getName() + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
