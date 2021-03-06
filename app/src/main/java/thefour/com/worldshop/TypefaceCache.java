package thefour.com.worldshop;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * Created by phatnguyen on 8/28/16.
 */
public final class TypefaceCache {
    public static final String HARMONIA_REGULAR = "fonts/HarmoniaSansProCyr-Regular.otf";
    public static final String HARMONIA_BOLD = "fonts/HarmoniaSansProCyr-Bold.otf";
    public static final String TITLE_FONT = "fonts/norwester.otf";

    private static final Hashtable<String, Typeface> CACHE = new Hashtable<String, Typeface>();

    public static Typeface get(Context context, String name) {
        synchronized (CACHE) {
            if (!CACHE.containsKey(name)) {
                Typeface t = Typeface.createFromAsset(context.getAssets(), name);
                CACHE.put(name, t);
            }
            return CACHE.get(name);
        }
    }
}