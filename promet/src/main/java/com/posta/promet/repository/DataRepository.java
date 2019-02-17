package com.posta.promet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posta.promet.model.Data;

public interface DataRepository extends JpaRepository<Data, Long> {

}
