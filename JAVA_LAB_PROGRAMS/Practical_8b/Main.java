package Practical_8b.src;

import java.io.IOException;
import java.util.Scanner;

import Practical_8b.src.model.Appointment;
import Practical_8b.src.model.Doctor;
import Practical_8b.src.model.Patient;
import Practical_8b.src.service.AppointmentService;
import Practical_8b.src.service.DoctorService;
import Practical_8b.src.service.PatientService;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PatientService patientService = new PatientService();
    private static DoctorService doctorService = new DoctorService();
    private static AppointmentService appointmentService = new AppointmentService();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Doctor Management");
            System.out.println("2. Patient Management");
            System.out.println("3. Appointment Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        doctorManagement();
                        break;
                    case 2:
                        patientManagement();
                        break;
                    case 3:
                        appointmentManagement();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting system.");
                        System.out.println("Thank You for using Hospital Management System. Goodbye!");

                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void patientManagement() throws IOException {
        boolean back = false;

        while (!back) {
            System.out.println("\n=== Patient Management ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.nextLine();

                    patientService.addPatient(new Patient(id, name, contact));
                    System.out.println("Patient added successfully!");
                    break;
                case 2:
                    System.out.println("\n=== Patient List ===");
                    for (Patient patient : patientService.getAllPatients()) {
                        System.out.println("ID: " + patient.getId() +
                                ", Name: " + patient.getName() +
                                ", Contact: " + patient.getContact());
                    }
                    break;
                case 3:
                    System.out.print("Enter Patient ID: ");
                    Patient patient = patientService.findPatientById(scanner.nextLine());
                    if (patient != null) {
                        System.out.println("Patient found:");
                        System.out.println("ID: " + patient.getId() +
                                ", Name: " + patient.getName() +
                                ", Contact: " + patient.getContact());
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void doctorManagement() throws IOException {
        boolean back = false;

        while (!back) {
            System.out.println("\n=== Doctor Management ===");
            System.out.println("1. Add Doctor");
            System.out.println("2. View Doctors");
            System.out.println("3. Search Doctor");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();

                    doctorService.addDoctor(new Doctor(id, name, specialization));
                    System.out.println("Doctor added successfully!");
                    break;
                case 2:
                    System.out.println("\n=== Doctor List ===");
                    for (Doctor doctor : doctorService.getAllDoctors()) {
                        System.out.println("ID: " + doctor.getId() +
                                ", Name: " + doctor.getName() +
                                ", Specialization: " + doctor.getSpecialization());
                    }
                    break;
                case 3:
                    System.out.print("Enter Doctor ID: ");
                    Doctor doctor = doctorService.findDoctorById(scanner.nextLine());
                    if (doctor != null) {
                        System.out.println("Doctor found:");
                        System.out.println("ID: " + doctor.getId() +
                                ", Name: " + doctor.getName() +
                                ", Specialization: " + doctor.getSpecialization());
                    } else {
                        System.out.println("Doctor not found.");
                    }
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void appointmentManagement() throws IOException {
        boolean back = false;

        while (!back) {
            System.out.println("\n=== Appointment Management ===");
            System.out.println("1. Add Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Search Appointment");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Appointment ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Enter Doctor ID: ");
                    String doctorId = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();

                    // Check if patient and doctor exist
                    if (patientService.findPatientById(patientId) == null) {
                        System.out.println("Patient not found.");
                        break;
                    }
                    if (doctorService.findDoctorById(doctorId) == null) {
                        System.out.println("Doctor not found.");
                        break;
                    }

                    appointmentService.addAppointment(new Appointment(id, patientId, doctorId, date));
                    System.out.println("Appointment added successfully!");
                    break;
                case 2:
                    System.out.println("\n=== Appointment List ===");
                    for (Appointment appt : appointmentService.getAllAppointments()) {
                        System.out.println("ID: " + appt.getId() +
                                ", Patient ID: " + appt.getPatientId() +
                                ", Doctor ID: " + appt.getDoctorId() +
                                ", Date: " + appt.getDate());
                    }
                    break;
                case 3:
                    System.out.print("Enter Appointment ID: ");
                    Appointment appt = appointmentService.findAppointmentById(scanner.nextLine());
                    if (appt != null) {
                        System.out.println("Appointment found:");
                        System.out.println("ID: " + appt.getId() +
                                ", Patient ID: " + appt.getPatientId() +
                                ", Doctor ID: " + appt.getDoctorId() +
                                ", Date: " + appt.getDate());
                    } else {
                        System.out.println("Appointment not found.");
                    }
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}