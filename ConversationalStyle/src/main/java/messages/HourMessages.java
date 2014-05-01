package main.java.messages;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class HourMessages {
	private static final String BUNDLE_NAME = "main.resources.HourMessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private HourMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
