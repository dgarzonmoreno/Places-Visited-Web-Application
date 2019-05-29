package com.example.demo;

import com.example.demo.controllers.PlaceVisitedController;
import com.example.demo.models.PlaceVisited;
import com.example.demo.repository.PlacesVisitedRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @InjectMocks
    private PlaceVisitedController pvc;

    @Mock
    private PlacesVisitedRepository placesVisitedRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPlacesVisitedGet() {
        PlaceVisited pv = new PlaceVisited();
        pv.setid(1L);
        when(placesVisitedRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(pv));

        PlaceVisited pv2 = pvc.get(1L).get();

        verify(placesVisitedRepository).findById(1L);
        assertEquals(1L, pv2.getid().longValue());
        assertThat(pv2.getid(), is(1L));

    }

}
