package com.vladavekin.server.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "figure")
public class FigureDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_create")
    private Date dateCreate;

    @Column(name = "date_change")
    private Date dateChange;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordinate_id", referencedColumnName = "id")
    private CoordinateDao coordinate;

    public FigureDao(final String name,
                     final Date dateCreate,
                     final Date dateChange,
                     final CoordinateDao coordinate) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateChange = dateChange;
        this.coordinate = coordinate;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(final Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateChange() {
        return dateChange;
    }

    public void setDateChange(final Date dateChange) {
        this.dateChange = dateChange;
    }

    public CoordinateDao getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(final CoordinateDao coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "FigureDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateChange=" + dateChange +
                ", coordinate=" + coordinate +
                '}';
    }
}
