package com.anurag;

import com.anurag.models.Speaker;
import com.anurag.services.SpeakerServiceImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        SpeakerServiceImpl service = new SpeakerServiceImpl();

        List<Speaker> speakers = service.findAll();


        System.out.println(speakers);
    }
}
