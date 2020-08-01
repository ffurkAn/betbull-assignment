package com.betbull.assignment.config;

import com.betbull.assignment.model.BaseEntity;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;
import org.hibernate.id.UUIDHexGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author atanriverdi
 */
public class EntityIdGenerator extends IdentityGenerator {

    public static final UUIDHexGenerator generator = new UUIDHexGenerator();

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        if (obj == null) throw new HibernateException(new NullPointerException());
        String objId = ((BaseEntity) obj).getId();
        String res = objId == null ? generator.generate(session, obj).toString() : objId;
        return res;
    }

    // todo delete
    public static String generateUniqueID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

