package com.nt.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Mobile;
@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {

}
