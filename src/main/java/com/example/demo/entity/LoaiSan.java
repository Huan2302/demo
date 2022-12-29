package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class LoaiSan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String maLoaiSan;

    @Column
    private String tenLoaiSan;

    @Column
    private float giaThue;

    @OneToMany(mappedBy = "loaiSan")
    private List<TTDangKyThue> list;
}
