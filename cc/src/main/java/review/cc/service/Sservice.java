package review.cc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import review.cc.model.Model;
import review.cc.repository.Repository;

@Service
public class Sservice {
private Repository rpo;

public Model createfirstname(@NonNull Model firstname){
    return rpo.save(firstname);
}

public List<Model> getAllfirstname(){
    return rpo.findAll();


}
public Optional<Model> getModelbyEmail(String email){
    return rpo.findByEmail(email);
}

public Model updateUser(@NonNull String email,@RequestBody Model model){
    return rpo.findByEmail(email).map(existingUser ->{
        existingUser.setEmail(model.getEmail());
        existingUser.setFirstName(model.getFirstName());
        existingUser.setPassword(model.getPassword());
        existingUser.setMobileno(model.getMobileno());

        return rpo.save(existingUser);
    })
    .orElseThrow(()-> new RuntimeException("User not found this email: "+email));
}
}
