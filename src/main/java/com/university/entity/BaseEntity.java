package com.university.entity;

import com.university.IHasId;
import org.hibernate.Hibernate;

import javax.persistence.*;

/**
 * Created by lerafatova on 28.07.17.
 */
@MappedSuperclass
@Access(value = AccessType.FIELD)
public abstract class BaseEntity implements IHasId{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Access(value = AccessType.PROPERTY)
    private Integer id;

    public BaseEntity() {
    }

    protected BaseEntity(Integer id){
        this.id = id;
    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(Hibernate.getClass(o))) return false;

        BaseEntity that = (BaseEntity) o;

        return getId() != null && getId().equals(that.getId());

    }

    @Override
    public int hashCode() {
        return getId() == null ? 0 : getId().intValue();
    }

    @Override
    public String toString() {
        return String.format("Entity of type %s with id: $s", getClass().getName(), getId());
    }

    @Override
    public boolean isNew(){
        return getId() ==null || getId()==0;
    }
}
