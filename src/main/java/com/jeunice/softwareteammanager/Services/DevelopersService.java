package com.jeunice.softwareteammanager.Services;

import com.jeunice.softwareteammanager.Dao.DevelopersRepository;
import com.jeunice.softwareteammanager.Models.Developers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DevelopersService{

    private DevelopersRepository developersRepository;

//    This method basically returns a list of all agents to the controller
    public List<Developers> getAllDevelopers(){
        return developersRepository.findAll();
    }

//    Save Method for Agents
    public  Developers saveDevelopers(Developers developers){
        return developersRepository.save(developers);
    }

//    Get Developers by Id
public Developers getDevelopersById(Long devId){
        return developersRepository.findById(devId).orElseThrow(() -> {
            throw new NoSuchElementException("Developer not found for id:: " + devId);
        });
}

//Delete method using devId
    public void deleteDevelopers(Long devId){
        developersRepository.findById(devId).ifPresentOrElse(developersRepository::delete, () -> {
            throw new NoSuchElementException("not found");
        });
    }

}
