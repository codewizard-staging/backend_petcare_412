package com.app.petcare.function;

import com.app.petcare.model.Pet;
import com.app.petcare.model.PetCareCenter;
import com.app.petcare.model.PetOwner;
import com.app.petcare.model.Document;
import com.app.petcare.model.PetService;
import com.app.petcare.enums.PetServiceType;
import com.app.petcare.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.petcare.repository.PetServiceRepository;
import com.app.petcare.repository.PetOwnerRepository;
import com.app.petcare.repository.PetCareCenterRepository;
import com.app.petcare.repository.DocumentRepository;
import com.app.petcare.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
