package com.app.petcare.function;

import com.app.petcare.model.Pet;
import com.app.petcare.model.PetCareCenter;
import com.app.petcare.model.PetOwner;
import com.app.petcare.model.Document;
import com.app.petcare.model.PetService;




import com.app.petcare.enums.PetServiceType;
import com.app.petcare.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  