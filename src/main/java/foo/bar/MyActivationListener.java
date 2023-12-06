package foo.bar;

import com.intellij.openapi.application.ApplicationActivationListener;
import com.intellij.openapi.wm.IdeFrame;
import org.jetbrains.annotations.NotNull;

import com.redhat.devtools.lsp4ij.LSPIJUtils;

public class MyActivationListener implements ApplicationActivationListener {

    @Override
    public void applicationActivated(@NotNull IdeFrame ideFrame) {
        LSPIJUtils.toTextDocumentIdentifier(null);
    }
}
