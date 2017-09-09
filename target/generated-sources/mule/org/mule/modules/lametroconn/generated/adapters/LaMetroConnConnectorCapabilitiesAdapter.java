
package org.mule.modules.lametroconn.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.lametroconn.LaMetroConnConnector;


/**
 * A <code>LaMetroConnConnectorCapabilitiesAdapter</code> is a wrapper around {@link LaMetroConnConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-09T01:49:46-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class LaMetroConnConnectorCapabilitiesAdapter
    extends LaMetroConnConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
