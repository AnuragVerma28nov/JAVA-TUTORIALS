import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String contact;

    public Patient(String id, String name, int age, String gender, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContact() { return contact; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + 
               ", Gender: " + gender + ", Contact: " + contact;
    }
}

class Doctor {
    private String id;
    private String name;
    private String specialization;
    private String contact;
    private String schedule;

    public Doctor(String id, String name, String specialization, String contact, String schedule) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;
        this.schedule = schedule;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public String getContact() { return contact; }
    public String getSchedule() { return schedule; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Specialization: " + specialization + 
               ", Contact: " + contact + ", Schedule: " + schedule;
    }
}

class Appointment {
    private String id;
    private String patientId;
    private String doctorId;
    private String date;
    private String time;
    private String description;

    public Appointment(String id, String patientId, String doctorId, String date, String time, String description) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "ID: " + id + ", Patient ID: " + patientId + ", Doctor ID: " + doctorId + 
               ", Date: " + date + ", Time: " + time + ", Description: " + description;
    }
}

public class HospitalManagementSystem {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Patient Management");
            System.out.println("2. Doctor Management");
            System.out.println("3. Appointment Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    patientManagement();
                    break;
                case 2:
                    doctorManagement();
                    break;
                case 3:
                    appointmentManagement();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void patientManagement() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n=== Patient Management ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    searchPatient();
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addPatient() {
        System.out.println("\n=== Add New Patient ===");
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
        
        Patient patient = new Patient(id, name, age, gender, contact);
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    private static void viewPatients() {
        System.out.println("\n=== Patient List ===");
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    private static void searchPatient() {
        System.out.println("\n=== Search Patient ===");
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        
        boolean found = false;
        for (Patient patient : patients) {
            if (patient.getId().equalsIgnoreCase(id)) {
                System.out.println("Patient found:");
                System.out.println(patient);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Patient with ID " + id + " not found.");
        }
    }

    private static void doctorManagement() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n=== Doctor Management ===");
            System.out.println("1. Add Doctor");
            System.out.println("2. View Doctors");
            System.out.println("3. Search Doctor");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    viewDoctors();
                    break;
                case 3:
                    searchDoctor();
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addDoctor() {
        System.out.println("\n=== Add New Doctor ===");
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
        System.out.print("Enter Schedule: ");
        String schedule = scanner.nextLine();
        
        Doctor doctor = new Doctor(id, name, specialization, contact, schedule);
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    private static void viewDoctors() {
        System.out.println("\n=== Doctor List ===");
        if (doctors.isEmpty()) {
            System.out.println("No doctors registered.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    private static void searchDoctor() {
        System.out.println("\n=== Search Doctor ===");
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();
        
        boolean found = false;
        for (Doctor doctor : doctors) {
            if (doctor.getId().equalsIgnoreCase(id)) {
                System.out.println("Doctor found:");
                System.out.println(doctor);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Doctor with ID " + id + " not found.");
        }
    }

    private static void appointmentManagement() {
        boolean back = false;
        
        while (!back) {
            System.out.println("\n=== Appointment Management ===");
            System.out.println("1. Schedule Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Search Appointment");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    scheduleAppointment();
                    break;
                case 2:
                    viewAppointments();
                    break;
                case 3:
                    searchAppointment();
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void scheduleAppointment() {
        System.out.println("\n=== Schedule New Appointment ===");
        System.out.print("Enter Appointment ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter Date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        System.out.print("Enter Time: ");
        String time = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        
        // Check if patient and doctor exist
        boolean patientExists = false;
        boolean doctorExists = false;
        
        for (Patient patient : patients) {
            if (patient.getId().equalsIgnoreCase(patientId)) {
                patientExists = true;
                break;
            }
        }
        
        for (Doctor doctor : doctors) {
            if (doctor.getId().equalsIgnoreCase(doctorId)) {
                doctorExists = true;
                break;
            }
        }
        
        if (patientExists && doctorExists) {
            Appointment appointment = new Appointment(id, patientId, doctorId, date, time, description);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } else {
            if (!patientExists) {
                System.out.println("Patient with ID " + patientId + " not found.");
            }
            if (!doctorExists) {
                System.out.println("Doctor with ID " + doctorId + " not found.");
            }
            System.out.println("Appointment not scheduled.");
        }
    }

    private static void viewAppointments() {
        System.out.println("\n=== Appointment List ===");
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    private static void searchAppointment() {
        System.out.println("\n=== Search Appointment ===");
        System.out.print("Enter Appointment ID: ");
        String id = scanner.nextLine();
        
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getId().equalsIgnoreCase(id)) {
                System.out.println("Appointment found:");
                System.out.println(appointment);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Appointment with ID " + id + " not found.");
        }
    }
}

// Output:

