package Practical_8b.src.service;

import model.Doctor;
import util.FileUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private static final String FILENAME = "C:\\Users\\vanur\\OneDrive\\Desktop\\JAVA  TUTORIAL\\JAVA_LAB_PROGRAMS\\hospital_management\\src\\database\\doctors.txt";

    public void addDoctor(Doctor doctor) throws IOException {
        List<String> doctors = FileUtil.readFromFile(FILENAME);
        doctors.add(doctor.toString());
        FileUtil.writeToFile(FILENAME, doctors);
    }

    public List<Doctor> getAllDoctors() throws IOException {
        List<String> data = FileUtil.readFromFile(FILENAME);
        List<Doctor> doctors = new ArrayList<>();
        for (String line : data) {
            doctors.add(Doctor.fromString(line));
        }
        return doctors;
    }

    public Doctor findDoctorById(String id) throws IOException {
        List<Doctor> doctors = getAllDoctors();
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }
}