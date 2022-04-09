package com.nt.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Company;
@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
