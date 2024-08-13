package com.crick.apis.CrickInformerBackend.services;

import com.crick.apis.CrickInformerBackend.entities.Match;
import java.util.List;

public interface CrickService {
    List<Match> getAllMatches();
    List<Match> getLiveMatch();

}
