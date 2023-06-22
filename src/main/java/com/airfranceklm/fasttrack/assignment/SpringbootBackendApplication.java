package com.airfranceklm.fasttrack.assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;
import com.airfranceklm.fasttrack.assignment.resources.Holiday;
import com.airfranceklm.fasttrack.assignment.resources.Status;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private HolidayRepository holidayRepository;

    @Override
    public void run(String...args) throws Exception {
    	if (this.holidayRepository.count() == 0) {
            this.holidayRepository.save(new Holiday("SummerHoliday1", "klm012345", "2022-08-02T08:00:00+00:00", "2022-08-16T08:00:00+00:00", Status.SCHEDULED));
            this.holidayRepository.save(new Holiday("SummerHoliday2", "klm012345", "2022-08-20T08:00:00+00:00", "2022-08-22T08:00:00+00:00", Status.REQUESTED));
            this.holidayRepository.save(new Holiday("SummerHoliday3", "klm012345", "2022-09-10T08:00:00+00:00", "2022-09-20T08:00:00+00:00", Status.REQUESTED));
            this.holidayRepository.save(new Holiday("SummerHoliday3", "klm000000", "2022-09-10T08:00:00+00:00", "2022-09-20T08:00:00+00:00", Status.REQUESTED));
    	}
    }
}

