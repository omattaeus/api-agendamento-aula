package com.agenda_aulas_api.repository;

import com.agenda_aulas_api.domain.Address;
import com.agenda_aulas_api.domain.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID> {
}
