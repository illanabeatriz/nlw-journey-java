package com.rocketseat.planner.link;

import java.util.List;
import java.util.UUID;

import com.rocketseat.planner.trip.Trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip){
        Link newLink = new Link(payload.title(), payload.url(), trip);

        this.repository.save(newLink);

        return new LinkResponse(newLink.getID());
    }

    public List<LinkData> getAllLinksFromTrip(UUID tripId){
        return this.repository.findByTripId(tripId).stream().map(link -> new LinkData(link.getID(), link.getTitle(), link.getUrl())).toList();
    }
}