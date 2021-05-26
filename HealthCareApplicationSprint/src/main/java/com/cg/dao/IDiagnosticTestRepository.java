package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entites.DiagnosticTest;

public interface IDiagnosticTestRepository extends JpaRepository<DiagnosticTest,Integer> {

}
