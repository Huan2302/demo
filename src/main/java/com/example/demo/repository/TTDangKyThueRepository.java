package com.example.demo.repository;

import com.example.demo.entity.TTDangKyThue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TTDangKyThueRepository
    extends CrudRepository<TTDangKyThue, String> {
}
