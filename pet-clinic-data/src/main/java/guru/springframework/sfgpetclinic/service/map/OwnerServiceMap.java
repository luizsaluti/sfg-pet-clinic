package guru.springframework.sfgpetclinic.service.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner t) {
		return super.save(t.getId(), t);
	}

	@Override
	public Owner save(Long id, Owner object) {
		return super.save(id, object);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
