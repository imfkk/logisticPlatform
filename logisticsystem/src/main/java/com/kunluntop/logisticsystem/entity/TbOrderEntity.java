package com.kunluntop.logisticsystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_order", schema = "logisticsdatabase", catalog = "")
public class TbOrderEntity {
    private int id;
    private String orderCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_code")
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbOrderEntity that = (TbOrderEntity) o;
        return id == that.id &&
                Objects.equals(orderCode, that.orderCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderCode);
    }
}
