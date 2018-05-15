package tech.lapsa.eurasia.dao;

import javax.ejb.Local;
import javax.ejb.Remote;

import tech.lapsa.java.commons.exceptions.IllegalState;

public interface EurasiaDAOPingService extends EJBConstants {

    public static final String BEAN_NAME = "InsuranceDAOPingServiceBean";

    @Local
    public interface InsuranceDAOPingServiceLocal extends EurasiaDAOPingService {
    }

    @Remote
    public interface InsuranceDAOPingServiceRemote extends EurasiaDAOPingService {
    }

    void ping() throws IllegalState;
}
