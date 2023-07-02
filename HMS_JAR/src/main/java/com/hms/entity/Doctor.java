package com.hms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    private int docId;

    private String docName;

    private int docHours;

    private char docShift;

    private Department docDepartment;

    private String docEmail;

    private Schedule docSchedule;

}
