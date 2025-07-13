package HomeWork7.TaskOne;

public class Therapist extends Doctor {
    public void heal() {
        System.out.println("The therapist treats the patient...");
    }

    public void assignDoctor(Patient patient) {
        Doctor doctor;
        switch (patient.getPlanTreatment()) {
            case 1 -> doctor = new Surgeon();
            case 2 -> doctor = new Dentist();
            default -> doctor = this;
        }

        patient.setDoctor(doctor);
        doctor.heal();
    }
}
