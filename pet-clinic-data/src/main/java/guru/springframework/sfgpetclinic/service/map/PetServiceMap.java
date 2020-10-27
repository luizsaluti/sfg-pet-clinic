package guru.springframework.sfgpetclinic.service.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet t) {
		return super.save(t.getId(), t);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Long id, Pet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
    
}
