package com.example.demo.service.v1;

import com.example.demo.entity.LoaiSan;
import com.example.demo.repository.LoaiSanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class LoaiSanService {
    @Autowired
    private LoaiSanRepository loaiSanRepository;

    public List<LoaiSan> findAll() {
        log.info("find all LoaiSan");
        return loaiSanRepository.findAll();
    }

    public Optional<LoaiSan> findById(String id) {
        log.info("find loaiSan by ID #{}", id);
        return loaiSanRepository.findById(id);
    }
}
