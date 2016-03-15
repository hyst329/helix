package com.helix.psi;
/**
 * Created by hyst329 on 14.03.2016.
 */

import com.intellij.psi.tree.IElementType;
import com.helix.HelenLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class HelenTokenType extends IElementType {
    public HelenTokenType(@NotNull @NonNls String debugName) {
        super(debugName, HelenLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "HelenTokenType." + super.toString();
    }
}
