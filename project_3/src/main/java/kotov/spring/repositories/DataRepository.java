package kotov.spring.repositories;


import kotov.spring.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {
    List<Data> findAllByRaining(Boolean bool);
}
