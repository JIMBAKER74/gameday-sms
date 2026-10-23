package com.gamedaysms.superdupermms.mms;

import android.content.UriMatcher;
import android.net.Uri;
import android.provider.BaseColumns;

public class CopyOfAppConsts {

	// Templates Provider
    public static final String TemplatesProvider_TYPE = "vnd.android.cursor.dir/vnd.com.gamedaysms.mms.template";
    public static UriMatcher sMatcher_TemplatesProvider;
    public static final int TEMPLATES = 1;
    public static final int TEMPLATE_ID = 2;
    static {
    	sMatcher_TemplatesProvider = new UriMatcher(UriMatcher.NO_MATCH);
    	sMatcher_TemplatesProvider.addURI("com.gamedaysms.mms", "templates", TEMPLATES);
    	sMatcher_TemplatesProvider.addURI("com.gamedaysms.mms", "templates/#", TEMPLATE_ID);
    }

    public static class Template implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.parse("content://com.gamedaysms/templates");
        public static final String TEXT = "text";
    }

   // SuggestionsProvider
    final static String SuggestionsProvider_AUTHORITY = "com.gamedaysms.mms.SuggestionsProvider";

    // TempFileProvider
    public static final Uri TempFileProvider_SCRAP_CONTENT_URI = Uri.parse("content://gameday_temp_file/scrapSpace");

    public static final int MMS_SCRAP_SPACE = 1;
    public static final UriMatcher sURLMatcher_TempFileProvider = new UriMatcher(UriMatcher.NO_MATCH);
    static {
        sURLMatcher_TempFileProvider.addURI("gameday_temp_file", "scrapSpace", MMS_SCRAP_SPACE);
    }

	public static final String THEME_PACKAGE_PREFIX = "com.gamedaysms.theme";

}
