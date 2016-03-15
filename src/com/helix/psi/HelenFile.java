package com.helix.psi;

/**
 * Created by main on 14.03.2016.
 */

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.helix.HelenFileType;
import com.helix.HelenLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class HelenFile extends PsiFileBase {
    public HelenFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, HelenLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return HelenFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Helen File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
