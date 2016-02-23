package com.springapp.mvc.domain;

import javax.persistence.*;

/**
 * Created by vlad on 13.02.16.
 */
@Entity
@Table(name= "Busses")
public class Buss {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "drive")
    private String drive;

    @Column(name = "time")
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
