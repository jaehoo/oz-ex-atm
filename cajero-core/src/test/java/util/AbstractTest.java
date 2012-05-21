package util;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Created by IntelliJ IDEA.
 * User: Admin
 * Date: 24/03/12
 * Time: 06:45 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public abstract class AbstractTest extends AbstractTransactionalJUnit4SpringContextTests{
}
