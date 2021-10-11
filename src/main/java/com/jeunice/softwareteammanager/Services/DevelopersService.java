package com.jeunice.softwareteammanager.Services;

import com.jeunice.softwareteammanager.Dao.DevelopersRepository;
import com.jeunice.softwareteammanager.Models.Developers;
import com.jeunice.softwareteammanager.Models.Developers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DevelopersService{

    @Autowired
    private DevelopersRepository developersRepository;

//    This method basically returns a list of all developers to the controller
    public List<Developers> getAllDevelopers(){
        return developersRepository.findAll();
    }

//    Save Method for developers
    public  Developers saveDevelopers(Developers developers){
        return developersRepository.save(developers);
    }

    //  Get Developers by Id
    public Developers getDevelopersById(Long developerId){
        return developersRepository.findById(developerId).orElseThrow(() -> {
            throw new NoSuchElementException("Developer not found for id:: " + developerId);
        });
    }

    //Update Developers by Id
    public Developers updateDevelopers(Long developerId, Developers developer){
        getDevelopersById(developerId);
        return saveDevelopers(developer);
    }

    //Delete method using developerId
    public void deleteDeveloper(Long developerId){
        developersRepository.findById(developerId).ifPresentOrElse(developersRepository::delete, () -> {
            throw new NoSuchElementException("not found");
        });
    }

}
