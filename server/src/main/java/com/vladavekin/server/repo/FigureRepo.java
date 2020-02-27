package com.vladavekin.server.repo;

import com.vladavekin.server.dao.FigureDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FigureRepo extends JpaRepository<FigureDao, Long> {
}
