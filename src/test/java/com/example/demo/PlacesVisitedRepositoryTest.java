package com.example.demo;

import com.example.demo.models.PlaceVisited;
import com.example.demo.repository.PlacesVisitedRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class PlacesVisitedRepositoryTest {

    @Autowired
    private PlacesVisitedRepository pvr;
    @Test
    public void testFindAll(){
        List<PlaceVisited> pv = pvr.findAll();
        assertThat(pv.size(), is(greaterThanOrEqualTo(0)));
    }
}
