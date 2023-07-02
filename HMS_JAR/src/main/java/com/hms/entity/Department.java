package com.hms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.rmi.server.UID;
import java.util.HashSet;

@Data
@AllArgsConstructor
public class Department {

    private int DepartmentId;

    private String DepartmentName;

    private HashSet<String> treatableDiseases;

}