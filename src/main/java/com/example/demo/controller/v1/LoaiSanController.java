package com.example.demo.controller.v1;

import com.example.demo.bloc.v1.LoaiSanBloc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoaiSanController {
    private final LoaiSanBloc loaiSanBloc;

    public LoaiSanController(final LoaiSanBloc loaiSanBloc) {
        this.loaiSanBloc = loaiSanBloc;
    }

    @GetMapping("/loai-san")
    public ModelAndView getAllLoaiSan() {
        ModelAndView modelAndView = new ModelAndView("loaisan");
        modelAndView.addObject("listLoaiSan", loaiSanBloc.getLoaiSans());
        return modelAndView;
    }
}
