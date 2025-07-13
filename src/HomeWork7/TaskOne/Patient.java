package HomeWork7.TaskOne;

public class Patient {
    private int planTreatment;
    private Doctor doctor;

    Patient(int planTreatment) {
        this.planTreatment = planTreatment;
    }

    public int getPlanTreatment() {
        return planTreatment;
    }

    public void setPlanTreatment(int planTreatment) {
        this.planTreatment = planTreatment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
