package com.vladavekin.server.repo;

import com.vladavekin.server.dao.CoordinateDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateRepo extends JpaRepository<CoordinateDao, Long> {
}
