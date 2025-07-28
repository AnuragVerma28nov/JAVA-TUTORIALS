🏥 Hospital Management System

A modern, efficient Java-based Hospital Management System designed to streamline patient, doctor, and appointment management with secure file-based persistence.

✨ Features-

👩‍⚕️ Patient Management
✅ Add new patients with complete details
🔍 View and search patient records
📊 Maintain comprehensive patient profiles
🩺 Doctor Management
➕ Register new doctors with specialties
👀 Browse doctor availability
🔎 Find doctors by specialization
📅 Appointment Scheduling
🗓️ Book patient-doctor appointments
👁️ View upcoming appointments
🔍 Search appointment history

# Compile the project
javac src/*.java src/model/*.java src/service/*.java src/util/*.java

# Run the application
java -cp src Main

🗂️ Project Structure
hospital-management/
├── src/
│   ├── model/            # Data models
│   │   ├── Patient.java
│   │   ├── Doctor.java
│   │   └── Appointment.java
│   ├── service/          # Business logic
│   │   ├── PatientService.java
│   │   ├── DoctorService.java
│   │   └── AppointmentService.java
│   ├── util/             # Utilities
│   │   └── FileUtil.java
│   └── Main.java         # Entry point
├── data/                 # Data storage
│   ├── patients.txt
│   ├── doctors.txt
│   └── appointments.txt
└── README.md             # Documentation


🖥️Main Menu Options:

1. Patient Management
2. Doctor Management
3. Appointment Management
4. Exit

---

## 📌 Usage
  - Prepared for academic and industry-oriented Java learning.

---

## 🧑‍💻 Author
  - Anurag Verma
  - Year: 2025
