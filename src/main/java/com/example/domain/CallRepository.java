package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alejandro Duarte
 */
@Repository
public interface CallRepository extends JpaRepository<Call, Long> {

}
