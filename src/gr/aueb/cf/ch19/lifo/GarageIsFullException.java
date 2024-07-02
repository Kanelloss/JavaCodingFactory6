package gr.aueb.cf.ch19.lifo;

import java.rmi.server.UID;

public class GarageIsFullException extends Exception {
    private final static long serialVersionUID = 1L;

    public GarageIsFullException(String s) {
        super(s);
    }

}
