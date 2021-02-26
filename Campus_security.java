import java.util.Observer;

import javax.swing.JFrame;

/* Generated by Together */

/**
 * The Campus security staff actually activate and deactivate the barriers, enter warnings for
 * vehicles breaching the parking regulations and monitor the state of the barrier system.
 * This class represents the interactive interface to these functions.  Information about these
 * functions is in the Campus security use case diagram (hyperlinked from this class).
 * The interface comprises one screen with the various functions present on it, all on view at
 * once since there aren't many.
 * There could be several instances of this class: one in the central security office, and one
 * at each entrance to the University (in a staffed booth).
 * The class implements Observer, and observes the system status so that it can keep the displayed
 * information up to date (current date, barriers active or not, log of entries through the barriers).
 * @stereotype boundary
 */
public class Campus_security extends JFrame implements Observer {
    /**
     * Each instance of Campus_security has a navigable association to the vehicle list so that
     * warnings can be recorded on the permit for vehicles that breach parking regulations.
     * Note that this process goes via the vehicle list as the only information available about such a
     * vehicle is its registration number.
     * @clientCardinality 1..*
     * @supplierCardinality 1
     * @label Record warning
     * @directed
     */
    private Vehicle_list lnkVehicle_list;

    /**
     * Each instance of Campus_security has a navigable association to the system status so that it
     * can both find out status information about the system, and send controlling messages to the
     * system status (to activate/deactivate the system).
     * @clientCardinality 1..*
     * @supplierCardinality 1
     * @label Control/monitor
     * @directed*/
    private System_status lnkSystem_status;
}
