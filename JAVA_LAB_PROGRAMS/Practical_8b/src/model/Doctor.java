package Practical_8b.src.model;

public class Doctor {
    private String id;
    private String name;
    private String specialization;

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return id + "," + name + "," + specialization;
    }

    public static Doctor fromString(String data) {
        String[] parts = data.split(",");
        return new Doctor(parts[0], parts[1], parts[2]);
    }
}