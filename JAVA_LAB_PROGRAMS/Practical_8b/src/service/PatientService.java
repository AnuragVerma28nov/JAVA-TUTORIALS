package Practical_8b.src.service;

import model.Patient;
import util.FileUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    
    private static final String FILENAME = "C:\\Users\\vanur\\OneDrive\\Desktop\\JAVA  TUTORIAL\\JAVA_LAB_PROGRAMS\\hospital_management\\src\\database\\patients.txt";
    public void addPatient(Patient patient) throws IOException {
        List<String> patients = FileUtil.readFromFile(FILENAME);
        patients.add(patient.toString());
        FileUtil.writeToFile(FILENAME, patients);
    }
    public List<Patient> getAllPatients() throws IOException {
        List<String> data = FileUtil.readFromFile(FILENAME);
        List<Patient> patients = new ArrayList<>();
        for (String line : data) {
            patients.add(Patient.fromString(line));
        }
        return patients;
    }
    public Patient findPatientById(String id) throws IOException {
        List<Patient> patients = getAllPatients();
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }
}
