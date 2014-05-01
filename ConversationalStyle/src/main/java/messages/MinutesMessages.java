package main.java.messages;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MinutesMessages {
	private static final String BUNDLE_NAME = "main.resources.MinutesMessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private MinutesMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
