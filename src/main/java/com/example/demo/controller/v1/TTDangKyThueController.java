package com.example.demo.controller.v1;

import com.example.demo.bloc.v1.LoaiSanBloc;
import com.example.demo.bloc.v1.TTDangKyThueBloc;
import com.example.demo.entity.TTDangKyThue;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
public class TTDangKyThueController {
    private final TTDangKyThueBloc ttDangKyThueBloc;
    private final LoaiSanBloc loaiSanBloc;

    public TTDangKyThueController(final TTDangKyThueBloc ttDangKyThueBloc, final LoaiSanBloc loaiSanBloc) {
        this.ttDangKyThueBloc = ttDangKyThueBloc;
        this.loaiSanBloc = loaiSanBloc;
    }

    @ModelAttribute("dangKyThue")
    public TTDangKyThue createStudentModel() {
        return new TTDangKyThue();
    }

    @GetMapping("dang-ky")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView("ttdangkythue");
        modelAndView.addObject("loaiSan", loaiSanBloc.getLoaiSans());
        return modelAndView;
    }

    @PostMapping("dang-ky")
    public ModelAndView save(final @Valid @ModelAttribute("dangKyThue") TTDangKyThue dangKyThue,
                              final BindingResult rs) {
        ModelAndView modelAndView = new ModelAndView("ttdangkythue");
        if (rs.hasErrors()) {
            modelAndView.addObject("loaiSan", loaiSanBloc.getLoaiSans());
            return modelAndView;
        }
        ttDangKyThueBloc.insert(dangKyThue);
        return modelAndView;

    }
}
