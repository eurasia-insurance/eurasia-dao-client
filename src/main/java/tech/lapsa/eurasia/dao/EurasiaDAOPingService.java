package tech.lapsa.eurasia.dao;

import javax.ejb.Local;
import javax.ejb.Remote;

import tech.lapsa.java.commons.exceptions.IllegalState;

public interface EurasiaDAOPingService extends EJBConstants {

    public static final String BEAN_NAME = "InsuranceDAOPingServiceBean";

    @Local
    public interface EurasiaDAOPingServiceLocal extends EurasiaDAOPingService {
    }

    @Remote
    public interface EurasiaDAOPingServiceRemote extends EurasiaDAOPingService {
    }

    void ping() throws IllegalState;
}
