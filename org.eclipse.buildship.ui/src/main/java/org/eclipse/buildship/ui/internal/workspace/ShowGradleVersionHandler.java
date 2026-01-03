package org.eclipse.buildship.ui.internal.workspace;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.runtime.Platform;

public class ShowGradleVersionHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String version = Platform.getBundle("org.eclipse.buildship.core").getVersion().toString();
        MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Buildship Version", "Core Plugin Version: " + version);
        return null;
    }
}
