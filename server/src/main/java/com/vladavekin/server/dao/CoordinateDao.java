package com.vladavekin.server.dao;

import javax.persistence.*;

@Entity
@Table(name = "coordinate")
public class CoordinateDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "x")
    private Integer x;

    @Column(name = "y")
    private Integer y;

    @OneToOne(mappedBy = "coordinate")
    private FigureDao figureDao;

    public CoordinateDao() {
    }

    public CoordinateDao(Integer x, Integer y, FigureDao figureDao) {
        this.x = x;
        this.y = y;
        this.figureDao = figureDao;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(final Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(final Integer y) {
        this.y = y;
    }

    public FigureDao getFigureDao() {
        return figureDao;
    }

    public void setFigureDao(FigureDao figureDao) {
        this.figureDao = figureDao;
    }

    @Override
    public String toString() {
        return "CoordinateDao{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
