package tacos.data;

import org.springframework.data.repository.CrudRepository;

import tacos.Taco;

public interface TacoRepository
         extends CrudRepository<Taco, Long> {
	
	@SuppressWarnings("unchecked")
	Taco save(Taco design);
	
}