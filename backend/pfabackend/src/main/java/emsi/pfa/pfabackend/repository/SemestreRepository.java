package emsi.pfa.pfabackend.repository;

import emsi.pfa.pfabackend.entity.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre,Long> {
}
