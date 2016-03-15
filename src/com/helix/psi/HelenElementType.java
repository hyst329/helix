package com.helix.psi;

/**
 * Created by main on 14.03.2016.
 */

import com.intellij.psi.tree.IElementType;
import com.helix.HelenLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class HelenElementType extends IElementType {
    public HelenElementType(@NotNull @NonNls String debugName) {
        super(debugName, HelenLanguage.INSTANCE);
    }
}