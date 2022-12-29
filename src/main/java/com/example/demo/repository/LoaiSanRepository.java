package com.example.demo.repository;

import com.example.demo.entity.LoaiSan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiSanRepository
    extends CrudRepository<LoaiSan, String> {
    List<LoaiSan> findAll();
}
