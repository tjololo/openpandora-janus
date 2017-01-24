package net.tjololo.openpandora.services.keres;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by tjololo on 24/01/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"net.tjololo.openpandora:keres:0.1-SNAPSHOT:stubs:8686"}, workOffline = true)
public class KeresServiceTest {
    @Test
    public void dummyTest() throws Exception {
        assertThat(true, is(true));
    }
}
