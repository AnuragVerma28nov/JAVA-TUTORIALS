package Practical_8b.src.service;

import model.Appointment;
import util.FileUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private static final String FILENAME = "C:\\Users\\vanur\\OneDrive\\Desktop\\JAVA  TUTORIAL\\JAVA_LAB_PROGRAMS\\hospital_management\\src\\database\\appointments.txt";

    public void addAppointment(Appointment appointment) throws IOException {
        List<String> appointments = FileUtil.readFromFile(FILENAME);
        appointments.add(appointment.toString());
        FileUtil.writeToFile(FILENAME, appointments);
    }

    public List<Appointment> getAllAppointments() throws IOException {
        List<String> data = FileUtil.readFromFile(FILENAME);
        List<Appointment> appointments = new ArrayList<>();
        for (String line : data) {
            appointments.add(Appointment.fromString(line));
        }
        return appointments;
    }

    public Appointment findAppointmentById(String id) throws IOException {
        List<Appointment> appointments = getAllAppointments();
        for (Appointment appointment : appointments) {
            if (appointment.getId().equals(id)) {
                return appointment;
            }
        }
        return null;
    }
}