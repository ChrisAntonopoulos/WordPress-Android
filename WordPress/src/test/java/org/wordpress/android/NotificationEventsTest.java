package org.wordpress.android;

import org.junit.Assert;
import org.junit.Test;
import org.wordpress.android.ui.notifications.NotificationEvents;

public class NotificationEventsTest {
	NotificationEvents test_product = new NotificationEvents();

	@Test
	public void  NotificationsMarkedAsUnread() {
		Assert.assertTrue(test_product.NotificationsMarkedAsUnread(true,true));
	}
}

/**
 * This is NotificationEventsTest.java which tests the addition of NotificationsMarkedAsUsRead
 * class with tries to give the user an extra tool of being capable of dynamically
 * change a status in notification from seen to unseen.
 *
 * @author Thodoris Kanellopoulos
 */