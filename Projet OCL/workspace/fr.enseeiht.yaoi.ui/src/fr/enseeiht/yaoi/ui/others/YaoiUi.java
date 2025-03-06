package fr.enseeiht.yaoi.ui.others;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class YaoiUi extends AbstractUIPlugin {
    private static YaoiUi instance;
    public final static String PLUGIN_ID = "fr.enseeiht.yaoi.ui";
    public final static String SUCCESS_IMAGE_ID = "fr.enseeiht.yaoi.ui.images.Success";
    public final static String ERROR_IMAGE_ID = "fr.enseeiht.yaoi.ui.images.Error";	
    
	private final static String SUCCESS_IMAGE_PATH = "icons/wink-green.gif";
	private final static String ERROR_IMAGE_PATH = "icons/sad.gif";
    
    public YaoiUi() {
        instance = this;
    }

    public static YaoiUi getInstance() {
        return instance;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
      
        Bundle bundle = Platform.getBundle(PLUGIN_ID);
        IPath successPath = new Path(SUCCESS_IMAGE_PATH);
        IPath errorPath = new Path(ERROR_IMAGE_PATH);
        URL successUrl = FileLocator.find(bundle, successPath, null);
        URL errorUrl = FileLocator.find(bundle, errorPath, null);
        ImageDescriptor successDesc = ImageDescriptor.createFromURL(successUrl);
        ImageDescriptor errorDesc = ImageDescriptor.createFromURL(errorUrl);
      
        ImageRegistry registry = YaoiUi.getInstance().getImageRegistry();
        registry.put(SUCCESS_IMAGE_ID, successDesc);
        registry.put(ERROR_IMAGE_ID, errorDesc);
        
        YaoiConsole.getInstance().show();
        YaoiConsole.out.println("Yaoi started!");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        instance = null;
        super.stop(context);
       
        YaoiConsole.out.println("Yaoi stopped!");
    }
    

}
