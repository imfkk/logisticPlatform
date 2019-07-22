package com.kunluntop.catsystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_car", schema = "carsdatabase", catalog = "")
public class TbCarEntity {
    private int id;
    private String plateNum;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "plate_num")
    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCarEntity that = (TbCarEntity) o;
        return id == that.id &&
                Objects.equals(plateNum, that.plateNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plateNum);
    }
}
