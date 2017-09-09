
package org.mule.modules.lametroconn.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/la-metro-conn</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-09T01:49:46-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class LaMetroConnNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(LaMetroConnNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [la-metro-conn] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [la-metro-conn] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new LaMetroConnConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-all-routes", new GetAllRoutesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-all-routes", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-route", new GetRouteDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-route", "@Processor", ex);
        }
    }

}
