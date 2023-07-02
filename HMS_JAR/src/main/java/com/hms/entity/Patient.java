package com.hms.entity;

import java.util.HashMap;

public class Patient {

    private int patientId;

    private HashMap<String, Integer> recurringAppointment;

    private String patientName;

    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        recurringAppointment = new HashMap<String, Integer>();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public HashMap<String, Integer> getRecurringAppointment() {
        return recurringAppointment;
    }

    public int setRecurringAppointment(String patientDisease, int docId) {
        if(recurringAppointment.get(patientDisease) == null) {
            recurringAppointment.put(patientDisease, docId);
        }
        else{
            docId = recurringAppointment.get(patientDisease);
        }
        return docId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", recurringAppointment=" + recurringAppointment +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientId == patient.patientId &&
                patientName.equals(patient.patientName);
    }

}