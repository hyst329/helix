/**
 * Created by hyst329 on 14.03.2016.
 */
package com.helix;

import com.intellij.lang.Language;

public class HelenLanguage extends Language {
    public static final HelenLanguage INSTANCE = new HelenLanguage();

    private HelenLanguage() {
        super("Helen");
    }
}
