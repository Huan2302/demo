package com.example.demo.service.v1;

import com.example.demo.entity.TTDangKyThue;
import com.example.demo.repository.TTDangKyThueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
public class TTDangKyThueService {

    @Autowired
    private TTDangKyThueRepository ttDangKyThueRepository;

    @Transactional
    public void insert(TTDangKyThue ttDangKyThue){
        log.info("save ttDangKyThue");
        ttDangKyThueRepository.save(ttDangKyThue);
    }
}
