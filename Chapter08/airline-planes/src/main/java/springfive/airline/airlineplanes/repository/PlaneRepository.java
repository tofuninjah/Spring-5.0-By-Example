package springfive.airline.airlineplanes.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import springfive.airline.airlineplanes.domain.Plane;

public interface PlaneRepository extends ReactiveCrudRepository<Plane,String>{
}
