package com.fiqri.challange4.repository;

import com.fiqri.challange4.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {
}