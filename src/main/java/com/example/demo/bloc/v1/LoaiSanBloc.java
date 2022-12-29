package com.example.demo.bloc.v1;

import com.example.demo.entity.LoaiSan;
import com.example.demo.service.v1.LoaiSanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanBloc {
    private final LoaiSanService loaiSanService;

    public LoaiSanBloc(final LoaiSanService loaiSanService) {
        this.loaiSanService = loaiSanService;
    }

    public List<LoaiSan> getLoaiSans(){
        return loaiSanService.findAll();
    }

    public LoaiSan findById(String id){
        return loaiSanService.findById(id).get();
    }
}
