package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import com.spring.mytourbook.entities.Route;

public interface IRouteService {
	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	
	public Optional<Route> searchRoute(Long routeId);
	public List<Route> viewRoute();
	String removeRoute(Long routeId);
}
