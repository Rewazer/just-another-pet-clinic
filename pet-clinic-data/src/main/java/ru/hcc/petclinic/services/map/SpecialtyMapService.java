/*
 * Created by SS on 25/05/2020
 */

package ru.hcc.petclinic.services.map;

import org.springframework.stereotype.Service;
import ru.hcc.petclinic.model.Speciality;
import ru.hcc.petclinic.services.SpecialtyService;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
