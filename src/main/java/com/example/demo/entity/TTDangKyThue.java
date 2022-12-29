package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class TTDangKyThue {
    @Id
    @NotBlank(message = "Vui lòng nhập")
    private String maDK;

    @Column
    @NotBlank(message = "Vui lòng nhập")
    private String tenKH;

    @Pattern(regexp = "^[0-9\\-\\+]{10,11}$", message = "Nhập đúng định dạng số phone")
    @Column
    private String soDienThoai;

    @Column
    @Builder.Default
    private int trangThai = 1;

    @ManyToOne
    @JoinColumn(name = "maLoaiSan", nullable = false)
    private LoaiSan loaiSan;
}
