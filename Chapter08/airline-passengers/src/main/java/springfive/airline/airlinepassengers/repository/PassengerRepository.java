package springfive.airline.airlinepassengers.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import springfive.airline.airlinepassengers.domain.Passenger;

public interface PassengerRepository extends ReactiveCrudRepository<Passenger, String> {

}
