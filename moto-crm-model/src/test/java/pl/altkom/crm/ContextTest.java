/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.crm;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author Administrator
 */


@ContextConfiguration("/jpa-application-context.xml")
public class ContextTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Test
    public void test() {
        
    }

}
