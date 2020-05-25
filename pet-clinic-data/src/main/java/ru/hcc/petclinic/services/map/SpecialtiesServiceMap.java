/*
 * Created by SS on 25/05/2020
 */

package ru.hcc.petclinic.services.map;

import org.springframework.stereotype.Service;
import ru.hcc.petclinic.model.Specialty;
import ru.hcc.petclinic.services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
