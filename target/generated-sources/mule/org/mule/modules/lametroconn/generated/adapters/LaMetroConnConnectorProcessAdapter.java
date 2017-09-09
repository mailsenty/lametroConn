
package org.mule.modules.lametroconn.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.lametroconn.LaMetroConnConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>LaMetroConnConnectorProcessAdapter</code> is a wrapper around {@link LaMetroConnConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-09T01:49:46-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class LaMetroConnConnectorProcessAdapter
    extends LaMetroConnConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<LaMetroConnConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, LaMetroConnConnectorCapabilitiesAdapter> getProcessTemplate() {
        final LaMetroConnConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,LaMetroConnConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, LaMetroConnConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, LaMetroConnConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
