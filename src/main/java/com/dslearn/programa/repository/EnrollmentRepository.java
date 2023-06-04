package com.dslearn.programa.repository;

import com.dslearn.programa.domain.entities.Enrollment;
import com.dslearn.programa.domain.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
