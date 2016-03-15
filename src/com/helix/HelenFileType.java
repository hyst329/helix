package com.helix;

/**
 * Created by main on 14.03.2016.
 */
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class HelenFileType extends LanguageFileType {
    public static final HelenFileType INSTANCE = new HelenFileType();

    private HelenFileType() {
        super(HelenLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Helen file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Helen language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "f4";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return HelenIcons.FILE;
    }
}