package net.babuszka.hws.repository;

import net.babuszka.hws.model.entity.ReadingUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingUnitRepostory extends JpaRepository<ReadingUnit, Integer> {
}
