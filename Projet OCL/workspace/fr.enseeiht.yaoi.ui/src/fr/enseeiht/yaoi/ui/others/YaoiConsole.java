package fr.enseeiht.yaoi.ui.others;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.console.IConsoleView;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;


public class YaoiConsole {
    
    private static final String CONSOLE_NAME = "Yaoi Console";
    private static YaoiConsole instance;
    private MessageConsole console;
    public static MessageConsoleStream out;
    public static MessageConsoleStream err;
    
    private YaoiConsole() {
        console = findConsole();
        out = console.newMessageStream();
        err = console.newMessageStream();
    }
    
    public static synchronized YaoiConsole getInstance() {
        if (instance == null) {
            instance = new YaoiConsole();
        }
        return instance;
    }
    
    private MessageConsole findConsole() {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        IConsoleManager conMan = plugin.getConsoleManager();
        IConsole[] existing = conMan.getConsoles();
        
        for (int i = 0; i < existing.length; i++) {
            if (CONSOLE_NAME.equals(existing[i].getName())) {
                return (MessageConsole) existing[i];
            }
        }
        
        // No console found, create a new one
        MessageConsole myConsole = new MessageConsole(CONSOLE_NAME, null);
        conMan.addConsoles(new IConsole[] { myConsole });
        return myConsole;
    }
    
    public void show() {
        try {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            String id = IConsoleConstants.ID_CONSOLE_VIEW;
            IConsoleView view = (IConsoleView) page.showView(id);
            view.display(console);
        } catch (PartInitException e) {
            System.err.println("Error showing console: " + e.getMessage());
        }
    }
    
    public void clear() {
        console.clearConsole();
    }
    
    public static void printStackTrace(Throwable t) {
    	PrintWriter pw = new PrintWriter(new StringWriter());
    	t.printStackTrace(pw);
    	YaoiConsole.err.println(pw.toString());
    }
}