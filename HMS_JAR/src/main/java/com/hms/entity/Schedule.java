package com.hms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    Map<LocalDate, TreeSet<LocalTime> > schedule = new TreeMap<LocalDate, TreeSet<LocalTime> >();

}