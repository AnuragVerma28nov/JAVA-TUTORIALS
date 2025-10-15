package Practical_8b.src.model;

public class Patient {
    
    private String id;
    private String name;
    private String contact;

    public Patient(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public String getId() { return id; }     // Getters
    public String getName() { return name; }
    public String getContact() { return contact; }

    @Override
    public String toString() {
        return id + "," + name + "," + contact;
    }

    public static Patient fromString(String data) {
        String[] parts = data.split(",");
        return new Patient(parts[0], parts[1], parts[2]);
    }
}