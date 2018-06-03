package org.wordpress.android;

import org.junit.Assert;
import org.junit.Test;
import org.wordpress.android.ui.comments.CommentUtils;
import static org.hamcrest.CoreMatchers.instanceOf;

public class CommentUtilsTest {
	CommentUtils test_product = new CommentUtils();

	@Test
	public void  NotificationsMarkedAsUnread() {
		Assert.assertThat(test_product.getLeadingMarginLineCount(),instanceOf(int.class));
	}
}

/**
 * This is CommentUtilsTest.java which tests the addition of code in overring getLeadingMarginLineCount
 * method in CommentUtils.java class.
 *
 * @author Thodoris Kanellopoulos
 */