package com.example.demo.bloc.v1;

import com.example.demo.entity.TTDangKyThue;
import com.example.demo.service.v1.LoaiSanService;
import com.example.demo.service.v1.TTDangKyThueService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TTDangKyThueBloc {
    private final TTDangKyThueService ttDangKyThueService;
    final LoaiSanService loaiSanService;

    public TTDangKyThueBloc(final TTDangKyThueService ttDangKyThueService, final LoaiSanService loaiSanService) {
        this.ttDangKyThueService = ttDangKyThueService;
        this.loaiSanService = loaiSanService;
    }

    public void insert(TTDangKyThue ttDangKyThue){

        ttDangKyThueService.insert(ttDangKyThue);
    }
}
